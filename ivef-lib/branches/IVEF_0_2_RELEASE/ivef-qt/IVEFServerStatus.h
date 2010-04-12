/* 
 *  ServerStatus
 *
 *  ServerStatus is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 12 22:41:49 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __SERVERSTATUS_H__
#define __SERVERSTATUS_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of ServerStatus
//!
//! DATA describing the status of the server (full/available)
//!

class ServerStatus : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    ServerStatus();
    //!copy constructor
    //!
    ServerStatus(const ServerStatus&);
    //!= operator
    //!
    ServerStatus & operator=(const ServerStatus&/*val*/);
    //!              sets the ContactIdentity: reference to the identity associated with this service
    //!
    void setContactIdentity(QString val);

    //!              gets the ContactIdentity: reference to the identity associated with this service
    //!
    //! \return     QString
    //!
    QString getContactIdentity() const;

    //!              returns true if ContactIdentityis used (optional field).
    //!
    //! \return     bool
    bool hasContactIdentity() const;

    //!              sets the Details: Details of status
    //!
    void setDetails(QString val);

    //!              gets the Details: Details of status
    //!
    //! \return     QString
    //!
    QString getDetails() const;

    //!              returns true if Detailsis used (optional field).
    //!
    //! \return     bool
    bool hasDetails() const;

    //!              sets the Status: Status of the server (ok /  not ok)
    //!
    void setStatus(bool val);

    //!              gets the Status: Status of the server (ok /  not ok)
    //!
    //! \return     bool
    //!
    bool getStatus() const;

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
    QString m_contactIdentity;
    bool m_contactIdentityPresent;
    QString m_details;
    bool m_detailsPresent;
    bool m_status;

}; 

#endif

