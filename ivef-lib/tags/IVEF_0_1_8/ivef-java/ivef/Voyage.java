/* 
 *  Voyage
 *
 *  Voyage is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Aug 26 11:23:45 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Voyage { 

    private String m_id; // default value is uninitialized
    private boolean m_idPresent;
    private String m_sourceName; // default value is uninitialized
    private boolean m_sourceNamePresent;
    private int m_source; // default value is uninitialized
    private boolean m_sourcePresent;
    private int m_cargoType; // default value is uninitialized
    private boolean m_cargoTypePresent;
    private String m_destination; // default value is uninitialized
    private boolean m_destinationPresent;
    private Date m_ETA; // default value is uninitialized
    private boolean m_ETAPresent;
    private Date m_ATA; // default value is uninitialized
    private boolean m_ATAPresent;
    private int m_personsOnBoard; // default value is uninitialized
    private boolean m_personsOnBoardPresent;
    private double m_airDraught; // default value is uninitialized
    private boolean m_airDraughtPresent;
    private double m_draught; // default value is uninitialized
    private boolean m_draughtPresent;

    public Voyage() {

        m_idPresent = false;
        m_sourceNamePresent = false;
        m_sourcePresent = false;
        m_cargoTypePresent = false;
        m_destinationPresent = false;
        m_ETAPresent = false;
        m_ATAPresent = false;
        m_personsOnBoardPresent = false;
        m_airDraughtPresent = false;
        m_draughtPresent = false;
    }

    public Voyage(Voyage val) {

        m_id = val.getId();
        if (val != null) {
            m_idPresent = true;
        }
        m_sourceName = val.getSourceName();
        if (val != null) {
            m_sourceNamePresent = true;
        }
        m_source = val.getSource();
        if (val != null) {
            m_sourcePresent = true;
        }
        m_cargoType = val.getCargoType();
        if (val != null) {
            m_cargoTypePresent = true;
        }
        m_destination = val.getDestination();
        if (val != null) {
            m_destinationPresent = true;
        }
        m_ETA = val.getETA();
        if (val != null) {
            m_ETAPresent = true;
        }
        m_ATA = val.getATA();
        if (val != null) {
            m_ATAPresent = true;
        }
        m_personsOnBoard = val.getPersonsOnBoard();
        if (val != null) {
            m_personsOnBoardPresent = true;
        }
        m_airDraught = val.getAirDraught();
        if (val != null) {
            m_airDraughtPresent = true;
        }
        m_draught = val.getDraught();
        if (val != null) {
            m_draughtPresent = true;
        }
    }

    public boolean setId(String val) {

        if (val.length() > 40)
          return false;
        m_idPresent = true;
        m_id = val;
          return true;
    }

    public String getId() {

        return m_id;
    }

    public boolean setSourceName(String val) {

        m_sourceNamePresent = true;
        m_sourceName = val;
          return true;
    }

    public String getSourceName() {

        return m_sourceName;
    }

    public boolean setSource(int val) {

        if ( ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) )
            return false;
        m_sourcePresent = true;
        m_source = val;
          return true;
    }

    public int getSource() {

        return m_source;
    }

    public boolean setCargoType(int val) {

        if ( ( val != 0 ) &&
             ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) &&
             ( val != 4 ) &&
             ( val != 9 ) )
            return false;
        m_cargoTypePresent = true;
        m_cargoType = val;
          return true;
    }

    public int getCargoType() {

        return m_cargoType;
    }

    public boolean hasCargoType() {

        return m_cargoTypePresent;
    }

    public boolean setDestination(String val) {

        m_destinationPresent = true;
        m_destination = val;
          return true;
    }

    public String getDestination() {

        return m_destination;
    }

    public boolean hasDestination() {

        return m_destinationPresent;
    }

    public boolean setETA(Date val) {

        m_ETAPresent = true;
        m_ETA = val;
          return true;
    }

    public Date getETA() {

        return m_ETA;
    }

    public boolean hasETA() {

        return m_ETAPresent;
    }

    public boolean setATA(Date val) {

        m_ATAPresent = true;
        m_ATA = val;
          return true;
    }

    public Date getATA() {

        return m_ATA;
    }

    public boolean hasATA() {

        return m_ATAPresent;
    }

    public boolean setPersonsOnBoard(int val) {

        if (val < 0)
          return false;
        m_personsOnBoardPresent = true;
        m_personsOnBoard = val;
          return true;
    }

    public int getPersonsOnBoard() {

        return m_personsOnBoard;
    }

    public boolean hasPersonsOnBoard() {

        return m_personsOnBoardPresent;
    }

    public boolean setAirDraught(double val) {

        if (val < 0)
          return false;
        m_airDraughtPresent = true;
        m_airDraught = val;
          return true;
    }

    public double getAirDraught() {

        return m_airDraught;
    }

    public boolean hasAirDraught() {

        return m_airDraughtPresent;
    }

    public boolean setDraught(double val) {

        if (val < 0)
          return false;
        m_draughtPresent = true;
        m_draught = val;
          return true;
    }

    public double getDraught() {

        return m_draught;
    }

    public boolean hasDraught() {

        return m_draughtPresent;
    }

    public String toXML() {

        String xml = "<Voyage";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( m_idPresent ) {
            xml += " Id=\"" + encode( m_id) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( m_sourceNamePresent ) {
            xml += " SourceName=\"" + encode( m_sourceName) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( m_sourcePresent ) {
            xml += " Source=\"" + m_source + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( hasCargoType() ) {
            xml += " CargoType=\"" + m_cargoType + "\"";
        }
        if ( hasDestination() ) {
            xml += " Destination=\"" + encode( m_destination) + "\"";
        }
        if ( hasETA() ) {
            xml += " ETA=\"" + df.format(m_ETA) + "\"";
        }
        if ( hasATA() ) {
            xml += " ATA=\"" + df.format(m_ATA) + "\"";
        }
        if ( hasPersonsOnBoard() ) {
            xml += " PersonsOnBoard=\"" + m_personsOnBoard + "\"";
        }
        if ( hasAirDraught() ) {
            xml += " AirDraught=\"" + nf.format(m_airDraught) + "\"";
        }
        if ( hasDraught() ) {
            xml += " Draught=\"" + nf.format(m_draught) + "\"";
        }
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Voyage\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

            str +=  lead + "    Id = " + m_id + "\n";
            str +=  lead + "    SourceName = " + m_sourceName + "\n";
            str +=  lead + "    Source = " + m_source + "\n";
        if ( hasCargoType() ) {
            str +=  lead + "    CargoType = " + m_cargoType + "\n";
        }
        if ( hasDestination() ) {
            str +=  lead + "    Destination = " + m_destination + "\n";
        }
        if ( hasETA() ) {
            str +=  lead + "    ETA = " + df.format(m_ETA) + "\n";
        }
        if ( hasATA() ) {
            str +=  lead + "    ATA = " + df.format(m_ATA) + "\n";
        }
        if ( hasPersonsOnBoard() ) {
            str +=  lead + "    PersonsOnBoard = " + m_personsOnBoard + "\n";
        }
        if ( hasAirDraught() ) {
            str +=  lead + "    AirDraught = " + nf.format(m_airDraught) + "\n";
        }
        if ( hasDraught() ) {
            str +=  lead + "    Draught = " + nf.format(m_draught) + "\n";
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
