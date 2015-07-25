
package ar.com.todopago.api.authorize;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.todopago.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendAuthorizeRequestResponseRequestKey_QNAME = new QName("http://api.todopago.com.ar", "RequestKey");
    private final static QName _SendAuthorizeRequestResponseStatusMessage_QNAME = new QName("http://api.todopago.com.ar", "StatusMessage");
    private final static QName _SendAuthorizeRequestResponseURLRequest_QNAME = new QName("http://api.todopago.com.ar", "URL_Request");
    private final static QName _SendAuthorizeRequestResponsePublicRequestKey_QNAME = new QName("http://api.todopago.com.ar", "PublicRequestKey");
    private final static QName _GetAuthorizeAnswerAnswerKey_QNAME = new QName("http://api.todopago.com.ar", "AnswerKey");
    private final static QName _GetAuthorizeAnswerSession_QNAME = new QName("http://api.todopago.com.ar", "Session");
    private final static QName _GetAuthorizeAnswerResponseAuthorizationKey_QNAME = new QName("http://api.todopago.com.ar", "AuthorizationKey");
    private final static QName _GetAuthorizeAnswerResponsePayload_QNAME = new QName("http://api.todopago.com.ar", "Payload");
    private final static QName _GetAuthorizeAnswerResponseEncodingMethod_QNAME = new QName("http://api.todopago.com.ar", "EncodingMethod");
    private final static QName _SendAuthorizeRequestURLERROR_QNAME = new QName("http://api.todopago.com.ar", "URL_ERROR");
    private final static QName _SendAuthorizeRequestURLOK_QNAME = new QName("http://api.todopago.com.ar", "URL_OK");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.todopago.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendAuthorizeRequest }
     * 
     */
    public SendAuthorizeRequest createSendAuthorizeRequest() {
        return new SendAuthorizeRequest();
    }

    /**
     * Create an instance of {@link GetAuthorizeAnswerResponse }
     * 
     */
    public GetAuthorizeAnswerResponse createGetAuthorizeAnswerResponse() {
        return new GetAuthorizeAnswerResponse();
    }

    /**
     * Create an instance of {@link SendAuthorizeRequestResponse }
     * 
     */
    public SendAuthorizeRequestResponse createSendAuthorizeRequestResponse() {
        return new SendAuthorizeRequestResponse();
    }

    /**
     * Create an instance of {@link GetAuthorizeAnswer }
     * 
     */
    public GetAuthorizeAnswer createGetAuthorizeAnswer() {
        return new GetAuthorizeAnswer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "RequestKey", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponseRequestKey(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponseRequestKey_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "StatusMessage", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponseStatusMessage(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponseStatusMessage_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "URL_Request", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponseURLRequest(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponseURLRequest_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "PublicRequestKey", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponsePublicRequestKey(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponsePublicRequestKey_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "AnswerKey", scope = GetAuthorizeAnswer.class)
    public JAXBElement<String> createGetAuthorizeAnswerAnswerKey(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerAnswerKey_QNAME, String.class, GetAuthorizeAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "RequestKey", scope = GetAuthorizeAnswer.class)
    public JAXBElement<String> createGetAuthorizeAnswerRequestKey(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponseRequestKey_QNAME, String.class, GetAuthorizeAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "Session", scope = GetAuthorizeAnswer.class)
    public JAXBElement<String> createGetAuthorizeAnswerSession(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerSession_QNAME, String.class, GetAuthorizeAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "AuthorizationKey", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<String> createGetAuthorizeAnswerResponseAuthorizationKey(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerResponseAuthorizationKey_QNAME, String.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "StatusMessage", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<String> createGetAuthorizeAnswerResponseStatusMessage(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponseStatusMessage_QNAME, String.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "Payload", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<Object> createGetAuthorizeAnswerResponsePayload(Object value) {
        return new JAXBElement<Object>(_GetAuthorizeAnswerResponsePayload_QNAME, Object.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "EncodingMethod", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<String> createGetAuthorizeAnswerResponseEncodingMethod(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerResponseEncodingMethod_QNAME, String.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "Session", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestSession(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerSession_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "Payload", scope = SendAuthorizeRequest.class)
    public JAXBElement<Object> createSendAuthorizeRequestPayload(Object value) {
        return new JAXBElement<Object>(_GetAuthorizeAnswerResponsePayload_QNAME, Object.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "EncodingMethod", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestEncodingMethod(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerResponseEncodingMethod_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "URL_ERROR", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestURLERROR(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestURLERROR_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "URL_OK", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestURLOK(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestURLOK_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

}
