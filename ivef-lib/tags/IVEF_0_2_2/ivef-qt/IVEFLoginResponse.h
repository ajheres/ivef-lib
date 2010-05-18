/* 
 *  LoginResponse
 *
 *  LoginResponse is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue May 18 15:08:32 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __LOGINRESPONSE_H__
#define __LOGINRESPONSE_H__

#include <QtCore>
#include <cstdlib>
#include <iostream>

//-----------------------------------------------------------
//! \brief       Class definition of LoginResponse
//!
//! DATA login response with acceptance or deny with optional reason
//!

class LoginResponse : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    LoginResponse();
    //!copy constructor
    //!
    LoginResponse(const LoginResponse&);
    //!= operator
    //!
    LoginResponse & operator=(const LoginResponse&/*val*/);
    //!              sets the Reason: String describing reason for declining, only used when result is "Declined"
    //!
    bool setReason(QString val);

    //!              gets the Reason: String describing reason for declining, only used when result is "Declined"
    //!
    //! \return     QString
    //!
    QString getReason() const;

    //!              returns true if Reasonis used (optional field).
    //!
    //! \return     bool
    bool hasReason() const;

    //!              sets the ResponseOn: Corresponds to the original MsgRefId from the Login.xml message. Must be an Universally Unique Identifier (TU-T Rec. X.667 | ISO/IEC 9834-8.)
    //!
    bool setResponseOn(QString val);

    //!              gets the ResponseOn: Corresponds to the original MsgRefId from the Login.xml message. Must be an Universally Unique Identifier (TU-T Rec. X.667 | ISO/IEC 9834-8.)
    //!
    //! \return     QString
    //!
    QString getResponseOn() const;

    //!              sets the Result: 1 = Accepted 2 = Declined
    //!
    bool setResult(int val);

    //!              gets the Result: 1 = Accepted 2 = Declined
    //!
    //! \return     int
    //!
    int getResult() const;

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
    QString m_reason;
    bool m_reasonPresent;
    QString m_responseOn;
    bool m_responseOnPresent;
    int m_result;
    bool m_resultPresent;

}; 

#endif

