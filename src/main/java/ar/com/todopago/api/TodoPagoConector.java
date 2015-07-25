package ar.com.todopago.api;

import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import ar.com.todopago.utils.TodoPagoConectorAuthorize;
import ar.com.todopago.utils.TodoPagoConectorOperations;
import ar.com.todopago.utils.TodoPagoConectorPaymentMethods;

public class TodoPagoConector {

	Map<String, String>wsdl;
	Map<String, String>endpoint;
	TodoPagoConectorAuthorize authorize;
	TodoPagoConectorOperations operations;
	TodoPagoConectorPaymentMethods paymentMethods;
	
	public TodoPagoConector(Map<String, String> wsdl, Map<String, String> endpoint, Map<String, List<String>>auth) throws MalformedURLException {
		this(wsdl, endpoint, auth, false);
			
	}
	
	public TodoPagoConector(Map<String, String> wsdl, Map<String, String> endpoint, Map<String, List<String>>auth, boolean security) throws MalformedURLException {
		if(security){
			this.disableSslVerification();
		}

		this.wsdl = wsdl;
		this.endpoint = endpoint;
		authorize = new TodoPagoConectorAuthorize(wsdl.get(ElementNames.AuthorizeWSDL), endpoint.get(ElementNames.AuthorizeWSDL), auth);
		operations = new TodoPagoConectorOperations(wsdl.get(ElementNames.OperationsWSDL), endpoint.get(ElementNames.OperationsWSDL), auth);
		//paymentMethods = new TodoPagoConectorPaymentMethods(wsdl.get(ElementNames.PaymentMethodsWSDL.getValue()), endpoint.get(ElementNames.PaymentMethodsWSDL.getValue()), auth);
	}
	
	public Map<String, Object> sendAuthorizeRequest (Map<String, String> parameters){
		Map<String, Object> result = new HashMap<String, Object>();
		//llama a SendAuthorizeRequest en php
		result = authorize.getpaymentValues(parameters);
		return result;
	}
	
	public Map<String, Object> getAuthorizeAnswer (Map<String, String> parameters){
		Map<String, Object> result = new HashMap<String, Object>();
		//GetAuthorizeAnswer
		result = authorize.getPaymentValuesPCI(parameters);
		return result;
	}
	
	public Map<String, Object> getAllPaymentMethods (Map<String, String> parameters){
		Map<String, Object> result = new HashMap<String, Object>();
		result = paymentMethods.getAllValues(parameters);
		return result;
	}
	
	public Map<String, Object> getStatus (Map<String, String> parameters){
		Map<String, Object> result = new HashMap<String, Object>();
		result = operations.getOperationsValues(parameters);
		return result;
	}
	
		
	
	
	
	
	
	
	private void disableSslVerification() {
		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};
			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
	}

	
	
}
