//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.17 at 06:36:56 PM UTC 
//


package com.projektr.tomcatservertest;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Line attributes are part of a location reference point and consists of functional road class (FRC),form of way (FOW) and bearing (BEAR) data.
 * 
 * <p>Java class for OpenlrLineAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLineAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrFunctionalRoadClass" type="{http://datex2.eu/schema/2/2_0}OpenlrFunctionalRoadClassEnum"/&gt;
 *         &lt;element name="openlrFormOfWay" type="{http://datex2.eu/schema/2/2_0}OpenlrFormOfWayEnum"/&gt;
 *         &lt;element name="openlrBearing" type="{http://datex2.eu/schema/2/2_0}AngleInDegrees"/&gt;
 *         &lt;element name="openlrLineAttributesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLineAttributes", propOrder = {
    "openlrFunctionalRoadClass",
    "openlrFormOfWay",
    "openlrBearing",
    "openlrLineAttributesExtension"
})
public class OpenlrLineAttributes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpenlrFunctionalRoadClassEnum openlrFunctionalRoadClass;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpenlrFormOfWayEnum openlrFormOfWay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrBearing;
    protected ExtensionType openlrLineAttributesExtension;

    /**
     * Gets the value of the openlrFunctionalRoadClass property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public OpenlrFunctionalRoadClassEnum getOpenlrFunctionalRoadClass() {
        return openlrFunctionalRoadClass;
    }

    /**
     * Sets the value of the openlrFunctionalRoadClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrFunctionalRoadClass(OpenlrFunctionalRoadClassEnum value) {
        this.openlrFunctionalRoadClass = value;
    }

    /**
     * Gets the value of the openlrFormOfWay property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrFormOfWayEnum }
     *     
     */
    public OpenlrFormOfWayEnum getOpenlrFormOfWay() {
        return openlrFormOfWay;
    }

    /**
     * Sets the value of the openlrFormOfWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrFormOfWayEnum }
     *     
     */
    public void setOpenlrFormOfWay(OpenlrFormOfWayEnum value) {
        this.openlrFormOfWay = value;
    }

    /**
     * Gets the value of the openlrBearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrBearing() {
        return openlrBearing;
    }

    /**
     * Sets the value of the openlrBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrBearing(BigInteger value) {
        this.openlrBearing = value;
    }

    /**
     * Gets the value of the openlrLineAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLineAttributesExtension() {
        return openlrLineAttributesExtension;
    }

    /**
     * Sets the value of the openlrLineAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLineAttributesExtension(ExtensionType value) {
        this.openlrLineAttributesExtension = value;
    }

}
