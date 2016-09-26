
package com.eli.calc.shape.service.ws.resp;

import javax.annotation.Generated;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusResponse" type="{http://resp.ws.service.shape.calc.eli.com/}StatusResponse"/&gt;
 *         &lt;element name="numRun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusResponse",
    "numRun"
})
@XmlRootElement(name = "RunPendingRequestsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
public class RunPendingRequestsResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected StatusResponse statusResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    protected int numRun;

    /**
     * Gets the value of the statusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public StatusResponse getStatusResponse() {
        return statusResponse;
    }

    /**
     * Sets the value of the statusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setStatusResponse(StatusResponse value) {
        this.statusResponse = value;
    }

    /**
     * Gets the value of the numRun property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public int getNumRun() {
        return numRun;
    }

    /**
     * Sets the value of the numRun property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-25T12:50:08-04:00", comments = "JAXB RI v2.2.11")
    public void setNumRun(int value) {
        this.numRun = value;
    }

}
