/* 
 *  OtherName
 *
 *  OtherName is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Mar 26 13:53:33 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __OTHERNAME_H__
#define __OTHERNAME_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of OtherName
//!
//! Other names for the track than the English name
//!

class OtherName : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    OtherName();
    //!copy constructor
    //!
    OtherName(const OtherName&);
    //!= operator
    //!
    OtherName & operator=(const OtherName&/*val*/);
    //!              sets the Lang: Languange  (ISO 3166-1-alpha2)
    //!
    void setLang(QString val);

    //!              gets the Lang: Languange  (ISO 3166-1-alpha2)
    //!
    //! \return     QString
    //!
    QString getLang() const;

    //!              sets the Name: Name in the foreign language
    //!
    void setName(QString val);

    //!              gets the Name: Name in the foreign language
    //!
    //! \return     QString
    //!
    QString getName() const;

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
    QString m_lang;
    QString m_name;

}; 

#endif

