/* 
 *  Sensor
 *
 *  Sensor is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Apr 15 15:29:47 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __SENSOR_H__
#define __SENSOR_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of Sensor
//!
//! Sensors contributing to this postion report (for the purpose of analysis)
//!

class Sensor : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Sensor();
    //!copy constructor
    //!
    Sensor(const Sensor&);
    //!= operator
    //!
    Sensor & operator=(const Sensor&/*val*/);
    //!              sets the SenId: Identifier of local sensor contributing to position report
    //!
    void setSenId(int val);

    //!              gets the SenId: Identifier of local sensor contributing to position report
    //!
    //! \return     int
    //!
    int getSenId() const;

    //!              sets the TrkId: local Identifier of track from sensor contributing to position report
    //!
    void setTrkId(int val);

    //!              gets the TrkId: local Identifier of track from sensor contributing to position report
    //!
    //! \return     int
    //!
    int getTrkId() const;

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
    int m_senId;
    int m_trkId;

}; 

#endif

