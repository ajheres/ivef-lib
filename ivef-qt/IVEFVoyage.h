/* 
 *  Voyage
 *
 *  Voyage is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Mon Apr 12 22:41:38 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __VOYAGE_H__
#define __VOYAGE_H__

#include <QtCore>

//-----------------------------------------------------------
//! \brief       Class definition of Voyage
//!
//! 
//!

class Voyage : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Voyage();
    //!copy constructor
    //!
    Voyage(const Voyage&);
    //!= operator
    //!
    Voyage & operator=(const Voyage&/*val*/);
    //!              sets the Id: The identification of this voyage
    //!
    void setId(QString val);

    //!              gets the Id: The identification of this voyage
    //!
    //! \return     QString
    //!
    QString getId() const;

    //!              sets the SourceName: Identification of the originator of this data
    //!
    void setSourceName(QString val);

    //!              gets the SourceName: Identification of the originator of this data
    //!
    //! \return     QString
    //!
    QString getSourceName() const;

    //!              sets the Source: Source/originator type: 1 = transponder 2 = database 3 = manual
    //!
    void setSource(int val);

    //!              gets the Source: Source/originator type: 1 = transponder 2 = database 3 = manual
    //!
    //! \return     int
    //!
    int getSource() const;

    //!              sets the CargoType: 0 = All ships of this type\n
    //!              1 = Carrying DG, HS, or MP, IMO hazard or pollutant category A\n
    //!              2 = Carrying DG, HS, or MP, IMO hazard or pollutant category B\n
    //!              3 = Carrying DG, HS, or MP, IMO hazard or pollutant category C\n
    //!              4 = Carrying DG, HS, or MP, IMO hazard or pollutant category D\n
    //!              9 = No additional information
    //!
    void setCargoType(int val);

    //!              gets the CargoType: 0 = All ships of this type\n
    //!              1 = Carrying DG, HS, or MP, IMO hazard or pollutant category A\n
    //!              2 = Carrying DG, HS, or MP, IMO hazard or pollutant category B\n
    //!              3 = Carrying DG, HS, or MP, IMO hazard or pollutant category C\n
    //!              4 = Carrying DG, HS, or MP, IMO hazard or pollutant category D\n
    //!              9 = No additional information
    //!
    //! \return     int
    //!
    int getCargoType() const;

    //!              returns true if CargoTypeis used (optional field).
    //!
    //! \return     bool
    bool hasCargoType() const;

    //!              sets the Destination: Destination of the target
    //!
    void setDestination(QString val);

    //!              gets the Destination: Destination of the target
    //!
    //! \return     QString
    //!
    QString getDestination() const;

    //!              returns true if Destinationis used (optional field).
    //!
    //! \return     bool
    bool hasDestination() const;

    //!              sets the ETA: Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Expected Time Of Arrival of the target.
    //!
    void setETA(QDateTime val);

    //!              gets the ETA: Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Expected Time Of Arrival of the target.
    //!
    //! \return     QDateTime
    //!
    QDateTime getETA() const;

    //!              returns true if ETAis used (optional field).
    //!
    //! \return     bool
    bool hasETA() const;

    //!              sets the ATA: Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Actual Time Of Arrival of the target.
    //!
    void setATA(QDateTime val);

    //!              gets the ATA: Date and time in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ss.sssZ) of the Actual Time Of Arrival of the target.
    //!
    //! \return     QDateTime
    //!
    QDateTime getATA() const;

    //!              returns true if ATAis used (optional field).
    //!
    //! \return     bool
    bool hasATA() const;

    //!              sets the PersonsOnBoard: Total number of persons on board (passengers, crew, pilots, etc)
    //!
    void setPersonsOnBoard(int val);

    //!              gets the PersonsOnBoard: Total number of persons on board (passengers, crew, pilots, etc)
    //!
    //! \return     int
    //!
    int getPersonsOnBoard() const;

    //!              returns true if PersonsOnBoardis used (optional field).
    //!
    //! \return     bool
    bool hasPersonsOnBoard() const;

    //!              sets the AirDraught: Actual air draught of the vessel in meters
    //!
    void setAirDraught(float val);

    //!              gets the AirDraught: Actual air draught of the vessel in meters
    //!
    //! \return     float
    //!
    float getAirDraught() const;

    //!              returns true if AirDraughtis used (optional field).
    //!
    //! \return     bool
    bool hasAirDraught() const;

    //!              sets the Draught: Actual draught of the vessel in meters
    //!
    void setDraught(float val);

    //!              gets the Draught: Actual draught of the vessel in meters
    //!
    //! \return     float
    //!
    float getDraught() const;

    //!              returns true if Draughtis used (optional field).
    //!
    //! \return     bool
    bool hasDraught() const;

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
    QString m_id;
    QString m_sourceName;
    int m_source;
    int m_cargoType;
    bool m_cargoTypePresent;
    QString m_destination;
    bool m_destinationPresent;
    QDateTime m_ETA;
    bool m_ETAPresent;
    QDateTime m_ATA;
    bool m_ATAPresent;
    int m_personsOnBoard;
    bool m_personsOnBoardPresent;
    float m_airDraught;
    bool m_airDraughtPresent;
    float m_draught;
    bool m_draughtPresent;

}; 

#endif

