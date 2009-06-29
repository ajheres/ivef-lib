/* 
 *  ParserListener
 *
 *  ParserListener is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Jun 29 14:33:13 2009.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;


public interface ParserListener { 

    // subclass these methods to receive events 
    public void handleMSG_LoginRequest(MSG_LoginRequest obj);
    public void handleMSG_LoginResponse(MSG_LoginResponse obj);
    public void handleMSG_Logout(MSG_Logout obj);
    public void handleMSG_Ping(MSG_Ping obj);
    public void handleMSG_Pong(MSG_Pong obj);
    public void handleMSG_ServerStatus(MSG_ServerStatus obj);
    public void handleMSG_ServiceRequest(MSG_ServiceRequest obj);
    public void handleMSG_VesselData(MSG_VesselData obj);

}
