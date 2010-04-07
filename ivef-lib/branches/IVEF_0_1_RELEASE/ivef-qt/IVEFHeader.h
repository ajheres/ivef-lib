/* 
 *  Header
 *
 *  Header is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Wed Apr 7 16:24:49 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __HEADER_H__
#define __HEADER_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of Header
//!
//! 
//!

class Header : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Header();
    //!copy constructor
    //!
    Header(const Header&);
    //!= operator
    //!
    Header & operator=(const Header&/*val*/);
    //!              sets the Version
    //!
    void setVersion(QString val);

    //!              gets the Version
    //!
    //! \return     QString
    //!
    QString getVersion() const;

    //!              sets the MsgRefId: Must be an Universally Unique Identifier for each message  (TU-T Rec. X.667 | ISO/IEC 9834-8.) Reply messages refer to this id to identify the message they are replying to. In its canonical form, a UUID consists of 32 hexadecimal digits, displayed in 5 groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters, enclosed by brackets. For example:\n
    //!              {550e8400-e29b-41d4-a716-446655440000} For backwards compatibilty the string is not restricted to 38 characters
    //!
    void setMsgRefId(QString val);

    //!              gets the MsgRefId: Must be an Universally Unique Identifier for each message  (TU-T Rec. X.667 | ISO/IEC 9834-8.) Reply messages refer to this id to identify the message they are replying to. In its canonical form, a UUID consists of 32 hexadecimal digits, displayed in 5 groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters, enclosed by brackets. For example:\n
    //!              {550e8400-e29b-41d4-a716-446655440000} For backwards compatibilty the string is not restricted to 38 characters
    //!
    //! \return     QString
    //!
    QString getMsgRefId() const;

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
    QString m_version;
    QString m_msgRefId;

}; 

#endif

