
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goals", propOrder = {
    "idGoal",
    "goalName",
    "goalValue",
    "measureType"
})
public class Goals {

    protected int idGoal;
    protected String goalName;
    protected String goalValue;
    protected String measureType;

    /**
     * Gets the value of the idGoal property.
     * 
     */
    public int getIdGoal() {
        return idGoal;
    }

    /**
     * Sets the value of the idGoal property.
     * 
     */
    public void setIdGoal(int value) {
        this.idGoal = value;
    }

    /**
     * Gets the value of the goalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalName() {
        return goalName;
    }

    /**
     * Sets the value of the goalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalName(String value) {
        this.goalName = value;
    }

    /**
     * Gets the value of the goalValue property.
     * 
     */
    public String getGoalValue() {
        return goalValue;
    }

    /**
     * Sets the value of the goalValue property.
     * 
     */
    public void setGoalValue(String value) {
        this.goalValue = value;
    }

    /**
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

}
