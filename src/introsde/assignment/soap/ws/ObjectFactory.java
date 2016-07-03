
package introsde.assignment.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment.soap.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadAllGoals_QNAME = new QName("http://ws.soap.assignment.introsde/", "readAllGoals");
    private final static QName _ReadGoal_QNAME = new QName("http://ws.soap.assignment.introsde/", "readGoal");
    private final static QName _ReadLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readLifeStatusResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://ws.soap.assignment.introsde/", "updateGoal");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updateGoalResponse");
    private final static QName _UpdateLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "updateLifeStatus");
    private final static QName _Goals_QNAME = new QName("http://ws.soap.assignment.introsde/", "goals");
    private final static QName _ReadLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "readLifeStatus");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePerson");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readGoalResponse");
    private final static QName _Person_QNAME = new QName("http://ws.soap.assignment.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPerson");
    private final static QName _ReadAllLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readAllLifeStatusResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonResponse");
    private final static QName _UpdateLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updateLifeStatusResponse");
    private final static QName _ReadAllGoalsResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readAllGoalsResponse");
    private final static QName _ReadAllLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "readAllLifeStatus");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link ReadLifeStatusResponse }
     * 
     */
    public ReadLifeStatusResponse createReadLifeStatusResponse() {
        return new ReadLifeStatusResponse();
    }

    /**
     * Create an instance of {@link ReadAllGoals }
     * 
     */
    public ReadAllGoals createReadAllGoals() {
        return new ReadAllGoals();
    }

    /**
     * Create an instance of {@link ReadAllGoalsResponse }
     * 
     */
    public ReadAllGoalsResponse createReadAllGoalsResponse() {
        return new ReadAllGoalsResponse();
    }

    /**
     * Create an instance of {@link ReadAllLifeStatus }
     * 
     */
    public ReadAllLifeStatus createReadAllLifeStatus() {
        return new ReadAllLifeStatus();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadAllLifeStatusResponse }
     * 
     */
    public ReadAllLifeStatusResponse createReadAllLifeStatusResponse() {
        return new ReadAllLifeStatusResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link UpdateLifeStatusResponse }
     * 
     */
    public UpdateLifeStatusResponse createUpdateLifeStatusResponse() {
        return new UpdateLifeStatusResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link ReadLifeStatus }
     * 
     */
    public ReadLifeStatus createReadLifeStatus() {
        return new ReadLifeStatus();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdateLifeStatus }
     * 
     */
    public UpdateLifeStatus createUpdateLifeStatus() {
        return new UpdateLifeStatus();
    }

    /**
     * Create an instance of {@link Goals }
     * 
     */
    public Goals createGoals() {
        return new Goals();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readAllGoals")
    public JAXBElement<ReadAllGoals> createReadAllGoals(ReadAllGoals value) {
        return new JAXBElement<ReadAllGoals>(_ReadAllGoals_QNAME, ReadAllGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readLifeStatusResponse")
    public JAXBElement<ReadLifeStatusResponse> createReadLifeStatusResponse(ReadLifeStatusResponse value) {
        return new JAXBElement<ReadLifeStatusResponse>(_ReadLifeStatusResponse_QNAME, ReadLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updateLifeStatus")
    public JAXBElement<UpdateLifeStatus> createUpdateLifeStatus(UpdateLifeStatus value) {
        return new JAXBElement<UpdateLifeStatus>(_UpdateLifeStatus_QNAME, UpdateLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "goals")
    public JAXBElement<Goals> createGoals(Goals value) {
        return new JAXBElement<Goals>(_Goals_QNAME, Goals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readLifeStatus")
    public JAXBElement<ReadLifeStatus> createReadLifeStatus(ReadLifeStatus value) {
        return new JAXBElement<ReadLifeStatus>(_ReadLifeStatus_QNAME, ReadLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readAllLifeStatusResponse")
    public JAXBElement<ReadAllLifeStatusResponse> createReadAllLifeStatusResponse(ReadAllLifeStatusResponse value) {
        return new JAXBElement<ReadAllLifeStatusResponse>(_ReadAllLifeStatusResponse_QNAME, ReadAllLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updateLifeStatusResponse")
    public JAXBElement<UpdateLifeStatusResponse> createUpdateLifeStatusResponse(UpdateLifeStatusResponse value) {
        return new JAXBElement<UpdateLifeStatusResponse>(_UpdateLifeStatusResponse_QNAME, UpdateLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readAllGoalsResponse")
    public JAXBElement<ReadAllGoalsResponse> createReadAllGoalsResponse(ReadAllGoalsResponse value) {
        return new JAXBElement<ReadAllGoalsResponse>(_ReadAllGoalsResponse_QNAME, ReadAllGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readAllLifeStatus")
    public JAXBElement<ReadAllLifeStatus> createReadAllLifeStatus(ReadAllLifeStatus value) {
        return new JAXBElement<ReadAllLifeStatus>(_ReadAllLifeStatus_QNAME, ReadAllLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

}
