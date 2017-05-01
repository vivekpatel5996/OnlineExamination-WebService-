
package AdminService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="catID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="questionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rightAns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "catID",
    "questionText",
    "option1",
    "option2",
    "option3",
    "option4",
    "rightAns"
})
@XmlRootElement(name = "AddQuestion")
public class AddQuestion {

    protected Integer catID;
    @XmlElementRef(name = "questionText", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> questionText;
    @XmlElementRef(name = "option1", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option1;
    @XmlElementRef(name = "option2", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option2;
    @XmlElementRef(name = "option3", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option3;
    @XmlElementRef(name = "option4", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option4;
    @XmlElementRef(name = "rightAns", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rightAns;

    /**
     * Gets the value of the catID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatID() {
        return catID;
    }

    /**
     * Sets the value of the catID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatID(Integer value) {
        this.catID = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuestionText(JAXBElement<String> value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the option1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOption1() {
        return option1;
    }

    /**
     * Sets the value of the option1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOption1(JAXBElement<String> value) {
        this.option1 = value;
    }

    /**
     * Gets the value of the option2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOption2() {
        return option2;
    }

    /**
     * Sets the value of the option2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOption2(JAXBElement<String> value) {
        this.option2 = value;
    }

    /**
     * Gets the value of the option3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOption3() {
        return option3;
    }

    /**
     * Sets the value of the option3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOption3(JAXBElement<String> value) {
        this.option3 = value;
    }

    /**
     * Gets the value of the option4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOption4() {
        return option4;
    }

    /**
     * Sets the value of the option4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOption4(JAXBElement<String> value) {
        this.option4 = value;
    }

    /**
     * Gets the value of the rightAns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRightAns() {
        return rightAns;
    }

    /**
     * Sets the value of the rightAns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRightAns(JAXBElement<String> value) {
        this.rightAns = value;
    }

}
