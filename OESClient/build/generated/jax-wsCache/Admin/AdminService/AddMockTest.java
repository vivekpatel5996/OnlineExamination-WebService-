
package AdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="totalQue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="markPerQue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="negPerQue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalMark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "totalQue",
    "markPerQue",
    "negPerQue",
    "totalMark",
    "timeLimit"
})
@XmlRootElement(name = "AddMockTest")
public class AddMockTest {

    protected Integer catID;
    protected Integer totalQue;
    protected Integer markPerQue;
    protected Integer negPerQue;
    protected Integer totalMark;
    protected Integer timeLimit;

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
     * Gets the value of the totalQue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalQue() {
        return totalQue;
    }

    /**
     * Sets the value of the totalQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalQue(Integer value) {
        this.totalQue = value;
    }

    /**
     * Gets the value of the markPerQue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkPerQue() {
        return markPerQue;
    }

    /**
     * Sets the value of the markPerQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkPerQue(Integer value) {
        this.markPerQue = value;
    }

    /**
     * Gets the value of the negPerQue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegPerQue() {
        return negPerQue;
    }

    /**
     * Sets the value of the negPerQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegPerQue(Integer value) {
        this.negPerQue = value;
    }

    /**
     * Gets the value of the totalMark property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMark() {
        return totalMark;
    }

    /**
     * Sets the value of the totalMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMark(Integer value) {
        this.totalMark = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeLimit(Integer value) {
        this.timeLimit = value;
    }

}
