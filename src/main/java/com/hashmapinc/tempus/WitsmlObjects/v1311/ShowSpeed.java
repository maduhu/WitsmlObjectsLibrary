package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShowSpeed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ShowSpeed">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="slow"/>
 *     <enumeration value="moderately fast"/>
 *     <enumeration value="fast"/>
 *     <enumeration value="instantaneous"/>
 *     <enumeration value="none"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ShowSpeed")
@XmlEnum
public enum ShowSpeed {

    @XmlEnumValue("slow")
    SLOW("slow"),
    @XmlEnumValue("moderately fast")
    MODERATELY_FAST("moderately fast"),
    @XmlEnumValue("fast")
    FAST("fast"),
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ShowSpeed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShowSpeed fromValue(String v) {
        for (ShowSpeed c: ShowSpeed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}