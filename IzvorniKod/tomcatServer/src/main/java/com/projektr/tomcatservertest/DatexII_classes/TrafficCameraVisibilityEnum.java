//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.17 at 06:36:56 PM UTC 
//


package com.projektr.tomcatservertest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficCameraVisibilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficCameraVisibilityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noRestrictions"/&gt;
 *     &lt;enumeration value="internalOnly"/&gt;
 *     &lt;enumeration value="hidden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficCameraVisibilityEnum")
@XmlEnum
public enum TrafficCameraVisibilityEnum {


    /**
     * No visibility restrictions
     * 
     */
    @XmlEnumValue("noRestrictions")
    NO_RESTRICTIONS("noRestrictions"),

    /**
     * Camera should only be availabile for internal use in TMCs and Authorities
     * 
     */
    @XmlEnumValue("internalOnly")
    INTERNAL_ONLY("internalOnly"),

    /**
     * Camera should not be availabile
     * 
     */
    @XmlEnumValue("hidden")
    HIDDEN("hidden");
    private final String value;

    TrafficCameraVisibilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficCameraVisibilityEnum fromValue(String v) {
        for (TrafficCameraVisibilityEnum c: TrafficCameraVisibilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
