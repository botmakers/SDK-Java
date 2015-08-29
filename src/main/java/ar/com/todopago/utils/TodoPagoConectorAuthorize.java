package ar.com.todopago.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.authorize.Authorize;
import ar.com.todopago.api.authorize.AuthorizePortType;
import ar.com.todopago.api.authorize.GetAuthorizeAnswer;
import ar.com.todopago.api.authorize.GetAuthorizeAnswerResponse;
import ar.com.todopago.api.authorize.ObjectFactory;
import ar.com.todopago.api.authorize.SendAuthorizeRequest;
import ar.com.todopago.api.authorize.SendAuthorizeRequestResponse;

public class TodoPagoConectorAuthorize{

	private final static Logger logger = Logger.getLogger(TodoPagoConectorAuthorize.class.getName());

	private ObjectFactory factory;
	private String wsdl = null;
	private String endpoint = null;
	private AuthorizePortType service = null;

	/**
	 * 
	 * @param wsdl
	 * @param endpoint
	 * @param security
	 * @throws MalformedURLException
	 */
	public TodoPagoConectorAuthorize(String wsdl, String endpoint, Map<String, List<String>> auth) throws MalformedURLException {
		this.factory = new ObjectFactory();
		this.wsdl = wsdl;
		this.endpoint = endpoint;
		this.service = new Authorize(new URL(this.wsdl)).getAuthorizeHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
	}


	/**
	 * 
	 * @param parameters
	 * @return
	 */
	public Map<String, Object> getPaymentValuesPCI(Map<String, String> parameters) {
		logger.info("Deshabilitando verificacion SSL");
		GetAuthorizeAnswer getAuthorizeAnswer = this.parseToAuthorizeAnswer(parameters);
		GetAuthorizeAnswerResponse getAuthorizeAnswerResponse = service.getAuthorizeAnswer(getAuthorizeAnswer);
		System.err.println("-------------------------" + getAuthorizeAnswerResponse);
		// devuelve el formato de array el resultado de de la operación
		// Authorize
		Map<String, Object> response = this.parseAuthorizeResponseToArray(getAuthorizeAnswerResponse);
		return response;
	}

	/**
	 * 
	 * @param parameters
	 * @return
	 */
	public Map<String, Object> getpaymentValues(Map<String, String> parameters, Map<String, String> fraudControl) {
		// parseo de los valores enviados por el e-commerce/custompage
		SendAuthorizeRequest sendAuthorizeRequest = this.parseToSendAuthorizeRequest(parameters, fraudControl);
		SendAuthorizeRequestResponse sendAuthorizeRequestResponse = service.sendAuthorizeRequest(sendAuthorizeRequest);
		// devuelve el formato de array el resultado de de la operación
		// Authorize
		Map<String, Object> response = this.parseSendAuthorizeRequestResponseToArray(sendAuthorizeRequestResponse);
		return response;
	}

	private GetAuthorizeAnswer parseToAuthorizeAnswer(Map<String, String> parameters) {
		GetAuthorizeAnswer o = factory.createGetAuthorizeAnswer();
		if (parameters != null) {
			o.setAnswerKey(factory.createGetAuthorizeAnswerAnswerKey(parameters.get(ElementNames.AnswerKey)));
			o.setRequestKey(factory.createGetAuthorizeAnswerRequestKey(parameters.get(ElementNames.RequestKey)));
			o.setMerchant(parameters.get(ElementNames.Merchant));
			o.setSecurity(parameters.get(ElementNames.Security));
			o.setSession(factory.createGetAuthorizeAnswerSession(parameters.get(ElementNames.Session)));
		}
		return o;
	}

	private String getValue(JAXBElement element) {
		String s = "";
		if (element != null) {
			s = element.getValue().toString();
		}
		return s;
	}

	private String getValue(int element) {
		String s = String.valueOf(element);
		return s;
	}


