/* 
 *  Logout
 *
 *  Logout is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Fri Mar 26 13:53:21 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __LOGOUT_H__
#define __LOGOUT_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of Logout
//!
//! DATA logout message, the server will drop the connection if logout is successfull
//!

class Logout : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Logout();
    //!copy constructor
    //!
    Logout(const Logout&);
    //!= operator
    //!
    Logout & operator=(const Logout&/*val*/);
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

}; 

#endif

