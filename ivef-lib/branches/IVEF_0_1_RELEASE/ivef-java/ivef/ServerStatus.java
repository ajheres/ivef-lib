/* 
 *  ServerStatus
 *
 *  ServerStatus is free software: you can redistribute it and/or modify
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


public class ServerStatus { 

    private String m_status; // default value is uninitialized
    private boolean m_statusPresent;
    private String m_details; // default value is uninitialized
    private boolean m_detailsPresent;

    public ServerStatus() {

        m_statusPresent = false;
        m_detailsPresent = false;
    }

    public ServerStatus(ServerStatus val) {

        m_status = val.getStatus();
        if (val != null) {
            m_statusPresent = true;
        }
        m_details = val.getDetails();
        if (val != null) {
            m_detailsPresent = true;
        }
    }

    public boolean setStatus(String val) {

        if ( ( !val.equals("queuefull") ) &&
             ( !val.equals("ok") ) )
            return false;
        m_statusPresent = true;
        m_status = val;
          return true;
    }

    public String getStatus() {

        return m_status;
    }

    public boolean setDetails(String val) {

        m_detailsPresent = true;
        m_details = val;
          return true;
    }

    public String getDetails() {

        return m_details;
    }

    public boolean hasDetails() {

        return m_detailsPresent;
    }

    public String toXML() {

        String xml = "<ServerStatus";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( m_statusPresent ) {
            xml += " Status=\"" + encode( m_status) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( hasDetails() ) {
            xml += " Details=\"" + encode( m_details) + "\"";
        }
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "ServerStatus\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        str +=  lead + "    Status = " + m_status + "\n";
        if ( hasDetails() ) {
            str +=  lead + "    Details = " + m_details + "\n";
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