	private Map<String, Object> parseSendAuthorizeRequestResponseToArray(
			SendAuthorizeRequestResponse sendAuthorizeRequestResponse) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(ElementNames.RequestKey, getValue(sendAuthorizeRequestResponse.getRequestKey()));
		result.put(ElementNames.StatusCode, getValue(sendAuthorizeRequestResponse.getStatusCode()));
		result.put(ElementNames.StatusMessage, getValue(sendAuthorizeRequestResponse.getStatusMessage()));
		result.put(ElementNames.UrlRequest, getValue(sendAuthorizeRequestResponse.getURLRequest()));
		result.put(ElementNames.PublicRequestKey, getValue(sendAuthorizeRequestResponse.getPublicRequestKey()));
		logger.log(Level.INFO, "Armando sendAuthorizeRequestResponse: {0}", result);
		return result;
	}

	private SendAuthorizeRequest parseToSendAuthorizeRequest(Map<String, String> parameters, Map<String, String> fraudControl) {
		SendAuthorizeRequest o = factory.createSendAuthorizeRequest();
		if (parameters != null) {
			o.setEncodingMethod(factory.createSendAuthorizeRequestEncodingMethod(parameters
					.get(ElementNames.EncodingMethod)));
			o.setMerchant(parameters.get(ElementNames.Merchant));
			o.setPayload(factory.createSendAuthorizeRequestPayload(createPayload(parameters, fraudControl)));
			o.setSecurity(parameters.get(ElementNames.Security));
			o.setSession(factory.createSendAuthorizeRequestSession(parameters.get(ElementNames.Session)));
			o.setURLERROR(factory.createSendAuthorizeRequestURLERROR(parameters.get(ElementNames.UrlError)));
			o.setURLOK(factory.createSendAuthorizeRequestURLOK(parameters.get(ElementNames.UrlOK)));
		}
		logger.log(Level.INFO, "Armando SendAuthorizeRequest: {0}", o);
		return o;
	}

	private String createPayload(Map<String, String> parameters, Map<String, String> fraudControl) {
		StringBuilder payload = new StringBuilder("<Request>");
		
		for (Map.Entry<String, String> entry : parameters.entrySet()) {
			payload.append("<");
			payload.append(entry.getKey().toUpperCase());
			payload.append(">");
			payload.append(entry.getValue());
			payload.append("</");
			payload.append(entry.getKey().toUpperCase());
			payload.append(">");
		}
		for (Map.Entry<String, String> entry : fraudControl.entrySet()) {
			payload.append("<");
			payload.append(entry.getKey().toUpperCase());
			payload.append(">");
			payload.append(entry.getValue());
			payload.append("</");
			payload.append(entry.getKey().toUpperCase());
			payload.append(">");
		}
		
		payload.append("</Request>");
		String result = payload.toString();
		logger.log(Level.INFO, "Armando payload: {0}", result);
		return result;
	}

	private Map<String, Object> parseAuthorizeResponseToArray(GetAuthorizeAnswerResponse authorizeAnswerResponse) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(ElementNames.AuthorizationKey, getValue(authorizeAnswerResponse.getAuthorizationKey()));
		result.put(ElementNames.EncodingMethod, getValue(authorizeAnswerResponse.getEncodingMethod()));
		payloadToArray(result, authorizeAnswerResponse.getPayload());
		//TODO fix previos line remove following
		//result.put("payload", getValue(authorizeAnswerResponse.getPayload()));
//		result.put("payload", authorizeAnswerResponse.getPayload());
		result.put(ElementNames.StatusCode, getValue(authorizeAnswerResponse.getStatusCode()));
		result.put(ElementNames.StatusMessage, getValue(authorizeAnswerResponse.getStatusMessage()));
		return result;
	}

	private void payloadToArray(Map<String, Object> result, Node node) {
		if(node!=null){
			Node answer = node.getFirstChild();
			Node request = answer.getNextSibling();
			nodeToMap(answer, result);
			nodeToMap(request, result);
		}
	}

	private void nodeToMap(Node node, Map<String, Object> result) {
		if (node != null) {
			NodeList nodeList = node.getChildNodes();
			for (int i = 0; nodeList.getLength() > i; i++) {
				Node child = nodeList.item(i);
				result.put(child.getNodeName(), child.getNodeValue());
			}
		}
	}

}
