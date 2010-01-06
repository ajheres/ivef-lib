/* 
 *  Parser
 *
 *  Parser is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Wed Jan 6 14:24:24 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import ivef.ParserListener;
import java.util.*;
import java.text.DateFormat;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import ivef.MSG_LoginRequest;
import ivef.Body;
import ivef.MSG_LoginResponse;
import ivef.MSG_Logout;
import ivef.Logout;
import ivef.MSG_Ping;
import ivef.MSG_Pong;
import ivef.MSG_ServerStatus;
import ivef.MSG_ServiceRequest;
import ivef.MSG_VesselData;
import ivef.Header;
import ivef.LoginRequest;
import ivef.LoginResponse;
import ivef.Ping;
import ivef.Pong;
import ivef.Pos;
import ivef.PosReport;
import ivef.Sensor;
import ivef.StaticData;
import ivef.ServerStatus;
import ivef.TaggedItem;
import ivef.ServiceRequest;
import ivef.Area;
import ivef.Transmission;
import ivef.Item;
import ivef.Object;
import ivef.VesselData;
import ivef.Voyage;

public class Parser extends DefaultHandler { 

    private String m_dataBuffer = new String();
    private ParserListener m_handler =  null;
    private Stack m_objStack = new Stack(); // cannot use a template since it stores different Objects
    private SAXParser parser; // init in constructor

    public Parser(ParserListener handler) {

        m_handler = handler;

        // set the parser
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try { 
            parser = factory.newSAXParser();
        } catch(Exception e) {
            e.printStackTrace();
        }
}


    public void startElement(String namespaceUri,
                             String localName,
                             String qName,
                             Attributes atts) {

    // check all possible options
    if (qName == "MSG_LoginRequest") {
        MSG_LoginRequest obj = new MSG_LoginRequest();
        m_objStack.push( obj );
    }
    else if (qName == "Body") {
        Body obj = new Body();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_LoginResponse") {
        MSG_LoginResponse obj = new MSG_LoginResponse();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_Logout") {
        MSG_Logout obj = new MSG_Logout();
        m_objStack.push( obj );
    }
    else if (qName == "Logout") {
        Logout obj = new Logout();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_Ping") {
        MSG_Ping obj = new MSG_Ping();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_Pong") {
        MSG_Pong obj = new MSG_Pong();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_ServerStatus") {
        MSG_ServerStatus obj = new MSG_ServerStatus();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_ServiceRequest") {
        MSG_ServiceRequest obj = new MSG_ServiceRequest();
        m_objStack.push( obj );
    }
    else if (qName == "MSG_VesselData") {
        MSG_VesselData obj = new MSG_VesselData();
        m_objStack.push( obj );
    }
    else if (qName == "Header") {
        Header obj = new Header();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Version") {
                String val = value;
                obj.setVersion(val);
            }
            else if (key == "MsgRefId") {
                String val = value;
                obj.setMsgRefId(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "LoginRequest") {
        LoginRequest obj = new LoginRequest();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Name") {
                String val = value;
                obj.setName(val);
            }
            else if (key == "Password") {
                String val = value;
                obj.setPassword(val);
            }
            else if (key == "Encryption") {
                int val = Integer.parseInt(value);
                obj.setEncryption(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "LoginResponse") {
        LoginResponse obj = new LoginResponse();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "MsgId") {
                String val = value;
                obj.setMsgId(val);
            }
            else if (key == "Result") {
                int val = Integer.parseInt(value);
                obj.setResult(val);
            }
            else if (key == "Reason") {
                String val = value;
                obj.setReason(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "Ping") {
        Ping obj = new Ping();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "TimeStamp") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setTimeStamp(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "Pong") {
        Pong obj = new Pong();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "TimeStamp") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setTimeStamp(val);
            }
            else if (key == "MsgId") {
                String val = value;
                obj.setMsgId(val);
            }
            else if (key == "SourceId") {
                int val = Integer.parseInt(value);
                obj.setSourceId(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "Pos") {
        Pos obj = new Pos();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Lat") {
                double val = Double.parseDouble(value);
                obj.setLat(val);
            }
            else if (key == "Long") {
                double val = Double.parseDouble(value);
                obj.setLong(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "PosReport") {
        PosReport obj = new PosReport();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Id") {
                int val = Integer.parseInt(value);
                obj.setId(val);
            }
            else if (key == "SourceId") {
                int val = Integer.parseInt(value);
                obj.setSourceId(val);
            }
            else if (key == "UpdateTime") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setUpdateTime(val);
            }
            else if (key == "UpdateTimeRadar") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setUpdateTimeRadar(val);
            }
            else if (key == "UpdateTimeAIS") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setUpdateTimeAIS(val);
            }
            else if (key == "UpdateTimeDR") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setUpdateTimeDR(val);
            }
            else if (key == "SOG") {
                double val = Double.parseDouble(value);
                obj.setSOG(val);
            }
            else if (key == "COG") {
                double val = Double.parseDouble(value);
                obj.setCOG(val);
            }
            else if (key == "Lost") {
                String val = value;
                obj.setLost(val);
            }
            else if (key == "RateOfTurn") {
                double val = Double.parseDouble(value);
                obj.setRateOfTurn(val);
            }
            else if (key == "Orientation") {
                double val = Double.parseDouble(value);
                obj.setOrientation(val);
            }
            else if (key == "Length") {
                double val = Double.parseDouble(value);
                obj.setLength(val);
            }
            else if (key == "Breadth") {
                double val = Double.parseDouble(value);
                obj.setBreadth(val);
            }
            else if (key == "Altitude") {
                double val = Double.parseDouble(value);
                obj.setAltitude(val);
            }
            else if (key == "NavStatus") {
                int val = Integer.parseInt(value);
                obj.setNavStatus(val);
            }
            else if (key == "UpdSensorType") {
                int val = Integer.parseInt(value);
                obj.setUpdSensorType(val);
            }
            else if (key == "ATONOffPos") {
                boolean val = (value.toUpperCase() == "YES");
                obj.setATONOffPos(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "Sensor") {
        Sensor obj = new Sensor();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "SenId") {
                double val = Double.parseDouble(value);
                obj.setSenId(val);
            }
            else if (key == "TrkId") {
                double val = Double.parseDouble(value);
                obj.setTrkId(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "StaticData") {
        StaticData obj = new StaticData();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Id") {
                String val = value;
                obj.setId(val);
            }
            else if (key == "SourceName") {
                String val = value;
                obj.setSourceName(val);
            }
            else if (key == "Source") {
                int val = Integer.parseInt(value);
                obj.setSource(val);
            }
            else if (key == "Length") {
                double val = Double.parseDouble(value);
                obj.setLength(val);
            }
            else if (key == "Breadth") {
                double val = Double.parseDouble(value);
                obj.setBreadth(val);
            }
            else if (key == "Callsign") {
                String val = value;
                obj.setCallsign(val);
            }
            else if (key == "ShipName") {
                String val = value;
                obj.setShipName(val);
            }
            else if (key == "ObjectType") {
                int val = Integer.parseInt(value);
                obj.setObjectType(val);
            }
            else if (key == "ShipType") {
                int val = Integer.parseInt(value);
                obj.setShipType(val);
            }
            else if (key == "IMO") {
                int val = Integer.parseInt(value);
                obj.setIMO(val);
            }
            else if (key == "MMSI") {
                int val = Integer.parseInt(value);
                obj.setMMSI(val);
            }
            else if (key == "ATONType") {
                int val = Integer.parseInt(value);
                obj.setATONType(val);
            }
            else if (key == "ATONName") {
                String val = value;
                obj.setATONName(val);
            }
            else if (key == "AntPosDistFromFront") {
                double val = Double.parseDouble(value);
                obj.setAntPosDistFromFront(val);
            }
            else if (key == "AntPosDistFromLeft") {
                double val = Double.parseDouble(value);
                obj.setAntPosDistFromLeft(val);
            }
            else if (key == "NatLangShipName") {
                String val = value;
                obj.setNatLangShipName(val);
            }
            else if (key == "PortOfRegistry") {
                String val = value;
                obj.setPortOfRegistry(val);
            }
            else if (key == "CountryFlag") {
                String val = value;
                obj.setCountryFlag(val);
            }
            else if (key == "MaxAirDraught") {
                double val = Double.parseDouble(value);
                obj.setMaxAirDraught(val);
            }
            else if (key == "MaxDraught") {
                double val = Double.parseDouble(value);
                obj.setMaxDraught(val);
            }
            else if (key == "DeepWaterVesselind") {
                String val = value;
                obj.setDeepWaterVesselind(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "ServerStatus") {
        ServerStatus obj = new ServerStatus();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Status") {
                String val = value;
                obj.setStatus(val);
            }
            else if (key == "Details") {
                String val = value;
                obj.setDetails(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "TaggedItem") {
        TaggedItem obj = new TaggedItem();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Key") {
                String val = value;
                obj.setKey(val);
            }
            else if (key == "Value") {
                String val = value;
                obj.setValue(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "ServiceRequest") {
        ServiceRequest obj = new ServiceRequest();
        m_objStack.push( obj );
    }
    else if (qName == "Area") {
        Area obj = new Area();
        m_objStack.push( obj );
    }
    else if (qName == "Transmission") {
        Transmission obj = new Transmission();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Type") {
                int val = Integer.parseInt(value);
                obj.setType(val);
            }
            else if (key == "Period") {
                double val = Double.parseDouble(value);
                obj.setPeriod(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "Item") {
        Item obj = new Item();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Element") {
                int val = Integer.parseInt(value);
                obj.setElement(val);
            }
            else if (key == "Field") {
                String val = value;
                obj.setField(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "Object") {
        Object obj = new Object();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "FileName") {
                String val = value;
                obj.setFileName(val);
            }
        }
        m_objStack.push( obj );
    }
    else if (qName == "VesselData") {
        VesselData obj = new VesselData();
        m_objStack.push( obj );
    }
    else if (qName == "Voyage") {
        Voyage obj = new Voyage();
        for (int i=0; i < atts.getLength(); i++) {
            String key = atts.getLocalName(i);
            String value = atts.getValue(i);

            if (key == "Id") {
                String val = value;
                obj.setId(val);
            }
            else if (key == "SourceName") {
                String val = value;
                obj.setSourceName(val);
            }
            else if (key == "Source") {
                int val = Integer.parseInt(value);
                obj.setSource(val);
            }
            else if (key == "CargoType") {
                int val = Integer.parseInt(value);
                obj.setCargoType(val);
            }
            else if (key == "Destination") {
                String val = value;
                obj.setDestination(val);
            }
            else if (key == "ETA") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setETA(val);
            }
            else if (key == "ATA") {
                if (value.endsWith("Z")) { 
                    value = value.substring(0, value.length() - 1);
                } 
                Date val = new Date(); // starts since the epoch
                try { 
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                    val = df.parse( value );
                } catch(Exception e) {
                    try { // if there are no miliseconds they will not be sent
                       DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
                       val = df.parse( value );
                    } catch(Exception e2) {
                        e2.printStackTrace();
                    }
                }
                obj.setATA(val);
            }
            else if (key == "PersonsOnBoard") {
                double val = Double.parseDouble(value);
                obj.setPersonsOnBoard(val);
            }
            else if (key == "AirDraught") {
                double val = Double.parseDouble(value);
                obj.setAirDraught(val);
            }
            else if (key == "Draught") {
                double val = Double.parseDouble(value);
                obj.setDraught(val);
            }
        }
        m_objStack.push( obj );
    }
}

    public void endElement(String namespaceUri,
                           String localName,
                           String qName) {

    // check all possible options
    if (qName == "MSG_LoginRequest") {

        MSG_LoginRequest obj = (MSG_LoginRequest) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_LoginRequest( obj ); 
    }
    else if (qName == "Body") {

        Body obj = (Body) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new MSG_LoginRequest().getClass() ) {
                ((MSG_LoginRequest) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_LoginResponse().getClass() ) {
                ((MSG_LoginResponse) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_Logout().getClass() ) {
                ((MSG_Logout) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_Ping().getClass() ) {
                ((MSG_Ping) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_Pong().getClass() ) {
                ((MSG_Pong) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_ServerStatus().getClass() ) {
                ((MSG_ServerStatus) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_ServiceRequest().getClass() ) {
                ((MSG_ServiceRequest) ( m_objStack.peek() ) ).setBody( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_VesselData().getClass() ) {
                ((MSG_VesselData) ( m_objStack.peek() ) ).setBody( obj );
        }
    }
    else if (qName == "MSG_LoginResponse") {

        MSG_LoginResponse obj = (MSG_LoginResponse) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_LoginResponse( obj ); 
    }
    else if (qName == "MSG_Logout") {

        MSG_Logout obj = (MSG_Logout) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_Logout( obj ); 
    }
    else if (qName == "Logout") {

        Logout obj = (Logout) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setLogout( obj );
        }
    }
    else if (qName == "MSG_Ping") {

        MSG_Ping obj = (MSG_Ping) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_Ping( obj ); 
    }
    else if (qName == "MSG_Pong") {

        MSG_Pong obj = (MSG_Pong) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_Pong( obj ); 
    }
    else if (qName == "MSG_ServerStatus") {

        MSG_ServerStatus obj = (MSG_ServerStatus) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_ServerStatus( obj ); 
    }
    else if (qName == "MSG_ServiceRequest") {

        MSG_ServiceRequest obj = (MSG_ServiceRequest) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_ServiceRequest( obj ); 
    }
    else if (qName == "MSG_VesselData") {

        MSG_VesselData obj = (MSG_VesselData) ( m_objStack.pop() );
        if (m_handler != null) 
            m_handler.handleMSG_VesselData( obj ); 
    }
    else if (qName == "Header") {

        Header obj = (Header) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new MSG_LoginRequest().getClass() ) {
                ((MSG_LoginRequest) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_LoginResponse().getClass() ) {
                ((MSG_LoginResponse) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_Logout().getClass() ) {
                ((MSG_Logout) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_Ping().getClass() ) {
                ((MSG_Ping) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_Pong().getClass() ) {
                ((MSG_Pong) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_ServerStatus().getClass() ) {
                ((MSG_ServerStatus) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_ServiceRequest().getClass() ) {
                ((MSG_ServiceRequest) ( m_objStack.peek() ) ).setHeader( obj );
        }
        if ( m_objStack.peek().getClass() == new MSG_VesselData().getClass() ) {
                ((MSG_VesselData) ( m_objStack.peek() ) ).setHeader( obj );
        }
    }
    else if (qName == "LoginRequest") {

        LoginRequest obj = (LoginRequest) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setLoginRequest( obj );
        }
    }
    else if (qName == "LoginResponse") {

        LoginResponse obj = (LoginResponse) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setLoginResponse( obj );
        }
    }
    else if (qName == "Ping") {

        Ping obj = (Ping) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setPing( obj );
        }
    }
    else if (qName == "Pong") {

        Pong obj = (Pong) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setPong( obj );
        }
    }
    else if (qName == "Pos") {

        Pos obj = (Pos) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new PosReport().getClass() ) {
                ((PosReport) ( m_objStack.peek() ) ).setPos( obj );
        }
        if ( m_objStack.peek().getClass() == new Area().getClass() ) {
                ((Area) ( m_objStack.peek() ) ).addPos( obj );
        }
    }
    else if (qName == "PosReport") {

        PosReport obj = (PosReport) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new VesselData().getClass() ) {
                ((VesselData) ( m_objStack.peek() ) ).setPosReport( obj );
        }
    }
    else if (qName == "Sensor") {

        Sensor obj = (Sensor) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new PosReport().getClass() ) {
                ((PosReport) ( m_objStack.peek() ) ).addSensor( obj );
        }
    }
    else if (qName == "StaticData") {

        StaticData obj = (StaticData) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new VesselData().getClass() ) {
                ((VesselData) ( m_objStack.peek() ) ).addStaticData( obj );
        }
    }
    else if (qName == "ServerStatus") {

        ServerStatus obj = (ServerStatus) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setServerStatus( obj );
        }
    }
    else if (qName == "TaggedItem") {

        TaggedItem obj = (TaggedItem) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new VesselData().getClass() ) {
                ((VesselData) ( m_objStack.peek() ) ).addTaggedItem( obj );
        }
    }
    else if (qName == "ServiceRequest") {

        ServiceRequest obj = (ServiceRequest) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).setServiceRequest( obj );
        }
    }
    else if (qName == "Area") {

        Area obj = (Area) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new ServiceRequest().getClass() ) {
                ((ServiceRequest) ( m_objStack.peek() ) ).addArea( obj );
        }
    }
    else if (qName == "Transmission") {

        Transmission obj = (Transmission) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new ServiceRequest().getClass() ) {
                ((ServiceRequest) ( m_objStack.peek() ) ).setTransmission( obj );
        }
    }
    else if (qName == "Item") {

        Item obj = (Item) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new ServiceRequest().getClass() ) {
                ((ServiceRequest) ( m_objStack.peek() ) ).addItem( obj );
        }
    }
    else if (qName == "Object") {

        Object obj = (Object) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new ServiceRequest().getClass() ) {
                ((ServiceRequest) ( m_objStack.peek() ) ).addObject( obj );
        }
    }
    else if (qName == "VesselData") {

        VesselData obj = (VesselData) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new Body().getClass() ) {
                ((Body) ( m_objStack.peek() ) ).addVesselData( obj );
        }
    }
    else if (qName == "Voyage") {

        Voyage obj = (Voyage) ( m_objStack.pop() );
        if ( m_objStack.peek().getClass() == new VesselData().getClass() ) {
                ((VesselData) ( m_objStack.peek() ) ).addVoyage( obj );
        }
    }
}

    public boolean parseXMLString(String data, boolean cont) { 

     m_dataBuffer += data;

     int index[] = new int[8], indexMax = -1;

     // note that if a message does not exist the index will be equal to strlen(name\n) - 1 so indexMax is always > 0
     index[0] = m_dataBuffer.lastIndexOf("</MSG_LoginRequest>") + ("</MSG_LoginRequest>").length();
     index[1] = m_dataBuffer.lastIndexOf("</MSG_LoginResponse>") + ("</MSG_LoginResponse>").length();
     index[2] = m_dataBuffer.lastIndexOf("</MSG_Logout>") + ("</MSG_Logout>").length();
     index[3] = m_dataBuffer.lastIndexOf("</MSG_Ping>") + ("</MSG_Ping>").length();
     index[4] = m_dataBuffer.lastIndexOf("</MSG_Pong>") + ("</MSG_Pong>").length();
     index[5] = m_dataBuffer.lastIndexOf("</MSG_ServerStatus>") + ("</MSG_ServerStatus>").length();
     index[6] = m_dataBuffer.lastIndexOf("</MSG_ServiceRequest>") + ("</MSG_ServiceRequest>").length();
     index[7] = m_dataBuffer.lastIndexOf("</MSG_VesselData>") + ("</MSG_VesselData>").length();
     for (int i=0; i<8; i++) {
         if (index[i] > indexMax) {
             indexMax = index[i];
         }
     }

     if (indexMax > 30) {
         String messages = m_dataBuffer.substring(0, indexMax);
         m_dataBuffer = m_dataBuffer.substring(indexMax); // remove up to indexMax
         try { 
             parser.parse(new InputSource(new StringReader(messages)), this);
         } catch(Exception e) {
             String errorMessage =
                 "Error parsing " + messages + ": " + e;
             System.err.println(errorMessage);
             e.printStackTrace();
         }
     } else {
         return false; // not enough data in string
     }
     if (!cont) {
         m_dataBuffer = "";
     }
     return true;
}


}
