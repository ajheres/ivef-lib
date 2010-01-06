/* 
 *  UnType
 *
 *  UnType is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Wed Jan 6 14:24:27 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __UNTYPE_H__
#define __UNTYPE_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of UnType
//!
//! Object type according to CODES FOR TYPES OF MEANS OF TRANSPORT Revision 2 (UNECE CEFACT Trade Facilitation Recommendation No. 28 edition 2007) Check latest version
//!

class UnType : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    UnType();
    //!copy constructor
    //!
    UnType(const UnType&);
    //!= operator
    //!
    UnType & operator=(const UnType&/*val*/);
    //!              sets the CodeA
    //!
    void setCodeA(int val);

    //!              gets the CodeA
    //!
    //! \return     int
    //!
    int getCodeA() const;

    //!              sets the CodeB
    //!
    void setCodeB(int val);

    //!              gets the CodeB
    //!
    //! \return     int
    //!
    int getCodeB() const;

    //!              sets the Mode
    //!
    void setMode(int val);

    //!              gets the Mode
    //!
    //! \return     int
    //!
    int getMode() const;

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
    int m_codeA;
    int m_codeB;
    int m_mode;

}; 

#endif

