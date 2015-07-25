
package ar.com.todopago.api.payment;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Promotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="BuyerCfBonus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SellerCfBonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Coefficient" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DirectRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tna" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promotion", propOrder = {
    "id",
    "rateId",
    "buyerCfBonus",
    "sellerCfBonus",
    "promotionId",
    "amount",
    "payment",
    "feeQuantity",
    "coefficient",
    "directRate",
    "tna"
})
public class Promotion {

    @XmlElement(name = "Id", required = true, nillable = true)
    protected BigInteger id;
    @XmlElement(name = "RateId", required = true, nillable = true)
    protected BigInteger rateId;
    @XmlElement(name = "BuyerCfBonus", required = true, nillable = true)
    protected BigInteger buyerCfBonus;
    @XmlElement(name = "SellerCfBonus", required = true, nillable = true)
    protected BigDecimal sellerCfBonus;
    @XmlElement(name = "PromotionId", required = true, nillable = true)
    protected BigInteger promotionId;
    @XmlElement(name = "Amount", required = true, nillable = true)
    protected BigDecimal amount;
    @XmlElement(name = "Payment", required = true, nillable = true)
    protected BigDecimal payment;
    @XmlElement(name = "FeeQuantity", required = true, nillable = true)
    protected BigInteger feeQuantity;
    @XmlElement(name = "Coefficient", required = true, nillable = true)
    protected BigDecimal coefficient;
    @XmlElement(name = "DirectRate", required = true, nillable = true)
    protected BigDecimal directRate;
    @XmlElement(name = "Tna", required = true, nillable = true)
    protected BigDecimal tna;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the rateId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateId() {
        return rateId;
    }

    /**
     * Sets the value of the rateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateId(BigInteger value) {
        this.rateId = value;
    }

    /**
     * Gets the value of the buyerCfBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuyerCfBonus() {
        return buyerCfBonus;
    }

    /**
     * Sets the value of the buyerCfBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuyerCfBonus(BigInteger value) {
        this.buyerCfBonus = value;
    }

    /**
     * Gets the value of the sellerCfBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellerCfBonus() {
        return sellerCfBonus;
    }

    /**
     * Sets the value of the sellerCfBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellerCfBonus(BigDecimal value) {
        this.sellerCfBonus = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPromotionId(BigInteger value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment(BigDecimal value) {
        this.payment = value;
    }

    /**
     * Gets the value of the feeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeQuantity() {
        return feeQuantity;
    }

    /**
     * Sets the value of the feeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeQuantity(BigInteger value) {
        this.feeQuantity = value;
    }

    /**
     * Gets the value of the coefficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoefficient() {
        return coefficient;
    }

    /**
     * Sets the value of the coefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoefficient(BigDecimal value) {
        this.coefficient = value;
    }

    /**
     * Gets the value of the directRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDirectRate() {
        return directRate;
    }

    /**
     * Sets the value of the directRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDirectRate(BigDecimal value) {
        this.directRate = value;
    }

    /**
     * Gets the value of the tna property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTna() {
        return tna;
    }

    /**
     * Sets the value of the tna property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTna(BigDecimal value) {
        this.tna = value;
    }

}
