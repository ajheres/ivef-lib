/* 
 *  ILSensor
 *
 *  ILSensor is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Mar 26 13:53:20 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>

//-----------------------------------------------------------
//! \brief       Class definition of ILSensor
//!
//! Sensors contributing to this postion report (for the purpose of analysis)
//!

@interface ILSensor : NSObject { 
    float m_senId;
    float m_trkId;
}


/* SenId:
   Identifier of local sensor contributing to position report */
//!Setter for SenId
//!
-(void) setSenId:(float) val;
//!Getter for SenId
//!
-(float) senId;

/* TrkId:
   local Identifier of track from sensor contributing to position report */
//!Setter for TrkId
//!
-(void) setTrkId:(float) val;
//!Getter for TrkId
//!
-(float) trkId;
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



