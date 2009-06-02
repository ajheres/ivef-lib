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
 *  Generated by xsd2code on Tue Feb 3 14:32:12 2009.
 **********************************************************************************
 *  Copyright 2008
 *
 */

#ifndef __PING_H__
#define __PING_H__

#include <QtCore>

class Ping : public QObject { 
    Q_OBJECT

public:
    Ping();
    Ping(const Ping&);
    Ping & operator=(const Ping&/*val*/);

    /* TimeStamp:
       Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sss) of the time this message is sent. */
    void setTimeStamp(QDateTime val);
    QDateTime getTimeStamp() const;
    QString toXML();
    QString toString(QString lead);

private:
    QDateTime m_timeStamp;

}; 

#endif

