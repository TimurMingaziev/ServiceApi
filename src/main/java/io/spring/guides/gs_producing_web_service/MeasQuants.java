//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.21 at 02:27:49 PM EET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for measQuants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measQuants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeMq" type="{http://spring.io/guides/gs-producing-web-service}typeMq"/>
 *         &lt;element name="nameMq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DGDId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arcPeriod" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="calcType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refChanTq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastTs" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastTs30" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastTS1" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="refDeviceid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arcType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measQuants", propOrder = {
    "idMq",
    "typeMq",
    "nameMq",
    "idCH",
    "taskLevel",
    "dgdId",
    "arcPeriod",
    "calcType",
    "refChanTq",
    "lastTs",
    "lastTs30",
    "lastTS1",
    "refDeviceid",
    "arcType"
})
public class MeasQuants {

    protected int idMq;
    @XmlElement(required = true)
    protected TypeMq typeMq;
    @XmlElement(required = true)
    protected String nameMq;
    protected int idCH;
    protected int taskLevel;
    @XmlElement(name = "DGDId")
    protected int dgdId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arcPeriod;
    protected int calcType;
    protected int refChanTq;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTs30;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTS1;
    protected int refDeviceid;
    protected int arcType;

    /**
     * Gets the value of the idMq property.
     * 
     */
    public int getIdMq() {
        return idMq;
    }

    /**
     * Sets the value of the idMq property.
     * 
     */
    public void setIdMq(int value) {
        this.idMq = value;
    }

    /**
     * Gets the value of the typeMq property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMq }
     *     
     */
    public TypeMq getTypeMq() {
        return typeMq;
    }

    /**
     * Sets the value of the typeMq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMq }
     *     
     */
    public void setTypeMq(TypeMq value) {
        this.typeMq = value;
    }

    /**
     * Gets the value of the nameMq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMq() {
        return nameMq;
    }

    /**
     * Sets the value of the nameMq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMq(String value) {
        this.nameMq = value;
    }

    /**
     * Gets the value of the idCH property.
     * 
     */
    public int getIdCH() {
        return idCH;
    }

    /**
     * Sets the value of the idCH property.
     * 
     */
    public void setIdCH(int value) {
        this.idCH = value;
    }

    /**
     * Gets the value of the taskLevel property.
     * 
     */
    public int getTaskLevel() {
        return taskLevel;
    }

    /**
     * Sets the value of the taskLevel property.
     * 
     */
    public void setTaskLevel(int value) {
        this.taskLevel = value;
    }

    /**
     * Gets the value of the dgdId property.
     * 
     */
    public int getDGDId() {
        return dgdId;
    }

    /**
     * Sets the value of the dgdId property.
     * 
     */
    public void setDGDId(int value) {
        this.dgdId = value;
    }

    /**
     * Gets the value of the arcPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArcPeriod() {
        return arcPeriod;
    }

    /**
     * Sets the value of the arcPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArcPeriod(XMLGregorianCalendar value) {
        this.arcPeriod = value;
    }

    /**
     * Gets the value of the calcType property.
     * 
     */
    public int getCalcType() {
        return calcType;
    }

    /**
     * Sets the value of the calcType property.
     * 
     */
    public void setCalcType(int value) {
        this.calcType = value;
    }

    /**
     * Gets the value of the refChanTq property.
     * 
     */
    public int getRefChanTq() {
        return refChanTq;
    }

    /**
     * Sets the value of the refChanTq property.
     * 
     */
    public void setRefChanTq(int value) {
        this.refChanTq = value;
    }

    /**
     * Gets the value of the lastTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTs() {
        return lastTs;
    }

    /**
     * Sets the value of the lastTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTs(XMLGregorianCalendar value) {
        this.lastTs = value;
    }

    /**
     * Gets the value of the lastTs30 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTs30() {
        return lastTs30;
    }

    /**
     * Sets the value of the lastTs30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTs30(XMLGregorianCalendar value) {
        this.lastTs30 = value;
    }

    /**
     * Gets the value of the lastTS1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTS1() {
        return lastTS1;
    }

    /**
     * Sets the value of the lastTS1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTS1(XMLGregorianCalendar value) {
        this.lastTS1 = value;
    }

    /**
     * Gets the value of the refDeviceid property.
     * 
     */
    public int getRefDeviceid() {
        return refDeviceid;
    }

    /**
     * Sets the value of the refDeviceid property.
     * 
     */
    public void setRefDeviceid(int value) {
        this.refDeviceid = value;
    }

    /**
     * Gets the value of the arcType property.
     * 
     */
    public int getArcType() {
        return arcType;
    }

    /**
     * Sets the value of the arcType property.
     * 
     */
    public void setArcType(int value) {
        this.arcType = value;
    }

}
