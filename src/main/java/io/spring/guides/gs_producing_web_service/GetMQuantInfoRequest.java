//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.13 at 10:21:37 PM EET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minMqId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxMqId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "token",
    "minMqId",
    "maxMqId"
})
@XmlRootElement(name = "getMQuantInfoRequest")
public class GetMQuantInfoRequest {

    @XmlElement(required = true)
    protected String token;
    protected int minMqId;
    protected int maxMqId;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the minMqId property.
     * 
     */
    public int getMinMqId() {
        return minMqId;
    }

    /**
     * Sets the value of the minMqId property.
     * 
     */
    public void setMinMqId(int value) {
        this.minMqId = value;
    }

    /**
     * Gets the value of the maxMqId property.
     * 
     */
    public int getMaxMqId() {
        return maxMqId;
    }

    /**
     * Sets the value of the maxMqId property.
     * 
     */
    public void setMaxMqId(int value) {
        this.maxMqId = value;
    }

}
