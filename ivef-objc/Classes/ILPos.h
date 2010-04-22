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
 *  Generated by xsd2code on Thu Apr 22 11:27:24 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>

//-----------------------------------------------------------
//! \brief       Class definition of ILPos
//!
//! DATA position measurement of the geometrical centre of the object or location
//!

@interface ILPos : NSObject { 
    float m_altitude;
    bool m_altitudePresent;
    float m_estAccAlt;
    bool m_estAccAltPresent;
    float m_estAccLat;
    bool m_estAccLatPresent;
    float m_estAccLong;
    bool m_estAccLongPresent;
    float m_lat;
    float m_long;
}


/* Altitude:
   The altitude of the target above the WGS-84 ellipsoid in meters */
//!Setter for Altitude
//!
-(void) setAltitude:(float) val;
//!Getter for Altitude
//!
-(float) altitude;
//!Test for pressence of Altitude
//!
-(bool) hasAltitude;

/* EstAccAlt:
   Estimated accuracy
   standard deviation of the calculated position of a target
   expressed in m */
//!Setter for EstAccAlt
//!
-(void) setEstAccAlt:(float) val;
//!Getter for EstAccAlt
//!
-(float) estAccAlt;
//!Test for pressence of EstAccAlt
//!
-(bool) hasEstAccAlt;

/* EstAccLat:
   Estimated accuracy
   standard deviation of the calculated position of a target
   expressed in m */
//!Setter for EstAccLat
//!
-(void) setEstAccLat:(float) val;
//!Getter for EstAccLat
//!
-(float) estAccLat;
//!Test for pressence of EstAccLat
//!
-(bool) hasEstAccLat;

/* EstAccLong:
   Estimated accuracy
   standard deviation of the calculated position of a target
   expressed in m */
//!Setter for EstAccLong
//!
-(void) setEstAccLong:(float) val;
//!Getter for EstAccLong
//!
-(float) estAccLong;
//!Test for pressence of EstAccLong
//!
-(bool) hasEstAccLong;

/* Lat:
   Latitude (WGS84) in degrees. (+/- 90 degrees;
   North = positive; South = negative) Examples:
   
   -90deg (south) =   -90.0000000
   0deg0min1sec (north) =    0.0000016
   50deg50min (north)  = 50.8333333 */
//!Setter for Lat
//!
-(void) setLat:(float) val;
//!Getter for Lat
//!
-(float) lat;

/* Long:
   Longitude (WGS84) in degrees. (+/- 180 degrees; East = positive; West = negative). Examples:
   
   -180deg (west) =   -180.0000000
   0deg0min1sec (east) =       0.0000016 */
//!Setter for Long
//!
-(void) setLong:(float) val;
//!Getter for Long
//!
-(float) long;
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



