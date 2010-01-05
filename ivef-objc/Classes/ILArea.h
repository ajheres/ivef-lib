/* 
 *  ILArea
 *
 *  ILArea is free software: you can redistribute it and/or modify
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
#import "ILPos.h"

@interface ILArea : NSObject { 
    NSMutableArray *m_poss;
    NSString *m_name;
    bool m_namePresent;
}

-(void) addPos:(ILPos *) val;
-(ILPos *) posAt:(int) i;
-(int) countOfPoss;
-(NSArray *) poss;

/* Name:
   Name of the area */
-(void) setName:(NSString *) val;
-(NSString *) name;
-(bool) hasName;

-(void) setAttributes:(NSDictionary *)attributeDict;
-(NSDictionary *) attributes;
-(NSString *) XML;
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
-(NSString *) encode: (NSString *) input;

@end



