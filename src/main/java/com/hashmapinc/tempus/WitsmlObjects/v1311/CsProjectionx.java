package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Element Types
 * 
 * <p>Java class for cs_projectionx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_projectionx">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameCRS" type="{http://www.witsml.org/schemas/131}wellKnownNameStruct" minOccurs="0"/>
 *         <element name="projectionCode" type="{http://www.witsml.org/schemas/131}Projection" minOccurs="0"/>
 *         <element name="projectedFrom" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <element name="stdParallel1" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="stdParallel2" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="centralMeridian" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="originLatitude" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="originLongitude" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="latitude1" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="longitude1" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="latitude2" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="longitude2" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="latitudeForScale" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="longitudeForScale" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="trueScaleLatitude" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="spheroidRadius" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="scaleFactor" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="methodVariant" type="{http://www.witsml.org/schemas/131}ProjectionVariantsObliqueMercator" minOccurs="0"/>
 *         <element name="perspectiveHeight" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="zone" type="{http://www.witsml.org/schemas/131}geodeticZoneString" minOccurs="0"/>
 *         <element name="NADType" type="{http://www.witsml.org/schemas/131}NADTypes" minOccurs="0"/>
 *         <element name="falseEasting" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="falseNorthing" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="bearing" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="hemisphere" type="{http://www.witsml.org/schemas/131}Hemispheres" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="parameter" type="{http://www.witsml.org/schemas/131}indexedObject" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_projectionx", propOrder = {
    "nameCRS",
    "projectionCode",
    "projectedFrom",
    "stdParallel1",
    "stdParallel2",
    "centralMeridian",
    "originLatitude",
    "originLongitude",
    "latitude1",
    "longitude1",
    "latitude2",
    "longitude2",
    "latitudeForScale",
    "longitudeForScale",
    "trueScaleLatitude",
    "spheroidRadius",
    "scaleFactor",
    "methodVariant",
    "perspectiveHeight",
    "zone",
    "nadType",
    "falseEasting",
    "falseNorthing",
    "bearing",
    "hemisphere",
    "description",
    "parameter"
})
public class CsProjectionx {

    protected WellKnownNameStruct nameCRS;
    @XmlSchemaType(name = "string")
    protected Projection projectionCode;
    protected RefNameString projectedFrom;
    protected PlaneAngleMeasure stdParallel1;
    protected PlaneAngleMeasure stdParallel2;
    protected PlaneAngleMeasure centralMeridian;
    protected PlaneAngleMeasure originLatitude;
    protected PlaneAngleMeasure originLongitude;
    protected PlaneAngleMeasure latitude1;
    protected PlaneAngleMeasure longitude1;
    protected PlaneAngleMeasure latitude2;
    protected PlaneAngleMeasure longitude2;
    protected PlaneAngleMeasure latitudeForScale;
    protected PlaneAngleMeasure longitudeForScale;
    protected PlaneAngleMeasure trueScaleLatitude;
    protected LengthMeasure spheroidRadius;
    protected Double scaleFactor;
    @XmlSchemaType(name = "string")
    protected ProjectionVariantsObliqueMercator methodVariant;
    protected LengthMeasure perspectiveHeight;
    protected String zone;
    @XmlElement(name = "NADType")
    @XmlSchemaType(name = "string")
    protected NADTypes nadType;
    protected LengthMeasure falseEasting;
    protected LengthMeasure falseNorthing;
    protected PlaneAngleMeasure bearing;
    @XmlSchemaType(name = "string")
    protected Hemispheres hemisphere;
    protected String description;
    protected List<IndexedObject> parameter;

    /**
     * Gets the value of the nameCRS property.
     * 
     * @return
     *     possible object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public WellKnownNameStruct getNameCRS() {
        return nameCRS;
    }

    /**
     * Sets the value of the nameCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public void setNameCRS(WellKnownNameStruct value) {
        this.nameCRS = value;
    }

    /**
     * Gets the value of the projectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Projection }
     *     
     */
    public Projection getProjectionCode() {
        return projectionCode;
    }

    /**
     * Sets the value of the projectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Projection }
     *     
     */
    public void setProjectionCode(Projection value) {
        this.projectionCode = value;
    }

