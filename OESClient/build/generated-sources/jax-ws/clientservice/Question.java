
package clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="question">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="option1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="questiontext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rightanswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "question", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", propOrder = {
    "categoryid",
    "option1",
    "option2",
    "option3",
    "option4",
    "questionid",
    "questiontext",
    "rightanswer"
})
public class Question {

    protected Integer categoryid;
    @XmlElementRef(name = "option1", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option1;
    @XmlElementRef(name = "option2", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option2;
    @XmlElementRef(name = "option3", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option3;
    @XmlElementRef(name = "option4", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option4;
    protected Integer questionid;
    @XmlElementRef(name = "questiontext", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> questiontext;
    @XmlElementRef(name = "rightanswer", namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rightanswer;

    /**
     * Gets the value of the categoryid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * Sets the value of the categoryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryid(Integer value) {
        this.categoryid = value;
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
     * Gets the value of the questionid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuestionid() {
        return questionid;
    }

    /**
     * Sets the value of the questionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuestionid(Integer value) {
        this.questionid = value;
    }

    /**
     * Gets the value of the questiontext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuestiontext() {
        return questiontext;
    }

    /**
     * Sets the value of the questiontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuestiontext(JAXBElement<String> value) {
        this.questiontext = value;
    }

    /**
     * Gets the value of the rightanswer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRightanswer() {
        return rightanswer;
    }

    /**
     * Sets the value of the rightanswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRightanswer(JAXBElement<String> value) {
        this.rightanswer = value;
    }

}
