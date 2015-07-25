
package ar.com.todopago.api.payment;

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

    private final static QName _PaymentMethodsCollection_QNAME = new QName("http://api.todopago.com.ar", "PaymentMethodsCollection");
    private final static QName _CurrenciesCollection_QNAME = new QName("http://api.todopago.com.ar", "CurrenciesCollection");
    private final static QName _PromosCollection_QNAME = new QName("http://api.todopago.com.ar", "PromosCollection");
    private final static QName _BanksCollection_QNAME = new QName("http://api.todopago.com.ar", "BanksCollection");
    private final static QName _PaymentMethodBanksCollection_QNAME = new QName("http://api.todopago.com.ar", "PaymentMethodBanksCollection");
    private final static QName _PromotionsCollection_QNAME = new QName("http://api.todopago.com.ar", "PromotionsCollection");
    private final static QName _Result_QNAME = new QName("http://api.todopago.com.ar", "Result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.todopago.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PromotionsCollection }
     * 
     */
    public PromotionsCollection createPromotionsCollection() {
        return new PromotionsCollection();
    }

    /**
     * Create an instance of {@link PaymentMethodBanksCollection }
     * 
     */
    public PaymentMethodBanksCollection createPaymentMethodBanksCollection() {
        return new PaymentMethodBanksCollection();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link BanksCollection }
     * 
     */
    public BanksCollection createBanksCollection() {
        return new BanksCollection();
    }

    /**
     * Create an instance of {@link PromosCollection }
     * 
     */
    public PromosCollection createPromosCollection() {
        return new PromosCollection();
    }

    /**
     * Create an instance of {@link GetComplete }
     * 
     */
    public GetComplete createGetComplete() {
        return new GetComplete();
    }

    /**
     * Create an instance of {@link GetPromotions }
     * 
     */
    public GetPromotions createGetPromotions() {
        return new GetPromotions();
    }

    /**
     * Create an instance of {@link CurrenciesCollection }
     * 
     */
    public CurrenciesCollection createCurrenciesCollection() {
        return new CurrenciesCollection();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link PaymentMethodsCollection }
     * 
     */
    public PaymentMethodsCollection createPaymentMethodsCollection() {
        return new PaymentMethodsCollection();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link Bank }
     * 
     */
    public Bank createBank() {
        return new Bank();
    }

    /**
     * Create an instance of {@link PaymentMethod }
     * 
     */
    public PaymentMethod createPaymentMethod() {
        return new PaymentMethod();
    }

    /**
     * Create an instance of {@link PaymentMethodBank }
     * 
     */
    public PaymentMethodBank createPaymentMethodBank() {
        return new PaymentMethodBank();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link Promo }
     * 
     */
    public Promo createPromo() {
        return new Promo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodsCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "PaymentMethodsCollection")
    public JAXBElement<PaymentMethodsCollection> createPaymentMethodsCollection(PaymentMethodsCollection value) {
        return new JAXBElement<PaymentMethodsCollection>(_PaymentMethodsCollection_QNAME, PaymentMethodsCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrenciesCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "CurrenciesCollection")
    public JAXBElement<CurrenciesCollection> createCurrenciesCollection(CurrenciesCollection value) {
        return new JAXBElement<CurrenciesCollection>(_CurrenciesCollection_QNAME, CurrenciesCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromosCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "PromosCollection")
    public JAXBElement<PromosCollection> createPromosCollection(PromosCollection value) {
        return new JAXBElement<PromosCollection>(_PromosCollection_QNAME, PromosCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanksCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "BanksCollection")
    public JAXBElement<BanksCollection> createBanksCollection(BanksCollection value) {
        return new JAXBElement<BanksCollection>(_BanksCollection_QNAME, BanksCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodBanksCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "PaymentMethodBanksCollection")
    public JAXBElement<PaymentMethodBanksCollection> createPaymentMethodBanksCollection(PaymentMethodBanksCollection value) {
        return new JAXBElement<PaymentMethodBanksCollection>(_PaymentMethodBanksCollection_QNAME, PaymentMethodBanksCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionsCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "PromotionsCollection")
    public JAXBElement<PromotionsCollection> createPromotionsCollection(PromotionsCollection value) {
        return new JAXBElement<PromotionsCollection>(_PromotionsCollection_QNAME, PromotionsCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.todopago.com.ar", name = "Result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
    }

}
