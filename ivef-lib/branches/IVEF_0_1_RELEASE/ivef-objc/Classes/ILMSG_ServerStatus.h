/* 
 *  ILMSG_ServerStatus
 *
 *  ILMSG_ServerStatus is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 26 20:38:05 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>
#import "ILHeader.h"
#import "ILBody.h"

//-----------------------------------------------------------
//! \brief       Class definition of ILMSG_ServerStatus
//!
//! MESSAGE sent by the supplier in case the server is experienceing / recovering from load problems
//!

@interface ILMSG_ServerStatus : NSObject { 
    ILHeader *m_header;
    BOOL m_headerPresent;
    ILBody *m_body;
    BOOL m_bodyPresent;
}

//!Setter for Header
//!
-(BOOL) setHeader:(ILHeader *) val;
//!Getter for Header
//!
-(ILHeader *) header;
//!Setter for Body
//!
-(BOOL) setBody:(ILBody *) val;
//!Getter for Body
//!
-(ILBody *) body;
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



