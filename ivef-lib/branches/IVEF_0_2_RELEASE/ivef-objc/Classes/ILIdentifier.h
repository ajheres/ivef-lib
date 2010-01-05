/* 
 *  ILIdentifier
 *
 *  ILIdentifier is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Jan 5 16:22:58 2010.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#import <Foundation/Foundation.h>
#import "ILOtherId.h"
#import "ILOtherName.h"

@interface ILIdentifier : NSObject { 
    NSMutableArray *m_otherIds;
    NSMutableArray *m_otherNames;
    NSString *m_callsign;
    bool m_callsignPresent;
    int m_IMO;
    bool m_IMOPresent;
    NSString *m_name;
    bool m_namePresent;
    int m_MMSI;
    bool m_MMSIPresent;
    NSString *m_LRIT;
    bool m_LRITPresent;
}

-(void) addOtherId:(ILOtherId *) val;
-(ILOtherId *) otherIdAt:(int) i;
-(int) countOfOtherIds;
-(NSArray *) otherIds;
-(void) addOtherName:(ILOtherName *) val;
-(ILOtherName *) otherNameAt:(int) i;
-(int) countOfOtherNames;
-(NSArray *) otherNames;

/* Callsign:
   Callsign of the target, in accordance with Article 19, Section III of the ITU Radio Regulations (RR) */
-(void) setCallsign:(NSString *) val;
-(NSString *) callsign;
-(bool) hasCallsign;

/* IMO:
   IMO number of the target */
-(void) setIMO:(int) val;
-(int) IMO;
-(bool) hasIMO;

/* Name:
   Name of the target */
-(void) setName:(NSString *) val;
-(NSString *) name;
-(bool) hasName;

/* MMSI:
   MMSI number of the target */
-(void) setMMSI:(int) val;
-(int) MMSI;
-(bool) hasMMSI;

/* LRIT:
   LRIT identification */
-(void) setLRIT:(NSString *) val;
-(NSString *) LRIT;
-(bool) hasLRIT;

-(void) setAttributes:(NSDictionary *)attributeDict;
-(NSDictionary *) attributes;
-(NSString *) XML;
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
-(NSString *) encode: (NSString *) input;

@end



