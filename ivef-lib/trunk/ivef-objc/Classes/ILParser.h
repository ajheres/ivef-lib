/* 
 *  ILParser
 *
 *  ILParser is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Sep 1 21:31:55 2009.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#import <Foundation/Foundation.h>
#import "ILSchema.h"
#import "ILMSG_LoginRequest.h"
#import "ILBody.h"
#import "ILMSG_LoginResponse.h"
#import "ILMSG_Logout.h"
#import "ILLogout.h"
#import "ILMSG_Ping.h"
#import "ILMSG_Pong.h"
#import "ILMSG_ServerStatus.h"
#import "ILMSG_ServiceRequest.h"
#import "ILMSG_VesselData.h"
#import "ILHeader.h"
#import "ILLoginRequest.h"
#import "ILLoginResponse.h"
#import "ILPing.h"
#import "ILPong.h"
#import "ILPos.h"
#import "ILPosReport.h"
#import "ILSensor.h"
#import "ILStaticData.h"
#import "ILServerStatus.h"
#import "ILServiceRequest.h"
#import "ILArea.h"
#import "ILTransmission.h"
#import "ILItem.h"
#import "ILObject.h"
#import "ILVesselData.h"
#import "ILVoyage.h"

@interface ILParser : NSObject { 
    NSMutableString *m_dataBuffer;
    NSMutableArray *m_objStack;
}

- (void)     parser:(NSXMLParser *)parser 
    didStartElement:(NSString *)elementName
       namespaceURI:(NSString *)namespaceURI
      qualifiedName:(NSString *)qualifiedName
         attributes:(NSDictionary *)attributeDict;
- (void)     parser:(NSXMLParser *)parser 
      didEndElement:(NSString *)elementName
       namespaceURI:(NSString *)namespaceURI
      qualifiedName:(NSString *)qualifiedName;
- (bool) parseXMLString:(NSString *)data andBuffer: (bool) cont;

// published notifications:
//    @"NewILMSG_LoginRequest" with @"Data" = ILMSG_LoginRequest
//    @"NewILMSG_LoginResponse" with @"Data" = ILMSG_LoginResponse
//    @"NewILMSG_Logout" with @"Data" = ILMSG_Logout
//    @"NewILMSG_Ping" with @"Data" = ILMSG_Ping
//    @"NewILMSG_Pong" with @"Data" = ILMSG_Pong
//    @"NewILMSG_ServerStatus" with @"Data" = ILMSG_ServerStatus
//    @"NewILMSG_ServiceRequest" with @"Data" = ILMSG_ServiceRequest
//    @"NewILMSG_VesselData" with @"Data" = ILMSG_VesselData

@end



