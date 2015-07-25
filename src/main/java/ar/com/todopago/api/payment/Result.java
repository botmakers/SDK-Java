
package ar.com.todopago.api.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.todopago.com.ar}PaymentMethodsCollection" minOccurs="0"/>
 *         &lt;element ref="{http://api.todopago.com.ar}BanksCollection" minOccurs="0"/>
 *         &lt;element ref="{http://api.todopago.com.ar}PaymentMethodBanksCollection" minOccurs="0"/>
 *         &lt;element ref="{http://api.todopago.com.ar}PromotionsCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "paymentMethodsCollection",
    "banksCollection",
    "paymentMethodBanksCollection",
    "promotionsCollection"
})
public class Result {

    @XmlElement(name = "PaymentMethodsCollection")
    protected PaymentMethodsCollection paymentMethodsCollection;
    @XmlElement(name = "BanksCollection")
    protected BanksCollection banksCollection;
    @XmlElement(name = "PaymentMethodBanksCollection")
    protected PaymentMethodBanksCollection paymentMethodBanksCollection;
    @XmlElement(name = "PromotionsCollection")
    protected PromotionsCollection promotionsCollection;

    /**
     * Gets the value of the paymentMethodsCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodsCollection }
     *     
     */
    public PaymentMethodsCollection getPaymentMethodsCollection() {
        return paymentMethodsCollection;
    }

    /**
     * Sets the value of the paymentMethodsCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodsCollection }
     *     
     */
    public void setPaymentMethodsCollection(PaymentMethodsCollection value) {
        this.paymentMethodsCollection = value;
    }

    /**
     * Gets the value of the banksCollection property.
     * 
     * @return
     *     possible object is
     *     {@link BanksCollection }
     *     
     */
    public BanksCollection getBanksCollection() {
        return banksCollection;
    }

    /**
     * Sets the value of the banksCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BanksCollection }
     *     
     */
    public void setBanksCollection(BanksCollection value) {
        this.banksCollection = value;
    }

    /**
     * Gets the value of the paymentMethodBanksCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodBanksCollection }
     *     
     */
    public PaymentMethodBanksCollection getPaymentMethodBanksCollection() {
        return paymentMethodBanksCollection;
    }

    /**
     * Sets the value of the paymentMethodBanksCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodBanksCollection }
     *     
     */
    public void setPaymentMethodBanksCollection(PaymentMethodBanksCollection value) {
        this.paymentMethodBanksCollection = value;
    }

    /**
     * Gets the value of the promotionsCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionsCollection }
     *     
     */
    public PromotionsCollection getPromotionsCollection() {
        return promotionsCollection;
    }

    /**
     * Sets the value of the promotionsCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsCollection }
     *     
     */
    public void setPromotionsCollection(PromotionsCollection value) {
        this.promotionsCollection = value;
    }

}
