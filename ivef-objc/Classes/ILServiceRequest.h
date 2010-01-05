/* 
 *  ILServiceRequest
 *
 *  ILServiceRequest is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Jan 5 23:01:06 2010.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#import <Foundation/Foundation.h>
#import "ILArea.h"
#import "ILTransmission.h"
#import "ILItem.h"
#import "ILFilter.h"

@interface ILServiceRequest : NSObject { 
    NSMutableArray *m_areas;
    ILTransmission *m_transmission;
    NSMutableArray *m_items;
    ILFilter *m_filter;
}

-(void) addArea:(ILArea *) val;
-(ILArea *) areaAt:(int) i;
-(int) countOfAreas;
-(NSArray *) areas;
-(void) setTransmission:(ILTransmission *) val;
-(ILTransmission *) transmission;
-(void) addItem:(ILItem *) val;
-(ILItem *) itemAt:(int) i;
-(int) countOfItems;
-(NSArray *) items;
-(void) setFilter:(ILFilter *) val;
-(ILFilter *) filter;

-(void) setAttributes:(NSDictionary *)attributeDict;
-(NSDictionary *) attributes;
-(NSString *) XML;
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
-(NSString *) encode: (NSString *) input;

@end



