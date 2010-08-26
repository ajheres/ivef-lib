/* 
 *  Area
 *
 *  Area is free software: you can redistribute it and/or modify
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

import ivef.Pos;

public class Area { 

    private Vector<Pos> m_poss = new Vector<Pos>();
    private boolean m_posPresent;
    private String m_name; // default value is uninitialized
    private boolean m_namePresent;

    public Area() {

        m_posPresent = false;
        m_namePresent = false;
    }

    public Area(Area val) {

        for(int i=0; i < val.countOfPoss(); i++ ) {
            m_poss.add( val.getPosAt(i) );
        }
        m_name = val.getName();
        if (val != null) {
            m_namePresent = true;
        }
    }

    public boolean removePos(Pos val) {
          if (m_poss.size() <= 3) {
              return false; // scalar already at minOccurs
          }

        m_poss.remove(val);
          return true;
    }

    public boolean addPos(Pos val) {

        m_poss.add(val);
          return true;
    }

    public Pos getPosAt(int i) {

        return (Pos) m_poss.get(i);
    }

    public int countOfPoss() {

        return m_poss.size();
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

    public boolean hasName() {

        return m_namePresent;
    }

    public String toXML() {

        String xml = "<Area";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasName() ) {
            xml += " Name=\"" + encode( m_name) + "\"";
        }
        xml += ">\n";
        if (m_poss.size() < 3) {
            return null; // not enough values
        }
        if (m_poss.size() < 3) {
            return null; // not enough values
        }
        for(int i=0; i < m_poss.size(); i++ ) {
           Pos attribute = (Pos) m_poss.get(i);
            dataMember = attribute.toXML();
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        xml += "</Area>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Area\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasName() ) {
            str +=  lead + "    Name = " + m_name + "\n";
        }
        for(int i=0; i < m_poss.size(); i++ ) {
           Pos attribute = (Pos) m_poss.get(i);
           str += attribute.toString(lead + "    ");
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
