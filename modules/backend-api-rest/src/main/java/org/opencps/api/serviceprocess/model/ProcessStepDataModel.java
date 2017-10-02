//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.29 at 09:13:56 AM ICT 
//


package org.opencps.api.serviceprocess.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessStepDataModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessStepDataModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processStepId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierSubStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierSubStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customProcessUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessStepDataModel", propOrder = {
    "stepCode",
    "processStepId",
    "stepName",
    "sequenceNo",
    "dossierStatus",
    "dossierStatusText",
    "dossierSubStatus",
    "dossierSubStatusText",
    "durationCount",
    "instructionNote",
    "customProcessUrl",
    "editable"
})
public class ProcessStepDataModel {

    protected String stepCode;
    protected long processStepId;
    protected String stepName;
    protected String sequenceNo;
    protected String dossierStatus;
    protected String dossierStatusText;
    protected String dossierSubStatus;
    protected String dossierSubStatusText;
    protected String durationCount;
    protected String instructionNote;
    protected String customProcessUrl;
    protected String editable;

    /**
     * Gets the value of the stepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepCode() {
        return stepCode;
    }

    /**
     * Sets the value of the stepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepCode(String value) {
        this.stepCode = value;
    }

    /**
     * Gets the value of the processStepId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessStepId() {
        return processStepId;
    }

    /**
     * Sets the value of the processStepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessStepId(Long value) {
        this.processStepId = value;
    }

    /**
     * Gets the value of the stepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * Sets the value of the stepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepName(String value) {
        this.stepName = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNo(String value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the dossierStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierStatus() {
        return dossierStatus;
    }

    /**
     * Sets the value of the dossierStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierStatus(String value) {
        this.dossierStatus = value;
    }

    /**
     * Gets the value of the dossierStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierStatusText() {
        return dossierStatusText;
    }

    /**
     * Sets the value of the dossierStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierStatusText(String value) {
        this.dossierStatusText = value;
    }

    /**
     * Gets the value of the dossierSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierSubStatus() {
        return dossierSubStatus;
    }

    /**
     * Sets the value of the dossierSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierSubStatus(String value) {
        this.dossierSubStatus = value;
    }

    /**
     * Gets the value of the dossierSubStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierSubStatusText() {
        return dossierSubStatusText;
    }

    /**
     * Sets the value of the dossierSubStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierSubStatusText(String value) {
        this.dossierSubStatusText = value;
    }

    /**
     * Gets the value of the durationCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationCount() {
        return durationCount;
    }

    /**
     * Sets the value of the durationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationCount(String value) {
        this.durationCount = value;
    }

    /**
     * Gets the value of the instructionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionNote() {
        return instructionNote;
    }

    /**
     * Sets the value of the instructionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionNote(String value) {
        this.instructionNote = value;
    }

    /**
     * Gets the value of the customProcessUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomProcessUrl() {
        return customProcessUrl;
    }

    /**
     * Sets the value of the customProcessUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomProcessUrl(String value) {
        this.customProcessUrl = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditable(String value) {
        this.editable = value;
    }

}
