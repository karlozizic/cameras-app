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
 * <p>Java class for UrgencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UrgencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="extremelyUrgent"/&gt;
 *     &lt;enumeration value="urgent"/&gt;
 *     &lt;enumeration value="normalUrgency"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrgencyEnum")
@XmlEnum
public enum UrgencyEnum {


    /**
     * Dissemination of the information is extremely urgent.
     * 
     */
    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),

    /**
     * Dissemination of the information is urgent.
     * 
     */
    @XmlEnumValue("urgent")
    URGENT("urgent"),

    /**
     * Dissemination of the information is of normal urgency.
     * 
     */
    @XmlEnumValue("normalUrgency")
    NORMAL_URGENCY("normalUrgency");
    private final String value;

    UrgencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrgencyEnum fromValue(String v) {
        for (UrgencyEnum c: UrgencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
