package ar.com.todopago.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.operations.DataServiceFault;
import ar.com.todopago.api.operations.GetByOperationId;
import ar.com.todopago.api.operations.ObjectFactory;
import ar.com.todopago.api.operations.Operations;
import ar.com.todopago.api.operations.OperationsColections;
import ar.com.todopago.api.operations.OperationsPortType;
import ar.com.todopago.api.operations.Operations_Service;


public class TodoPagoConectorOperations{

	private final static Logger logger = Logger.getLogger(TodoPagoConectorOperations.class.getName());

	private ObjectFactory factory;
	private String wsdl = null;
	private String endpoint = null;
	private OperationsPortType service = null;

	/**
	 * 
	 * @param wsdl
	 * @param endpoint
	 * @param auth 
	 * @param security
	 * @throws MalformedURLException
	 */
	public TodoPagoConectorOperations(String wsdl, String endpoint, Map<String, List<String>> auth) throws MalformedURLException {
		this.factory = new ObjectFactory();
		this.wsdl = wsdl;
		this.endpoint = endpoint;
		this.service = new Operations_Service(new URL(this.wsdl)).getOperationsHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
		
	}

	/**
	 * 
	 * @param parameters
	 * @return
	 */
	public Map<String, Object> getOperationsValues(Map<String, String> parameters) {

		Map<String, Object> response = new HashMap<String, Object>();
		try{

			GetByOperationId operationId = this.parseToGetByOperationId(parameters);
			OperationsColections operationColection = service.getByOperationId(operationId);
			response = this.parseOperationColectionsToArray(operationColection);

		}catch(DataServiceFault dsf){
			response.put(ElementNames.ErrorMessage, dsf.getMessage());
		}catch (Exception e) {
			response.put(ElementNames.ErrorMessage, e.getMessage());
		}

		return response;
	}
	
	//OPERATIONS
	private Map<String, Object> parseOperationColectionsToArray(OperationsColections operationsColections) {
		Map<String, Object> result = new HashMap<String, Object>();
		List <Operations> opsList = operationsColections.getOperations();
		
		Iterator <Operations>opsIt= opsList.iterator();
		
		Map <String, Object> list= new HashMap<String, Object>();
		
		while(opsIt.hasNext()){
			Map<String, Object> subMap = new HashMap<String, Object>();

			Operations current = opsIt.next();

			subMap.put(ElementNames.AuthorizationKey, current.getAUTHORIZATIONCODE());
			subMap.put(ElementNames.Barcode, current.getBARCODE());
			subMap.put(ElementNames.CardHolderName, current.getCARDHOLDERNAME());
			subMap.put(ElementNames.CardNumber, current.getCARDNUMBER());
			subMap.put(ElementNames.CuponExipartionDate, current.getCOUPONEXPDATE());
			subMap.put(ElementNames.CuponSecondExpirationDate, current.getCOUPONSECEXPDATE());
			subMap.put(ElementNames.CuponSubscriber, current.getCOUPONSUBSCRIBER());
			subMap.put(ElementNames.CurrencyCode, current.getCURRENCYCODE());
			subMap.put(ElementNames.CustomerMail, current.getCUSTOMEREMAIL());
			subMap.put(ElementNames.Identification, current.getIDENTIFICATION());
			subMap.put(ElementNames.IdentificationType, current.getIDENTIFICATIONTYPE());
			subMap.put(ElementNames.InstallmentPayments, current.getINSTALLMENTPAYMENTS());
			subMap.put(ElementNames.OperationID, current.getOPERATIONID());
			subMap.put(ElementNames.ResultCode, current.getRESULTCODE());
			subMap.put(ElementNames.ResultMessage, current.getRESULTMESSAGE());
			subMap.put(ElementNames.Type, current.getTYPE());
			subMap.put(ElementNames.Ammount, current.getAMOUNT());
			subMap.put(ElementNames.DateTime, current.getDATETIME());
			subMap.put(ElementNames.TicketNumber, current.getTICKETNUMBER());

			opsIt.remove();
			//Add the current OP to the list
			list.put(current.getOPERATIONID(), subMap);
		}
		//Add all lists to the result under 1 node
		result.put(ElementNames.Operation, list);

		logger.log(Level.INFO, "Armando sendAuthorizeRequestResponse: {0}", result);
		
		return result;
	}

	//OPERATIONS
	private GetByOperationId parseToGetByOperationId(Map<String, String> parameters) {
		GetByOperationId o = factory.createGetByOperationId();
		if(parameters!=null){
			o.setMERCHANT(parameters.get(ElementNames.Merchant));
			o.setOPERATIONID(parameters.get(ElementNames.OperationID));
		}
		logger.log(Level.INFO, "Armando SendAuthorizeRequest: {0}", o);
		return o;
	}

	
}
