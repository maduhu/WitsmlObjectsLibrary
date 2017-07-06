//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogIndexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="LogIndexType">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="date time"/>
 *     <enumeration value="elapsed time"/>
 *     <enumeration value="length"/>
 *     <enumeration value="measured depth"/>
 *     <enumeration value="vertical depth"/>
 *     <enumeration value="other"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "LogIndexType")
@XmlEnum
public enum LogIndexType {


    /**
     * Log is indexed on date with time.
     * 
     */
    @XmlEnumValue("date time")
    DATE_TIME("date time"),

    /**
     * Log is indexed on time.
     * 
     */
    @XmlEnumValue("elapsed time")
    ELAPSED_TIME("elapsed time"),

    /**
     * Log is indexed on length (not a depth).
     * 
     */
    @XmlEnumValue("length")
    LENGTH("length"),

    /**
     * Log index is a measured depth index.
     * 
     */
    @XmlEnumValue("measured depth")
    MEASURED_DEPTH("measured depth"),

    /**
     * Log index is a vertical depth depth index .
     * 
     */
    @XmlEnumValue("vertical depth")
    VERTICAL_DEPTH("vertical depth"),

    /**
     * Any other index type for a log.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LogIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogIndexType fromValue(String v) {
        for (LogIndexType c: LogIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}