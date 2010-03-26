/* 
 *  ILVesselData
 *
 *  ILVesselData is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Mar 26 13:53:32 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>
#import "ILConstruction.h"
#import "ILIdentifier.h"

//-----------------------------------------------------------
//! \brief       Class definition of ILVesselData
//!
//! DATA regarding static elements of an object
//!

@interface ILVesselData : NSObject { 
    ILConstruction *m_construction;
    ILIdentifier *m_identifier;
    int m_class;
    bool m_classPresent;
    bool m_blackListed;
    bool m_blackListedPresent;
    int m_id;
    NSString *m_specialAttention;
    bool m_specialAttentionPresent;
    NSString *m_sourceId;
    bool m_sourceIdPresent;
    NSString *m_sourceName;
    int m_sourceType;
    NSDate *m_updateTime;
}


/* Construction:
   attributes of the object regarding the physical construction */
//!Setter for Construction
//!
-(void) setConstruction:(ILConstruction *) val;
//!Getter for Construction
//!
-(ILConstruction *) construction;

/* Identifier:
   (local) Identification of vessel */
//!Setter for Identifier
//!
-(void) setIdentifier:(ILIdentifier *) val;
//!Getter for Identifier
//!
-(ILIdentifier *) identifier;

/* Class:
   0 = Unknown
   1 = Vessel
   2 = Aids to Navigate */
//!Setter for Class
//!
-(void) setClass:(int) val;
//!Getter for Class
//!
-(int) class;
//!Test for pressence of Class
//!
-(bool) hasClass;

/* BlackListed:
   Vessel is blacklisted by a NCA */
//!Setter for BlackListed
//!
-(void) setBlackListed:(bool) val;
//!Getter for BlackListed
//!
-(bool) blackListed;
//!Test for pressence of BlackListed
//!
-(bool) hasBlackListed;

/* Id:
   The unique identification of this vesseldata. Valid from first message with TrackStatus!=Terminated to first message with TrackStatus=Terminated */
//!Setter for Id
//!
-(void) setIdent:(int) val;
//!Getter for Id
//!
-(int) ident;

/* SpecialAttention:
   Vessel is under special attention of the NCA or fairway authorities */
//!Setter for SpecialAttention
//!
-(void) setSpecialAttention:(NSString *) val;
//!Getter for SpecialAttention
//!
-(NSString *) specialAttention;
//!Test for pressence of SpecialAttention
//!
-(bool) hasSpecialAttention;

/* SourceId:
   Unique identification of the producer  (UN/LOCODE)  in case multiple producers exist on the same LOCODE, the local competent authority can optionally addended this with a local  code (e.g. BE ANR 01 = Antwerp, 01) */
//!Setter for SourceId
//!
-(void) setSourceId:(NSString *) val;
//!Getter for SourceId
//!
-(NSString *) sourceId;
//!Test for pressence of SourceId
//!
-(bool) hasSourceId;

/* SourceName:
   Identification of the originator of the data */
//!Setter for SourceName
//!
-(void) setSourceName:(NSString *) val;
//!Getter for SourceName
//!
-(NSString *) sourceName;

/* SourceType:
   Source/originator type: 1 = AIS transponder 2 = VTS Plan Server 3 = Operator 4 = External source */
//!Setter for SourceType
//!
-(void) setSourceType:(int) val;
//!Getter for SourceType
//!
-(int) sourceType;

/* UpdateTime:
   Date and time in UTC format (YYYY-MM-DDThh:mm:ss.sssZ)  (subset of ISO 8601) this data was compiled */
//!Setter for UpdateTime
//!
-(void) setUpdateTime:(NSDate *) val;
//!Getter for UpdateTime
//!
-(NSDate *) updateTime;
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



