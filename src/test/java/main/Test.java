package main;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.TodoPagoConector;
import ar.com.todopago.api.rest.RestConnector;

public class Test {

		public static void main(String[] args) throws MalformedURLException {

		TodoPagoConector tpc = new TodoPagoConector(getWsdl(), getEndpoint(), getAuthorization(), true);

		Map<String, Object> a = tpc.sendAuthorizeRequest(getSARParameters(), getFraudControlParameters());
		printMap(a, "");

		Map<String, Object> b = tpc.getAuthorizeAnswer(getAAParameters());
		printMap(b, "");

		Map<String, Object> e = tpc.getStatus(getSParameters());
		printMap(e, "");
		
		Map<String, Object> f = tpc.getAllPaymentMethods(getPMParameters());
		System.out.println(f);
		printMap(f, "");
		
		
		
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
				printMap(aux, tab + "  ");
				
			}else{
				System.out.println(tab + "- " + keys.get(i) + " : " + pr.get(keys.get(i)));
				
			}		
		}
	}
	
	
	
	
	
	private static Map<String, String> getSARParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Session", "ABCDEF-1234-12221-FDE1-00000200");
		parameters.put("Security", "1234567890ABCDEF1234567890ABCDEF");
		parameters.put("EncodingMethod", "XML");
		parameters.put("Merchant", "2153");
		parameters.put("OperationId", "12");
		parameters.put("CurrencyCode", "032");
		parameters.put("Amount", "54");
		parameters.put("URL_OK", "http,//someurl.com/ok/");
		parameters.put("URL_ERROR", "http,//someurl/fail/");
		parameters.put("EMAILCLIENTE", "email_cliente@dominio.com");
		return parameters;
	}
	
	//Parametros para el control de fraude
	private static Map<String, String> getFraudControlParameters() {
		//Example
		Map<String, String> parameters = new HashMap<String, String>();     
		parameters.put("CSBTCITY", "Villa General Belgrano"); //MANDATORIO.
		parameters.put("CSSTCITY", "Villa General Belgrano"); //MANDATORIO.
		
		parameters.put("CSBTCOUNTRY", "AR");//MANDATORIO. Código ISO.
		parameters.put("CSSTCOUNTRY", "AR");//MANDATORIO. Código ISO.
		
		parameters.put("CSBTEMAIL", "todopago@hotmail.com"); //MANDATORIO.
		parameters.put("CSSTEMAIL", "todopago@hotmail.com"); //MANDATORIO.
		
		parameters.put("CSBTFIRSTNAME", "Juan");//MANDATORIO.      
		parameters.put("CSSTFIRSTNAME", "Juan");//MANDATORIO.      
		
		parameters.put("CSBTLASTNAME", "Perez");//MANDATORIO.
		parameters.put("CSSTLASTNAME", "Perez");//MANDATORIO.
		
		parameters.put("CSBTPHONENUMBER", "541160913988");//MANDATORIO.     
		parameters.put("CSSTPHONENUMBER", "541160913988");//MANDATORIO.     
		
		parameters.put("CSBTPOSTALCODE", " 1010");//MANDATORIO.
		parameters.put("CSSTPOSTALCODE", " 1010");//MANDATORIO.
		
		parameters.put("CSBTSTATE", "B");//MANDATORIO
		parameters.put("CSSTSTATE", "B");//MANDATORIO
		
		parameters.put("CSBTSTREET1", "Cerrito 740");//MANDATORIO.
		parameters.put("CSSTSTREET1", "Cerrito 740");//MANDATORIO.
		
		parameters.put("CSBTCUSTOMERID", "453458"); //MANDATORIO.
		parameters.put("CSBTIPADDRESS", "192.0.0.4"); //MANDATORIO.       
		parameters.put("CSPTCURRENCY", "ARS");//MANDATORIO.      
		parameters.put("CSPTGRANDTOTALAMOUNT", "125.38");//MANDATORIO.
		parameters.put("CSMDD7", "");//NO MANDATORIO.        
		parameters.put("CSMDD8", "Y"); //NO MANDATORIO.       
		parameters.put("CSMDD9", "");//NO MANDATORIO.       
		parameters.put("CSMDD10", "");//NO MANDATORIO.      
		parameters.put("CSMDD11", "");//NO MANDATORIO.
		parameters.put("CSMDD12", "");//NO MADATORIO.     
		parameters.put("CSMDD13", "");//NO MANDATORIO.     
		parameters.put("CSMDD14", "");//NO MANDATORIO.      
		parameters.put("CSMDD15", "");//NO MANDATORIO.        
		parameters.put("CSMDD16", "");//NO MANDATORIO.
		parameters.put("CSITPRODUCTCODE", "electronic_good#chocho");//CONDICIONAL
		parameters.put("CSITPRODUCTDESCRIPTION", "NOTEBOOK L845 SP4304LA DF TOSHIBA#chocho");//CONDICIONAL.     
		parameters.put("CSITPRODUCTNAME", "NOTEBOOK L845 SP4304LA DF TOSHIBA#chocho");//CONDICIONAL.  
		parameters.put("CSITPRODUCTSKU", "LEVJNSL36GN#chocho");//CONDICIONAL.      
		parameters.put("CSITTOTALAMOUNT", "1254.40#10.00");//CONDICIONAL.      
		parameters.put("CSITQUANTITY", "1#1");//CONDICIONAL.       
		parameters.put("CSITUNITPRICE", "1254.40#15.00");
		return parameters;
	}
	

	private static Map<String, String> getAAParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Security", "1234567890ABCDEF1234567890ABCDEF");
		parameters.put("Merchant", "2153");
		parameters.put("RequestKey", "710268a7-7688-c8bf-68c9-430107e6b9da");
		parameters.put("AnswerKey", "693ca9cc-c940-06a4-8d96-1ab0d66f3ee6");
		return parameters;
	}

	 private static Map<String, String> getPMParameters(){
	 Map<String, String> parameters = new HashMap<String, String>();
	 parameters.put("Merchant", "305");
	 return parameters;
	 }

	private static Map<String, String> getSParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Merchant", "2153");
		parameters.put("OperationID", "02");
		return parameters;
	}

	private static Map<String, String> getWsdl() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.AuthorizeWSDL, "file:D:/WorkspaceJuno/TodoPago-sdk/res/Authorize.wsdl");
		return parameters;
	}

	private static Map<String, String> getEndpoint() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.AuthorizeWSDL, "https://developers.todopago.com.ar/services/t/1.1/Authorize");
		parameters.put(ElementNames.Endpoint, "https://developers.todopago.com.ar/t/1.1/");
		return parameters;
	}

	private static Map<String, List<String>> getAuthorization() {
		Map<String, List<String>> parameters = new HashMap<String, List<String>>();
		parameters.put("Authorization", Collections.singletonList("PRISMA f3d8b72c94ab4a06be2ef7c95490f7d3"));
		//include all aditional Http headers to map, all of them will be used
		return parameters;
	}


	
}