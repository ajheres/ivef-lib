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
 *  Generated by xsd2code on Mon Apr 26 22:36:23 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.PosReport;
import ivef.StaticData;
import ivef.Voyage;
import ivef.TaggedItem;

public class VesselData { 

    private PosReport m_posReport; // default value is uninitialized
    private boolean m_posReportPresent;
    private Vector<StaticData> m_staticDatas = new Vector<StaticData>();
    private boolean m_staticDataPresent;
    private Vector<Voyage> m_voyages = new Vector<Voyage>();
    private boolean m_voyagePresent;
    private Vector<TaggedItem> m_taggedItems = new Vector<TaggedItem>();
    private boolean m_taggedItemPresent;

    public VesselData() {

        m_posReportPresent = false;
        m_staticDataPresent = false;
        m_voyagePresent = false;
        m_taggedItemPresent = false;
    }

    public VesselData(VesselData val) {

        m_posReport = val.getPosReport();
        if (val != null) {
            m_posReportPresent = true;
        }
        for(int i=0; i < val.countOfStaticDatas(); i++ ) {
            m_staticDatas.add( val.getStaticDataAt(i) );
        }
        for(int i=0; i < val.countOfVoyages(); i++ ) {
            m_voyages.add( val.getVoyageAt(i) );
        }
        for(int i=0; i < val.countOfTaggedItems(); i++ ) {
            m_taggedItems.add( val.getTaggedItemAt(i) );
        }
    }

    public boolean setPosReport(PosReport val) {

        m_posReportPresent = true;
        m_posReport = val;
          return true;
    }

    public PosReport getPosReport() {

        return m_posReport;
    }

    public boolean hasPosReport() {

        return m_posReportPresent;
    }

    public boolean addStaticData(StaticData val) {

        m_staticDatas.add(val);
          return true;
    }

    public StaticData getStaticDataAt(int i) {

        return (StaticData) m_staticDatas.get(i);
    }

    public int countOfStaticDatas() {

        return m_staticDatas.size();
    }

    public boolean addVoyage(Voyage val) {

        m_voyages.add(val);
          return true;
    }

    public Voyage getVoyageAt(int i) {

        return (Voyage) m_voyages.get(i);
    }

    public int countOfVoyages() {

        return m_voyages.size();
    }

    public boolean addTaggedItem(TaggedItem val) {

        m_taggedItems.add(val);
          return true;
    }

    public TaggedItem getTaggedItemAt(int i) {

        return (TaggedItem) m_taggedItems.get(i);
    }

    public int countOfTaggedItems() {

        return m_taggedItems.size();
    }

    public String toXML() {

        String xml = "<VesselData";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        xml += ">\n";
        if ( hasPosReport() ) {
            dataMember =  m_posReport.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if (m_staticDatas.size() < 0) {
            return null; // not enough values
        }
        for(int i=0; i < m_staticDatas.size(); i++ ) {
           StaticData attribute = (StaticData) m_staticDatas.get(i);
            dataMember = attribute.toXML();
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if (m_voyages.size() < 0) {
            return null; // not enough values
        }
        for(int i=0; i < m_voyages.size(); i++ ) {
           Voyage attribute = (Voyage) m_voyages.get(i);
            dataMember = attribute.toXML();
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if (m_taggedItems.size() < 0) {
            return null; // not enough values
        }
        for(int i=0; i < m_taggedItems.size(); i++ ) {
           TaggedItem attribute = (TaggedItem) m_taggedItems.get(i);
            dataMember = attribute.toXML();
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        xml += "</VesselData>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "VesselData\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasPosReport() ) {
            str +=  m_posReport.toString(lead + "    ") ;
        }
        for(int i=0; i < m_staticDatas.size(); i++ ) {
           StaticData attribute = (StaticData) m_staticDatas.get(i);
           str += attribute.toString(lead + "    ");
        }
        for(int i=0; i < m_voyages.size(); i++ ) {
           Voyage attribute = (Voyage) m_voyages.get(i);
           str += attribute.toString(lead + "    ");
        }
        for(int i=0; i < m_taggedItems.size(); i++ ) {
           TaggedItem attribute = (TaggedItem) m_taggedItems.get(i);
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
