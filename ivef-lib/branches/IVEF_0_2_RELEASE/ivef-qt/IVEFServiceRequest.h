/* 
 *  ServiceRequest
 *
 *  ServiceRequest is free software: you can redistribute it and/or modify
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

#ifndef __SERVICEREQUEST_H__
#define __SERVICEREQUEST_H__

#include <QtCore>
#include "IVEFArea.h"
#include "IVEFTransmission.h"
#include "IVEFItem.h"
#include "IVEFFilter.h"

//-----------------------------------------------------------
//! \brief       Class definition of ServiceRequest
//!
//! DATA describing the service a user requests
//!

class ServiceRequest : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    ServiceRequest();
    //!copy constructor
    //!
    ServiceRequest(const ServiceRequest&);
    //!= operator
    //!
    ServiceRequest & operator=(const ServiceRequest&/*val*/);
    //!              adds a Area.
    //!
    void addArea(Area val);

    //!              gets the i-th Area.
    //!
    Area getAreaAt(int i) const;

    //!              return the number of Area objects.
    //!
    //! \return     int
    int countOfAreas() const;

    //!              sets the Transmission
    //!
    void setTransmission(Transmission val);

    //!              gets the Transmission
    //!
    //! \return     Transmission
    //!
    Transmission getTransmission() const;

    //!              adds a Item.
    //!
    void addItem(Item val);

    //!              gets the i-th Item.
    //!
    Item getItemAt(int i) const;

    //!              return the number of Item objects.
    //!
    //! \return     int
    int countOfItems() const;

    //!              sets the Filter
    //!
    void setFilter(Filter val);

    //!              gets the Filter
    //!
    //! \return     Filter
    //!
    Filter getFilter() const;

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
    QVector<Area> m_areas;
    Transmission m_transmission;
    QVector<Item> m_items;
    Filter m_filter;

}; 

#endif

