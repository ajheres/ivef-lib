/* 
 *  Schema
 *
 *  Schema is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon May 25 16:37:00 2009.
 **********************************************************************************
 *  Copyright 2008
 *
 */

#ifndef __SCHEMA_H__
#define __SCHEMA_H__

#include <QtCore>

class Schema : public QObject { 
    Q_OBJECT

public:
    Schema();
    Schema(const Schema&);
    Schema & operator=(const Schema&/*val*/);
    QString getElementFormDefault() const;
    QString getTargetNamespace() const;
    QString toXML();
    QString toString(QString lead);
    QString encode(QString str);

private:

}; 

#endif

