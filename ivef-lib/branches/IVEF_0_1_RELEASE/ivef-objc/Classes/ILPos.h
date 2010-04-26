/* 
 *  ILPos
 *
 *  ILPos is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 26 21:22:52 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>

//-----------------------------------------------------------
//! \brief       Class definition of ILPos
//!
//! 
//!

@interface ILPos : NSObject { 
    float m_lat;
    BOOL m_latPresent;
    float m_long;
    BOOL m_longPresent;
}


/* Lat:
   Latitude (WGS84) in degrees. (+/- 90 degrees;
   North = positive; South = negative) Examples:
   
   -90deg (south) =   -90.0000000
   0deg0min1sec (north) =    0.0000016
   50deg50min (north)  = 50.8333333 */
//!Setter for Lat
//!
-(BOOL) setLat:(float) val;
//!Getter for Lat
//!
-(float) lat;

/* Long:
   Longitude (WGS84) in degrees. (+/- 180 degrees; East = positive; West = negative). Examples:
   
   -180deg (west) =   -180.0000000
   0deg0min1sec (east) =       0.0000016 */
//!Setter for Long
//!
-(BOOL) setLong:(float) val;
//!Getter for Long
//!
-(float) long;
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



