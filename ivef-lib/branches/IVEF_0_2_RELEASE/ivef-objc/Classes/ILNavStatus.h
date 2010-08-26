/* 
 *  ILNavStatus
 *
 *  ILNavStatus is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Aug 26 11:50:39 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>

//-----------------------------------------------------------
//! \brief       Class definition of ILNavStatus
//!
//! 
//!

@interface ILNavStatus : NSObject { 
    int m_value;
    BOOL m_valuePresent;
}


/* Value:
   Navigation status of the target
   								0 = under way using engine
   								1 = at anchor
   								2 = not under command
   								3 = restricted manoeuvrability
   								4 = constrained by her draught
   								5 = moored
   								6 = aground
   								7 = engaged in fishing
   								8 = under way sailing
   								9 = engaged in fishing other than trawling  
   								10 = air-cushion vessel in non displacement mode or WIG craft taking off, landing or in flight
   								11 = power driven vessel towing astern
   								12 = power driven vessel pushing ahead or towing alongside
   								13 = in distress or requiring assistance  
   								14 = AIS SART, seeking to attract attention
   								15 = undefined default */
//!Setter for Value
//!
-(BOOL) setValue:(int) val;
//!Getter for Value
//!
-(int) value;
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



