package ar.com.todopago.api.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.exceptions.ConnectionException;
import ar.com.todopago.api.exceptions.ResponseException;
import ar.com.todopago.api.model.User;
import ar.com.todopago.utils.MockObjects;
	
public class RestConnector {

	private final static Logger logger = Logger.getLogger(RestConnector.class.getName());

	private final String USER_AGENT = "Mozilla/5.0";
	private String endpoint; // https://developers.todopago.com.ar/api/t/1.1/
	private Map<String, String> headders;

	public RestConnector(String endpoint, Map<String, List<String>> headder) {

		this.endpoint = endpoint;
		this.headders = new HashMap<String, String>();

		if (headder != null) {
			List<String> aux = headder.get(ElementNames.Authorization);
			this.headders.put(ElementNames.Authorization, aux.get(0));
		}

	}

	public Map<String, Object> getByOperationId(Map<String, String> params) {

		// Tets amazon
		// url =
		// "http://localhost:8280/t/1.1/api/Operations/GetByOperationId/MERCHANT/1/OPERATIONID/2502";

		String url = endpoint + "Operations/GetByOperationId/";
		// Merchant
		url += ElementNames.Merchant.toUpperCase() + "/" + params.get(ElementNames.Merchant) + "/";
		// OperationID
		url += ElementNames.OperationID.toUpperCase() + "/" + params.get(ElementNames.OperationID);

		logger.log(Level.INFO, "URLCreation getByOperationId" + url);

		Map<String, Object> ret = new HashMap<String, Object>();
		try {
			ret = OperationsParser.inputStreamToMap(sendGet(url));
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
			ret.put("Error", e.getMessage());
			ret.put("StackTrace", e.getStackTrace());
		}
		return ret;
	}

	public Map<String, Object> getPaymentMethods(Map<String, String> params) {

		String url = endpoint + "PaymentMethods/Get/";
		// Merchant
		url += ElementNames.Merchant.toUpperCase() + "/" + params.get(ElementNames.Merchant) + "/";

		logger.log(Level.INFO, "URLCreation getPaymentMethods" + url);

		Map<String, Object> ret = new HashMap<String, Object>();
		try {

			// ret = PaymentMethodsParser.inputStreamToMap(sendGet(url));

			// streamToMap
			PaymentMethodsParser pmp = new PaymentMethodsParser();

			ret = pmp.streamToMap(sendGet(url));

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
			ret.put("Error", e.getMessage());
			ret.put("StackTrace", e.getStackTrace());
		}

		return ret;
	}

	public Map<String, Object> discoverPaymentMethods() {

		String url = endpoint + "PaymentMethods/Discover";

		logger.log(Level.INFO, "URLCreation getPaymentMethods" + url);

		Map<String, Object> ret = new HashMap<String, Object>();
		try {
			// streamToMap
			PaymentMethodsParser pmp = new PaymentMethodsParser();
			ret = pmp.streamToMap(sendGet(url));

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get: ", e.getMessage());
			ret.put("Error", e.getMessage());
			ret.put("StackTrace", e.getStackTrace());
		}

		return ret;
	}

	public Map<String, Object> getByRangeDateTime(Map<String, String> params) {

		// Tets Amazon
		// url =
		// "http://localhost:8280/t/1.1/api/Operations/GetByRangeDateTime/MERCHANT/1/STARTDATE/2016-03-16/ENDDATE/2016-03-17/PAGENUMBER/1";

		String url = endpoint + "Operations/GetByRangeDateTime/";
		// Merchant
		url += ElementNames.Merchant.toUpperCase() + "/" + params.get(ElementNames.Merchant) + "/";
		// start date
		url += ElementNames.STARTDATE.toUpperCase() + "/" + params.get(ElementNames.STARTDATE) + "/";
		// end date
		url += ElementNames.ENDDATE.toUpperCase() + "/" + params.get(ElementNames.ENDDATE) + "/";
		// page number
		url += ElementNames.PAGENUMBER.toUpperCase() + "/" + params.get(ElementNames.PAGENUMBER);

		logger.log(Level.INFO, "URLCreation GetByRangeDateTime " + url);

		Map<String, Object> ret = new HashMap<String, Object>();
		try {

			ret = OperationsParser.inputStreamToMap(sendGet(url));
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
			ret.put("Error", e.getMessage());
			ret.put("StackTrace", e.getStackTrace());
		}

		return ret;

	}

	public Map<String, Object> getPromotions(Map<String, String> params) {
		String url = endpoint + "PaymentMethods/Get/";
		// Merchant
		url += ElementNames.Merchant.toUpperCase() + "/" + params.get(ElementNames.Merchant) + "/";
		url += ElementNames.PaymentMethod.toUpperCase() + "/" + params.get(ElementNames.PaymentMethod) + "/";
		url += ElementNames.Bank.toUpperCase() + "/" + params.get(ElementNames.Bank) + "/";
		url += ElementNames.Amount.toUpperCase() + "/" + params.get(ElementNames.Amount) + "/";

		logger.log(Level.INFO, "URLCreation getPaymentMethods" + url);

		Map<String, Object> ret = new HashMap<String, Object>();
		try {

			// ret = PaymentMethodsParser.inputStreamToMap(sendGet(url));
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
			ret.put("Error", e.getMessage());
			ret.put("StackTrace", e.getStackTrace());
		}

		return ret;
	}

