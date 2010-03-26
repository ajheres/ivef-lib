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
 *  Generated by xsd2code on Fri Mar 26 13:53:41 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ivef.LoginRequest;
import ivef.LoginResponse;
import ivef.Logout;
import ivef.ObjectDatas;
import ivef.Ping;
import ivef.Pong;
import ivef.ServerStatus;
import ivef.ServiceRequest;
import ivef.ServiceRequestResponse;

public class Body { 

    private LoginRequest m_loginRequest; // default value is uninitialized
    private boolean m_loginRequestPresent;
    private LoginResponse m_loginResponse; // default value is uninitialized
    private boolean m_loginResponsePresent;
    private Logout m_logout; // default value is uninitialized
    private boolean m_logoutPresent;
    private ObjectDatas m_objectDatas; // default value is uninitialized
    private boolean m_objectDatasPresent;
    private Ping m_ping; // default value is uninitialized
    private boolean m_pingPresent;
    private Pong m_pong; // default value is uninitialized
    private boolean m_pongPresent;
    private ServerStatus m_serverStatus; // default value is uninitialized
    private boolean m_serverStatusPresent;
    private ServiceRequest m_serviceRequest; // default value is uninitialized
    private boolean m_serviceRequestPresent;
    private ServiceRequestResponse m_serviceRequestResponse; // default value is uninitialized
    private boolean m_serviceRequestResponsePresent;

    public Body() {

        m_loginRequestPresent = false;
        m_loginResponsePresent = false;
        m_logoutPresent = false;
        m_objectDatasPresent = false;
        m_pingPresent = false;
        m_pongPresent = false;
        m_serverStatusPresent = false;
        m_serviceRequestPresent = false;
        m_serviceRequestResponsePresent = false;
    }

    public Body(Body val) {

        m_loginRequestPresent = val.hasLoginRequest();
        m_loginRequest = val.getLoginRequest();
        m_loginResponsePresent = val.hasLoginResponse();
        m_loginResponse = val.getLoginResponse();
        m_logoutPresent = val.hasLogout();
        m_logout = val.getLogout();
        m_objectDatasPresent = val.hasObjectDatas();
        m_objectDatas = val.getObjectDatas();
        m_pingPresent = val.hasPing();
        m_ping = val.getPing();
        m_pongPresent = val.hasPong();
        m_pong = val.getPong();
        m_serverStatusPresent = val.hasServerStatus();
        m_serverStatus = val.getServerStatus();
        m_serviceRequestPresent = val.hasServiceRequest();
        m_serviceRequest = val.getServiceRequest();
        m_serviceRequestResponsePresent = val.hasServiceRequestResponse();
        m_serviceRequestResponse = val.getServiceRequestResponse();
    }

    public void setLoginRequest(LoginRequest val) {

        m_loginRequestPresent = true;
        m_loginRequest = val;
    }

    public LoginRequest getLoginRequest() {

        return m_loginRequest;
    }

    public boolean hasLoginRequest() {

        return m_loginRequestPresent;
    }

    public void setLoginResponse(LoginResponse val) {

        m_loginResponsePresent = true;
        m_loginResponse = val;
    }

    public LoginResponse getLoginResponse() {

        return m_loginResponse;
    }

    public boolean hasLoginResponse() {

        return m_loginResponsePresent;
    }

    public void setLogout(Logout val) {

        m_logoutPresent = true;
        m_logout = val;
    }

    public Logout getLogout() {

        return m_logout;
    }

    public boolean hasLogout() {

        return m_logoutPresent;
    }

    public void setObjectDatas(ObjectDatas val) {

        m_objectDatasPresent = true;
        m_objectDatas = val;
    }

    public ObjectDatas getObjectDatas() {

        return m_objectDatas;
    }

    public boolean hasObjectDatas() {

        return m_objectDatasPresent;
    }

    public void setPing(Ping val) {

        m_pingPresent = true;
        m_ping = val;
    }

    public Ping getPing() {

        return m_ping;
    }

    public boolean hasPing() {

        return m_pingPresent;
    }

    public void setPong(Pong val) {

        m_pongPresent = true;
        m_pong = val;
    }

    public Pong getPong() {

        return m_pong;
    }

    public boolean hasPong() {

        return m_pongPresent;
    }

    public void setServerStatus(ServerStatus val) {

        m_serverStatusPresent = true;
        m_serverStatus = val;
    }

    public ServerStatus getServerStatus() {

        return m_serverStatus;
    }

    public boolean hasServerStatus() {

        return m_serverStatusPresent;
    }

    public void setServiceRequest(ServiceRequest val) {

        m_serviceRequestPresent = true;
        m_serviceRequest = val;
    }

    public ServiceRequest getServiceRequest() {

        return m_serviceRequest;
    }

    public boolean hasServiceRequest() {

        return m_serviceRequestPresent;
    }

    public void setServiceRequestResponse(ServiceRequestResponse val) {

        m_serviceRequestResponsePresent = true;
        m_serviceRequestResponse = val;
    }

    public ServiceRequestResponse getServiceRequestResponse() {

        return m_serviceRequestResponse;
    }

    public boolean hasServiceRequestResponse() {

        return m_serviceRequestResponsePresent;
    }

    public String toXML() {

        String xml = "<Body";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += ">\n";
        if ( hasLoginRequest() ) {
            xml +=  m_loginRequest.toXML() ;
            }
        if ( hasLoginResponse() ) {
            xml +=  m_loginResponse.toXML() ;
            }
        if ( hasLogout() ) {
            xml +=  m_logout.toXML() ;
            }
        if ( hasObjectDatas() ) {
            xml +=  m_objectDatas.toXML() ;
            }
        if ( hasPing() ) {
            xml +=  m_ping.toXML() ;
            }
        if ( hasPong() ) {
            xml +=  m_pong.toXML() ;
            }
        if ( hasServerStatus() ) {
            xml +=  m_serverStatus.toXML() ;
            }
        if ( hasServiceRequest() ) {
            xml +=  m_serviceRequest.toXML() ;
            }
        if ( hasServiceRequestResponse() ) {
            xml +=  m_serviceRequestResponse.toXML() ;
            }
        xml += "</Body>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "Body\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        if ( hasLoginRequest() ) {
            str +=  m_loginRequest.toString(lead + "    ") ;
        }
        if ( hasLoginResponse() ) {
            str +=  m_loginResponse.toString(lead + "    ") ;
        }
        if ( hasLogout() ) {
            str +=  m_logout.toString(lead + "    ") ;
        }
        if ( hasObjectDatas() ) {
            str +=  m_objectDatas.toString(lead + "    ") ;
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
        if ( hasServiceRequestResponse() ) {
            str +=  m_serviceRequestResponse.toString(lead + "    ") ;
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
