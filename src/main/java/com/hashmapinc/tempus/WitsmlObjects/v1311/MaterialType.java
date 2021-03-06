package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaterialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="MaterialType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="aluminum"/>
 *     <enumeration value="beryllium copper"/>
 *     <enumeration value="chrome alloy"/>
 *     <enumeration value="composite"/>
 *     <enumeration value="other"/>
 *     <enumeration value="non-magnetic steel"/>
 *     <enumeration value="plastic"/>
 *     <enumeration value="steel"/>
 *     <enumeration value="steel alloy"/>
 *     <enumeration value="titanium"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "MaterialType")
@XmlEnum
public enum MaterialType {

    @XmlEnumValue("aluminum")
    ALUMINUM("aluminum"),
    @XmlEnumValue("beryllium copper")
    BERYLLIUM_COPPER("beryllium copper"),
    @XmlEnumValue("chrome alloy")
    CHROME_ALLOY("chrome alloy"),
    @XmlEnumValue("composite")
    COMPOSITE("composite"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("non-magnetic steel")
    NON_MAGNETIC_STEEL("non-magnetic steel"),
    @XmlEnumValue("plastic")
    PLASTIC("plastic"),
    @XmlEnumValue("steel")
    STEEL("steel"),
    @XmlEnumValue("steel alloy")
    STEEL_ALLOY("steel alloy"),
    @XmlEnumValue("titanium")
    TITANIUM("titanium"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MaterialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialType fromValue(String v) {
        for (MaterialType c: MaterialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
