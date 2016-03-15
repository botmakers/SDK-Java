<a name="inicio"></a>		
sdk-java	
=======		
		
Modulo para conexi�n con gateway de pago Todo Pago		

######[Instalaci�n](#instalacion)		
######[Versiones de Java soportadas](#Versionesdejavasoportadas)
######[Generalidades](#general)	
######[Uso](#uso)		
######[Datos adicionales para prevencion de fraude] (#datosadicionales) 		
######[Ejemplo](#ejemplo)		
######[Modo test](#test)
######[Status de la operaci�n](#status)
######[Consulta de operaciones por rango de tiempo](#statusdate)
######[Devoluci�nes](#devolucion)
######[Tablas de referencia](#tablas)		
######[Agregar el proyecto a Eclipse](#eclipse)

<a name="instalacion"></a>		
## Instalaci�n		
Se debe descargar la �ltima versi�n del SDK desde el bot�n Download ZIP, branch master.		
Una vez descargado y descomprimido, debe hacerse el siguiente include.
```java
import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.TodoPagoConector;
```

En caso de utilizar Maven se puede agregar el jar al repositorio local de Maven utilizando la siguinte linea de comando:
```
mvn install:install-file -Dfile=<path-to-file> -DpomFile=<path-to-pomfile>
```
Una vez hecho esto se puede agregar la dependencia a este paquete desde el pom.xml
```xml
<dependency>
	<groupId>com.ar.todopago</groupId>
	<artifactId>sdk-java</artifactId>
	<version>1.2.0</version>
</dependency>
```

El Ejemplo es un proyecto hecho en maven, con un pom.xml que incluye la configuracion para importar y exportar las librerias requeridas.

Para agregar el proyecto de ejemplo a Eclipse, una vez descargado, por consola ir hasta su carpeta y ejecutar las siguientes lineas:
```
mvn clean install �Dwtpversion=2.0
mvn eclipse:clean eclipse:eclipse �Dwtpversion=2.0
```
Luego, importar el proyecto normalmente en eclipse.

