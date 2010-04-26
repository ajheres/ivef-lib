/* 
 *  MSG_Pong
 *
 *  MSG_Pong is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 26 22:11:34 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.Header;
import ivef.Body;

public class MSG_Pong { 

    private Header m_header; // default value is uninitialized
    private boolean m_headerPresent;
    private Body m_body; // default value is uninitialized
    private boolean m_bodyPresent;

    public MSG_Pong() {

        m_headerPresent = false;
        m_bodyPresent = false;
    }

    public MSG_Pong(MSG_Pong val) {

        m_header = val.getHeader();
        if (val != null) {
            m_headerPresent = true;
        }
        m_body = val.getBody();
        if (val != null) {
            m_bodyPresent = true;
        }
    }

    public boolean setHeader(Header val) {

        m_headerPresent = true;
        m_header = val;
          return true;
    }

    public Header getHeader() {

        return m_header;
    }

    public boolean setBody(Body val) {

        m_bodyPresent = true;
        m_body = val;
          return true;
    }

    public Body getBody() {

        return m_body;
    }

    public String toXML() {

        String xml = "<MSG_Pong";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        xml += ">\n";
        if ( m_headerPresent ) {
            xml +=  m_header.toXML();
        } else { 
            return null; // not all required data members have been set 
        } 
        if ( m_bodyPresent ) {
            xml +=  m_body.toXML();
        } else { 
            return null; // not all required data members have been set 
        } 
        xml += "</MSG_Pong>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "MSG_Pong\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        str +=  m_header.toString(lead + "    ");
        str +=  m_body.toString(lead + "    ");
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
