package main;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.TodoPagoConector;

public class Test {

	private static Map<String, String> getSARParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Session", "ABCDEF-1234-12221-FDE1-00000200");
		parameters.put("Security", "1234567890ABCDEF1234567890ABCDEF");
		parameters.put("EncodingMethod", "XML");
		parameters.put("Merchant", "305");
		parameters.put("OperationId", "01");
		parameters.put("CurrencyCode", "032");
		parameters.put("Amount", "54");
		parameters.put("URL_OK", "http,//www.google.com");
		parameters.put("URL_ERROR", "http,//www.yahoo.com");
		parameters.put("EMAILCLIENTE", "email_cliente@dominio.com");
		return parameters;
	}

	private static Map<String, String> getAAParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Security", "1234567890ABCDEF1234567890ABCDEF");
		parameters.put("Merchant", "305");
		parameters.put("RequestKey", "8496472a-8c87-e35b-dcf2-94d5e31eb12f");
		parameters.put("AnswerKey", "8496472a-8c87-e35b-dcf2-94d5e31eb12f");
		return parameters;
	}

	// private static Map<String, String> getAPMParameters(){
	// Map<String, String> parameters = new HashMap<>();
	// parameters.put("Merchant", "305");
	// return parameters;
	// }

	private static Map<String, String> getSParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Merchant", "305");
		parameters.put("OperationID", "01");
		return parameters;
	}

	private static Map<String, String> getWsdl() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.AuthorizeWSDL, "file:D:/WorkspaceJuno/TodoPago-sdk/res/Authorize.wsdl");
		parameters
				.put(ElementNames.OperationsWSDL, "file:D:/WorkspaceJuno/TodoPago-sdk/res/Operations.wsdl");
		// parameters.put(ElementNames.PaymentMethodsWSDL.getValue(),
		// "file:D:/WorkspaceJuno/TodoPago-sdk/res/PaymentMethods.wsdl");
		return parameters;
	}

	private static Map<String, String> getEndpoint() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.AuthorizeWSDL, "https://50.19.97.101:8243/services/Authorize");
		parameters.put(ElementNames.OperationsWSDL, "https://50.19.97.101:8243/services/Operations");
		// parameters.put(ElementNames.PaymentMethodsWSDL.getValue(),
		// "https://50.19.97.101:8243/services/PaymentMethods");
		return parameters;
	}

	private static Map<String, List<String>> getAuthorization() {
		Map<String, List<String>> parameters = new HashMap<String, List<String>>();
		parameters.put("Authorization", Collections.singletonList("PRISMA 912EC803B2CE49E4A541068D495AB570"));
		parameters.put("Username", Collections.singletonList("Test"));
		return parameters;
	}

	public static void main(String[] args) throws MalformedURLException {

		TodoPagoConector tpc = new TodoPagoConector(getWsdl(), getEndpoint(), getAuthorization(), true);

		Map<String, Object> a = tpc.sendAuthorizeRequest(getSARParameters());
		printMap(a, "");

		Map<String, Object> b = tpc.getAuthorizeAnswer(getAAParameters());
		printMap(b, "");

		// Map<String, Object> c = tpc.getAllPaymentMethods(getAPMParameters());
		// printMap(c, "");

		Map<String, Object> d = tpc.getStatus(getSParameters());
		printMap(d, "");
	}
	
	private static void printMap(Map<String, Object> pr, String tab){
		
		List<String> keys = new ArrayList<String>();
		keys.addAll(pr.keySet());
		
		for(int i = 0; i<keys.size();i++){
			Map<String, Object> aux = new HashMap<String, Object>();
			Object tmp = pr.get(keys.get(i));
			
			if(tmp!=null && tmp.getClass().isInstance(aux)){
				System.out.println(tab + "- " + keys.get(i));
				aux = (Map<String, Object>)(tmp);
				tab+="  ";
				printMap(aux, tab);
				
			}else{
				System.out.println(tab + "- " + keys.get(i) + " : " + pr.get(keys.get(i)));
				
			}		
		}
	}
}
