/* 
 *  Identifier
 *
 *  Identifier is free software: you can redistribute it and/or modify
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

#ifndef __IDENTIFIER_H__
#define __IDENTIFIER_H__

#include <QtCore>
#include "IVEFOtherId.h"
#include "IVEFOtherName.h"

//-----------------------------------------------------------
//! \brief       Class definition of Identifier
//!
//! (local) Identification of vessel
//!

class Identifier : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Identifier();
    //!copy constructor
    //!
    Identifier(const Identifier&);
    //!= operator
    //!
    Identifier & operator=(const Identifier&/*val*/);
    //!              adds a OtherId.
    //!
    void addOtherId(OtherId val);

    //!              gets the i-th OtherId.
    //!
    OtherId getOtherIdAt(int i) const;

    //!              return the number of OtherId objects.
    //!
    //! \return     int
    int countOfOtherIds() const;

    //!              adds a OtherName.
    //!
    void addOtherName(OtherName val);

    //!              gets the i-th OtherName.
    //!
    OtherName getOtherNameAt(int i) const;

    //!              return the number of OtherName objects.
    //!
    //! \return     int
    int countOfOtherNames() const;

    //!              sets the Callsign: Callsign of the target, in accordance with Article 19, Section III of the ITU Radio Regulations (RR)
    //!
    void setCallsign(QString val);

    //!              gets the Callsign: Callsign of the target, in accordance with Article 19, Section III of the ITU Radio Regulations (RR)
    //!
    //! \return     QString
    //!
    QString getCallsign() const;

    //!              returns true if Callsignis used (optional field).
    //!
    //! \return     bool
    bool hasCallsign();

    //!              sets the IMO: IMO number of the target
    //!
    void setIMO(int val);

    //!              gets the IMO: IMO number of the target
    //!
    //! \return     int
    //!
    int getIMO() const;

    //!              returns true if IMOis used (optional field).
    //!
    //! \return     bool
    bool hasIMO();

    //!              sets the Name: Name of the target
    //!
    void setName(QString val);

    //!              gets the Name: Name of the target
    //!
    //! \return     QString
    //!
    QString getName() const;

    //!              returns true if Nameis used (optional field).
    //!
    //! \return     bool
    bool hasName();

    //!              sets the MMSI: MMSI number of the target
    //!
    void setMMSI(int val);

    //!              gets the MMSI: MMSI number of the target
    //!
    //! \return     int
    //!
    int getMMSI() const;

    //!              returns true if MMSIis used (optional field).
    //!
    //! \return     bool
    bool hasMMSI();

    //!              sets the LRIT: LRIT identification
    //!
    void setLRIT(QString val);

    //!              gets the LRIT: LRIT identification
    //!
    //! \return     QString
    //!
    QString getLRIT() const;

    //!              returns true if LRITis used (optional field).
    //!
    //! \return     bool
    bool hasLRIT();

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
    QVector<OtherId> m_otherIds;
    QVector<OtherName> m_otherNames;
    QString m_callsign;
    bool m_callsignPresent;
    int m_IMO;
    bool m_IMOPresent;
    QString m_name;
    bool m_namePresent;
    int m_MMSI;
    bool m_MMSIPresent;
    QString m_LRIT;
    bool m_LRITPresent;

}; 

#endif

