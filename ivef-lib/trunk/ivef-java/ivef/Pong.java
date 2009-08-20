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
 *  Generated by xsd2code on Thu Aug 20 19:56:51 2009.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Pong { 

    private Date m_timeStamp; // default value is uninitialized
    private String m_msgId; // default value is uninitialized
    private int m_sourceId; // default value is uninitialized

    public Pong() {

    }

    public Pong(Pong val) {

        m_timeStamp = val.getTimeStamp();
        m_msgId = val.getMsgId();
        m_sourceId = val.getSourceId();
    }

    public void setTimeStamp(Date val) {

        m_timeStamp = val;
    }

    public Date getTimeStamp() {

        return m_timeStamp;
    }

    public void setMsgId(String val) {

        m_msgId = val;
    }

    public String getMsgId() {

        return m_msgId;
    }

    public void setSourceId(int val) {

        m_sourceId = val;
    }

    public int getSourceId() {

        return m_sourceId;
    }

    public String toXML() {

        String xml = "<Pong";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += " TimeStamp=\"" + df.format(m_timeStamp) + "\"";
        xml += " MsgId=\"" + encode( m_msgId) + "\"";
        xml += " SourceId=\"" + m_sourceId + "\"";
        xml += ">\n";
        xml += "</Pong>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Pong\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        str +=  lead + "    TimeStamp = " + df.format(m_timeStamp) + "\n";
        str +=  lead + "    MsgId = " + m_msgId + "\n";
        str +=  lead + "    SourceId = " + m_sourceId + "\n";
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
