package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShowFluorescence.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ShowFluorescence">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="faint"/>
 *     <enumeration value="bright"/>
 *     <enumeration value="none"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ShowFluorescence")
@XmlEnum
public enum ShowFluorescence {

    @XmlEnumValue("faint")
    FAINT("faint"),
    @XmlEnumValue("bright")
    BRIGHT("bright"),
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

    ShowFluorescence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShowFluorescence fromValue(String v) {
        for (ShowFluorescence c: ShowFluorescence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
