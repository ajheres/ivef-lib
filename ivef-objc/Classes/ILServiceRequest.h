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
 *  Generated by xsd2code on Mon Apr 12 22:52:32 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#import <Foundation/Foundation.h>
#import "ILArea.h"
#import "ILTransmission.h"
#import "ILItem.h"
#import "ILObject.h"

//-----------------------------------------------------------
//! \brief       Class definition of ILServiceRequest
//!
//! 
//!

@interface ILServiceRequest : NSObject { 
    NSMutableArray *m_areas;
    ILTransmission *m_transmission;
    NSMutableArray *m_items;
    NSMutableArray *m_objects;
}

//!Setter for Area
//!
-(void) addArea:(ILArea *) val;
//!Getter for Area
//!
-(ILArea *) areaAt:(int) i;
//!Element counter for Area
//!
-(int) countOfAreas;
//!Get all elements for Area
//!
-(NSArray *) areas;
//!Setter for Transmission
//!
-(void) setTransmission:(ILTransmission *) val;
//!Getter for Transmission
//!
-(ILTransmission *) transmission;
//!Setter for Item
//!
-(void) addItem:(ILItem *) val;
//!Getter for Item
//!
-(ILItem *) itemAt:(int) i;
//!Element counter for Item
//!
-(int) countOfItems;
//!Get all elements for Item
//!
-(NSArray *) items;
//!Setter for Object
//!
-(void) addObject:(ILObject *) val;
//!Getter for Object
//!
-(ILObject *) objectAt:(int) i;
//!Element counter for Object
//!
-(int) countOfObjects;
//!Get all elements for Object
//!
-(NSArray *) objects;
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



