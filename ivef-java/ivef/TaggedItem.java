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


public class TaggedItem { 

    private String m_key; // default value is uninitialized
    private String m_value; // default value is uninitialized

    public TaggedItem() {

    }

    public TaggedItem(TaggedItem val) {

        m_key = val.getKey();
        m_value = val.getValue();
    }

    public void setKey(String val) {

        m_key = val;
    }

    public String getKey() {

        return m_key;
    }

    public void setValue(String val) {

        m_value = val;
    }

    public String getValue() {

        return m_value;
    }

    public String toXML() {

        String xml = "<TaggedItem";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        xml += " Key=\"" + encode( m_key) + "\"";
        xml += " Value=\"" + encode( m_value) + "\"";
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
