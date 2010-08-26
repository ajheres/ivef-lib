/* 
 *  OtherName
 *
 *  OtherName is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Aug 26 11:51:13 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class OtherName { 

    private String m_lang; // default value is uninitialized
    private boolean m_langPresent;
    private String m_name; // default value is uninitialized
    private boolean m_namePresent;

    public OtherName() {

        m_langPresent = false;
        m_namePresent = false;
    }

    public OtherName(OtherName val) {

        m_lang = val.getLang();
        if (val != null) {
            m_langPresent = true;
        }
        m_name = val.getName();
        if (val != null) {
            m_namePresent = true;
        }
    }

    public boolean setLang(String val) {

        if (val.length() < 2)
          return false;
        if (val.length() > 2)
          return false;
        m_langPresent = true;
        m_lang = val;
          return true;
    }

    public String getLang() {

        return m_lang;
    }

    public boolean setName(String val) {

        if (val.length() < 1)
          return false;
        if (val.length() > 42)
          return false;
        m_namePresent = true;
        m_name = val;
          return true;
    }

    public String getName() {

        return m_name;
    }

    public String toXML() {

        String xml = "<OtherName";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( m_langPresent ) {
            xml += " Lang=\"" + encode( m_lang) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        if ( m_namePresent ) {
            xml += " Name=\"" + encode( m_name) + "\"";
        } else { 
            return null; // not all required attributes have been set 
        } 
        xml += "/>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "OtherName\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

            str +=  lead + "    Lang = " + m_lang + "\n";
            str +=  lead + "    Name = " + m_name + "\n";
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
