/* 
 *  ILTransmission
 *
 *  ILTransmission is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Sep 1 22:43:50 2009.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#import <Foundation/Foundation.h>

@interface ILTransmission : NSObject { 
    int m_type;
    float m_period;
    bool m_periodPresent;
}


/* Type:
   Type of transmission, possible values are:
   1 = single occurrence
   2 = periodic
   3 = synchronic
   4 = on change */
-(void) setType:(int) val;
-(int) type;

/* Period:
   Specifies he time between two periodic updates in seconds */
-(void) setPeriod:(float) val;
-(float) period;
-(bool) hasPeriod;

-(void) setAttributes:(NSDictionary *)attributeDict;
-(NSDictionary *) attributes;
-(NSString *) XML;
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
-(NSString *) encode: (NSString *) input;

@end



