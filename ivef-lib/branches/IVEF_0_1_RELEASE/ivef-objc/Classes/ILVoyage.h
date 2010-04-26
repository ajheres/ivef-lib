/* 
 *  ILVoyage
 *
 *  ILVoyage is free software: you can redistribute it and/or modify
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

//-----------------------------------------------------------
//! \brief       Class definition of ILVoyage
//!
//! 
//!

@interface ILVoyage : NSObject { 
    NSString *m_id;
    BOOL m_idPresent;
    NSString *m_sourceName;
    BOOL m_sourceNamePresent;
    int m_source;
    BOOL m_sourcePresent;
    int m_cargoType;
    BOOL m_cargoTypePresent;
    NSString *m_destination;
    BOOL m_destinationPresent;
    NSDate *m_ETA;
    BOOL m_ETAPresent;
    NSDate *m_ATA;
    BOOL m_ATAPresent;
    int m_personsOnBoard;
    BOOL m_personsOnBoardPresent;
    float m_airDraught;
    BOOL m_airDraughtPresent;
    float m_draught;
    BOOL m_draughtPresent;
}


/* Id:
   The identification of this voyage */
//!Setter for Id
//!
-(BOOL) setIdent:(NSString *) val;
//!Getter for Id
//!
-(NSString *) ident;

/* SourceName:
   Identification of the originator of this data */
//!Setter for SourceName
//!
-(BOOL) setSourceName:(NSString *) val;
//!Getter for SourceName
//!
-(NSString *) sourceName;

/* Source:
   Source/originator type: 1 = transponder 2 = database 3 = manual */
//!Setter for Source
//!
-(BOOL) setSource:(int) val;
//!Getter for Source
//!
-(int) source;

/* CargoType:
   0 = All ships of this type
   1 = Carrying DG, HS, or MP, IMO hazard or pollutant category A
   2 = Carrying DG, HS, or MP, IMO hazard or pollutant category B
   3 = Carrying DG, HS, or MP, IMO hazard or pollutant category C
   4 = Carrying DG, HS, or MP, IMO hazard or pollutant category D
   9 = No additional information */
//!Setter for CargoType
//!
-(BOOL) setCargoType:(int) val;
//!Getter for CargoType
//!
-(int) cargoType;
//!Test for pressence of CargoType
//!
-(BOOL) hasCargoType;

/* Destination:
   Destination of the target */
//!Setter for Destination
//!
-(BOOL) setDestination:(NSString *) val;
//!Getter for Destination
//!
-(NSString *) destination;
//!Test for pressence of Destination
//!
-(BOOL) hasDestination;

/* ETA:
   Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Expected Time Of Arrival of the target. */
//!Setter for ETA
//!
-(BOOL) setETA:(NSDate *) val;
//!Getter for ETA
//!
-(NSDate *) ETA;
//!Test for pressence of ETA
//!
-(BOOL) hasETA;

/* ATA:
   Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Actual Time Of Arrival of the target. */
//!Setter for ATA
//!
-(BOOL) setATA:(NSDate *) val;
//!Getter for ATA
//!
-(NSDate *) ATA;
//!Test for pressence of ATA
//!
-(BOOL) hasATA;

/* PersonsOnBoard:
   Total number of persons on board (passengers, crew, pilots, etc) */
//!Setter for PersonsOnBoard
//!
-(BOOL) setPersonsOnBoard:(int) val;
//!Getter for PersonsOnBoard
//!
-(int) personsOnBoard;
//!Test for pressence of PersonsOnBoard
//!
-(BOOL) hasPersonsOnBoard;

/* AirDraught:
   Actual air draught of the vessel in meters */
//!Setter for AirDraught
//!
-(BOOL) setAirDraught:(float) val;
//!Getter for AirDraught
//!
-(float) airDraught;
//!Test for pressence of AirDraught
//!
-(BOOL) hasAirDraught;

/* Draught:
   Actual draught of the vessel in meters */
//!Setter for Draught
//!
-(BOOL) setDraught:(float) val;
//!Getter for Draught
//!
-(float) draught;
//!Test for pressence of Draught
//!
-(BOOL) hasDraught;
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



