/* 
 *  ObjectDatas
 *
 *  ObjectDatas is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Mar 26 13:53:41 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.ObjectData;

public class ObjectDatas { 

    private Vector<ObjectData> m_objectDatas = new Vector<ObjectData>();

    public ObjectDatas() {

    }

    public ObjectDatas(ObjectDatas val) {

        for(int i=0; i < val.countOfObjectDatas(); i++ ) {
            m_objectDatas.add( val.getObjectDataAt(i) );
        }
    }

    public void addObjectData(ObjectData val) {

        m_objectDatas.add(val);
    }

    public ObjectData getObjectDataAt(int i) {

        return (ObjectData) m_objectDatas.get(i);
    }

    public int countOfObjectDatas() {

        return m_objectDatas.size();
    }

    public String toXML() {

        String xml = "<ObjectDatas";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += ">\n";
        for(int i=0; i < m_objectDatas.size(); i++ ) {
           ObjectData attribute = (ObjectData) m_objectDatas.get(i);
            xml += attribute.toXML();
        }
        xml += "</ObjectDatas>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "ObjectDatas\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        for(int i=0; i < m_objectDatas.size(); i++ ) {
           ObjectData attribute = (ObjectData) m_objectDatas.get(i);
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
