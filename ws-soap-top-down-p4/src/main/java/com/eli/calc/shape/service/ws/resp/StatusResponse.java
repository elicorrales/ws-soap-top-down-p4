
package com.eli.calc.shape.service.ws.resp;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://resp.ws.service.shape.calc.eli.com/}StatusCode"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="causeMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResponse", propOrder = {
    "status",
    "description",
    "clazz",
    "errMsg",
    "causeMsg"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
public class StatusResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected StatusCode status;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected String description;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected String clazz;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected String errMsg;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected String causeMsg;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public StatusCode getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setStatus(StatusCode value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

    /**
     * Gets the value of the causeMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public String getCauseMsg() {
        return causeMsg;
    }

    /**
     * Sets the value of the causeMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setCauseMsg(String value) {
        this.causeMsg = value;
    }

}
