
package clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mocktest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mocktest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="markperque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mockid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="negperque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timelimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalmark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalquestion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mocktest", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", propOrder = {
    "catid",
    "markperque",
    "mockid",
    "negperque",
    "timelimit",
    "totalmark",
    "totalquestion"
})
public class Mocktest {

    @XmlElementRef(name = "catid", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> catid;
    protected Integer markperque;
    protected Integer mockid;
    protected Integer negperque;
    protected Integer timelimit;
    protected Integer totalmark;
    protected Integer totalquestion;

    /**
     * Gets the value of the catid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCatid() {
        return catid;
    }

    /**
     * Sets the value of the catid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCatid(JAXBElement<Integer> value) {
        this.catid = value;
    }

    /**
     * Gets the value of the markperque property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkperque() {
        return markperque;
    }

    /**
     * Sets the value of the markperque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkperque(Integer value) {
        this.markperque = value;
    }

    /**
     * Gets the value of the mockid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMockid() {
        return mockid;
    }

    /**
     * Sets the value of the mockid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMockid(Integer value) {
        this.mockid = value;
    }

    /**
     * Gets the value of the negperque property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegperque() {
        return negperque;
    }

    /**
     * Sets the value of the negperque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegperque(Integer value) {
        this.negperque = value;
    }

    /**
     * Gets the value of the timelimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimelimit() {
        return timelimit;
    }

    /**
     * Sets the value of the timelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimelimit(Integer value) {
        this.timelimit = value;
    }

    /**
     * Gets the value of the totalmark property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalmark() {
        return totalmark;
    }

    /**
     * Sets the value of the totalmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalmark(Integer value) {
        this.totalmark = value;
    }

    /**
     * Gets the value of the totalquestion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalquestion() {
        return totalquestion;
    }

    /**
     * Sets the value of the totalquestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalquestion(Integer value) {
        this.totalquestion = value;
    }

}
