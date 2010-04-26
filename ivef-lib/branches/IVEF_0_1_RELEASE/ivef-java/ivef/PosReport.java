/* 
 *  PosReport
 *
 *  PosReport is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Foobar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY ); without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 **********************************************************************************
 *  WARNING: THIS CODE WAS GENERATED DO NOT MODIFY, CHANGE THE XSD INSTEAD
 *  Generated by xsd2code on Fri Apr 23 14:10:27 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.Pos;
import ivef.Sensor;

public class PosReport { 

    private Pos m_pos; // default value is uninitialized
    private Vector<Sensor> m_sensors = new Vector<Sensor>();
    private int m_id; // default value is uninitialized
    private int m_sourceId; // default value is uninitialized
    private Date m_updateTime; // default value is uninitialized
    private Date m_updateTimeRadar; // default value is uninitialized
    private boolean m_updateTimeRadarPresent;
    private Date m_updateTimeAIS; // default value is uninitialized
    private boolean m_updateTimeAISPresent;
    private Date m_updateTimeDR; // default value is uninitialized
    private boolean m_updateTimeDRPresent;
    private double m_SOG; // default value is uninitialized
    private double m_COG; // default value is uninitialized
    private String m_lost; // default value is uninitialized
    private double m_rateOfTurn; // default value is uninitialized
    private boolean m_rateOfTurnPresent;
    private double m_orientation; // default value is uninitialized
    private boolean m_orientationPresent;
    private double m_length; // default value is uninitialized
    private boolean m_lengthPresent;
    private double m_breadth; // default value is uninitialized
    private boolean m_breadthPresent;
    private double m_altitude; // default value is uninitialized
    private boolean m_altitudePresent;
    private int m_navStatus; // default value is uninitialized
    private boolean m_navStatusPresent;
    private int m_updSensorType; // default value is uninitialized
    private boolean m_updSensorTypePresent;
    private boolean m_ATONOffPos; // default value is uninitialized
    private boolean m_ATONOffPosPresent;

    public PosReport() {

        m_updateTimeRadarPresent = false;
        m_updateTimeAISPresent = false;
        m_updateTimeDRPresent = false;
        m_rateOfTurnPresent = false;
        m_orientationPresent = false;
        m_lengthPresent = false;
        m_breadthPresent = false;
        m_altitudePresent = false;
        m_navStatusPresent = false;
        m_updSensorTypePresent = false;
        m_ATONOffPosPresent = false;
    }

    public PosReport(PosReport val) {

        m_pos = val.getPos();
        for(int i=0; i < val.countOfSensors(); i++ ) {
            m_sensors.add( val.getSensorAt(i) );
        }
        m_id = val.getId();
        m_sourceId = val.getSourceId();
        m_updateTime = val.getUpdateTime();
        m_updateTimeRadarPresent = val.hasUpdateTimeRadar();
        m_updateTimeRadar = val.getUpdateTimeRadar();
        m_updateTimeAISPresent = val.hasUpdateTimeAIS();
        m_updateTimeAIS = val.getUpdateTimeAIS();
        m_updateTimeDRPresent = val.hasUpdateTimeDR();
        m_updateTimeDR = val.getUpdateTimeDR();
        m_SOG = val.getSOG();
        m_COG = val.getCOG();
        m_lost = val.getLost();
        m_rateOfTurnPresent = val.hasRateOfTurn();
        m_rateOfTurn = val.getRateOfTurn();
        m_orientationPresent = val.hasOrientation();
        m_orientation = val.getOrientation();
        m_lengthPresent = val.hasLength();
        m_length = val.getLength();
        m_breadthPresent = val.hasBreadth();
        m_breadth = val.getBreadth();
        m_altitudePresent = val.hasAltitude();
        m_altitude = val.getAltitude();
        m_navStatusPresent = val.hasNavStatus();
        m_navStatus = val.getNavStatus();
        m_updSensorTypePresent = val.hasUpdSensorType();
        m_updSensorType = val.getUpdSensorType();
        m_ATONOffPosPresent = val.hasATONOffPos();
        m_ATONOffPos = val.getATONOffPos();
    }

    public boolean setPos(Pos val) {

        m_pos = val;
          return true;
    }

    public Pos getPos() {

        return m_pos;
    }

    public boolean addSensor(Sensor val) {

        m_sensors.add(val);
          return true;
    }

    public Sensor getSensorAt(int i) {

        return (Sensor) m_sensors.get(i);
    }

    public int countOfSensors() {

        return m_sensors.size();
    }

    public boolean setId(int val) {

        m_id = val;
          return true;
    }

    public int getId() {

        return m_id;
    }

    public boolean setSourceId(int val) {

        m_sourceId = val;
          return true;
    }

    public int getSourceId() {

        return m_sourceId;
    }

    public boolean setUpdateTime(Date val) {

        m_updateTime = val;
          return true;
    }

    public Date getUpdateTime() {

        return m_updateTime;
    }

    public boolean setUpdateTimeRadar(Date val) {

        m_updateTimeRadarPresent = true;
        m_updateTimeRadar = val;
          return true;
    }

    public Date getUpdateTimeRadar() {

        return m_updateTimeRadar;
    }

    public boolean hasUpdateTimeRadar() {

        return m_updateTimeRadarPresent;
    }

    public boolean setUpdateTimeAIS(Date val) {

        m_updateTimeAISPresent = true;
        m_updateTimeAIS = val;
          return true;
    }

    public Date getUpdateTimeAIS() {

        return m_updateTimeAIS;
    }

    public boolean hasUpdateTimeAIS() {

        return m_updateTimeAISPresent;
    }

    public boolean setUpdateTimeDR(Date val) {

        m_updateTimeDRPresent = true;
        m_updateTimeDR = val;
          return true;
    }

    public Date getUpdateTimeDR() {

        return m_updateTimeDR;
    }

    public boolean hasUpdateTimeDR() {

        return m_updateTimeDRPresent;
    }

    public boolean setSOG(double val) {

        if (val < 0)
          return false;
        m_SOG = val;
          return true;
    }

    public double getSOG() {

        return m_SOG;
    }

    public boolean setCOG(double val) {

        if (val < 0)
          return false;
        if (val > 360)
          return false;
        m_COG = val;
          return true;
    }

    public double getCOG() {

        return m_COG;
    }

    public boolean setLost(String val) {

        if ( ( !val.equals("no") ) &&
             ( !val.equals("yes") ) )
            return false;
        m_lost = val;
          return true;
    }

    public String getLost() {

        return m_lost;
    }

    public boolean setRateOfTurn(double val) {

        m_rateOfTurnPresent = true;
        m_rateOfTurn = val;
          return true;
    }

    public double getRateOfTurn() {

        return m_rateOfTurn;
    }

    public boolean hasRateOfTurn() {

        return m_rateOfTurnPresent;
    }

    public boolean setOrientation(double val) {

        if (val < 0)
          return false;
        if (val > 360)
          return false;
        m_orientationPresent = true;
        m_orientation = val;
          return true;
    }

    public double getOrientation() {

        return m_orientation;
    }

    public boolean hasOrientation() {

        return m_orientationPresent;
    }

    public boolean setLength(double val) {

        if (val < 0)
          return false;
        m_lengthPresent = true;
        m_length = val;
          return true;
    }

    public double getLength() {

        return m_length;
    }

    public boolean hasLength() {

        return m_lengthPresent;
    }

    public boolean setBreadth(double val) {

        if (val < 0)
          return false;
        m_breadthPresent = true;
        m_breadth = val;
          return true;
    }

    public double getBreadth() {

        return m_breadth;
    }

    public boolean hasBreadth() {

        return m_breadthPresent;
    }

    public boolean setAltitude(double val) {

        m_altitudePresent = true;
        m_altitude = val;
          return true;
    }

    public double getAltitude() {

        return m_altitude;
    }

    public boolean hasAltitude() {

        return m_altitudePresent;
    }

    public boolean setNavStatus(int val) {

        if ( ( val != 0 ) &&
             ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) &&
             ( val != 4 ) &&
             ( val != 5 ) &&
             ( val != 6 ) &&
             ( val != 7 ) &&
             ( val != 8 ) &&
             ( val != 9 ) &&
             ( val != 10 ) &&
             ( val != 11 ) &&
             ( val != 12 ) &&
             ( val != 13 ) &&
             ( val != 14 ) &&
             ( val != 15 ) )
            return false;
        m_navStatusPresent = true;
        m_navStatus = val;
          return true;
    }

    public int getNavStatus() {

        return m_navStatus;
    }

    public boolean hasNavStatus() {

        return m_navStatusPresent;
    }

    public boolean setUpdSensorType(int val) {

        if ( ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) &&
             ( val != 4 ) &&
             ( val != 5 ) )
            return false;
        m_updSensorTypePresent = true;
        m_updSensorType = val;
          return true;
    }

    public int getUpdSensorType() {

        return m_updSensorType;
    }

    public boolean hasUpdSensorType() {

        return m_updSensorTypePresent;
    }

    public boolean setATONOffPos(boolean val) {

        m_ATONOffPosPresent = true;
        m_ATONOffPos = val;
          return true;
    }

    public boolean getATONOffPos() {

        return m_ATONOffPos;
    }

    public boolean hasATONOffPos() {

        return m_ATONOffPosPresent;
    }

    public String toXML() {

        String xml = "<PosReport";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        xml += " Id=\"" + m_id + "\"";
        xml += " SourceId=\"" + m_sourceId + "\"";
        xml += " UpdateTime=\"" + df.format(m_updateTime) + "\"";
        if ( hasUpdateTimeRadar() ) {
            xml += " UpdateTimeRadar=\"" + df.format(m_updateTimeRadar) + "\"";
        }
        if ( hasUpdateTimeAIS() ) {
            xml += " UpdateTimeAIS=\"" + df.format(m_updateTimeAIS) + "\"";
        }
        if ( hasUpdateTimeDR() ) {
            xml += " UpdateTimeDR=\"" + df.format(m_updateTimeDR) + "\"";
        }
        xml += " SOG=\"" + nf.format(m_SOG) + "\"";
        xml += " COG=\"" + nf.format(m_COG) + "\"";
        xml += " Lost=\"" + encode( m_lost) + "\"";
        if ( hasRateOfTurn() ) {
            xml += " RateOfTurn=\"" + nf.format(m_rateOfTurn) + "\"";
        }
        if ( hasOrientation() ) {
            xml += " Orientation=\"" + nf.format(m_orientation) + "\"";
        }
        if ( hasLength() ) {
            xml += " Length=\"" + nf.format(m_length) + "\"";
        }
        if ( hasBreadth() ) {
            xml += " Breadth=\"" + nf.format(m_breadth) + "\"";
        }
        if ( hasAltitude() ) {
            xml += " Altitude=\"" + nf.format(m_altitude) + "\"";
        }
        if ( hasNavStatus() ) {
            xml += " NavStatus=\"" + m_navStatus + "\"";
        }
        if ( hasUpdSensorType() ) {
            xml += " UpdSensorType=\"" + m_updSensorType + "\"";
        }
        if ( hasATONOffPos() ) {
            xml += " ATONOffPos=\"" + m_ATONOffPos + "\"";
        }
        xml += ">\n";
        xml +=  m_pos.toXML();
        for(int i=0; i < m_sensors.size(); i++ ) {
           Sensor attribute = (Sensor) m_sensors.get(i);
            xml += attribute.toXML();
        }
        xml += "</PosReport>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "PosReport\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        str +=  lead + "    Id = " + m_id + "\n";
        str +=  lead + "    SourceId = " + m_sourceId + "\n";
        str +=  lead + "    UpdateTime = " + df.format(m_updateTime) + "\n";
        if ( hasUpdateTimeRadar() ) {
            str +=  lead + "    UpdateTimeRadar = " + df.format(m_updateTimeRadar) + "\n";
        }
        if ( hasUpdateTimeAIS() ) {
            str +=  lead + "    UpdateTimeAIS = " + df.format(m_updateTimeAIS) + "\n";
        }
        if ( hasUpdateTimeDR() ) {
            str +=  lead + "    UpdateTimeDR = " + df.format(m_updateTimeDR) + "\n";
        }
        str +=  lead + "    SOG = " + nf.format(m_SOG) + "\n";
        str +=  lead + "    COG = " + nf.format(m_COG) + "\n";
        str +=  lead + "    Lost = " + m_lost + "\n";
        if ( hasRateOfTurn() ) {
            str +=  lead + "    RateOfTurn = " + nf.format(m_rateOfTurn) + "\n";
        }
        if ( hasOrientation() ) {
            str +=  lead + "    Orientation = " + nf.format(m_orientation) + "\n";
        }
        if ( hasLength() ) {
            str +=  lead + "    Length = " + nf.format(m_length) + "\n";
        }
        if ( hasBreadth() ) {
            str +=  lead + "    Breadth = " + nf.format(m_breadth) + "\n";
        }
        if ( hasAltitude() ) {
            str +=  lead + "    Altitude = " + nf.format(m_altitude) + "\n";
        }
        if ( hasNavStatus() ) {
            str +=  lead + "    NavStatus = " + m_navStatus + "\n";
        }
        if ( hasUpdSensorType() ) {
            str +=  lead + "    UpdSensorType = " + m_updSensorType + "\n";
        }
        if ( hasATONOffPos() ) {
            str +=  lead + "    ATONOffPos = " + m_ATONOffPos + "\n";
        }
        str +=  m_pos.toString(lead + "    ");
        for(int i=0; i < m_sensors.size(); i++ ) {
           Sensor attribute = (Sensor) m_sensors.get(i);
           str += attribute.toString(lead + "    ");
        }
        return str;
    }
    public String encode( String str) {

        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\"", "&quot;");
        return str;
    }


}
