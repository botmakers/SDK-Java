
package ar.com.todopago.api.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MERCHANT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAYMENTMETHOD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BANK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "merchant",
    "paymentmethod",
    "bank",
    "amount"
})
@XmlRootElement(name = "GetPromotions")
public class GetPromotions {

    @XmlElement(name = "MERCHANT", required = true, nillable = true)
    protected String merchant;
    @XmlElement(name = "PAYMENTMETHOD", required = true, type = Integer.class, nillable = true)
    protected Integer paymentmethod;
    @XmlElement(name = "BANK", required = true, type = Integer.class, nillable = true)
    protected Integer bank;
    @XmlElement(name = "AMOUNT", required = true, type = Float.class, nillable = true)
    protected Float amount;

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANT() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANT(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the paymentmethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAYMENTMETHOD() {
        return paymentmethod;
    }

    /**
     * Sets the value of the paymentmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAYMENTMETHOD(Integer value) {
        this.paymentmethod = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBANK() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBANK(Integer value) {
        this.bank = value;
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

}
