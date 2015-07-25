
package ar.com.todopago.api.operations;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Operations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESULTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RESULTMESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OPERATIONID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CURRENCYCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSTALLMENTPAYMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSTOMEREMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDENTIFICATIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDENTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARDNUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARDHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TICKETNUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="AUTHORIZATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BARCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COUPONEXPDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COUPONSECEXPDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COUPONSUBSCRIBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operations", propOrder = {
    "resultcode",
    "resultmessage",
    "datetime",
    "operationid",
    "currencycode",
    "amount",
    "type",
    "installmentpayments",
    "customeremail",
    "identificationtype",
    "identification",
    "cardnumber",
    "cardholdername",
    "ticketnumber",
    "authorizationcode",
    "barcode",
    "couponexpdate",
    "couponsecexpdate",
    "couponsubscriber"
})
public class Operations {

    @XmlElement(name = "RESULTCODE", required = true, nillable = true)
    protected String resultcode;
    @XmlElement(name = "RESULTMESSAGE", required = true, nillable = true)
    protected String resultmessage;
    @XmlElement(name = "DATETIME", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElement(name = "OPERATIONID", required = true, nillable = true)
    protected String operationid;
    @XmlElement(name = "CURRENCYCODE", required = true, nillable = true)
    protected String currencycode;
    @XmlElement(name = "AMOUNT", required = true, type = Float.class, nillable = true)
    protected Float amount;
    @XmlElement(name = "TYPE", required = true, nillable = true)
    protected String type;
    @XmlElement(name = "INSTALLMENTPAYMENTS", required = true, nillable = true)
    protected String installmentpayments;
    @XmlElement(name = "CUSTOMEREMAIL", required = true, nillable = true)
    protected String customeremail;
    @XmlElement(name = "IDENTIFICATIONTYPE", required = true, nillable = true)
    protected String identificationtype;
    @XmlElement(name = "IDENTIFICATION", required = true, nillable = true)
    protected String identification;
    @XmlElement(name = "CARDNUMBER", required = true, nillable = true)
    protected String cardnumber;
    @XmlElement(name = "CARDHOLDERNAME", required = true, nillable = true)
    protected String cardholdername;
    @XmlElement(name = "TICKETNUMBER", required = true, nillable = true)
    protected BigInteger ticketnumber;
    @XmlElement(name = "AUTHORIZATIONCODE", required = true, nillable = true)
    protected String authorizationcode;
    @XmlElement(name = "BARCODE", required = true, nillable = true)
    protected String barcode;
    @XmlElement(name = "COUPONEXPDATE", required = true, nillable = true)
    protected String couponexpdate;
    @XmlElement(name = "COUPONSECEXPDATE", required = true, nillable = true)
    protected String couponsecexpdate;
    @XmlElement(name = "COUPONSUBSCRIBER", required = true, nillable = true)
    protected String couponsubscriber;

    /**
     * Gets the value of the resultcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTCODE() {
        return resultcode;
    }

    /**
     * Sets the value of the resultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULTCODE(String value) {
        this.resultcode = value;
    }

    /**
     * Gets the value of the resultmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTMESSAGE() {
        return resultmessage;
    }

    /**
     * Sets the value of the resultmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULTMESSAGE(String value) {
        this.resultmessage = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATETIME() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATETIME(XMLGregorianCalendar value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the operationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATIONID() {
        return operationid;
    }

    /**
     * Sets the value of the operationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATIONID(String value) {
        this.operationid = value;
    }

    /**
     * Gets the value of the currencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCODE() {
        return currencycode;
    }

    /**
     * Sets the value of the currencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCODE(String value) {
        this.currencycode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAMOUNT(Float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the installmentpayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTALLMENTPAYMENTS() {
        return installmentpayments;
    }

    /**
     * Sets the value of the installmentpayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTALLMENTPAYMENTS(String value) {
        this.installmentpayments = value;
    }

    /**
     * Gets the value of the customeremail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMEREMAIL() {
        return customeremail;
    }

    /**
     * Sets the value of the customeremail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMEREMAIL(String value) {
        this.customeremail = value;
    }

    /**
     * Gets the value of the identificationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATIONTYPE() {
        return identificationtype;
    }

    /**
     * Sets the value of the identificationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATIONTYPE(String value) {
        this.identificationtype = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATION() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATION(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the cardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUMBER() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUMBER(String value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the cardholdername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDHOLDERNAME() {
        return cardholdername;
    }

    /**
     * Sets the value of the cardholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDHOLDERNAME(String value) {
        this.cardholdername = value;
    }

    /**
     * Gets the value of the ticketnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTICKETNUMBER() {
        return ticketnumber;
    }

    /**
     * Sets the value of the ticketnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTICKETNUMBER(BigInteger value) {
        this.ticketnumber = value;
    }

    /**
     * Gets the value of the authorizationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORIZATIONCODE() {
        return authorizationcode;
    }

    /**
     * Sets the value of the authorizationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORIZATIONCODE(String value) {
        this.authorizationcode = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARCODE() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARCODE(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the couponexpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONEXPDATE() {
        return couponexpdate;
    }

    /**
     * Sets the value of the couponexpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONEXPDATE(String value) {
        this.couponexpdate = value;
    }

    /**
     * Gets the value of the couponsecexpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONSECEXPDATE() {
        return couponsecexpdate;
    }

    /**
     * Sets the value of the couponsecexpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONSECEXPDATE(String value) {
        this.couponsecexpdate = value;
    }

    /**
     * Gets the value of the couponsubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONSUBSCRIBER() {
        return couponsubscriber;
    }

    /**
     * Sets the value of the couponsubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONSUBSCRIBER(String value) {
        this.couponsubscriber = value;
    }

}
