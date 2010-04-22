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
 *  Generated by xsd2code on Thu Apr 22 11:27:32 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

package ivef;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.Construction;
import ivef.Identifier;

public class VesselData { 

    private Construction m_construction; // default value is uninitialized
    private boolean m_constructionPresent;
    private Identifier m_identifier; // default value is uninitialized
    private boolean m_identifierPresent;
    private int m_class; // default value is uninitialized
    private boolean m_classPresent;
    private boolean m_blackListed; // default value is uninitialized
    private boolean m_blackListedPresent;
    private int m_id; // default value is uninitialized
    private String m_specialAttention; // default value is uninitialized
    private boolean m_specialAttentionPresent;
    private String m_sourceId; // default value is uninitialized
    private boolean m_sourceIdPresent;
    private String m_sourceName; // default value is uninitialized
    private int m_sourceType; // default value is uninitialized
    private Date m_updateTime; // default value is uninitialized

    public VesselData() {

        m_constructionPresent = false;
        m_identifierPresent = false;
        m_classPresent = false;
        m_blackListedPresent = false;
        m_specialAttentionPresent = false;
        m_sourceIdPresent = false;
    }

    public VesselData(VesselData val) {

        m_constructionPresent = val.hasConstruction();
        m_construction = val.getConstruction();
        m_identifierPresent = val.hasIdentifier();
        m_identifier = val.getIdentifier();
        m_classPresent = val.hasIVEFClass();
        m_class = val.getIVEFClass();
        m_blackListedPresent = val.hasBlackListed();
        m_blackListed = val.getBlackListed();
        m_id = val.getId();
        m_specialAttentionPresent = val.hasSpecialAttention();
        m_specialAttention = val.getSpecialAttention();
        m_sourceIdPresent = val.hasSourceId();
        m_sourceId = val.getSourceId();
        m_sourceName = val.getSourceName();
        m_sourceType = val.getSourceType();
        m_updateTime = val.getUpdateTime();
    }

    public void setConstruction(Construction val) {

        m_constructionPresent = true;
        m_construction = val;
    }

    public Construction getConstruction() {

        return m_construction;
    }

    public boolean hasConstruction() {

        return m_constructionPresent;
    }

    public void setIdentifier(Identifier val) {

        m_identifierPresent = true;
        m_identifier = val;
    }

    public Identifier getIdentifier() {

        return m_identifier;
    }

    public boolean hasIdentifier() {

        return m_identifierPresent;
    }

    public void setIVEFClass(int val) {

        if ( ( val != 0 ) &&
             ( val != 1 ) &&
             ( val != 2 ) )
            return;
        m_classPresent = true;
        m_class = val;
    }

    public int getIVEFClass() {

        return m_class;
    }

    public boolean hasIVEFClass() {

        return m_classPresent;
    }

    public void setBlackListed(boolean val) {

        m_blackListedPresent = true;
        m_blackListed = val;
    }

    public boolean getBlackListed() {

        return m_blackListed;
    }

    public boolean hasBlackListed() {

        return m_blackListedPresent;
    }

    public void setId(int val) {

        m_id = val;
    }

    public int getId() {

        return m_id;
    }

    public void setSpecialAttention(String val) {

        m_specialAttentionPresent = true;
        m_specialAttention = val;
    }

    public String getSpecialAttention() {

        return m_specialAttention;
    }

    public boolean hasSpecialAttention() {

        return m_specialAttentionPresent;
    }

    public void setSourceId(String val) {

        m_sourceIdPresent = true;
        m_sourceId = val;
    }

    public String getSourceId() {

        return m_sourceId;
    }

    public boolean hasSourceId() {

        return m_sourceIdPresent;
    }

    public void setSourceName(String val) {

        m_sourceName = val;
    }

    public String getSourceName() {

        return m_sourceName;
    }

    public void setSourceType(int val) {

        if ( ( val != 1 ) &&
             ( val != 2 ) &&
             ( val != 3 ) )
            return;
        m_sourceType = val;
    }

    public int getSourceType() {

        return m_sourceType;
    }

    public void setUpdateTime(Date val) {

        m_updateTime = val;
    }

    public Date getUpdateTime() {

        return m_updateTime;
    }

    public String toXML() {

        String xml = "<VesselData";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasIVEFClass() ) {
            xml += " Class=\"" + m_class + "\"";
        }
        if ( hasBlackListed() ) {
            xml += " BlackListed=\"" + m_blackListed + "\"";
        }
        xml += " Id=\"" + m_id + "\"";
        if ( hasSpecialAttention() ) {
            xml += " SpecialAttention=\"" + encode( m_specialAttention) + "\"";
        }
        if ( hasSourceId() ) {
            xml += " SourceId=\"" + encode( m_sourceId) + "\"";
        }
        xml += " SourceName=\"" + encode( m_sourceName) + "\"";
        xml += " SourceType=\"" + m_sourceType + "\"";
        xml += " UpdateTime=\"" + df.format(m_updateTime) + "\"";
        xml += ">\n";
        if ( hasConstruction() ) {
            xml +=  m_construction.toXML() ;
            }
        if ( hasIdentifier() ) {
            xml +=  m_identifier.toXML() ;
            }
        xml += "</VesselData>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "VesselData\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasIVEFClass() ) {
            str +=  lead + "    Class = " + m_class + "\n";
        }
        if ( hasBlackListed() ) {
            str +=  lead + "    BlackListed = " + m_blackListed + "\n";
        }
        str +=  lead + "    Id = " + m_id + "\n";
        if ( hasSpecialAttention() ) {
            str +=  lead + "    SpecialAttention = " + m_specialAttention + "\n";
        }
        if ( hasSourceId() ) {
            str +=  lead + "    SourceId = " + m_sourceId + "\n";
        }
        str +=  lead + "    SourceName = " + m_sourceName + "\n";
        str +=  lead + "    SourceType = " + m_sourceType + "\n";
        str +=  lead + "    UpdateTime = " + df.format(m_updateTime) + "\n";
        if ( hasConstruction() ) {
            str +=  m_construction.toString(lead + "    ") ;
        }
        if ( hasIdentifier() ) {
            str +=  m_identifier.toString(lead + "    ") ;
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
