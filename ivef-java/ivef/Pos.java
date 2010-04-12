/* 
 *  Pos
 *
 *  Pos is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 12 22:41:58 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Pos { 

    private double m_altitude; // default value is uninitialized
    private boolean m_altitudePresent;
    private double m_estAccAlt; // default value is uninitialized
    private boolean m_estAccAltPresent;
    private double m_estAccLat; // default value is uninitialized
    private boolean m_estAccLatPresent;
    private double m_estAccLong; // default value is uninitialized
    private boolean m_estAccLongPresent;
    private double m_lat; // default value is uninitialized
    private double m_long; // default value is uninitialized

    public Pos() {

        m_altitudePresent = false;
        m_estAccAltPresent = false;
        m_estAccLatPresent = false;
        m_estAccLongPresent = false;
    }

    public Pos(Pos val) {

        m_altitudePresent = val.hasAltitude();
        m_altitude = val.getAltitude();
        m_estAccAltPresent = val.hasEstAccAlt();
        m_estAccAlt = val.getEstAccAlt();
        m_estAccLatPresent = val.hasEstAccLat();
        m_estAccLat = val.getEstAccLat();
        m_estAccLongPresent = val.hasEstAccLong();
        m_estAccLong = val.getEstAccLong();
        m_lat = val.getLat();
        m_long = val.getLong();
    }

    public void setAltitude(double val) {

        m_altitudePresent = true;
        m_altitude = val;
    }

    public double getAltitude() {

        return m_altitude;
    }

    public boolean hasAltitude() {

        return m_altitudePresent;
    }

    public void setEstAccAlt(double val) {

        m_estAccAltPresent = true;
        m_estAccAlt = val;
    }

    public double getEstAccAlt() {

        return m_estAccAlt;
    }

    public boolean hasEstAccAlt() {

        return m_estAccAltPresent;
    }

    public void setEstAccLat(double val) {

        m_estAccLatPresent = true;
        m_estAccLat = val;
    }

    public double getEstAccLat() {

        return m_estAccLat;
    }

    public boolean hasEstAccLat() {

        return m_estAccLatPresent;
    }

    public void setEstAccLong(double val) {

        m_estAccLongPresent = true;
        m_estAccLong = val;
    }

    public double getEstAccLong() {

        return m_estAccLong;
    }

    public boolean hasEstAccLong() {

        return m_estAccLongPresent;
    }

    public void setLat(double val) {

        if (val < -90)
          return;
        if (val > 90)
          return;
        m_lat = val;
    }

    public double getLat() {

        return m_lat;
    }

    public void setLong(double val) {

        if (val < -180)
          return;
        if (val > 180)
          return;
        m_long = val;
    }

    public double getLong() {

        return m_long;
    }

    public String toXML() {

        String xml = "<Pos";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasAltitude() ) {
            xml += " Altitude=\"" + nf.format(m_altitude) + "\"";
        }
        if ( hasEstAccAlt() ) {
            xml += " EstAccAlt=\"" + nf.format(m_estAccAlt) + "\"";
        }
        if ( hasEstAccLat() ) {
            xml += " EstAccLat=\"" + nf.format(m_estAccLat) + "\"";
        }
        if ( hasEstAccLong() ) {
            xml += " EstAccLong=\"" + nf.format(m_estAccLong) + "\"";
        }
        xml += " Lat=\"" + nf.format(m_lat) + "\"";
        xml += " Long=\"" + nf.format(m_long) + "\"";
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Pos\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasAltitude() ) {
            str +=  lead + "    Altitude = " + nf.format(m_altitude) + "\n";
        }
        if ( hasEstAccAlt() ) {
            str +=  lead + "    EstAccAlt = " + nf.format(m_estAccAlt) + "\n";
        }
        if ( hasEstAccLat() ) {
            str +=  lead + "    EstAccLat = " + nf.format(m_estAccLat) + "\n";
        }
        if ( hasEstAccLong() ) {
            str +=  lead + "    EstAccLong = " + nf.format(m_estAccLong) + "\n";
        }
        str +=  lead + "    Lat = " + nf.format(m_lat) + "\n";
        str +=  lead + "    Long = " + nf.format(m_long) + "\n";
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
