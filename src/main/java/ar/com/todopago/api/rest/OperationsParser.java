package ar.com.todopago.api.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
				ret.put(nList.item(i).getNodeName(), parseNodeListToMap(nList.item(i).getChildNodes()));
			} else {
				// add value to this map
				ret.put(nList.item(i).getNodeName(), nList.item(i).getTextContent());
			}
		}
		return ret;

	}

}