    /**
     * Gets the value of the projectedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getProjectedFrom() {
        return projectedFrom;
    }

    /**
     * Sets the value of the projectedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setProjectedFrom(RefNameString value) {
        this.projectedFrom = value;
    }

    /**
     * Gets the value of the stdParallel1 property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStdParallel1() {
        return stdParallel1;
    }

    /**
     * Sets the value of the stdParallel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStdParallel1(PlaneAngleMeasure value) {
        this.stdParallel1 = value;
    }

    /**
     * Gets the value of the stdParallel2 property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStdParallel2() {
        return stdParallel2;
    }

    /**
     * Sets the value of the stdParallel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStdParallel2(PlaneAngleMeasure value) {
        this.stdParallel2 = value;
    }

    /**
     * Gets the value of the centralMeridian property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getCentralMeridian() {
        return centralMeridian;
    }

    /**
     * Sets the value of the centralMeridian property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setCentralMeridian(PlaneAngleMeasure value) {
        this.centralMeridian = value;
    }

    /**
     * Gets the value of the originLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getOriginLatitude() {
        return originLatitude;
    }

    /**
     * Sets the value of the originLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setOriginLatitude(PlaneAngleMeasure value) {
        this.originLatitude = value;
    }

    /**
     * Gets the value of the originLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getOriginLongitude() {
        return originLongitude;
    }

    /**
     * Sets the value of the originLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setOriginLongitude(PlaneAngleMeasure value) {
        this.originLongitude = value;
    }

    /**
     * Gets the value of the latitude1 property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLatitude1() {
        return latitude1;
    }

    /**
     * Sets the value of the latitude1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLatitude1(PlaneAngleMeasure value) {
        this.latitude1 = value;
    }

    /**
     * Gets the value of the longitude1 property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLongitude1() {
        return longitude1;
    }

    /**
     * Sets the value of the longitude1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLongitude1(PlaneAngleMeasure value) {
        this.longitude1 = value;
    }

    /**
     * Gets the value of the latitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLatitude2() {
        return latitude2;
    }

    /**
     * Sets the value of the latitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLatitude2(PlaneAngleMeasure value) {
        this.latitude2 = value;
    }

    /**
     * Gets the value of the longitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLongitude2() {
        return longitude2;
    }

    /**
     * Sets the value of the longitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLongitude2(PlaneAngleMeasure value) {
        this.longitude2 = value;
    }

    /**
     * Gets the value of the latitudeForScale property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLatitudeForScale() {
        return latitudeForScale;
    }

    /**
     * Sets the value of the latitudeForScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLatitudeForScale(PlaneAngleMeasure value) {
        this.latitudeForScale = value;
    }

    /**
     * Gets the value of the longitudeForScale property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLongitudeForScale() {
        return longitudeForScale;
    }

    /**
     * Sets the value of the longitudeForScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLongitudeForScale(PlaneAngleMeasure value) {
        this.longitudeForScale = value;
    }

    /**
     * Gets the value of the trueScaleLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getTrueScaleLatitude() {
        return trueScaleLatitude;
    }

    /**
     * Sets the value of the trueScaleLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setTrueScaleLatitude(PlaneAngleMeasure value) {
        this.trueScaleLatitude = value;
    }

    /**
     * Gets the value of the spheroidRadius property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSpheroidRadius() {
        return spheroidRadius;
    }

    /**
     * Sets the value of the spheroidRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSpheroidRadius(LengthMeasure value) {
        this.spheroidRadius = value;
    }

    /**
     * Gets the value of the scaleFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Sets the value of the scaleFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScaleFactor(Double value) {
        this.scaleFactor = value;
    }

    /**
     * Gets the value of the methodVariant property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectionVariantsObliqueMercator }
     *     
     */
    public ProjectionVariantsObliqueMercator getMethodVariant() {
        return methodVariant;
    }

    /**
     * Sets the value of the methodVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectionVariantsObliqueMercator }
     *     
     */
    public void setMethodVariant(ProjectionVariantsObliqueMercator value) {
        this.methodVariant = value;
    }

    /**
     * Gets the value of the perspectiveHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPerspectiveHeight() {
        return perspectiveHeight;
    }

    /**
     * Sets the value of the perspectiveHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPerspectiveHeight(LengthMeasure value) {
        this.perspectiveHeight = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the nadType property.
     * 
     * @return
     *     possible object is
     *     {@link NADTypes }
     *     
     */
    public NADTypes getNADType() {
        return nadType;
    }

    /**
     * Sets the value of the nadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NADTypes }
     *     
     */
    public void setNADType(NADTypes value) {
        this.nadType = value;
    }

    /**
     * Gets the value of the falseEasting property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFalseEasting() {
        return falseEasting;
    }

    /**
     * Sets the value of the falseEasting property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFalseEasting(LengthMeasure value) {
        this.falseEasting = value;
    }

    /**
     * Gets the value of the falseNorthing property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFalseNorthing() {
        return falseNorthing;
    }

    /**
     * Sets the value of the falseNorthing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFalseNorthing(LengthMeasure value) {
        this.falseNorthing = value;
    }

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setBearing(PlaneAngleMeasure value) {
        this.bearing = value;
    }

    /**
     * Gets the value of the hemisphere property.
     * 
     * @return
     *     possible object is
     *     {@link Hemispheres }
     *     
     */
    public Hemispheres getHemisphere() {
        return hemisphere;
    }

    /**
     * Sets the value of the hemisphere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hemispheres }
     *     
     */
    public void setHemisphere(Hemispheres value) {
        this.hemisphere = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getParameter().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<IndexedObject>();
        }
        return this.parameter;
    }

}