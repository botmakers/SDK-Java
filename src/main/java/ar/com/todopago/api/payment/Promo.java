
package ar.com.todopago.api.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Promo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstallmentsMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstallmentsMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element ref="{http://api.todopago.com.ar}BanksCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promo", propOrder = {
    "id",
    "name",
    "description",
    "installmentsMin",
    "installmentsMax",
    "discount",
    "banksCollection"
})
public class Promo {

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "InstallmentsMin", required = true, nillable = true)
    protected String installmentsMin;
    @XmlElement(name = "InstallmentsMax", required = true, nillable = true)
    protected String installmentsMax;
    @XmlElement(name = "Discount", required = true, type = Float.class, nillable = true)
    protected Float discount;
    @XmlElement(name = "BanksCollection", required = true)
    protected BanksCollection banksCollection;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the installmentsMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentsMin() {
        return installmentsMin;
    }

    /**
     * Sets the value of the installmentsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentsMin(String value) {
        this.installmentsMin = value;
    }

    /**
     * Gets the value of the installmentsMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentsMax() {
        return installmentsMax;
    }

    /**
     * Sets the value of the installmentsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentsMax(String value) {
        this.installmentsMax = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscount(Float value) {
        this.discount = value;
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

}
