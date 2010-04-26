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
 *  Generated by xsd2code on Mon Apr 26 21:47:53 2010.
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
    BOOL m_loginRequestPresent;
    ILLoginResponse *m_loginResponse;
    BOOL m_loginResponsePresent;
    ILLogout *m_logout;
    BOOL m_logoutPresent;
    ILPing *m_ping;
    BOOL m_pingPresent;
    ILPong *m_pong;
    BOOL m_pongPresent;
    ILServerStatus *m_serverStatus;
    BOOL m_serverStatusPresent;
    ILServiceRequest *m_serviceRequest;
    BOOL m_serviceRequestPresent;
    NSMutableArray *m_vesselDatas;
    BOOL m_vesselDataPresent;
}

//!Setter for LoginRequest
//!
-(BOOL) setLoginRequest:(ILLoginRequest *) val;
//!Getter for LoginRequest
//!
-(ILLoginRequest *) loginRequest;
//!Test for pressence of LoginRequest
//!
-(BOOL) hasLoginRequest;
//!Setter for LoginResponse
//!
-(BOOL) setLoginResponse:(ILLoginResponse *) val;
//!Getter for LoginResponse
//!
-(ILLoginResponse *) loginResponse;
//!Test for pressence of LoginResponse
//!
-(BOOL) hasLoginResponse;

/* Logout:
   Logout element node */
//!Setter for Logout
//!
-(BOOL) setLogout:(ILLogout *) val;
//!Getter for Logout
//!
-(ILLogout *) logout;
//!Test for pressence of Logout
//!
-(BOOL) hasLogout;
//!Setter for Ping
//!
-(BOOL) setPing:(ILPing *) val;
//!Getter for Ping
//!
-(ILPing *) ping;
//!Test for pressence of Ping
//!
-(BOOL) hasPing;
//!Setter for Pong
//!
-(BOOL) setPong:(ILPong *) val;
//!Getter for Pong
//!
-(ILPong *) pong;
//!Test for pressence of Pong
//!
-(BOOL) hasPong;
//!Setter for ServerStatus
//!
-(BOOL) setServerStatus:(ILServerStatus *) val;
//!Getter for ServerStatus
//!
-(ILServerStatus *) serverStatus;
//!Test for pressence of ServerStatus
//!
-(BOOL) hasServerStatus;
//!Setter for ServiceRequest
//!
-(BOOL) setServiceRequest:(ILServiceRequest *) val;
//!Getter for ServiceRequest
//!
-(ILServiceRequest *) serviceRequest;
//!Test for pressence of ServiceRequest
//!
-(BOOL) hasServiceRequest;
//!Setter for VesselData
//!
-(BOOL) addVesselData:(ILVesselData *) val;
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

-(BOOL) setAttributes:(NSDictionary *)attributeDict;
//!Get attributes as a key/value dictionary
//!
-(NSDictionary *) attributes;
//!Get a XML representation of this class
//!returns nil if not all required fields are set
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



