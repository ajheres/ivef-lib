/* 
 *  ServiceRequest
 *
 *  ServiceRequest is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Mar 26 13:53:29 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.Area;
import ivef.Transmission;
import ivef.Item;
import ivef.Object;

public class ServiceRequest { 

    private Vector<Area> m_areas = new Vector<Area>();
    private Transmission m_transmission; // default value is uninitialized
    private Vector<Item> m_items = new Vector<Item>();
    private Vector<Object> m_objects = new Vector<Object>();

    public ServiceRequest() {

    }

    public ServiceRequest(ServiceRequest val) {

        for(int i=0; i < val.countOfAreas(); i++ ) {
            m_areas.add( val.getAreaAt(i) );
        }
        m_transmission = val.getTransmission();
        for(int i=0; i < val.countOfItems(); i++ ) {
            m_items.add( val.getItemAt(i) );
        }
        for(int i=0; i < val.countOfObjects(); i++ ) {
            m_objects.add( val.getObjectAt(i) );
        }
    }

    public void addArea(Area val) {

        m_areas.add(val);
    }

    public Area getAreaAt(int i) {

        return (Area) m_areas.get(i);
    }

    public int countOfAreas() {

        return m_areas.size();
    }

    public void setTransmission(Transmission val) {

        m_transmission = val;
    }

    public Transmission getTransmission() {

        return m_transmission;
    }

    public void addItem(Item val) {

        m_items.add(val);
    }

    public Item getItemAt(int i) {

        return (Item) m_items.get(i);
    }

    public int countOfItems() {

        return m_items.size();
    }

    public void addObject(Object val) {

        m_objects.add(val);
    }

    public Object getObjectAt(int i) {

        return (Object) m_objects.get(i);
    }

    public int countOfObjects() {

        return m_objects.size();
    }

    public String toXML() {

        String xml = "<ServiceRequest";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += ">\n";
        for(int i=0; i < m_areas.size(); i++ ) {
           Area attribute = (Area) m_areas.get(i);
            xml += attribute.toXML();
        }
        xml +=  m_transmission.toXML();
        for(int i=0; i < m_items.size(); i++ ) {
           Item attribute = (Item) m_items.get(i);
            xml += attribute.toXML();
        }
        for(int i=0; i < m_objects.size(); i++ ) {
           Object attribute = (Object) m_objects.get(i);
            xml += attribute.toXML();
        }
        xml += "</ServiceRequest>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "ServiceRequest\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        for(int i=0; i < m_areas.size(); i++ ) {
           Area attribute = (Area) m_areas.get(i);
           str += attribute.toString(lead + "    ");
        }
        str +=  m_transmission.toString(lead + "    ");
        for(int i=0; i < m_items.size(); i++ ) {
           Item attribute = (Item) m_items.get(i);
           str += attribute.toString(lead + "    ");
        }
        for(int i=0; i < m_objects.size(); i++ ) {
           Object attribute = (Object) m_objects.get(i);
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
