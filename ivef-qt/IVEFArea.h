/* 
 *  Area
 *
 *  Area is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Jan 5 23:01:07 2010.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#ifndef __AREA_H__
#define __AREA_H__

#include <QtCore>
#include "IVEFPos.h"

//-----------------------------------------------------------
//! \brief       Class definition of Area
//!
//! Geographical location based on one or more polygons
//!

class Area : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Area();
    //!copy constructor
    //!
    Area(const Area&);
    //!= operator
    //!
    Area & operator=(const Area&/*val*/);
    //!              adds a Pos.
    //!
    void addPos(Pos val);

    //!              gets the i-th Pos.
    //!
    Pos getPosAt(int i) const;

    //!              return the number of Pos objects.
    //!
    //! \return     int
    int countOfPoss() const;

    //!              sets the Name: Name of the area
    //!
    void setName(QString val);

    //!              gets the Name: Name of the area
    //!
    //! \return     QString
    //!
    QString getName() const;

    //!              returns true if Nameis used (optional field).
    //!
    //! \return     bool
    bool hasName();

    //!              generates XML of this object including attributes and child elements
    //!
    //! \return     QString
    QString toXML();

    //!              generates output of this object including attributes and child elements
    //!
    //! \return     QString
    QString toString(QString lead);

    //!              encodes a string returning the encoded string
    //!
    //! \return     QString
    QString encode(QString str);


private:
    QVector<Pos> m_poss;
    QString m_name;
    bool m_namePresent;

}; 

#endif

