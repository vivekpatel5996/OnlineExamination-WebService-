
package clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cat_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cat_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cat_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "category", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", propOrder = {
    "catId",
    "catInfo",
    "catName"
})
public class Category {

    @XmlElement(name = "cat_id")
    protected Integer catId;
    @XmlElementRef(name = "cat_info", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> catInfo;
    @XmlElementRef(name = "cat_name", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> catName;

    /**
     * Gets the value of the catId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatId(Integer value) {
        this.catId = value;
    }

    /**
     * Gets the value of the catInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCatInfo() {
        return catInfo;
    }

    /**
     * Sets the value of the catInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCatInfo(JAXBElement<String> value) {
        this.catInfo = value;
    }

    /**
     * Gets the value of the catName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCatName() {
        return catName;
    }

    /**
     * Sets the value of the catName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCatName(JAXBElement<String> value) {
        this.catName = value;
    }

}
