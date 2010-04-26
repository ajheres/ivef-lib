/* 
 *  Ping
 *
 *  Ping is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 26 22:11:26 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __PING_H__
#define __PING_H__

#include <QtCore>
#include <cstdlib>
#include <iostream>

//-----------------------------------------------------------
//! \brief       Class definition of Ping
//!
//! 
//!

class Ping : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Ping();
    //!copy constructor
    //!
    Ping(const Ping&);
    //!= operator
    //!
    Ping & operator=(const Ping&/*val*/);
    //!              sets the TimeStamp: Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the time this message is sent.
    //!
    bool setTimeStamp(QDateTime val);

    //!              gets the TimeStamp: Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the time this message is sent.
    //!
    //! \return     QDateTime
    //!
    QDateTime getTimeStamp() const;

    //!              generates XML of this object including attributes and child elements
    //!              returns NULL if not all required elements are available
    //!
    //! \return     QString
    QString toXML() const;

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
    QString encode(QString str) const;


private:
    QDateTime m_timeStamp;
    bool m_timeStampPresent;

}; 

#endif

