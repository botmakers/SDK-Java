
package ar.com.todopago.api.payment;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Logo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDateCheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityCodeLength" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SecurityCodeCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CardNumberLengthMin" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CardNumberLengthMax" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{http://api.todopago.com.ar}CurrenciesCollection"/>
 *         &lt;element ref="{http://api.todopago.com.ar}PromosCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethod", propOrder = {
    "id",
    "name",
    "logo",
    "expirationDateCheck",
    "securityCodeLength",
    "securityCodeCheck",
    "cardNumberLengthMin",
    "cardNumberLengthMax",
    "currenciesCollection",
    "promosCollection"
})
public class PaymentMethod {

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Logo", required = true, nillable = true)
    protected String logo;
    @XmlElement(name = "ExpirationDateCheck", required = true, nillable = true)
    protected String expirationDateCheck;
    @XmlElement(name = "SecurityCodeLength", required = true, nillable = true)
    protected BigInteger securityCodeLength;
    @XmlElement(name = "SecurityCodeCheck", required = true, type = Boolean.class, nillable = true)
    protected Boolean securityCodeCheck;
    @XmlElement(name = "CardNumberLengthMin", required = true, nillable = true)
    protected BigInteger cardNumberLengthMin;
    @XmlElement(name = "CardNumberLengthMax", required = true, nillable = true)
    protected BigInteger cardNumberLengthMax;
    @XmlElement(name = "CurrenciesCollection", required = true)
    protected CurrenciesCollection currenciesCollection;
    @XmlElement(name = "PromosCollection", required = true)
    protected PromosCollection promosCollection;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the expirationDateCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDateCheck() {
        return expirationDateCheck;
    }

    /**
     * Sets the value of the expirationDateCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDateCheck(String value) {
        this.expirationDateCheck = value;
    }

    /**
     * Gets the value of the securityCodeLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecurityCodeLength() {
        return securityCodeLength;
    }

    /**
     * Sets the value of the securityCodeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecurityCodeLength(BigInteger value) {
        this.securityCodeLength = value;
    }

    /**
     * Gets the value of the securityCodeCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecurityCodeCheck() {
        return securityCodeCheck;
    }

    /**
     * Sets the value of the securityCodeCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecurityCodeCheck(Boolean value) {
        this.securityCodeCheck = value;
    }

    /**
     * Gets the value of the cardNumberLengthMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardNumberLengthMin() {
        return cardNumberLengthMin;
    }

    /**
     * Sets the value of the cardNumberLengthMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardNumberLengthMin(BigInteger value) {
        this.cardNumberLengthMin = value;
    }

    /**
     * Gets the value of the cardNumberLengthMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardNumberLengthMax() {
        return cardNumberLengthMax;
    }

    /**
     * Sets the value of the cardNumberLengthMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardNumberLengthMax(BigInteger value) {
        this.cardNumberLengthMax = value;
    }

    /**
     * Gets the value of the currenciesCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CurrenciesCollection }
     *     
     */
    public CurrenciesCollection getCurrenciesCollection() {
        return currenciesCollection;
    }

    /**
     * Sets the value of the currenciesCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrenciesCollection }
     *     
     */
    public void setCurrenciesCollection(CurrenciesCollection value) {
        this.currenciesCollection = value;
    }

    /**
     * Gets the value of the promosCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PromosCollection }
     *     
     */
    public PromosCollection getPromosCollection() {
        return promosCollection;
    }

    /**
     * Sets the value of the promosCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromosCollection }
     *     
     */
    public void setPromosCollection(PromosCollection value) {
        this.promosCollection = value;
    }

}
