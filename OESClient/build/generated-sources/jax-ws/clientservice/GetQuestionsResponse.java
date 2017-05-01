
package clientservice;

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
 *         &lt;element name="getQuestionsResult" type="{http://schemas.datacontract.org/2004/07/WCFServiceWebRole1}ArrayOfquestion" minOccurs="0"/>
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
    "getQuestionsResult"
})
@XmlRootElement(name = "getQuestionsResponse")
public class GetQuestionsResponse {

    @XmlElementRef(name = "getQuestionsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfquestion> getQuestionsResult;

    /**
     * Gets the value of the getQuestionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfquestion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfquestion> getGetQuestionsResult() {
        return getQuestionsResult;
    }

    /**
     * Sets the value of the getQuestionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfquestion }{@code >}
     *     
     */
    public void setGetQuestionsResult(JAXBElement<ArrayOfquestion> value) {
        this.getQuestionsResult = value;
    }

}
