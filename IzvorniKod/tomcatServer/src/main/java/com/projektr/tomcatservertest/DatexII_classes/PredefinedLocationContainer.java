//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.17 at 06:36:56 PM UTC 
//


package com.projektr.tomcatservertest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A container which may comprise the definition of a predefined itinerary, non ordered group of locations or single location.
 * 
 * <p>Java class for PredefinedLocationContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationContainerExtension" type="{http://datex2.eu/schema/2/2_0}_PredefinedLocationContainerExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationContainer", propOrder = {
    "predefinedLocationContainerExtension"
})
@XmlSeeAlso({
    PredefinedLocation.class
})
public abstract class PredefinedLocationContainer {

    protected PredefinedLocationContainerExtensionType predefinedLocationContainerExtension;

    /**
     * Gets the value of the predefinedLocationContainerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedLocationContainerExtensionType }
     *     
     */
    public PredefinedLocationContainerExtensionType getPredefinedLocationContainerExtension() {
        return predefinedLocationContainerExtension;
    }

    /**
     * Sets the value of the predefinedLocationContainerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedLocationContainerExtensionType }
     *     
     */
    public void setPredefinedLocationContainerExtension(PredefinedLocationContainerExtensionType value) {
        this.predefinedLocationContainerExtension = value;
    }

}
