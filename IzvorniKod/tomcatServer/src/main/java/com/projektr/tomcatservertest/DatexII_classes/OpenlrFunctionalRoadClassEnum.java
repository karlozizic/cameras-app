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
 * <p>Java class for OpenlrFunctionalRoadClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenlrFunctionalRoadClassEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FRC0"/&gt;
 *     &lt;enumeration value="FRC1"/&gt;
 *     &lt;enumeration value="FRC2"/&gt;
 *     &lt;enumeration value="FRC3"/&gt;
 *     &lt;enumeration value="FRC4"/&gt;
 *     &lt;enumeration value="FRC5"/&gt;
 *     &lt;enumeration value="FRC6"/&gt;
 *     &lt;enumeration value="FRC7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrFunctionalRoadClassEnum")
@XmlEnum
public enum OpenlrFunctionalRoadClassEnum {


    /**
     * Main road, highest importance
     * 
     */
    @XmlEnumValue("FRC0")
    FRC_0("FRC0"),

    /**
     * First class road
     * 
     */
    @XmlEnumValue("FRC1")
    FRC_1("FRC1"),

    /**
     * Second class road
     * 
     */
    @XmlEnumValue("FRC2")
    FRC_2("FRC2"),

    /**
     * Third class road
     * 
     */
    @XmlEnumValue("FRC3")
    FRC_3("FRC3"),

    /**
     * Fourth class road
     * 
     */
    @XmlEnumValue("FRC4")
    FRC_4("FRC4"),

    /**
     * Fifth class road
     * 
     */
    @XmlEnumValue("FRC5")
    FRC_5("FRC5"),

    /**
     * Sixth class road
     * 
     */
    @XmlEnumValue("FRC6")
    FRC_6("FRC6"),

    /**
     * Other class road, lowest importance
     * 
     */
    @XmlEnumValue("FRC7")
    FRC_7("FRC7");
    private final String value;

    OpenlrFunctionalRoadClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrFunctionalRoadClassEnum fromValue(String v) {
        for (OpenlrFunctionalRoadClassEnum c: OpenlrFunctionalRoadClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}