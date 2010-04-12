/* 
 *  ILBody
 *
 *  ILBody is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 12 22:41:37 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>
#import "ILLoginRequest.h"
#import "ILLoginResponse.h"
#import "ILLogout.h"
#import "ILPing.h"
#import "ILPong.h"
#import "ILServerStatus.h"
#import "ILServiceRequest.h"
#import "ILVesselData.h"

//-----------------------------------------------------------
//! \brief       Class definition of ILBody
//!
//! 
//!

@interface ILBody : NSObject { 
    ILLoginRequest *m_loginRequest;
    bool m_loginRequestPresent;
    ILLoginResponse *m_loginResponse;
    bool m_loginResponsePresent;
    ILLogout *m_logout;
    bool m_logoutPresent;
    ILPing *m_ping;
    bool m_pingPresent;
    ILPong *m_pong;
    bool m_pongPresent;
    ILServerStatus *m_serverStatus;
    bool m_serverStatusPresent;
    ILServiceRequest *m_serviceRequest;
    bool m_serviceRequestPresent;
    NSMutableArray *m_vesselDatas;
    bool m_vesselDataPresent;
}

//!Setter for LoginRequest
//!
-(void) setLoginRequest:(ILLoginRequest *) val;
//!Getter for LoginRequest
//!
-(ILLoginRequest *) loginRequest;
//!Test for pressence of LoginRequest
//!
-(bool) hasLoginRequest;
//!Setter for LoginResponse
//!
-(void) setLoginResponse:(ILLoginResponse *) val;
//!Getter for LoginResponse
//!
-(ILLoginResponse *) loginResponse;
//!Test for pressence of LoginResponse
//!
-(bool) hasLoginResponse;

/* Logout:
   Logout element node */
//!Setter for Logout
//!
-(void) setLogout:(ILLogout *) val;
//!Getter for Logout
//!
-(ILLogout *) logout;
//!Test for pressence of Logout
//!
-(bool) hasLogout;
//!Setter for Ping
//!
-(void) setPing:(ILPing *) val;
//!Getter for Ping
//!
-(ILPing *) ping;
//!Test for pressence of Ping
//!
-(bool) hasPing;
//!Setter for Pong
//!
-(void) setPong:(ILPong *) val;
//!Getter for Pong
//!
-(ILPong *) pong;
//!Test for pressence of Pong
//!
-(bool) hasPong;
//!Setter for ServerStatus
//!
-(void) setServerStatus:(ILServerStatus *) val;
//!Getter for ServerStatus
//!
-(ILServerStatus *) serverStatus;
//!Test for pressence of ServerStatus
//!
-(bool) hasServerStatus;
//!Setter for ServiceRequest
//!
-(void) setServiceRequest:(ILServiceRequest *) val;
//!Getter for ServiceRequest
//!
-(ILServiceRequest *) serviceRequest;
//!Test for pressence of ServiceRequest
//!
-(bool) hasServiceRequest;
//!Setter for VesselData
//!
-(void) addVesselData:(ILVesselData *) val;
//!Getter for VesselData
//!
-(ILVesselData *) vesselDataAt:(int) i;
//!Element counter for VesselData
//!
-(int) countOfVesselDatas;
//!Get all elements for VesselData
//!
-(NSArray *) vesselDatas;
//!Set attributes by providing a key/value dictionary
//!

-(void) setAttributes:(NSDictionary *)attributeDict;
//!Get attributes as a key/value dictionary
//!
-(NSDictionary *) attributes;
//!Get a XML representation of this class
//!
-(NSString *) XML;
//!Get a string representation of this class
//!
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
//!Helper routine to encode any string to an XML escaped string
//!
-(NSString *) encode: (NSString *) input;

@end



