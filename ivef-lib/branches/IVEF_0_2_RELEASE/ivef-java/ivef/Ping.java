/* 
 *  Ping
 *
 *  Ping is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Apr 1 13:04:12 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Ping { 

    private Date m_timeStamp; // default value is uninitialized

    public Ping() {

    }

    public Ping(Ping val) {

        m_timeStamp = val.getTimeStamp();
    }

    public void setTimeStamp(Date val) {

        m_timeStamp = val;
    }

    public Date getTimeStamp() {

        return m_timeStamp;
    }

    public String toXML() {

        String xml = "<Ping";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += " TimeStamp=\"" + df.format(m_timeStamp) + "\"";
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Ping\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

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
