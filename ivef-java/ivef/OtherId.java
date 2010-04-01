/* 
 *  OtherId
 *
 *  OtherId is free software: you can redistribute it and/or modify
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


public class OtherId { 

    private String m_id; // default value is uninitialized
    private String m_value; // default value is uninitialized

    public OtherId() {

    }

    public OtherId(OtherId val) {

        m_id = val.getId();
        m_value = val.getValue();
    }

    public void setId(String val) {

        m_id = val;
    }

    public String getId() {

        return m_id;
    }

    public void setValue(String val) {

        m_value = val;
    }

    public String getValue() {

        return m_value;
    }

    public String toXML() {

        String xml = "<OtherId";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += " Id=\"" + encode( m_id) + "\"";
        xml += " Value=\"" + encode( m_value) + "\"";
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "OtherId\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        str +=  lead + "    Id = " + m_id + "\n";
        str +=  lead + "    Value = " + m_value + "\n";
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
