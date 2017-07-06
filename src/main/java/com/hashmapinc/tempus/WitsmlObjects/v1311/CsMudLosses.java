package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Operations Mud Losses Component Schema
 * 
 * <p>Java class for cs_mudLosses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_mudLosses">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="volLostShakerSurf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostMudCleanerSurf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostPitsSurf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostTrippingSurf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostOtherSurf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volTotMudLostSurf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostCircHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostCsgHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostCmtHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostBhdCsgHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostAbandonHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volLostOtherHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volTotMudLostHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_mudLosses", propOrder = {
    "volLostShakerSurf",
    "volLostMudCleanerSurf",
    "volLostPitsSurf",
    "volLostTrippingSurf",
    "volLostOtherSurf",
    "volTotMudLostSurf",
    "volLostCircHole",
    "volLostCsgHole",
    "volLostCmtHole",
    "volLostBhdCsgHole",
    "volLostAbandonHole",
    "volLostOtherHole",
    "volTotMudLostHole"
})
public class CsMudLosses {

    protected VolumeMeasure volLostShakerSurf;
    protected VolumeMeasure volLostMudCleanerSurf;
    protected VolumeMeasure volLostPitsSurf;
    protected VolumeMeasure volLostTrippingSurf;
    protected VolumeMeasure volLostOtherSurf;
    protected VolumeMeasure volTotMudLostSurf;
    protected VolumeMeasure volLostCircHole;
    protected VolumeMeasure volLostCsgHole;
    protected VolumeMeasure volLostCmtHole;
    protected VolumeMeasure volLostBhdCsgHole;
    protected VolumeMeasure volLostAbandonHole;
    protected VolumeMeasure volLostOtherHole;
    protected VolumeMeasure volTotMudLostHole;

    /**
     * Gets the value of the volLostShakerSurf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostShakerSurf() {
        return volLostShakerSurf;
    }

    /**
     * Sets the value of the volLostShakerSurf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostShakerSurf(VolumeMeasure value) {
        this.volLostShakerSurf = value;
    }

    /**
     * Gets the value of the volLostMudCleanerSurf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostMudCleanerSurf() {
        return volLostMudCleanerSurf;
    }

    /**
     * Sets the value of the volLostMudCleanerSurf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostMudCleanerSurf(VolumeMeasure value) {
        this.volLostMudCleanerSurf = value;
    }

    /**
     * Gets the value of the volLostPitsSurf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostPitsSurf() {
        return volLostPitsSurf;
    }

    /**
     * Sets the value of the volLostPitsSurf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostPitsSurf(VolumeMeasure value) {
        this.volLostPitsSurf = value;
    }

    /**
     * Gets the value of the volLostTrippingSurf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostTrippingSurf() {
        return volLostTrippingSurf;
    }

    /**
     * Sets the value of the volLostTrippingSurf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostTrippingSurf(VolumeMeasure value) {
        this.volLostTrippingSurf = value;
    }

    /**
     * Gets the value of the volLostOtherSurf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostOtherSurf() {
        return volLostOtherSurf;
    }

    /**
     * Sets the value of the volLostOtherSurf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostOtherSurf(VolumeMeasure value) {
        this.volLostOtherSurf = value;
    }

    /**
     * Gets the value of the volTotMudLostSurf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolTotMudLostSurf() {
        return volTotMudLostSurf;
    }

    /**
     * Sets the value of the volTotMudLostSurf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolTotMudLostSurf(VolumeMeasure value) {
        this.volTotMudLostSurf = value;
    }

    /**
     * Gets the value of the volLostCircHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostCircHole() {
        return volLostCircHole;
    }

    /**
     * Sets the value of the volLostCircHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostCircHole(VolumeMeasure value) {
        this.volLostCircHole = value;
    }

    /**
     * Gets the value of the volLostCsgHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostCsgHole() {
        return volLostCsgHole;
    }

    /**
     * Sets the value of the volLostCsgHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostCsgHole(VolumeMeasure value) {
        this.volLostCsgHole = value;
    }

    /**
     * Gets the value of the volLostCmtHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostCmtHole() {
        return volLostCmtHole;
    }

    /**
     * Sets the value of the volLostCmtHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostCmtHole(VolumeMeasure value) {
        this.volLostCmtHole = value;
    }

    /**
     * Gets the value of the volLostBhdCsgHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostBhdCsgHole() {
        return volLostBhdCsgHole;
    }

    /**
     * Sets the value of the volLostBhdCsgHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostBhdCsgHole(VolumeMeasure value) {
        this.volLostBhdCsgHole = value;
    }

    /**
     * Gets the value of the volLostAbandonHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostAbandonHole() {
        return volLostAbandonHole;
    }

    /**
     * Sets the value of the volLostAbandonHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostAbandonHole(VolumeMeasure value) {
        this.volLostAbandonHole = value;
    }

    /**
     * Gets the value of the volLostOtherHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolLostOtherHole() {
        return volLostOtherHole;
    }

    /**
     * Sets the value of the volLostOtherHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolLostOtherHole(VolumeMeasure value) {
        this.volLostOtherHole = value;
    }

    /**
     * Gets the value of the volTotMudLostHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolTotMudLostHole() {
        return volTotMudLostHole;
    }

    /**
     * Sets the value of the volTotMudLostHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolTotMudLostHole(VolumeMeasure value) {
        this.volTotMudLostHole = value;
    }

}