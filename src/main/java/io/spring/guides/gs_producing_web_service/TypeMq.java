//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.29 at 10:59:52 PM EEST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeMq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTypeMq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nameTypeMq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nickTq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caclTpTq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formulaTq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultColor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeMq", propOrder = {
    "idTypeMq",
    "nameTypeMq",
    "nickTq",
    "defaultUnit",
    "caclTpTq",
    "formulaTq",
    "imageIndex",
    "defaultColor"
})
public class TypeMq {

    protected int idTypeMq;
    @XmlElement(required = true)
    protected String nameTypeMq;
    @XmlElement(required = true)
    protected String nickTq;
    @XmlElement(required = true)
    protected String defaultUnit;
    @XmlElement(required = true)
    protected String caclTpTq;
    @XmlElement(required = true)
    protected String formulaTq;
    protected int imageIndex;
    protected int defaultColor;

    /**
     * Gets the value of the idTypeMq property.
     * 
     */
    public int getIdTypeMq() {
        return idTypeMq;
    }

    /**
     * Sets the value of the idTypeMq property.
     * 
     */
    public void setIdTypeMq(int value) {
        this.idTypeMq = value;
    }

    /**
     * Gets the value of the nameTypeMq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTypeMq() {
        return nameTypeMq;
    }

    /**
     * Sets the value of the nameTypeMq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTypeMq(String value) {
        this.nameTypeMq = value;
    }

    /**
     * Gets the value of the nickTq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickTq() {
        return nickTq;
    }

    /**
     * Sets the value of the nickTq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickTq(String value) {
        this.nickTq = value;
    }

    /**
     * Gets the value of the defaultUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultUnit() {
        return defaultUnit;
    }

    /**
     * Sets the value of the defaultUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultUnit(String value) {
        this.defaultUnit = value;
    }

    /**
     * Gets the value of the caclTpTq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaclTpTq() {
        return caclTpTq;
    }

    /**
     * Sets the value of the caclTpTq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaclTpTq(String value) {
        this.caclTpTq = value;
    }

    /**
     * Gets the value of the formulaTq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaTq() {
        return formulaTq;
    }

    /**
     * Sets the value of the formulaTq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaTq(String value) {
        this.formulaTq = value;
    }

    /**
     * Gets the value of the imageIndex property.
     * 
     */
    public int getImageIndex() {
        return imageIndex;
    }

    /**
     * Sets the value of the imageIndex property.
     * 
     */
    public void setImageIndex(int value) {
        this.imageIndex = value;
    }

    /**
     * Gets the value of the defaultColor property.
     * 
     */
    public int getDefaultColor() {
        return defaultColor;
    }

    /**
     * Sets the value of the defaultColor property.
     * 
     */
    public void setDefaultColor(int value) {
        this.defaultColor = value;
    }

}
