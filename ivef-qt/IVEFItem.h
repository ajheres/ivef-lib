/* 
 *  Item
 *
 *  Item is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 26 17:16:41 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __ITEM_H__
#define __ITEM_H__

#include <QtCore>
#include <cstdlib>
#include <iostream>

//-----------------------------------------------------------
//! \brief       Class definition of Item
//!
//! 
//!

class Item : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Item();
    //!copy constructor
    //!
    Item(const Item&);
    //!= operator
    //!
    Item & operator=(const Item&/*val*/);
    //!              sets the Element: Describes requested Vessel data element, possible values:\n
    //!              1 = position\n
    //!              2 = static data\n
    //!              3 = voyage
    //!
    bool setElement(int val);

    //!              gets the Element: Describes requested Vessel data element, possible values:\n
    //!              1 = position\n
    //!              2 = static data\n
    //!              3 = voyage
    //!
    //! \return     int
    //!
    int getElement() const;

    //!              sets the Field: Selected field. Can be 'all' or one of the items of vessel data PositionReport, Static Data  or Voyage
    //!
    bool setField(QString val);

    //!              gets the Field: Selected field. Can be 'all' or one of the items of vessel data PositionReport, Static Data  or Voyage
    //!
    //! \return     QString
    //!
    QString getField() const;

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
    int m_element;
    bool m_elementPresent;
    QString m_field;
    bool m_fieldPresent;

}; 

#endif

