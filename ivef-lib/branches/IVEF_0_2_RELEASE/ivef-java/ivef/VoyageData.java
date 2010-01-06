/* 
 *  VoyageData
 *
 *  VoyageData is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Wed Jan 6 14:24:35 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.Waypoint;

public class VoyageData { 

    private Vector<Waypoint> m_waypoints = new Vector<Waypoint>();
    private double m_airDraught; // default value is uninitialized
    private boolean m_airDraughtPresent;
    private int m_id; // default value is uninitialized
    private int m_cargoTypeIMO; // default value is uninitialized
    private boolean m_cargoTypeIMOPresent;
    private String m_contactIdentity; // default value is uninitialized
    private boolean m_contactIdentityPresent;
    private String m_destCode; // default value is uninitialized
    private boolean m_destCodePresent;
    private String m_destName; // default value is uninitialized
    private boolean m_destNamePresent;
    private double m_draught; // default value is uninitialized
    private boolean m_draughtPresent;
    private Date m_ETA; // default value is uninitialized
    private boolean m_ETAPresent;
    private double m_ISPSLevel; // default value is uninitialized
    private boolean m_ISPSLevelPresent;
    private double m_overSizedLength; // default value is uninitialized
    private boolean m_overSizedLengthPresent;
    private double m_overSizedWidth; // default value is uninitialized
    private boolean m_overSizedWidthPresent;
    private String m_nextPort; // default value is uninitialized
    private boolean m_nextPortPresent;
    private double m_personsOnBoard; // default value is uninitialized
    private boolean m_personsOnBoardPresent;
    private double m_pilots; // default value is uninitialized
    private boolean m_pilotsPresent;
    private String m_prevPort; // default value is uninitialized
    private boolean m_prevPortPresent;
    private boolean m_routeBound; // default value is uninitialized
    private boolean m_routeBoundPresent;
    private String m_sourceId; // default value is uninitialized
    private boolean m_sourceIdPresent;
    private String m_sourceName; // default value is uninitialized
    private int m_sourceType; // default value is uninitialized
    private int m_tankerStatus; // default value is uninitialized
    private boolean m_tankerStatusPresent;
    private boolean m_tugs; // default value is uninitialized
    private boolean m_tugsPresent;
    private Date m_updateTime; // default value is uninitialized

    public VoyageData() {

        m_airDraughtPresent = false;
        m_cargoTypeIMOPresent = false;
        m_contactIdentityPresent = false;
        m_destCodePresent = false;
        m_destNamePresent = false;
        m_draughtPresent = false;
        m_ETAPresent = false;
        m_ISPSLevelPresent = false;
        m_overSizedLengthPresent = false;
        m_overSizedWidthPresent = false;
        m_nextPortPresent = false;
        m_personsOnBoardPresent = false;
        m_pilotsPresent = false;
        m_prevPortPresent = false;
        m_routeBoundPresent = false;
        m_sourceIdPresent = false;
        m_tankerStatusPresent = false;
        m_tugsPresent = false;
    }

    public VoyageData(VoyageData val) {

        for(int i=0; i < val.countOfWaypoints(); i++ ) {
            m_waypoints.add( val.getWaypointAt(i) );
        }
        m_airDraughtPresent = val.hasAirDraught();
        m_airDraught = val.getAirDraught();
        m_id = val.getId();
        m_cargoTypeIMOPresent = val.hasCargoTypeIMO();
        m_cargoTypeIMO = val.getCargoTypeIMO();
        m_contactIdentityPresent = val.hasContactIdentity();
        m_contactIdentity = val.getContactIdentity();
        m_destCodePresent = val.hasDestCode();
        m_destCode = val.getDestCode();
        m_destNamePresent = val.hasDestName();
        m_destName = val.getDestName();
        m_draughtPresent = val.hasDraught();
        m_draught = val.getDraught();
        m_ETAPresent = val.hasETA();
        m_ETA = val.getETA();
        m_ISPSLevelPresent = val.hasISPSLevel();
        m_ISPSLevel = val.getISPSLevel();
        m_overSizedLengthPresent = val.hasOverSizedLength();
        m_overSizedLength = val.getOverSizedLength();
        m_overSizedWidthPresent = val.hasOverSizedWidth();
        m_overSizedWidth = val.getOverSizedWidth();
        m_nextPortPresent = val.hasNextPort();
        m_nextPort = val.getNextPort();
        m_personsOnBoardPresent = val.hasPersonsOnBoard();
        m_personsOnBoard = val.getPersonsOnBoard();
        m_pilotsPresent = val.hasPilots();
        m_pilots = val.getPilots();
        m_prevPortPresent = val.hasPrevPort();
        m_prevPort = val.getPrevPort();
        m_routeBoundPresent = val.hasRouteBound();
        m_routeBound = val.getRouteBound();
        m_sourceIdPresent = val.hasSourceId();
        m_sourceId = val.getSourceId();
        m_sourceName = val.getSourceName();
        m_sourceType = val.getSourceType();
        m_tankerStatusPresent = val.hasTankerStatus();
        m_tankerStatus = val.getTankerStatus();
        m_tugsPresent = val.hasTugs();
        m_tugs = val.getTugs();
        m_updateTime = val.getUpdateTime();
    }

    public void addWaypoint(Waypoint val) {

        m_waypoints.add(val);
    }

    public Waypoint getWaypointAt(int i) {

        return (Waypoint) m_waypoints.get(i);
    }

    public int countOfWaypoints() {

        return m_waypoints.size();
    }

    public void setAirDraught(double val) {

        if (val < 0)
          return;
        m_airDraughtPresent = true;
        m_airDraught = val;
    }

    public double getAirDraught() {

        return m_airDraught;
    }

    public boolean hasAirDraught() {

        return m_airDraughtPresent;
    }

    public void setId(int val) {

        m_id = val;
    }

    public int getId() {

        return m_id;
    }

    public void setCargoTypeIMO(int val) {

        if ( ( val != 0 ) &&
             ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) &&
             ( val != 4 ) &&
             ( val != 5 ) )
            return;
        m_cargoTypeIMOPresent = true;
        m_cargoTypeIMO = val;
    }

    public int getCargoTypeIMO() {

        return m_cargoTypeIMO;
    }

    public boolean hasCargoTypeIMO() {

        return m_cargoTypeIMOPresent;
    }

    public void setContactIdentity(String val) {

        m_contactIdentityPresent = true;
        m_contactIdentity = val;
    }

    public String getContactIdentity() {

        return m_contactIdentity;
    }

    public boolean hasContactIdentity() {

        return m_contactIdentityPresent;
    }

    public void setDestCode(String val) {

        m_destCodePresent = true;
        m_destCode = val;
    }

    public String getDestCode() {

        return m_destCode;
    }

    public boolean hasDestCode() {

        return m_destCodePresent;
    }

    public void setDestName(String val) {

        m_destNamePresent = true;
        m_destName = val;
    }

    public String getDestName() {

        return m_destName;
    }

    public boolean hasDestName() {

        return m_destNamePresent;
    }

    public void setDraught(double val) {

        if (val < 0)
          return;
        m_draughtPresent = true;
        m_draught = val;
    }

    public double getDraught() {

        return m_draught;
    }

    public boolean hasDraught() {

        return m_draughtPresent;
    }

    public void setETA(Date val) {

        m_ETAPresent = true;
        m_ETA = val;
    }

    public Date getETA() {

        return m_ETA;
    }

    public boolean hasETA() {

        return m_ETAPresent;
    }

    public void setISPSLevel(double val) {

        if ( ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) )
            return;
        m_ISPSLevelPresent = true;
        m_ISPSLevel = val;
    }

    public double getISPSLevel() {

        return m_ISPSLevel;
    }

    public boolean hasISPSLevel() {

        return m_ISPSLevelPresent;
    }

    public void setOverSizedLength(double val) {

        if (val < 0)
          return;
        m_overSizedLengthPresent = true;
        m_overSizedLength = val;
    }

    public double getOverSizedLength() {

        return m_overSizedLength;
    }

    public boolean hasOverSizedLength() {

        return m_overSizedLengthPresent;
    }

    public void setOverSizedWidth(double val) {

        if (val < 0)
          return;
        m_overSizedWidthPresent = true;
        m_overSizedWidth = val;
    }

    public double getOverSizedWidth() {

        return m_overSizedWidth;
    }

    public boolean hasOverSizedWidth() {

        return m_overSizedWidthPresent;
    }

    public void setNextPort(String val) {

        m_nextPortPresent = true;
        m_nextPort = val;
    }

    public String getNextPort() {

        return m_nextPort;
    }

    public boolean hasNextPort() {

        return m_nextPortPresent;
    }

    public void setPersonsOnBoard(double val) {

        if (val < 0)
          return;
        m_personsOnBoardPresent = true;
        m_personsOnBoard = val;
    }

    public double getPersonsOnBoard() {

        return m_personsOnBoard;
    }

    public boolean hasPersonsOnBoard() {

        return m_personsOnBoardPresent;
    }

    public void setPilots(double val) {

        if (val < 0)
          return;
        m_pilotsPresent = true;
        m_pilots = val;
    }

    public double getPilots() {

        return m_pilots;
    }

    public boolean hasPilots() {

        return m_pilotsPresent;
    }

    public void setPrevPort(String val) {

        m_prevPortPresent = true;
        m_prevPort = val;
    }

    public String getPrevPort() {

        return m_prevPort;
    }

    public boolean hasPrevPort() {

        return m_prevPortPresent;
    }

    public void setRouteBound(boolean val) {

        m_routeBoundPresent = true;
        m_routeBound = val;
    }

    public boolean getRouteBound() {

        return m_routeBound;
    }

    public boolean hasRouteBound() {

        return m_routeBoundPresent;
    }

    public void setSourceId(String val) {

        m_sourceIdPresent = true;
        m_sourceId = val;
    }

    public String getSourceId() {

        return m_sourceId;
    }

    public boolean hasSourceId() {

        return m_sourceIdPresent;
    }

    public void setSourceName(String val) {

        m_sourceName = val;
    }

    public String getSourceName() {

        return m_sourceName;
    }

    public void setSourceType(int val) {

        if ( ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) &&
             ( val != 4 ) &&
             ( val != 5 ) )
            return;
        m_sourceType = val;
    }

    public int getSourceType() {

        return m_sourceType;
    }

    public void setTankerStatus(int val) {

        if ( ( val != 0 ) &&
             ( val != 1 ) &&
             ( val != 2 ) )
            return;
        m_tankerStatusPresent = true;
        m_tankerStatus = val;
    }

    public int getTankerStatus() {

        return m_tankerStatus;
    }

    public boolean hasTankerStatus() {

        return m_tankerStatusPresent;
    }

    public void setTugs(boolean val) {

        m_tugsPresent = true;
        m_tugs = val;
    }

    public boolean getTugs() {

        return m_tugs;
    }

    public boolean hasTugs() {

        return m_tugsPresent;
    }

    public void setUpdateTime(Date val) {

        m_updateTime = val;
    }

    public Date getUpdateTime() {

        return m_updateTime;
    }

    public String toXML() {

        String xml = "<VoyageData";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        if ( hasAirDraught() ) {
            xml += " AirDraught=\"" + m_airDraught + "\"";
        }
        xml += " Id=\"" + m_id + "\"";
        if ( hasCargoTypeIMO() ) {
            xml += " CargoTypeIMO=\"" + m_cargoTypeIMO + "\"";
        }
        if ( hasContactIdentity() ) {
            xml += " ContactIdentity=\"" + encode( m_contactIdentity) + "\"";
        }
        if ( hasDestCode() ) {
            xml += " DestCode=\"" + encode( m_destCode) + "\"";
        }
        if ( hasDestName() ) {
            xml += " DestName=\"" + encode( m_destName) + "\"";
        }
        if ( hasDraught() ) {
            xml += " Draught=\"" + m_draught + "\"";
        }
        if ( hasETA() ) {
            xml += " ETA=\"" + df.format(m_ETA) + "\"";
        }
        if ( hasISPSLevel() ) {
            xml += " ISPSLevel=\"" + m_ISPSLevel + "\"";
        }
        if ( hasOverSizedLength() ) {
            xml += " OverSizedLength=\"" + m_overSizedLength + "\"";
        }
        if ( hasOverSizedWidth() ) {
            xml += " OverSizedWidth=\"" + m_overSizedWidth + "\"";
        }
        if ( hasNextPort() ) {
            xml += " NextPort=\"" + encode( m_nextPort) + "\"";
        }
        if ( hasPersonsOnBoard() ) {
            xml += " PersonsOnBoard=\"" + m_personsOnBoard + "\"";
        }
        if ( hasPilots() ) {
            xml += " Pilots=\"" + m_pilots + "\"";
        }
        if ( hasPrevPort() ) {
            xml += " PrevPort=\"" + encode( m_prevPort) + "\"";
        }
        if ( hasRouteBound() ) {
            xml += " RouteBound=\"" + m_routeBound + "\"";
        }
        if ( hasSourceId() ) {
            xml += " SourceId=\"" + encode( m_sourceId) + "\"";
        }
        xml += " SourceName=\"" + encode( m_sourceName) + "\"";
        xml += " SourceType=\"" + m_sourceType + "\"";
        if ( hasTankerStatus() ) {
            xml += " TankerStatus=\"" + m_tankerStatus + "\"";
        }
        if ( hasTugs() ) {
            xml += " Tugs=\"" + m_tugs + "\"";
        }
        xml += " UpdateTime=\"" + df.format(m_updateTime) + "\"";
        xml += ">\n";
        for(int i=0; i < m_waypoints.size(); i++ ) {
           Waypoint attribute = (Waypoint) m_waypoints.get(i);
            xml += attribute.toXML();
        }
        xml += "</VoyageData>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "VoyageData\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        if ( hasAirDraught() ) {
            str +=  lead + "    AirDraught = " + m_airDraught + "\n";
        }
        str +=  lead + "    Id = " + m_id + "\n";
        if ( hasCargoTypeIMO() ) {
            str +=  lead + "    CargoTypeIMO = " + m_cargoTypeIMO + "\n";
        }
        if ( hasContactIdentity() ) {
            str +=  lead + "    ContactIdentity = " + m_contactIdentity + "\n";
        }
        if ( hasDestCode() ) {
            str +=  lead + "    DestCode = " + m_destCode + "\n";
        }
        if ( hasDestName() ) {
            str +=  lead + "    DestName = " + m_destName + "\n";
        }
        if ( hasDraught() ) {
            str +=  lead + "    Draught = " + m_draught + "\n";
        }
        if ( hasETA() ) {
            str +=  lead + "    ETA = " + df.format(m_ETA) + "\n";
        }
        if ( hasISPSLevel() ) {
            str +=  lead + "    ISPSLevel = " + m_ISPSLevel + "\n";
        }
        if ( hasOverSizedLength() ) {
            str +=  lead + "    OverSizedLength = " + m_overSizedLength + "\n";
        }
        if ( hasOverSizedWidth() ) {
            str +=  lead + "    OverSizedWidth = " + m_overSizedWidth + "\n";
        }
        if ( hasNextPort() ) {
            str +=  lead + "    NextPort = " + m_nextPort + "\n";
        }
        if ( hasPersonsOnBoard() ) {
            str +=  lead + "    PersonsOnBoard = " + m_personsOnBoard + "\n";
        }
        if ( hasPilots() ) {
            str +=  lead + "    Pilots = " + m_pilots + "\n";
        }
        if ( hasPrevPort() ) {
            str +=  lead + "    PrevPort = " + m_prevPort + "\n";
        }
        if ( hasRouteBound() ) {
            str +=  lead + "    RouteBound = " + m_routeBound + "\n";
        }
        if ( hasSourceId() ) {
            str +=  lead + "    SourceId = " + m_sourceId + "\n";
        }
        str +=  lead + "    SourceName = " + m_sourceName + "\n";
        str +=  lead + "    SourceType = " + m_sourceType + "\n";
        if ( hasTankerStatus() ) {
            str +=  lead + "    TankerStatus = " + m_tankerStatus + "\n";
        }
        if ( hasTugs() ) {
            str +=  lead + "    Tugs = " + m_tugs + "\n";
        }
        str +=  lead + "    UpdateTime = " + df.format(m_updateTime) + "\n";
        for(int i=0; i < m_waypoints.size(); i++ ) {
           Waypoint attribute = (Waypoint) m_waypoints.get(i);
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
