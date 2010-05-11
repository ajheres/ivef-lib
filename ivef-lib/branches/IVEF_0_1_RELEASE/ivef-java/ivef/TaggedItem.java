/* 
 *  TaggedItem
 *
 *  TaggedItem is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue May 11 11:33:59 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class TaggedItem { 

    private String m_key; // default value is uninitialized
    private boolean m_keyPresent;
    private String m_value; // default value is uninitialized
    private boolean m_valuePresent;

    public TaggedItem() {

        m_keyPresent = false;
        m_valuePresent = false;
    }

    public TaggedItem(TaggedItem val) {

        m_key = val.getKey();
        if (val != null) {
            m_keyPresent = true;
        }
        m_value = val.getValue();
        if (val != null) {
            m_valuePresent = true;
        }
    }

    public boolean setKey(String val) {

        m_keyPresent = true;
        m_key = val;
          return true;
    }

    public String getKey() {

        return m_key;
    }

    public boolean setValue(String val) {

        m_valuePresent = true;
        m_value = val;
          return true;
    }

    public String getValue() {

        return m_value;
    }

    public String toXML() {

        String xml = "<TaggedItem";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( m_keyPresent ) {
            xml += " Key=\"" + encode( m_key) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( m_valuePresent ) {
            xml += " Value=\"" + encode( m_value) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "TaggedItem\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        str +=  lead + "    Key = " + m_key + "\n";
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