	public Map<String, Object> voidRequest(Map<String, String> params) {

		String url = endpoint + "Authorize";
		logger.log(Level.INFO, "URLCreation voidRequest " + url);

		Map<String, Object> outMap = new HashMap<String, Object>();
		try {
			JSONObject data = new JSONObject();

			data.put(ElementNames.RequestType, ElementNames.VoidRequest);
			data.put(ElementNames.Security, params.get(ElementNames.Security));
			data.put(ElementNames.RequestKey, params.get(ElementNames.RequestKey));
			data.put(ElementNames.Merchant, params.get(ElementNames.Merchant));

			if (params.containsKey(ElementNames.AuthorizationKey)) {
				data.put(ElementNames.AuthorizationKey, params.get(ElementNames.AuthorizationKey));
			}

			InputStream is = sendPost(url, data.toString(), true);
			outMap = OperationsParser.parseInputStreamJsonToMap(is);

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
			outMap.put("Error", e.getMessage());
			outMap.put("StackTrace", e.getStackTrace());
		}

		return outMap;

	}

	public Map<String, Object> returnRequest(Map<String, String> params) {

		String url = endpoint + "Authorize";
		logger.log(Level.INFO, "URLCreation returnRequest " + url);

		Map<String, Object> outMap = new HashMap<String, Object>();
		try {
			JSONObject data = new JSONObject();

			data.put(ElementNames.RequestType, ElementNames.ReturnRequest);
			data.put(ElementNames.Security, params.get(ElementNames.Security));
			data.put(ElementNames.RequestKey, params.get(ElementNames.RequestKey));
			data.put(ElementNames.Merchant, params.get(ElementNames.Merchant));
			data.put(ElementNames.Amount, params.get(ElementNames.Amount));
			data.put(ElementNames.CurrencyCode, params.get(ElementNames.CurrencyCode));

			if (params.containsKey(ElementNames.AuthorizationKey)) {
				data.put(ElementNames.AuthorizationKey, params.get(ElementNames.AuthorizationKey));
			}

			InputStream is = sendPost(url, data.toString(), true);
			outMap = OperationsParser.parseInputStreamJsonToMap(is);

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
			outMap.put("Error", e.getMessage());
			outMap.put("StackTrace", e.getStackTrace());
		}

		return outMap;

	}

	public User getCredentials(User user) throws ResponseException, ConnectionException {

		String url = endpoint + "Credentials";	 	
		url = url.replace("t/1.1/", "");	
		logger.log(Level.INFO, "URLCreation getCredentials " + url);
		User userResponse = new User();

		try {
			
			JSONObject data = new JSONObject();
			data.put(ElementNames.USUARIO, user.getUser());
			data.put(ElementNames.CLAVE, user.getPassword());

			InputStream is = sendPost(url, data.toString(), false);
			userResponse = OperationsParser.parseInputStreamJsonToUser(is);

			// ONLY TEST
			// userResponse =
			// OperationsParser.parseInputStreamJsonToUser(MockObjects.createMockJsonUserResponseOk());
			// userResponse =
			// OperationsParser.parseInputStreamJsonToUser(MockObjects.createMockJsonUserResponseBadPass());

			} catch (JSONException e) {
				logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
				e.printStackTrace();
			} catch (IOException e) {
				logger.log(Level.SEVERE, "Error on get", e.getMessage() + " - " + e.getLocalizedMessage());
				e.printStackTrace();
			} 
		
		return userResponse;
	}

	// Do Connection recover InputStream
	private InputStream sendGet(String url) throws Exception {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		// Set Prisma Headder
		con.setRequestProperty("Authorization", headders.get("Authorization"));
		int responseCode = con.getResponseCode();
		
		if (responseCode != 200) {
			logger.log(Level.INFO, "Test: " + con.getErrorStream().toString());
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			String output = br.readLine();
			throw new ConnectionException(responseCode + " - " + con.getResponseMessage() + " - " + output);
		}
		
		logger.log(Level.INFO, "\nSending 'GET' request to URL : " + url);
		logger.log(Level.INFO, "Response Code : " + responseCode);

		return con.getInputStream();
	}

	// Do Connection recover InputStream
	private InputStream sendPost(String url, String json, boolean setHeadder) throws ConnectionException, IOException {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		con.setRequestMethod("POST");
		con.setDoInput(true);
		con.setDoOutput(true);
		con.setUseCaches(false);

		// Set Prisma Headder
		if (setHeadder) {
			con.setRequestProperty("Authorization", headders.get("Authorization"));
		}

		OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
		wr.write(json);
		wr.flush();

		int responseCode = con.getResponseCode();

		if (responseCode != 200) {
			logger.log(Level.INFO, "Test: " + con.getErrorStream().toString());
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			String output = br.readLine();
			throw new ConnectionException(responseCode + " - " + con.getResponseMessage() + " - " + output);
		}

		InputStream is = con.getInputStream();

		logger.log(Level.INFO, "\nSending 'POST' request to URL : " + url);
		logger.log(Level.INFO, "Response Code : " + responseCode);

		return is;
	}

}
