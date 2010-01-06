/* 
 *  Waypoint
 *
 *  Waypoint is free software: you can redistribute it and/or modify
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

import ivef.Pos;

public class Waypoint { 

    private Pos m_pos; // default value is uninitialized
    private Date m_ATA; // default value is uninitialized
    private boolean m_ATAPresent;
    private Date m_ETA; // default value is uninitialized
    private boolean m_ETAPresent;
    private Date m_RTA; // default value is uninitialized
    private boolean m_RTAPresent;
    private String m_loCode; // default value is uninitialized
    private boolean m_loCodePresent;
    private String m_name; // default value is uninitialized

    public Waypoint() {

        m_ATAPresent = false;
        m_ETAPresent = false;
        m_RTAPresent = false;
        m_loCodePresent = false;
    }

    public Waypoint(Waypoint val) {

        m_pos = val.getPos();
        m_ATAPresent = val.hasATA();
        m_ATA = val.getATA();
        m_ETAPresent = val.hasETA();
        m_ETA = val.getETA();
        m_RTAPresent = val.hasRTA();
        m_RTA = val.getRTA();
        m_loCodePresent = val.hasLoCode();
        m_loCode = val.getLoCode();
        m_name = val.getName();
    }

    public void setPos(Pos val) {

        m_pos = val;
    }

    public Pos getPos() {

        return m_pos;
    }

    public void setATA(Date val) {

        m_ATAPresent = true;
        m_ATA = val;
    }

    public Date getATA() {

        return m_ATA;
    }

    public boolean hasATA() {

        return m_ATAPresent;
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

    public void setRTA(Date val) {

        m_RTAPresent = true;
        m_RTA = val;
    }

    public Date getRTA() {

        return m_RTA;
    }

    public boolean hasRTA() {

        return m_RTAPresent;
    }

    public void setLoCode(String val) {

        m_loCodePresent = true;
        m_loCode = val;
    }

    public String getLoCode() {

        return m_loCode;
    }

    public boolean hasLoCode() {

        return m_loCodePresent;
    }

    public void setName(String val) {

        m_name = val;
    }

    public String getName() {

        return m_name;
    }

    public String toXML() {

        String xml = "<Waypoint";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        if ( hasATA() ) {
            xml += " ATA=\"" + df.format(m_ATA) + "\"";
        }
        if ( hasETA() ) {
            xml += " ETA=\"" + df.format(m_ETA) + "\"";
        }
        if ( hasRTA() ) {
            xml += " RTA=\"" + df.format(m_RTA) + "\"";
        }
        if ( hasLoCode() ) {
            xml += " LoCode=\"" + encode( m_loCode) + "\"";
        }
        xml += " Name=\"" + encode( m_name) + "\"";
        xml += ">\n";
        xml +=  m_pos.toXML();
        xml += "</Waypoint>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Waypoint\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        if ( hasATA() ) {
            str +=  lead + "    ATA = " + df.format(m_ATA) + "\n";
        }
        if ( hasETA() ) {
            str +=  lead + "    ETA = " + df.format(m_ETA) + "\n";
        }
        if ( hasRTA() ) {
            str +=  lead + "    RTA = " + df.format(m_RTA) + "\n";
        }
        if ( hasLoCode() ) {
            str +=  lead + "    LoCode = " + m_loCode + "\n";
        }
        str +=  lead + "    Name = " + m_name + "\n";
        str +=  m_pos.toString(lead + "    ");
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
