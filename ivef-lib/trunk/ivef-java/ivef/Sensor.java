/* 
 *  Sensor
 *
 *  Sensor is free software: you can redistribute it and/or modify
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


public class Sensor { 

    private double m_senId; // default value is uninitialized
    private double m_trkId; // default value is uninitialized
    private Date m_updateTime; // default value is uninitialized

    public Sensor() {

    }

    public Sensor(Sensor val) {

        m_senId = val.getSenId();
        m_trkId = val.getTrkId();
        m_updateTime = val.getUpdateTime();
    }

    public void setSenId(double val) {

        if (val < 0)
          return;
        if (val > 65536)
          return;
        m_senId = val;
    }

    public double getSenId() {

        return m_senId;
    }

    public void setTrkId(double val) {

        if (val < 0)
          return;
        if (val > 65536)
          return;
        m_trkId = val;
    }

    public double getTrkId() {

        return m_trkId;
    }

    public void setUpdateTime(Date val) {

        m_updateTime = val;
    }

    public Date getUpdateTime() {

        return m_updateTime;
    }

    public String toXML() {

        String xml = "<Sensor";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += " SenId=\"" + m_senId + "\"";
        xml += " TrkId=\"" + m_trkId + "\"";
        xml += " UpdateTime=\"" + df.format(m_updateTime) + "\"";
        xml += ">\n";
        xml += "</Sensor>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Sensor\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        str +=  lead + "    SenId = " + m_senId + "\n";
        str +=  lead + "    TrkId = " + m_trkId + "\n";
        str +=  lead + "    UpdateTime = " + df.format(m_updateTime) + "\n";
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
