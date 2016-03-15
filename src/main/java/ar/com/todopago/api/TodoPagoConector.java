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

import ar.com.todopago.api.rest.RestConnector;
import ar.com.todopago.utils.TodoPagoConectorAuthorize;

public class TodoPagoConector {

	public static final String versionTodoPago = "1.2.0";

	final String soapAppend = "services/";
	final String restAppend = "api/";
	final String tenant = "t/1.1/";
	final String authorizeSOAPAppend = "Authorize";
	final String authorizeWSDL = "/Authorize.wsdl";

	// endpoints
	final String endPointDev = "https://developers.todopago.com.ar/";
	final String endPointPrd = "https://apis.todopago.com.ar/";

	public final static int developerEndpoint = 0;
	public final static int productionEndpoint = 1;

	String ep;
	Map<String, String> wsdl;
	Map<String, String> endpoint;
	TodoPagoConectorAuthorize authorize;
	RestConnector restConector;

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

		String soapEndpoint = ep + soapAppend + tenant + authorizeSOAPAppend;
		try {
			authorize = new TodoPagoConectorAuthorize(
					TodoPagoConector.class.getResource(this.authorizeWSDL).toURI().toURL(), soapEndpoint, auth);
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		String restEndpoint = ep + tenant + restAppend;
		restConector = new RestConnector(restEndpoint, auth);
	}

	public Map<String, Object> sendAuthorizeRequest(Map<String, String> parameters, Map<String, String> fraudControl) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = authorize.getpaymentValues(parameters, fraudControl);
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
		result = authorize.voidRequest(parameters);
		return result;
	}

	// Devoluciones -- devolucion pacial
	public Map<String, Object> returnRequest(Map<String, String> parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		result = authorize.returnRequest(parameters);
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
