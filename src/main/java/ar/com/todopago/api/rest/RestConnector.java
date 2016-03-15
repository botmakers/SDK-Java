package ar.com.todopago.api.rest;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import ar.com.todopago.api.ElementNames;

public class RestConnector {

	private final static Logger logger = Logger.getLogger(RestConnector.class.getName());

	private final String USER_AGENT = "Mozilla/5.0";
	private String endpoint; // https://developers.todopago.com.ar/api/t/1.1/
	private Map<String, String> headders;

	public RestConnector(String endpoint, Map<String, List<String>> headder) {

		this.endpoint = endpoint;
		this.headders = new HashMap<String, String>();

		List<String> aux = headder.get(ElementNames.Authorization);
		this.headders.put(ElementNames.Authorization, aux.get(0));

	}

	public Map<String, Object> getByOperationId(Map<String, String> params) {
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
		logger.log(Level.INFO, "\nSending 'GET' request to URL : " + url);
		logger.log(Level.INFO, "Response Code : " + responseCode);

		return con.getInputStream();
	}

}
