/* 
 *  StaticData
 *
 *  StaticData is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Feb 3 14:32:12 2009.
 **********************************************************************************
 *  Copyright 2008
 *
 */

#ifndef __STATICDATA_H__
#define __STATICDATA_H__

#include <QtCore>

class StaticData : public QObject { 
    Q_OBJECT

public:
    StaticData();
    StaticData(const StaticData&);
    StaticData & operator=(const StaticData&/*val*/);

    /* Id:
       The identification of this static data */
    void setId(QString val);
    QString getId() const;

    /* SourceName:
       Identification of the originator of the data */
    void setSourceName(QString val);
    QString getSourceName() const;

    /* Source:
       Source/originator type: 1 = transponder 2 = database 3 = manual */
    void setSource(int val);
    int getSource() const;

    /* Length:
       Length of the target in meter */
    void setLength(float val);
    float getLength() const;
    bool hasLength();

    /* Breadth:
       Breadth of the target in meter */
    void setBreadth(float val);
    float getBreadth() const;
    bool hasBreadth();

    /* Callsign:
       Callsign of the target */
    void setCallsign(QString val);
    QString getCallsign() const;
    bool hasCallsign();

    /* ShipName:
       Name of the target */
    void setShipName(QString val);
    QString getShipName() const;
    bool hasShipName();

    /* ObjectType:
       1 = Aircraft
       2 = Vessel
       3 = Vehicle (not an aircraft or vessel)
       4 = BaseStation
       5 = Aids to Navigate
       6 = Virtual Aids to Navigate
       7 = Field Transponder */
    void setObjectType(int val);
    int getObjectType() const;
    bool hasObjectType();

    /* ShipType:
       20 = WIG
       30 = fishing vessel
       31 = towing vessel
       32 = big towing vessel
       33 = dredging vessel
       34 = diving vessel
       35 = military vessel
       36 = sailing vessel
       37 = pleasure craft
       40 = HSC
       50 = pilot vessel
       51 = SAR
       52 = tug
       53 = port tender
       54 = anti pollution vessel
       55 = law enforcement vessel
       58 = medical vessel
       59 = mob83 vessel
       60 = passenger ship
       70 = cargo ship
       80 = tanker
       90 = other types of ship */
    void setShipType(int val);
    int getShipType() const;
    bool hasShipType();

    /* IMO:
       IMO number of the target */
    void setIMO(int val);
    int getIMO() const;
    bool hasIMO();

    /* MMSI:
       MMSI number of the target */
    void setMMSI(int val);
    int getMMSI() const;
    bool hasMMSI();

    /* ATONType:
       0 = Unknown
       1 = Unknown fixed
       2 = Unknown floating
       3 = Fixed off shore structure
       5 = Light, without sectors
       6 = Light, with sectors
       7 = Leading Light Front
       8 = Leading Light Rear
       9 = Beacon, Cardinal N
       10 = Beacon, Cardinal E
       11 = Beacon, Cardinal S
       12 = Beacon, Cardinal W
       13 = Beacon, Port hand
       14 = Beacon, Starboard hand
       15 = Beacon, Preferred Channel port hand
       16 = Beacon, Preferred Channel starboard hand
       17 = Beacon, Isolated danger
       18 = Beacon, Safe water
       19 = Beacon, Special mark
       20 = Cardinal Mark N
       21 = Cardinal Mark E
       22 = Cardinal Mark S
       23 = Cardinal Mark W
       24 = Port hand Mark
       25 = Starboard hand Mark
       26 = Preferred Channel Port hand
       27 = Preferred Channel Starboard hand
       28 = Isolated danger
       29 = Safe Water
       30 = Special Mark
       31 = Light Vessel / LANBY/Rigs
       32 = Reference point
       33 = RACON */
    void setATONType(int val);
    int getATONType() const;
    bool hasATONType();

    /* ATONName:
       Name of Aids-to-navigation */
    void setATONName(QString val);
    QString getATONName() const;
    bool hasATONName();

    /* AntPosDistFromFront:
       GPS Antenna position distance from front in meters */
    void setAntPosDistFromFront(float val);
    float getAntPosDistFromFront() const;
    bool hasAntPosDistFromFront();

    /* AntPosDistFromLeft:
       GPS Antenna position distance from left in meters */
    void setAntPosDistFromLeft(float val);
    float getAntPosDistFromLeft() const;
    bool hasAntPosDistFromLeft();

    /* NatLangShipName:
       The name of the vessel in native language */
    void setNatLangShipName(QString val);
    QString getNatLangShipName() const;
    bool hasNatLangShipName();

    /* PortOfRegistry:
       Port Of Registry */
    void setPortOfRegistry(QString val);
    QString getPortOfRegistry() const;
    bool hasPortOfRegistry();

    /* CountryFlag:
       The country flag */
    void setCountryFlag(QString val);
    QString getCountryFlag() const;
    bool hasCountryFlag();

    /* MaxAirDraught:
       Maximum air draught of the vessel in meters */
    void setMaxAirDraught(float val);
    float getMaxAirDraught() const;
    bool hasMaxAirDraught();

    /* MaxDraught:
       Maximum draught of the vessel in meters */
    void setMaxDraught(float val);
    float getMaxDraught() const;
    bool hasMaxDraught();

    /* DeepWaterVesselind:
       "yes" or "no" */
    void setDeepWaterVesselind(QString val);
    QString getDeepWaterVesselind() const;
    bool hasDeepWaterVesselind();
    QString toXML();
    QString toString(QString lead);

private:
    QString m_id;
    QString m_sourceName;
    int m_source;
    float m_length;
    bool m_lengthPresent;
    float m_breadth;
    bool m_breadthPresent;
    QString m_callsign;
    bool m_callsignPresent;
    QString m_shipName;
    bool m_shipNamePresent;
    int m_objectType;
    bool m_objectTypePresent;
    int m_shipType;
    bool m_shipTypePresent;
    int m_IMO;
    bool m_IMOPresent;
    int m_MMSI;
    bool m_MMSIPresent;
    int m_ATONType;
    bool m_ATONTypePresent;
    QString m_ATONName;
    bool m_ATONNamePresent;
    float m_antPosDistFromFront;
    bool m_antPosDistFromFrontPresent;
    float m_antPosDistFromLeft;
    bool m_antPosDistFromLeftPresent;
    QString m_natLangShipName;
    bool m_natLangShipNamePresent;
    QString m_portOfRegistry;
    bool m_portOfRegistryPresent;
    QString m_countryFlag;
    bool m_countryFlagPresent;
    float m_maxAirDraught;
    bool m_maxAirDraughtPresent;
    float m_maxDraught;
    bool m_maxDraughtPresent;
    QString m_deepWaterVesselind;
    bool m_deepWaterVesselindPresent;

}; 

#endif