<br />		
[<sub>Volver a inicio</sub>](#inicio)		

<a name="Versionesdejavasoportadas"></a>		
## Versiones de Java soportadas		
La versi&oacute;n implementada de la SDK, esta testeada para versiones desde  Java 5 en adelante con JAX-WS.
<br />		
[<sub>Volver a inicio</sub>](#inicio)		

<a name="general"></a>
## Generalidades
Esta versi�n soporta �nicamente pago en moneda nacional argentina (CURRENCYCODE = 32).
[<sub>Volver a inicio</sub>](#inicio)		


<a name="uso"></a>		
## Uso		
####1.Inicializar la clase correspondiente al conector (TodoPago).

```java
Map<String, String> endpoint = new HashMap<>();
endpoint.put(ElementNames.AuthorizeWSDL.getValue(), "https://developers.todopago.com.ar/");
```
- crear un Map<String, List<String>> con los http header suministrados por Todo Pago
```java
Map<String, List<String>> auth = new HashMap<>(String, List<String>);
auth.put("Authorization", Collections.singletonList("PRISMA f3d8b72c94ab4a06be2ef7c95490f7d3"));
```
- crear una instancia de la clase TodoPago
```java		
TodoPagoConector tpc = new TodoPagoConector(endpoint, auth);//End Point y http_header provisto por TODO PAGO	
```		
		
####2.Solicitud de autorizaci�n		
En este caso hay que llamar a sendAuthorizeRequest(). 		
```java		
Map<String, Object> a = tpc.sendAuthorizeRequest(sARParameters, getFraudControlParameters());		
```		
<ins><strong>datos propios del comercio</strong></ins>		
 
$optionsSAR_comercio debe ser un Map<String, String> con la siguiente estructura:		
		
```java
Map<String, String> sARParameters = new HashMap<String, String>();
sARParameters.put("Session", "ABCDEF-1234-12221-FDE1-00000200");
sARParameters.put("Security", "f3d8b72c94ab4a06be2ef7c95490f7d3");
sARParameters.put("EncodingMethod", "XML");
sARParameters.put("Merchant", "2153");
sARParameters.put("OperationId", "8000");
sARParameters.put("CurrencyCode", "032");
sARParameters.put("Amount", "1.00");
sARParameters.put("URL_OK", "http,//someurl.com/ok/");
sARParameters.put("URL_ERROR", "http,//someurl/fail/");
sARParameters.put("EMAILCLIENTE", "some@someurl.com");


```		
		
####3.Confirmaci�n de transacci�n.		
En este caso hay que llamar a getAuthorizeAnswer(), enviando como parámetro un Map<String, String> como se describe a continuaci�n.		
```java		
Map<String, String> parameters = new HashMap<String, String>();
parameters.put("Security", "f3d8b72c94ab4a06be2ef7c95490f7d3");
parameters.put("Merchant", "2153");
parameters.put("RequestKey", "710268a7-7688-c8bf-68c9-430107e6b9da");
parameters.put("AnswerKey", "693ca9cc-c940-06a4-8d96-1ab0d66f3ee6");		

Map<String, Object> b = tpc.getAuthorizeAnswer(parameters);

```		
<strong><ins>*Importante:</ins></strong>El campo AnswerKey se adiciona  en la redireccion que se realiza a alguna de las direcciones ( URL ) epecificadas en el  servicio SendAurhorizationRequest, esto sucede cuando la transaccion ya fue resuelta y es necesario regresar al Site para finalizar la transaccion de pago, tambien se adiciona el campo Order, el cual tendra el contenido enviado en el campo OPERATIONID. para nuestro ejemplo: <strong>http://susitio.com/paydtodopago/ok?Order=27398173292187&Answer=1111-2222-3333-4444-5555-6666-7777</strong>		
		
```java		
Map<String, String> parameters = new HashMap<String, String>();		
parameters.put("StatusCode", "-1"); 		
parameters.put("StatusMessage", "APROBADA");		
parameters.put("AuthorizationKey", "1294-329E-F2FD-1AD8-3614-1218-2693-1378");		
parameters.put("EncodingMethod", "XML");

Map<String, String> payload = new HashMap<String, String>();
Map<String, String> answer = new HashMap<String, String>();

answer.put("DATETIME", "2015/07/11 15:24:38");		
answer.put("RESULTCODE", "-1");
answer.put("RESULTMESSAGE", "APROBADA");		
answer.put("CURRENCYNAME", "Pesos");	
answer.put("PAYMENTMETHODNAME", "VISA");		
answer.put("TICKETNUMBER", "12");	
answer.put("CARDNUMBERVISIBLE", "450799******4905");		
answer.put("AUTHORIZATIONCODE", "TEST38");

payload.put("Answer", answer);

Map<String, String> request = new HashMap<String, String>();
request.put("MERCHANT", "12345678");	
request.put("OPERATIONID", "ABCDEF-1234-12221-FDE1-00000012");		
request.put("AMOUNT", "1.00");
request.put("CURRENCYCODE", "032");

payload.put("Request", request);

parameters.put("Payload", payload);

```		
Este método devuelve el resumen de los datos de la transacci�n.		
<br />		
		
[<sub>Volver a inicio</sub>](#inicio)		
		
<a name="datosadicionales"></a>		
## Datos adicionales para control de fraude		
Para el envío de informaci�n adicional para control de fraude, el comercio debe enviar los siguientes datos:		
		
```java		
//Parametros para el control de fraude
private static Map<String, String> getFraudControlParameters() {
	//Example
	Map<String, String> parameters = new HashMap<String, String>();		
	parameters.put("CSBTCITY", "Villa General Belgrano"); //Ciudad de facturaci�n, MANDATORIO.		
	parameters.put("CSBTCOUNTRY", "AR");//País de facturaci�n. MANDATORIO. C�digo ISO.
	parameters.put("CSBTCUSTOMERID", "453458"); //Identificador del usuario al que se le emite la factura. MANDATORIO. No 
				//puede contener un correo electr�nico.		
	parameters.put(CSBTIPADDRESS", "192.0.0.4"); //IP de la PC del comprador. MANDATORIO.		
	parameters.put(CSBTEMAIL", "some@someurl.com"); //Mail del usuario al que se le emite la factura. MANDATORIO.
	parameters.put(CSBTFIRSTNAME", "Juan");//Nombre del usuario al que se le emite la factura. MANDATORIO.		
	parameters.put(CSBTLASTNAME", "Perez");//Apellido del usuario al que se le emite la factura. MANDATORIO.
	parameters.put(CSBTPHONENUMBER", "541160913988");//Teléfono del usuario al que se le emite la factura. No utilizar 
				//guiones, puntos o espacios. Incluir c�digo de país. MANDATORIO.		
	parameters.put(CSBTPOSTALCODE", "1010");//C�digo Postal de la direcci�n de facturaci�n. MANDATORIO.
	parameters.put(CSBTSTATE", "B");//Provincia de la direcci�n de facturaci�n. MANDATORIO. Ver tabla anexa de provincias.
	parameters.put(CSBTSTREET1", "Some Street 2153");//Domicilio de facturaci�n (calle y nro). MANDATORIO.		
	parameters.put("CSBTSTREET2", "");//NO MANDATORIO.
	parameters.put(CSPTCURRENCY", "ARS");//Moneda. MANDATORIO.		
	parameters.put(CSPTGRANDTOTALAMOUNT", "125.38");//Con decimales opcional usando el puntos como separador de decimales.
				//No se permiten comas, ni como separador de miles ni como separador de decimales. MANDATORIO.
				//(Ejemplos:$125,38-> 125.38 $12-> 12 o 12.00)		
	parameters.put(CSMDD7", "");// Fecha registro comprador(num Dias). NO MANDATORIO.		
	parameters.put(CSMDD8", "Y"); //Usuario Guest? (Y/N). En caso de ser Y, el campo CSMDD9 no deberá enviarse. NO 
				//MANDATORIO.		
	parameters.put(CSMDD9", "");//Customer password Hash: criptograma asociado al password del comprador final. NO 	
				//MANDATORIO.		
	parameters.put(CSMDD10", "");//Hist�rica de compras del comprador (Num transacciones). NO MANDATORIO.		
	parameters.put(CSMDD11", "");//Customer Cell Phone. NO MANDATORIO.		

	//Retail
	parameters.put("CSSTCITY", "Villa General Belgrano");//Ciudad de enví­o de la orden. MANDATORIO.		
	parameters.put("CSSTCOUNTRY", "AR");//País de envío de la orden. MANDATORIO.		
	parameters.put("CSSTEMAIL", "some@someurl.com");//Mail del destinatario, MANDATORIO.		
	parameters.put("CSSTFIRSTNAME", "Juan");//Nombre del destinatario. MANDATORIO.		
	parameters.put("CSSTLASTNAME", "Perez");//Apellido del destinatario. MANDATORIO.		
	parameters.put("CSSTPHONENUMBER", "541160913988");//N�mero de teléfono del destinatario. MANDATORIO.		
	parameters.put("CSSTPOSTALCODE", "1010");//C�digo postal del domicilio de envío. MANDATORIO.		
	parameters.put("CSSTSTATE", "B");//Provincia de envío. MANDATORIO. Son de 1 caracter		
	parameters.put("CSSTSTREET1", "Some Street 2153");//Domicilio de envío. MANDATORIO.		
	parameters.put("CSSTSTREET2", "");//NO MANDATORIO.
	parameters.put("CSMDD12", "");//Shipping DeadLine (Num Dias). NO MADATORIO.		
	parameters.put("CSMDD13", "");//Método de Despacho. NO MANDATORIO.		
	parameters.put("CSMDD14", "");//Customer requires Tax Bill ? (Y/N). NO MANDATORIO.		
	parameters.put("CSMDD15", "");//Customer Loyality Number. NO MANDATORIO. 		
	parameters.put("CSMDD16", "");//Promotional / Coupon Code. NO MANDATORIO. 		
	
	//datos a enviar por cada producto, los valores deben estar separado con #:		
	parameters.put("CSITPRODUCTCODE", "electronic_good");//C�digo de producto. CONDICIONAL. Valores posibles(adult_content;coupon;default;electronic_good;electronic_software;gift_certificate;handling_only;service;shipping_and_handling;shipping_only;subscription)		
	parameters.put("CSITPRODUCTDESCRIPTION", "Test Prd Description");//Descripci�n del producto. CONDICIONAL.		
	parameters.put("CSITPRODUCTNAME", "TestPrd");//Nombre del producto. CONDICIONAL.	
	parameters.put("CSITPRODUCTSKU", "SKU1234");//C�digo identificador del producto. CONDICIONAL.		
	parameters.put("CSITTOTALAMOUNT", "10.01");//CSITTOTALAMOUNT=CSITUNITPRICE*CSITQUANTITY "999999[.CC]" Con decimales opcional usando el puntos como separador de decimales. No se permiten comas, ni como separador de miles ni como separador de decimales. CONDICIONAL.		
	parameters.put("CSITQUANTITY", "1");//Cantidad del producto. CONDICIONAL.		
	parameters.put("CSITUNITPRICE", "10.01");//Formato Idem CSITTOTALAMOUNT. CONDICIONAL.	
```		

[<sub>Volver a inicio</sub>](#inicio)		
		
<a name="ejemplo"></a>		
## Ejemplo		
Existe un ejemplo en la carpeta https://github.com/TodoPago/sdk-java/tree/master/src/test que muestra los resultados de los métodos principales del SDK.		
		
[<sub>Volver a inicio</sub>](#inicio)	
<a name="status"></a>
## Status de la Operaci�n
La SDK cuenta con un m&eacute;todo para consultar el status de la transacci&oacute;n desde la misma SDK. El m&eacute;todo se utiliza de la siguiente manera:
```java
TodoPagoConector tpc = new TodoPagoConector(TodoPagoConector.developerEndpoint ,getAuthorization());

private static Map<String, String> getSParameters(){
	Map<String, String> parameters = new HashMap<String, String>();
	parameters.put("Merchant", "305");
	parameters.put("OperationID", "01");
	return parameters;
}
Map<String, Object> d = tpc.getStatus(getSParameters());// Merchant es el id site y $operation_id es el id operaci�n que se envi�n en el array a través del método sendAuthorizeRequest() 
```
El siguiente m&eacute;todo retornara el status actual de la transacci&oacute;n en Todopago.
[<sub>Volver a inicio</sub>](#inicio)

<a name="statusdate"></a>
## Consulta de operaciones por rango de tiempo
En este caso hay que llamar a getByRangeDateTime() y devolvera todas las operaciones realizadas en el rango de fechas dado

```java
TodoPagoConector tpc = new TodoPagoConector(TodoPagoConector.developerEndpoint ,getAuthorization());
private static Map<String, String> getBRYParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.Merchant, "2153");
		parameters.put(ElementNames.STARTDATE, "2016-01-01");
		parameters.put(ElementNames.ENDDATE, "2016-03-03");
		parameters.put(ElementNames.PAGENUMBER, "1");	
		return parameters;
	});
	
	Map<String, Object> j = tpc.getByRangeDateTime(getBRYParameters());
```

[<sub>Volver a inicio</sub>](#inicio)	

<a name="devolucion"></a>
## Devoluci�nes
La SDK dispone de dos m&eacute;todos para realizar la devoluci�n online, total o parcial, de una transacci&oacute;n realizada a traves de TodoPago. El m&eacute;todo se utiliza de la siguiente manera:

Devoluci�n Total
```java
TodoPagoConector tpc = new TodoPagoConector(TodoPagoConector.developerEndpoint ,getAuthorization());
private static Map<String, String> getVRParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.Security, "f3d8b72c94ab4a06be2ef7c95490f7d3");
		parameters.put(ElementNames.Merchant, "2153");
		parameters.put(ElementNames.AuthorizationKey, "e31d340c-690c-afe6-c478-fc1bef3fc157");
		return parameters;
	}
Map<String, Object> h = tpc.voidRequest(getVRParameters());// Merchant es el id site y AuthorizationKey es la key se que retorna a través del método getAuthorizeAnswer() 
```
Devoluci�n Parcial
```java
TodoPagoConector tpc = new TodoPagoConector(TodoPagoConector.developerEndpoint ,getAuthorization());
private static Map<String, String> getRRParameters() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(ElementNames.Security, "f3d8b72c94ab4a06be2ef7c95490f7d3");
		parameters.put(ElementNames.Merchant, "2153");
		parameters.put(ElementNames.AuthorizationKey, "c7a2b859-e850-7460-4752-61951fed2195");
		parameters.put(ElementNames.Amount, "0.5");
		return parameters;
	}
Map<String, Object> i = tpc.returnRequest(getRRParameters());// Merchant es el id site , AuthorizationKey es la key se que retorna a través del método getAuthorizeAnswer() y Amount la cantidad a devolver (float Type)
```

Si la operaci�n fue realizada correctamente se informar� con un c�digo 2011 y un mensaje indicando el �xito de la operaci�n.

[<sub>Volver a inicio</sub>](#inicio)	

<a name="tablas"></a>		
## Tablas de Referencia		
######[C�digos de Estado](#cde)		
######[Provincias](#p)		
<a name="cde"></a>		
<p>Codigos de Estado</p>		
<table>		
<tr><th>IdEstado</th><th>Descripcion</th></tr>		
<tr><td>1</td><td>Ingresada</td></tr>		
<tr><td>2</td><td>A procesar</td></tr>		
<tr><td>3</td><td>Procesada</td></tr>		
<tr><td>4</td><td>Autorizada</td></tr>		
<tr><td>5</td><td>Rechazada</td></tr>		
<tr><td>6</td><td>Acreditada</td></tr>		
<tr><td>7</td><td>Anulada</td></tr>		
<tr><td>8</td><td>Anulacion Confirmada</td></tr>		
<tr><td>9</td><td>Devuelta</td></tr>		
<tr><td>10</td><td>Devolucion Confirmada</td></tr>		
<tr><td>11</td><td>Pre autorizada</td></tr>		
<tr><td>12</td><td>Vencida</td></tr>		
<tr><td>13</td><td>Acreditacion no cerrada</td></tr>		
<tr><td>14</td><td>Autorizada *</td></tr>		
<tr><td>15</td><td>A reversar</td></tr>		
<tr><td>16</td><td>A registar en Visa</td></tr>		
<tr><td>17</td><td>Validacion iniciada en Visa</td></tr>		
<tr><td>18</td><td>Enviada a validar en Visa</td></tr>		
<tr><td>19</td><td>Validada OK en Visa</td></tr>		
<tr><td>20</td><td>Recibido desde Visa</td></tr>		
<tr><td>21</td><td>Validada no OK en Visa</td></tr>		
<tr><td>22</td><td>Factura generada</td></tr>		
<tr><td>23</td><td>Factura no generada</td></tr>		
<tr><td>24</td><td>Rechazada no autenticada</td></tr>		
<tr><td>25</td><td>Rechazada datos inválidos</td></tr>		
<tr><td>28</td><td>A registrar en IdValidador</td></tr>		
<tr><td>29</td><td>Enviada a IdValidador</td></tr>		
<tr><td>32</td><td>Rechazada no validada</td></tr>		
<tr><td>38</td><td>Timeout de compra</td></tr>		
<tr><td>50</td><td>Ingresada Distribuida</td></tr>		
<tr><td>51</td><td>Rechazada por grupo</td></tr>		
<tr><td>52</td><td>Anulada por grupo</td></tr>		
</table>		
		
<a name="p"></a>		
<p>Provincias</p>
<p>Solo utilizado para incluir los datos de control de fraude</p>
<table>		
<tr><th>Provincia</th><th>Codigo</th></tr>		
<tr><td>CABA</td><td>C</td></tr>		
<tr><td>Buenos Aires</td><td>B</td></tr>		
<tr><td>Catamarca</td><td>K</td></tr>		
<tr><td>Chaco</td><td>H</td></tr>		
<tr><td>Chubut</td><td>U</td></tr>		
<tr><td>Cordoba</td><td>X</td></tr>		
<tr><td>Corrientes</td><td>W</td></tr>		
<tr><td>Entre Ríos</td><td>E</td></tr>		
<tr><td>Formosa</td><td>P</td></tr>		
<tr><td>Jujuy</td><td>Y</td></tr>		
<tr><td>La Pampa</td><td>L</td></tr>		
<tr><td>La Rioja</td><td>F</td></tr>		
<tr><td>Mendoza</td><td>M</td></tr>		
<tr><td>Misiones</td><td>N</td></tr>		
<tr><td>Neuquén</td><td>Q</td></tr>		
<tr><td>Río Negro</td><td>R</td></tr>		
<tr><td>Salta</td><td>A</td></tr>		
<tr><td>San Juan</td><td>J</td></tr>		
<tr><td>San Luis</td><td>D</td></tr>		
<tr><td>Santa Cruz</td><td>Z</td></tr>		
<tr><td>Santa Fe</td><td>S</td></tr>		
<tr><td>Santiago del Estero</td><td>G</td></tr>		
<tr><td>Tierra del Fuego</td><td>V</td></tr>		
<tr><td>Tucumán</td><td>T</td></tr>		
</table>		
[<sub>Volver a inicio</sub>](#inicio)

<a name="eclipse"></a>		
## Agregar el proyecto a Eclipse		
- Bajar Maven 3 de la siguiente URL: http://maven.apache.org/download.cgi
- Descomprimir lo descargado.
- Agregar o modificar la variable de entorno M2_HOME con path a donde se descomprimi� Maven 
- Descargar el proyecto de GitHub
- Por consola ir a la carpeta donde se descargo el proyecto
- Ejecutar las siguientes líneas:
	- mvn clean install �Dwtpversion=2.0
	- mvn eclipse:clean eclipse:eclipse �Dwtpversion=2.0
- Ir a Eclipse e importar el Proyecto normalmente: File � Import � Existing Projects into Workspace

<br />		
[<sub>Volver a inicio</sub>](#inicio)