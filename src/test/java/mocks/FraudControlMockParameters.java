package mocks;

import java.util.HashMap;
import java.util.Map;

public class FraudControlMockParameters {

	// Parametros para el control de fraude
	public static Map<String, String> getFraudControlParameters() {
		// Example
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("CSBTCITY", "Villa General Belgrano"); // MANDATORIO.
		parameters.put("CSBTCOUNTRY", "AR");// MANDATORIO. C�digo ISO.
		parameters.put("CSBTEMAIL", "some@someurl.com"); // MANDATORIO.
		parameters.put("CSBTFIRSTNAME", "juan");// MANDATORIO.
		parameters.put("CSBTLASTNAME", "Perez");// MANDATORIO.
		parameters.put("CSBTPHONENUMBER", "541160913988");// MANDATORIO.
		parameters.put("CSBTPOSTALCODE", "1010");// MANDATORIO.
		parameters.put("CSBTSTATE", "B");// MANDATORIO
		parameters.put("CSBTSTREET1", "Some Street 2153");// MANDATORIO.
		parameters.put("CSBTSTREET2", "Test");// NO MANDATORIO

		parameters.put("CSBTCUSTOMERID", "453458"); // MANDATORIO.
		parameters.put("CSBTIPADDRESS", "192.0.0.4"); // MANDATORIO.
		parameters.put("CSPTCURRENCY", "ARS");// MANDATORIO.
		parameters.put("CSPTGRANDTOTALAMOUNT", "10.01");// MANDATORIO.

		parameters.put("CSMDD6", "");// NO MANDATORIO.
		parameters.put("CSMDD7", "");// NO MANDATORIO.
		parameters.put("CSMDD8", "");// NO MANDATORIO.
		parameters.put("CSMDD9", "");// NO MANDATORIO.
		parameters.put("CSMDD10", "");// NO MANDATORIO.
		parameters.put("CSMDD11", "");// NO MANDATORIO.

		switch (TodoPagoParametersMock.vertical) {
		case TodoPagoParametersMock.RETAIL:
			setRetail(parameters);
			break;
		}

		return parameters;
	}
	
	public static void setRetail(Map<String, String> parameters) {
		parameters.put("CSSTCITY", "Villa General Belgrano"); // MANDATORIO.
		parameters.put("CSSTCOUNTRY", "AR");// MANDATORIO. C�digo ISO.
		parameters.put("CSSTEMAIL", "some@someurl.com"); // MANDATORIO.
		parameters.put("CSSTFIRSTNAME", "Juan");// MANDATORIO.
		parameters.put("CSSTLASTNAME", "Perez");// MANDATORIO.
		parameters.put("CSSTPHONENUMBER", "541160913988");// MANDATORIO.
		parameters.put("CSSTPOSTALCODE", " 1010");// MANDATORIO.
		parameters.put("CSSTSTATE", "B");// MANDATORIO
		parameters.put("CSSTSTREET1", "Some Street 2153");// MANDATORIO.
		parameters.put("CSSTSTREET2", "Test");// NO MANDATORIO.

		parameters.put("CSITPRODUCTCODE", "electronic_good");// CONDICIONAL
		parameters.put("CSITPRODUCTDESCRIPTION", "Test Prd Description");// CONDICIONAL.
		parameters.put("CSITPRODUCTNAME", "TestPrd");// CONDICIONAL.
		parameters.put("CSITPRODUCTSKU", "SKU1234");// CONDICIONAL.
		parameters.put("CSITTOTALAMOUNT", "10.01");// CONDICIONAL.
		parameters.put("CSITQUANTITY", "1");// CONDICIONAL.
		parameters.put("CSITUNITPRICE", "10.01");

		parameters.put("CSMDD12", "");// NO MADATORIO.
		parameters.put("CSMDD13", "");// NO MANDATORIO.
		parameters.put("CSMDD14", "");// NO MANDATORIO.
		parameters.put("CSMDD15", "");// NO MANDATORIO.
		parameters.put("CSMDD16", "");// NO MANDATORIO.
	}
}
