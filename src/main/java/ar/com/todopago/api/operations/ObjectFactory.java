
package ar.com.todopago.api.operations;

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

    private final static QName _OperationsColections_QNAME = new QName("http://api.todopago.com.ar", "OperationsColections");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.todopago.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationsColections }
     * 
     */
    public OperationsColections createOperationsColections() {
        return new OperationsColections();
    }

    /**
     * Create an instance of {@link GetByOperationId }
     * 
     */
    public GetByOperationId createGetByOperationId() {
        return new GetByOperationId();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsColections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "OperationsColections")
    public JAXBElement<OperationsColections> createOperationsColections(OperationsColections value) {
        return new JAXBElement<OperationsColections>(_OperationsColections_QNAME, OperationsColections.class, null, value);
    }

}
