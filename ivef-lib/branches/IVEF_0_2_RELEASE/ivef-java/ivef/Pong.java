/* 
 *  Pong
 *
 *  Pong is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue May 18 15:12:04 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Pong { 

    private String m_responseOn; // default value is uninitialized
    private boolean m_responseOnPresent;
    private int m_sourceId; // default value is uninitialized
    private boolean m_sourceIdPresent;
    private Date m_timeStamp; // default value is uninitialized
    private boolean m_timeStampPresent;

    public Pong() {

        m_responseOnPresent = false;
        m_sourceIdPresent = false;
        m_timeStampPresent = false;
    }

    public Pong(Pong val) {

        m_responseOn = val.getResponseOn();
        if (val != null) {
            m_responseOnPresent = true;
        }
        m_sourceId = val.getSourceId();
        if (val != null) {
            m_sourceIdPresent = true;
        }
        m_timeStamp = val.getTimeStamp();
        if (val != null) {
            m_timeStampPresent = true;
        }
    }

    public boolean setResponseOn(String val) {

        m_responseOnPresent = true;
        m_responseOn = val;
          return true;
    }

    public String getResponseOn() {

        return m_responseOn;
    }

    public boolean setSourceId(int val) {

        m_sourceIdPresent = true;
        m_sourceId = val;
          return true;
    }

    public int getSourceId() {

        return m_sourceId;
    }

    public boolean setTimeStamp(Date val) {

        m_timeStampPresent = true;
        m_timeStamp = val;
          return true;
    }

    public Date getTimeStamp() {

        return m_timeStamp;
    }

    public String toXML() {

        String xml = "<Pong";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( m_responseOnPresent ) {
            xml += " ResponseOn=\"" + encode( m_responseOn) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( m_sourceIdPresent ) {
            xml += " SourceId=\"" + m_sourceId + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( m_timeStampPresent ) {
            xml += " TimeStamp=\"" + df.format(m_timeStamp) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Pong\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

            str +=  lead + "    ResponseOn = " + m_responseOn + "\n";
            str +=  lead + "    SourceId = " + m_sourceId + "\n";
            str +=  lead + "    TimeStamp = " + df.format(m_timeStamp) + "\n";
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
