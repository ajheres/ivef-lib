/* 
 *  VesselData
 *
 *  VesselData is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Wed May 20 17:30:51 2009.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.PosReport;
import ivef.StaticData;
import ivef.Voyage;

public class VesselData { 

    private PosReport m_posReport; // default value is uninitialized
    private Vector<StaticData> m_staticDatas = new Vector<StaticData>();
    private Vector<Voyage> m_voyages = new Vector<Voyage>();

    public VesselData() {

    }

    public VesselData(VesselData val) {

        m_posReport = val.getPosReport();
        for(int i=0; i < val.countOfStaticDatas(); i++ ) {
            m_staticDatas.add( val.getStaticDataAt(i) );
        }
        for(int i=0; i < val.countOfVoyages(); i++ ) {
            m_voyages.add( val.getVoyageAt(i) );
        }
    }

    public void setPosReport(PosReport val) {

        m_posReport = val;
    }

    public PosReport getPosReport() {

        return m_posReport;
    }

    public void addStaticData(StaticData val) {

        m_staticDatas.add(val);
    }

    public StaticData getStaticDataAt(int i) {

        return (StaticData) m_staticDatas.get(i);
    }

    public int countOfStaticDatas() {

        return m_staticDatas.size();
    }

    public void addVoyage(Voyage val) {

        m_voyages.add(val);
    }

    public Voyage getVoyageAt(int i) {

        return (Voyage) m_voyages.get(i);
    }

    public int countOfVoyages() {

        return m_voyages.size();
    }

    public String toXML() {

        String xml = "<VesselData";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");

        xml += ">\n";
        xml +=  m_posReport.toXML();
        for(int i=0; i < m_staticDatas.size(); i++ ) {
           StaticData attribute = (StaticData) m_staticDatas.get(i);
            xml += attribute.toXML();
        }
        for(int i=0; i < m_voyages.size(); i++ ) {
           Voyage attribute = (Voyage) m_voyages.get(i);
            xml += attribute.toXML();
        }
        xml += "</VesselData>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "VesselData\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");

        str +=  m_posReport.toString(lead + "    ");
        for(int i=0; i < m_staticDatas.size(); i++ ) {
           StaticData attribute = (StaticData) m_staticDatas.get(i);
           str += attribute.toString(lead + "    ");
        }
        for(int i=0; i < m_voyages.size(); i++ ) {
           Voyage attribute = (Voyage) m_voyages.get(i);
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
