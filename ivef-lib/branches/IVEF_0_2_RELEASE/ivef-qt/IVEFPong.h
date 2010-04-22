/* 
 *  Pong
 *
 *  Pong is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Apr 22 11:27:24 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __PONG_H__
#define __PONG_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of Pong
//!
//! DATA alive response
//!

class Pong : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Pong();
    //!copy constructor
    //!
    Pong(const Pong&);
    //!= operator
    //!
    Pong & operator=(const Pong&/*val*/);
    //!              sets the ResponseOn: Corresponds to the original MsgRefId from the Ping.xml message. Must be an Universally Unique Identifier (TU-T Rec. X.667 | ISO/IEC 9834-8.)
    //!
    void setResponseOn(QString val);

    //!              gets the ResponseOn: Corresponds to the original MsgRefId from the Ping.xml message. Must be an Universally Unique Identifier (TU-T Rec. X.667 | ISO/IEC 9834-8.)
    //!
    //! \return     QString
    //!
    QString getResponseOn() const;

    //!              sets the SourceId: The identification of the node who created this message
    //!
    void setSourceId(int val);

    //!              gets the SourceId: The identification of the node who created this message
    //!
    //! \return     int
    //!
    int getSourceId() const;

    //!              sets the TimeStamp: Date and time in (subset of ISO 8601) UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the time this message is sent.
    //!
    void setTimeStamp(QDateTime val);

    //!              gets the TimeStamp: Date and time in (subset of ISO 8601) UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the time this message is sent.
    //!
    //! \return     QDateTime
    //!
    QDateTime getTimeStamp() const;

    //!              generates XML of this object including attributes and child elements
    //!
    //! \return     QString
    QString toXML();

    //!              generates output of this object including attributes and child elements
    //!
    //! \return     QString
    QString toString();

    //!              generates output of this object including attributes and child elements
    //!
    //! \return     QString
    QString toString(QString lead);

    //!              encodes a string returning the encoded string
    //!
    //! \return     QString
    QString encode(QString str);


private:
    QString m_responseOn;
    int m_sourceId;
    QDateTime m_timeStamp;

}; 

#endif

