/* 
 *  ILPong
 *
 *  ILPong is free software: you can redistribute it and/or modify
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

@interface ILPong : NSObject { 
    NSString *m_responseOn;
    int m_sourceId;
    NSDate *m_timeStamp;
}


/* ResponseOn:
   Corresponds to the original MsgRefId from the Ping.xml message. Must be an Universally Unique Identifier (TU-T Rec. X.667 | ISO/IEC 9834-8.) */
-(void) setResponseOn:(NSString *) val;
-(NSString *) responseOn;

/* SourceId:
   The identification of the node who created this message */
-(void) setSourceId:(int) val;
-(int) sourceId;

/* TimeStamp:
   Date and time in (subset of ISO 8601) UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the time this message is sent. */
-(void) setTimeStamp:(NSDate *) val;
-(NSDate *) timeStamp;

-(void) setAttributes:(NSDictionary *)attributeDict;
-(NSDictionary *) attributes;
-(NSString *) XML;
-(NSString *) stringValue;
-(NSString *) stringValueWithLead:(NSString *) lead;
-(NSString *) encode: (NSString *) input;

@end



