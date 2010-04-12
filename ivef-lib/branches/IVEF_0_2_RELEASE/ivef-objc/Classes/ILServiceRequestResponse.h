/* 
 *  ILServiceRequestResponse
 *
 *  ILServiceRequestResponse is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 12 22:52:33 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>

//-----------------------------------------------------------
//! \brief       Class definition of ILServiceRequestResponse
//!
//! DATA detailing the supliers response to the users service request
//!

@interface ILServiceRequestResponse : NSObject { 
    NSString *m_reason;
    bool m_reasonPresent;
    NSString *m_responseOn;
    int m_result;
}


/* Reason:
   String describing reason for declining, when result is "Declined", or a string describing the restrictions when the result is "Accepted with restrictions" */
//!Setter for Reason
//!
-(void) setReason:(NSString *) val;
//!Getter for Reason
//!
-(NSString *) reason;
//!Test for pressence of Reason
//!
-(bool) hasReason;

/* ResponseOn:
   Corresponds to the original MsgRefId from the ServiceRequest message. Must be an Universally Unique Identifier (TU-T Rec. X.667 | ISO/IEC 9834-8.) */
//!Setter for ResponseOn
//!
-(void) setResponseOn:(NSString *) val;
//!Getter for ResponseOn
//!
-(NSString *) responseOn;

/* Result:
   1 = Accepted, 2 = Declined, 3 = Accepted with restrictions */
//!Setter for Result
//!
-(void) setResult:(int) val;
//!Getter for Result
//!
-(int) result;
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



