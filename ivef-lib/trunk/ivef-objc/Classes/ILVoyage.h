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
 *  Generated by xsd2code on Thu Aug 20 19:56:51 2009.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#import <Foundation/Foundation.h>

@interface ILVoyage : NSObject { 
    NSString *m_id;
    NSString *m_sourceName;
    int m_source;
    int m_cargoType;
    bool m_cargoTypePresent;
    NSString *m_destination;
    bool m_destinationPresent;
    NSDate *m_ETA;
    bool m_ETAPresent;
    NSDate *m_ATA;
    bool m_ATAPresent;
    float m_personsOnBoard;
    bool m_personsOnBoardPresent;
    float m_airDraught;
    bool m_airDraughtPresent;
    float m_draught;
    bool m_draughtPresent;
}


/* Id:
   The identification of this voyage */
-(void) setIdent:(NSString *) val;
-(NSString *) ident;

/* SourceName:
   Identification of the originator of this data */
-(void) setSourceName:(NSString *) val;
-(NSString *) sourceName;

/* Source:
   Source/originator type: 1 = transponder 2 = database 3 = manual */
-(void) setSource:(int) val;
-(int) source;

/* CargoType:
   0 = All ships of this type
   1 = Carrying DG, HS, or MP, IMO hazard or pollutant category A
   2 = Carrying DG, HS, or MP, IMO hazard or pollutant category B
   3 = Carrying DG, HS, or MP, IMO hazard or pollutant category C
   4 = Carrying DG, HS, or MP, IMO hazard or pollutant category D
   9 = No additional information */
-(void) setCargoType:(int) val;
-(int) cargoType;
-(bool) hasCargoType;

/* Destination:
   Destination of the target */
-(void) setDestination:(NSString *) val;
-(NSString *) destination;
-(bool) hasDestination;

/* ETA:
   Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Expected Time Of Arrival of the target. */
-(void) setETA:(NSDate *) val;
-(NSDate *) eTA;
-(bool) hasETA;

/* ATA:
   Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Actual Time Of Arrival of the target. */
-(void) setATA:(NSDate *) val;
-(NSDate *) aTA;
-(bool) hasATA;

/* PersonsOnBoard:
   Total number of persons on board (passengers, crew, pilots, etc) */
-(void) setPersonsOnBoard:(float) val;
-(float) personsOnBoard;
-(bool) hasPersonsOnBoard;

/* AirDraught:
   Actual air draught of the vessel in meters */
-(void) setAirDraught:(float) val;
-(float) airDraught;
-(bool) hasAirDraught;

/* Draught:
   Actual draught of the vessel in meters */
-(void) setDraught:(float) val;
-(float) draught;
-(bool) hasDraught;

-(void) setAttributes:(NSDictionary *)attributeDict;
-(NSDictionary *) attributes;
-(NSString *) XML;
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
-(NSString *) encode;

@end



