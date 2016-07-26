package ar.com.todopago.api;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
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

import ar.com.todopago.api.exceptions.ConnectionException;
import ar.com.todopago.api.exceptions.EmptyFieldException;
import ar.com.todopago.api.exceptions.EmptyFieldPassException;
import ar.com.todopago.api.exceptions.EmptyFieldUserException;
import ar.com.todopago.api.exceptions.ResponseException;
import ar.com.todopago.api.model.User;
import ar.com.todopago.api.rest.RestConnector;
import ar.com.todopago.utils.FraudControlValidate;
import ar.com.todopago.utils.TodoPagoConectorAuthorize;

public class TodoPagoConector {

	public static final String versionTodoPago = "1.5.0";

	private final String soapAppend = "services/";
	private final String restAppend = "api/";
	private final String tenant = "t/1.1/";
	private final String authorizeSOAPAppend = "Authorize";
	private final String authorizeWSDL = "/Authorize.wsdl";

	// endpoints
	private final String endPointDev = "https://developers.todopago.com.ar/";
	private final String endPointPrd = "https://apis.todopago.com.ar/";

	public final static int developerEndpoint = 0;
	public final static int productionEndpoint = 1;

	private String ep;
	private TodoPagoConectorAuthorize authorize;
	private RestConnector restConector;

	Map<String, String> wsdl;
	Map<String, String> endpoint;

	String soapEndpoint;
	String restEndpoint;	
	
	public TodoPagoConector(int endpoint) throws MalformedURLException {
		this(endpoint, null, false);
	}

	public TodoPagoConector(int endpoint, Map<String, List<String>> auth) throws MalformedURLException {
		this(endpoint, auth, false);
	}

	public TodoPagoConector(int endpoint, Map<String, List<String>> auth, boolean security)
			throws MalformedURLException {
		if (security) {
			this.disableSslVerification();
		}
		switch (endpoint) {
		case developerEndpoint:
			ep = endPointDev;
			break;
		case productionEndpoint:
			ep = endPointPrd;
			break;
		default:
			ep = endPointPrd;
			break;
		}

		this.soapEndpoint = ep + soapAppend + tenant + authorizeSOAPAppend;
		
		if(auth != null){
			try {
				authorize = new TodoPagoConectorAuthorize(
						TodoPagoConector.class.getResource(this.authorizeWSDL).toURI().toURL(), this.soapEndpoint, auth);
			} catch (URISyntaxException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		
		this.restEndpoint = ep + tenant + restAppend;
		restConector = new RestConnector(restEndpoint, auth);
	}

	public Map<String, Object> sendAuthorizeRequest(Map<String, String> parameters, Map<String, String> fraudControl) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		FraudControlValidate cf = new FraudControlValidate();
		fraudControl = cf.validate(fraudControl);
		
		if(fraudControl.containsKey(ElementNames.ERROR)){			
			result = setMapValidate(fraudControl);			
		}else{
			result = authorize.getpaymentValues(parameters, fraudControl);			
		}
		return result;
	}

	// GetAuthorizeAnswer
	public Map<String, Object> getAuthorizeAnswer(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = authorize.getPaymentValuesPCI(parameters);
		return result;
	}

	// Devoluciones -- devolucion total
	public Map<String, Object> voidRequest(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = restConector.voidRequest(parameters);
		return result;
	}

	// Devoluciones -- devolucion pacial
	public Map<String, Object> returnRequest(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = restConector.returnRequest(parameters);
		return result;
	}

	public Map<String, Object> getAllPaymentMethods(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = restConector.getPaymentMethods(parameters);
		return result;
	}

	public Map<String, Object> discoverPaymentMethods() {
		Map<String, Object> result = new HashMap<String, Object>();
		result = restConector.discoverPaymentMethods();
		return result;
	}

	public Map<String, Object> getStatus(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = restConector.getByOperationId(parameters);
		return result;
	}
	
	public Map<String, Object> getByRangeDateTime(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = restConector.getByRangeDateTime(parameters);
		return result;
	}
	
	public User getCredentials(User user) throws EmptyFieldException, ResponseException, ConnectionException {
		
		User result = user;		
		if(user!=null){
			if(user.getUser()== null  ||  user.getUser().isEmpty()){
				throw new EmptyFieldUserException("User/Mail is empty");			
			}
			if(user.getPassword()== null  || user.getPassword().isEmpty()){
				throw new EmptyFieldPassException("Pass is empty");			
			}						 
			result = restConector.getCredentials(user);			
		}else{
			throw new EmptyFieldPassException("User is null");				
		}
		return result;		
	}
	
	public void setAuthorize(Map<String, List<String>> auth) throws MalformedURLException, ResponseException {
			
		if(auth != null && auth.get(ElementNames.Authorization)!= null && auth.get(ElementNames.Authorization).iterator().next()!= null ){			
			try {
				 this.authorize = new TodoPagoConectorAuthorize(
						TodoPagoConector.class.getResource(this.authorizeWSDL).toURI().toURL(), this.soapEndpoint, auth);
			} catch (URISyntaxException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
			this.restConector = new RestConnector(restEndpoint, auth);
		}else{		
			throw new ResponseException("ApiKey is null");
		}

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

	public static String getVersionTodoTago() {
		return versionTodoPago;
	}
	
	private Map<String, Object> setMapValidate(Map<String, String>  map) {
		Map<String, Object> mapValidate = new HashMap <String, Object>() ;			
		mapValidate.put("StatusCode", "9999");
		mapValidate.put("PublicRequestKey", "");
		mapValidate.put("URL_Request", "");
		mapValidate.put("StatusMessage", "Campos invalidos " + map.get(ElementNames.ERROR));
		mapValidate.put("RequestKey", "");
		mapValidate.put("Error", map );		
		return mapValidate;
	}
	
	
}
