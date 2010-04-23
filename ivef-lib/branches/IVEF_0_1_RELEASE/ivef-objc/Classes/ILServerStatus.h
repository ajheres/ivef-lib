/* 
 *  ILServerStatus
 *
 *  ILServerStatus is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Apr 23 16:38:30 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>

//-----------------------------------------------------------
//! \brief       Class definition of ILServerStatus
//!
//! 
//!

@interface ILServerStatus : NSObject { 
    NSString *m_status;
    NSString *m_details;
    BOOL m_detailsPresent;
}


/* Status:
   Status of the server */
//!Setter for Status
//!
-(BOOL) setStatus:(NSString *) val;
//!Getter for Status
//!
-(NSString *) status;

/* Details:
   Details of status */
//!Setter for Details
//!
-(BOOL) setDetails:(NSString *) val;
//!Getter for Details
//!
-(NSString *) details;
//!Test for pressence of Details
//!
-(BOOL) hasDetails;
//!Set attributes by providing a key/value dictionary
//!

-(BOOL) setAttributes:(NSDictionary *)attributeDict;
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



