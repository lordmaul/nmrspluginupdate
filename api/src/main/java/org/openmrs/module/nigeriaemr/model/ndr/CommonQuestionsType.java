//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.05 at 07:44:04 AM WAT 
//

package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for CommonQuestionsType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonQuestionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HospitalNumber" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="DiagnosisFacility" type="{}FacilityType" minOccurs="0"/>
 *         &lt;element name="DateOfFirstReport" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DateOfLastReport" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PatientDieFromThisIllness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PatientPregnancyStatusCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="PMTCT"/>
 *               &lt;enumeration value="NP"/>
 *               &lt;enumeration value="NK"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PatientAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonQuestionsType", propOrder = { "hospitalNumber", "diagnosisFacility", "dateOfFirstReport",
        "dateOfLastReport", "diagnosisDate", "patientDieFromThisIllness", "patientPregnancyStatusCode",
        "estimatedDeliveryDate", "patientAge" })
public class CommonQuestionsType {
	
	@XmlElement(name = "HospitalNumber")
	protected String hospitalNumber;
	
	@XmlElement(name = "DiagnosisFacility")
	protected FacilityType diagnosisFacility;
	
	@XmlElement(name = "DateOfFirstReport")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateOfFirstReport;
	
	@XmlElement(name = "DateOfLastReport")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateOfLastReport;
	
	@XmlElement(name = "DiagnosisDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar diagnosisDate;
	
	@XmlElement(name = "PatientDieFromThisIllness")
	protected Boolean patientDieFromThisIllness;
	
	@XmlElement(name = "PatientPregnancyStatusCode")
	protected String patientPregnancyStatusCode;
	
	@XmlElement(name = "EstimatedDeliveryDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar estimatedDeliveryDate;
	
	@XmlElement(name = "PatientAge")
	protected Integer patientAge;
	
	/**
	 * Gets the value of the hospitalNumber property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getHospitalNumber() {
		return hospitalNumber;
	}
	
	/**
	 * Sets the value of the hospitalNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setHospitalNumber(String value) {
		this.hospitalNumber = value;
	}
	
	/**
	 * Gets the value of the diagnosisFacility property.
	 * 
	 * @return possible object is {@link FacilityType }
	 */
	public FacilityType getDiagnosisFacility() {
		return diagnosisFacility;
	}
	
	/**
	 * Sets the value of the diagnosisFacility property.
	 * 
	 * @param value allowed object is {@link FacilityType }
	 */
	public void setDiagnosisFacility(FacilityType value) {
		this.diagnosisFacility = value;
	}
	
	/**
	 * Gets the value of the dateOfFirstReport property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateOfFirstReport() {
		return dateOfFirstReport;
	}
	
	/**
	 * Sets the value of the dateOfFirstReport property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateOfFirstReport(XMLGregorianCalendar value) {
		this.dateOfFirstReport = value;
	}
	
	/**
	 * Gets the value of the dateOfLastReport property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateOfLastReport() {
		return dateOfLastReport;
	}
	
	/**
	 * Sets the value of the dateOfLastReport property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateOfLastReport(XMLGregorianCalendar value) {
		this.dateOfLastReport = value;
	}
	
	/**
	 * Gets the value of the diagnosisDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDiagnosisDate() {
		return diagnosisDate;
	}
	
	/**
	 * Sets the value of the diagnosisDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDiagnosisDate(XMLGregorianCalendar value) {
		this.diagnosisDate = value;
	}
	
	/**
	 * Gets the value of the patientDieFromThisIllness property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isPatientDieFromThisIllness() {
		return patientDieFromThisIllness;
	}
	
	/**
	 * Sets the value of the patientDieFromThisIllness property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setPatientDieFromThisIllness(Boolean value) {
		this.patientDieFromThisIllness = value;
	}
	
	/**
	 * Gets the value of the patientPregnancyStatusCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientPregnancyStatusCode() {
		return patientPregnancyStatusCode;
	}
	
	/**
	 * Sets the value of the patientPregnancyStatusCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientPregnancyStatusCode(String value) {
		this.patientPregnancyStatusCode = value;
	}
	
	/**
	 * Gets the value of the estimatedDeliveryDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	
	/**
	 * Sets the value of the estimatedDeliveryDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setEstimatedDeliveryDate(XMLGregorianCalendar value) {
		this.estimatedDeliveryDate = value;
	}
	
	/**
	 * Gets the value of the patientAge property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getPatientAge() {
		return patientAge;
	}
	
	/**
	 * Sets the value of the patientAge property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setPatientAge(Integer value) {
		this.patientAge = value;
	}
	
}
