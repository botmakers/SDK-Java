package ar.com.todopago.api.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ar.com.todopago.api.exceptions.ResponseException;
import ar.com.todopago.api.model.User;

public class OperationsParser {

	// from InputStream to Map
	public static Map<String, Object> inputStreamToMap(InputStream inputStream)
			throws ParserConfigurationException, SAXException, IOException {
		NodeList nList = inputStreamToNodeList(inputStream);
		return parseNodeListToMap(nList);
	}

	// From InputStream to NodeList
	public static NodeList inputStreamToNodeList(InputStream inputStream)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputStream);
		doc.getDocumentElement().normalize();
		return doc.getChildNodes();
	}

	// From NodeList to Map
	public static Map<String, Object> parseNodeListToMap(NodeList nList) {
		Map<String, Object> ret = new HashMap<String, Object>();
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i).hasChildNodes() && nList.item(i).getChildNodes().item(0).hasChildNodes()) {
				// call recursive, fill a new map
				// logger.log(Level.WARNING,
				// nList.item(i).getNodeName().toString() + " - "+
				// nList.item(i).getChildNodes().toString() );
				if (nList.item(i).getNodeName().equals("REFUND")) {
					ret.put(nList.item(i).getNodeName() + i, parseNodeListToMap(nList.item(i).getChildNodes()));
					// logger.log(Level.WARNING,
					// nList.item(i).getNodeName().toString() + i + " - "+
					// nList.item(i).getChildNodes().toString() );
				} else if (nList.item(i).getNodeName().equals("Operations")) {
					ret.put(nList.item(i).getNodeName() + i, parseNodeListToMap(nList.item(i).getChildNodes()));
				} else {
					ret.put(nList.item(i).getNodeName(), parseNodeListToMap(nList.item(i).getChildNodes()));
				}
			} else {
				// add value to this map
				// logger.log(Level.WARNING,
				// nList.item(i).getNodeName().toString() + " - "+
				// nList.item(i).getTextContent().toString() );
				ret.put(nList.item(i).getNodeName(), nList.item(i).getTextContent());
			}
		}
		return ret;
	}

	public static Map<String, Object> parseInputStreamJsonToMap(InputStream inputStream)
			throws JSONException, IOException {
		Map<String, Object> outMap = new HashMap<String, Object>();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String output = br.readLine();
		JSONObject jsonObject = new JSONObject(output);
		outMap = generateMap(jsonObject, outMap, null);
		return outMap;
	}

	private static Map<String, Object> generateMap(JSONObject jsonObject, Map<String, Object> outMap, String key)
			throws JSONException {

		Map<String, Object> auxMap = new HashMap<String, Object>();
		Iterator<String> Itr = jsonObject.keys();

		while (Itr.hasNext()) {
			String name = Itr.next();
			Object a = jsonObject.get(name);
			if (a instanceof String && ((String) a).startsWith("{")) {
				auxMap.put(name, null);
				generateMap(new JSONObject(a), auxMap, name);
			} else if (a instanceof JSONObject) {
				auxMap.put(name, null);
				generateMap((JSONObject) a, auxMap, name);
			} else {
				auxMap.put(name, a);
			}
		}
		if (key != null) {
			outMap.put(key, auxMap);
		} else {
			outMap.putAll(auxMap);
		}
		return outMap;
	}

	public static User parseInputStreamJsonToUser(InputStream inputStream)
			throws JSONException, IOException, ResponseException {
		User user = new User();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String output = br.readLine();
		user = parseInputStreamJsonToUser(new JSONObject(output));
		return user;
	}

	public static User parseInputStreamJsonToUser(JSONObject jsonObject)
			throws JSONException, IOException, ResponseException {

		JSONObject jCredentials;
		JSONObject jresultado;

		User user = new User();
		jCredentials = jsonObject.getJSONObject("Credentials");
		jresultado = jCredentials.getJSONObject("resultado");

		if (jCredentials.getInt("codigoResultado") == 1) {
			if (jresultado.getInt("codigoResultado") != 0) {
				throw new ResponseException(
						jresultado.getString("mensajeKey") + " - " + jresultado.getString("mensajeResultado"));
			} else {
				user.setApiKey(jCredentials.getString("APIKey"));
				user.setMerchant(jCredentials.getString("merchantId"));
			}
		} else {
			// throw new ResponseException("");
		}
		return user;
	}

}
