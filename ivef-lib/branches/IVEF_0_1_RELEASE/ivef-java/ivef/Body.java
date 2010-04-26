/* 
 *  Body
 *
 *  Body is free software: you can redistribute it and/or modify
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

import ivef.LoginRequest;
import ivef.LoginResponse;
import ivef.Logout;
import ivef.Ping;
import ivef.Pong;
import ivef.ServerStatus;
import ivef.ServiceRequest;
import ivef.VesselData;

public class Body { 

    private LoginRequest m_loginRequest; // default value is uninitialized
    private boolean m_loginRequestPresent;
    private LoginResponse m_loginResponse; // default value is uninitialized
    private boolean m_loginResponsePresent;
    private Logout m_logout; // default value is uninitialized
    private boolean m_logoutPresent;
    private Ping m_ping; // default value is uninitialized
    private boolean m_pingPresent;
    private Pong m_pong; // default value is uninitialized
    private boolean m_pongPresent;
    private ServerStatus m_serverStatus; // default value is uninitialized
    private boolean m_serverStatusPresent;
    private ServiceRequest m_serviceRequest; // default value is uninitialized
    private boolean m_serviceRequestPresent;
    private Vector<VesselData> m_vesselDatas = new Vector<VesselData>();
    private boolean m_vesselDataPresent;

    public Body() {

        m_loginRequestPresent = false;
        m_loginResponsePresent = false;
        m_logoutPresent = false;
        m_pingPresent = false;
        m_pongPresent = false;
        m_serverStatusPresent = false;
        m_serviceRequestPresent = false;
        m_vesselDataPresent = false;
    }

    public Body(Body val) {

        m_loginRequest = val.getLoginRequest();
        if (val != null) {
            m_loginRequestPresent = true;
        }
        m_loginResponse = val.getLoginResponse();
        if (val != null) {
            m_loginResponsePresent = true;
        }
        m_logout = val.getLogout();
        if (val != null) {
            m_logoutPresent = true;
        }
        m_ping = val.getPing();
        if (val != null) {
            m_pingPresent = true;
        }
        m_pong = val.getPong();
        if (val != null) {
            m_pongPresent = true;
        }
        m_serverStatus = val.getServerStatus();
        if (val != null) {
            m_serverStatusPresent = true;
        }
        m_serviceRequest = val.getServiceRequest();
        if (val != null) {
            m_serviceRequestPresent = true;
        }
        for(int i=0; i < val.countOfVesselDatas(); i++ ) {
            m_vesselDatas.add( val.getVesselDataAt(i) );
        }
    }

    public boolean setLoginRequest(LoginRequest val) {

        m_loginRequestPresent = true;
        m_loginRequest = val;
          return true;
    }

    public LoginRequest getLoginRequest() {

        return m_loginRequest;
    }

    public boolean hasLoginRequest() {

        return m_loginRequestPresent;
    }

    public boolean setLoginResponse(LoginResponse val) {

        m_loginResponsePresent = true;
        m_loginResponse = val;
          return true;
    }

    public LoginResponse getLoginResponse() {

        return m_loginResponse;
    }

    public boolean hasLoginResponse() {

        return m_loginResponsePresent;
    }

    public boolean setLogout(Logout val) {

        m_logoutPresent = true;
        m_logout = val;
          return true;
    }

    public Logout getLogout() {

        return m_logout;
    }

    public boolean hasLogout() {

        return m_logoutPresent;
    }

    public boolean setPing(Ping val) {

        m_pingPresent = true;
        m_ping = val;
          return true;
    }

    public Ping getPing() {

        return m_ping;
    }

    public boolean hasPing() {

        return m_pingPresent;
    }

    public boolean setPong(Pong val) {

        m_pongPresent = true;
        m_pong = val;
          return true;
    }

    public Pong getPong() {

        return m_pong;
    }

    public boolean hasPong() {

        return m_pongPresent;
    }

    public boolean setServerStatus(ServerStatus val) {

        m_serverStatusPresent = true;
        m_serverStatus = val;
          return true;
    }

    public ServerStatus getServerStatus() {

        return m_serverStatus;
    }

    public boolean hasServerStatus() {

        return m_serverStatusPresent;
    }

    public boolean setServiceRequest(ServiceRequest val) {

        m_serviceRequestPresent = true;
        m_serviceRequest = val;
          return true;
    }

    public ServiceRequest getServiceRequest() {

        return m_serviceRequest;
    }

    public boolean hasServiceRequest() {

        return m_serviceRequestPresent;
    }

    public boolean addVesselData(VesselData val) {

        m_vesselDatas.add(val);
          return true;
    }

    public VesselData getVesselDataAt(int i) {

        return (VesselData) m_vesselDatas.get(i);
    }

    public int countOfVesselDatas() {

        return m_vesselDatas.size();
    }

    public String toXML() {

        String xml = "<Body";
        String dataMember;        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        xml += ">\n";
        if ( hasLoginRequest() ) {
            dataMember =  m_loginRequest.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if ( hasLoginResponse() ) {
            dataMember =  m_loginResponse.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if ( hasLogout() ) {
            dataMember =  m_logout.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if ( hasPing() ) {
            dataMember =  m_ping.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if ( hasPong() ) {
            dataMember =  m_pong.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if ( hasServerStatus() ) {
            dataMember =  m_serverStatus.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        if ( hasServiceRequest() ) {
            dataMember =  m_serviceRequest.toXML() ;
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        for(int i=0; i < m_vesselDatas.size(); i++ ) {
           VesselData attribute = (VesselData) m_vesselDatas.get(i);
            dataMember = attribute.toXML();
            if (dataMember != null) {
               xml += dataMember;
            } else {
               return null; // not all required data members have been set 
            } 
        } 
        xml += "</Body>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Body\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DecimalFormat nf = new DecimalFormat("0.000000");

        if ( hasLoginRequest() ) {
            str +=  m_loginRequest.toString(lead + "    ") ;
        }
        if ( hasLoginResponse() ) {
            str +=  m_loginResponse.toString(lead + "    ") ;
        }
        if ( hasLogout() ) {
            str +=  m_logout.toString(lead + "    ") ;
        }
        if ( hasPing() ) {
            str +=  m_ping.toString(lead + "    ") ;
        }
        if ( hasPong() ) {
            str +=  m_pong.toString(lead + "    ") ;
        }
        if ( hasServerStatus() ) {
            str +=  m_serverStatus.toString(lead + "    ") ;
        }
        if ( hasServiceRequest() ) {
            str +=  m_serviceRequest.toString(lead + "    ") ;
        }
        for(int i=0; i < m_vesselDatas.size(); i++ ) {
           VesselData attribute = (VesselData) m_vesselDatas.get(i);
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
