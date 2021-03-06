
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateLifeStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateLifeStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lifeStatus" type="{http://ws.soap.assignment.introsde/}lifeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateLifeStatusResponse", propOrder = {
    "lifeStatus"
})
public class UpdateLifeStatusResponse {

    protected LifeStatus lifeStatus;

    /**
     * Gets the value of the lifeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LifeStatus }
     *     
     */
    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    /**
     * Sets the value of the lifeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeStatus }
     *     
     */
    public void setLifeStatus(LifeStatus value) {
        this.lifeStatus = value;
    }

}
