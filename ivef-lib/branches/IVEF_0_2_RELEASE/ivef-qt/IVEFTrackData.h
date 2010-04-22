/* 
 *  TrackData
 *
 *  TrackData is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Apr 22 11:27:24 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __TRACKDATA_H__
#define __TRACKDATA_H__

#include <QtCore>
#include "IVEFPos.h"

//-----------------------------------------------------------
//! \brief       Class definition of TrackData
//!
//! DATA describing a position report of an object
//!

class TrackData : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    TrackData();
    //!copy constructor
    //!
    TrackData(const TrackData&);
    //!= operator
    //!
    TrackData & operator=(const TrackData&/*val*/);
    //!              adds a Pos.
    //!
    void addPos(Pos val);

    //!              gets the i-th Pos.
    //!
    Pos getPosAt(int i) const;

    //!              return the number of Pos objects.
    //!
    //! \return     int
    int countOfPoss() const;

    //!              sets the COG: Course over ground  in degrees. (0-360)
    //!
    void setCOG(float val);

    //!              gets the COG: Course over ground  in degrees. (0-360)
    //!
    //! \return     float
    //!
    float getCOG() const;

    //!              sets the EstAccSOG: Estimated accuracy\n
    //!              standard deviation of the calculated value \n
    //!              expressed in m/s
    //!
    void setEstAccSOG(float val);

    //!              gets the EstAccSOG: Estimated accuracy\n
    //!              standard deviation of the calculated value \n
    //!              expressed in m/s
    //!
    //! \return     float
    //!
    float getEstAccSOG() const;

    //!              returns true if EstAccSOGis used (optional field).
    //!
    //! \return     bool
    bool hasEstAccSOG() const;

    //!              sets the EstAccCOG: Estimated accuracy\n
    //!              standard deviation of the calculated value \n
    //!              expressed in degrees
    //!
    void setEstAccCOG(float val);

    //!              gets the EstAccCOG: Estimated accuracy\n
    //!              standard deviation of the calculated value \n
    //!              expressed in degrees
    //!
    //! \return     float
    //!
    float getEstAccCOG() const;

    //!              returns true if EstAccCOGis used (optional field).
    //!
    //! \return     bool
    bool hasEstAccCOG() const;

    //!              sets the Id: The unique identification of this track. Valid from first message with TrackStatus!=Terminated to first message with TrackStatus=Terminated
    //!
    void setId(int val);

    //!              gets the Id: The unique identification of this track. Valid from first message with TrackStatus!=Terminated to first message with TrackStatus=Terminated
    //!
    //! \return     int
    //!
    int getId() const;

    //!              sets the Length: Measured length of the target in meter
    //!
    void setLength(float val);

    //!              gets the Length: Measured length of the target in meter
    //!
    //! \return     float
    //!
    float getLength() const;

    //!              returns true if Lengthis used (optional field).
    //!
    //! \return     bool
    bool hasLength() const;

    //!              sets the NavStatus: Navigation status of the target\n
    //!              0 = under way using engine\n
    //!              1 = at anchor\n
    //!              2 = not under command\n
    //!              3 = restricted manoeuvrability\n
    //!              4 = constrained by her draught\n
    //!              5 = moored\n
    //!              6 = aground\n
    //!              7 = engaged in fishing\n
    //!              8 = under way sailing\n
    //!              9 = engaged in fishing other than trawling  \n
    //!              10 = air-cushion vessel in non displacement mode or WIG craft taking off, landing or in flight\n
    //!              11 = power driven vessel towing astern\n
    //!              12 = power driven vessel pushing ahead or towing alongside\n
    //!              13 = in distress or requiring assistance  \n
    //!              14 = AIS SART, seeking to attract attention\n
    //!              15 = undefined default
    //!
    void setNavStatus(int val);

    //!              gets the NavStatus: Navigation status of the target\n
    //!              0 = under way using engine\n
    //!              1 = at anchor\n
    //!              2 = not under command\n
    //!              3 = restricted manoeuvrability\n
    //!              4 = constrained by her draught\n
    //!              5 = moored\n
    //!              6 = aground\n
    //!              7 = engaged in fishing\n
    //!              8 = under way sailing\n
    //!              9 = engaged in fishing other than trawling  \n
    //!              10 = air-cushion vessel in non displacement mode or WIG craft taking off, landing or in flight\n
    //!              11 = power driven vessel towing astern\n
    //!              12 = power driven vessel pushing ahead or towing alongside\n
    //!              13 = in distress or requiring assistance  \n
    //!              14 = AIS SART, seeking to attract attention\n
    //!              15 = undefined default
    //!
    //! \return     int
    //!
    int getNavStatus() const;

    //!              returns true if NavStatusis used (optional field).
    //!
    //! \return     bool
    bool hasNavStatus() const;

    //!              sets the Heading: Heading of the target in degrees
    //!
    void setHeading(float val);

    //!              gets the Heading: Heading of the target in degrees
    //!
    //! \return     float
    //!
    float getHeading() const;

    //!              returns true if Headingis used (optional field).
    //!
    //! \return     bool
    bool hasHeading() const;

    //!              sets the ROT: Rate of turn in degrees per minute
    //!
    void setROT(float val);

    //!              gets the ROT: Rate of turn in degrees per minute
    //!
    //! \return     float
    //!
    float getROT() const;

    //!              returns true if ROTis used (optional field).
    //!
    //! \return     bool
    bool hasROT() const;

    //!              sets the SOG: Speed over ground in meters per second
    //!
    void setSOG(float val);

    //!              gets the SOG: Speed over ground in meters per second
    //!
    //! \return     float
    //!
    float getSOG() const;

    //!              sets the SourceId: Unique identification of the producer  (UN/LOCODE)  in case multiple producers exist on the same LOCODE, the local competent authority can optionally addended this with a local  code (e.g. BE ANR 01 = Antwerp, 01)
    //!
    void setSourceId(QString val);

    //!              gets the SourceId: Unique identification of the producer  (UN/LOCODE)  in case multiple producers exist on the same LOCODE, the local competent authority can optionally addended this with a local  code (e.g. BE ANR 01 = Antwerp, 01)
    //!
    //! \return     QString
    //!
    QString getSourceId() const;

    //!              returns true if SourceIdis used (optional field).
    //!
    //! \return     bool
    bool hasSourceId() const;

    //!              sets the SourceName: Identification of the originator of the data
    //!
    void setSourceName(QString val);

    //!              gets the SourceName: Identification of the originator of the data
    //!
    //! \return     QString
    //!
    QString getSourceName() const;

    //!              sets the UpdateTime: Date and time in UTC format (YYYY-MM-DDThh:mm:ss.sssZ) (subset of ISO 8601)  this position was measured.
    //!
    void setUpdateTime(QDateTime val);

    //!              gets the UpdateTime: Date and time in UTC format (YYYY-MM-DDThh:mm:ss.sssZ) (subset of ISO 8601)  this position was measured.
    //!
    //! \return     QDateTime
    //!
    QDateTime getUpdateTime() const;

    //!              sets the TrackStatus: 1 = Updated, (sensors are updating the track)\n
    //!              2 = Coasted, (no sensor is updating the track)\n
    //!              3 = Dropped
    //!
    void setTrackStatus(int val);

    //!              gets the TrackStatus: 1 = Updated, (sensors are updating the track)\n
    //!              2 = Coasted, (no sensor is updating the track)\n
    //!              3 = Dropped
    //!
    //! \return     int
    //!
    int getTrackStatus() const;

    //!              sets the Width: Measured Width of the target in meter
    //!
    void setWidth(float val);

    //!              gets the Width: Measured Width of the target in meter
    //!
    //! \return     float
    //!
    float getWidth() const;

    //!              returns true if Widthis used (optional field).
    //!
    //! \return     bool
    bool hasWidth() const;

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
    QVector<Pos> m_poss;
    float m_COG;
    float m_estAccSOG;
    bool m_estAccSOGPresent;
    float m_estAccCOG;
    bool m_estAccCOGPresent;
    int m_id;
    float m_length;
    bool m_lengthPresent;
    int m_navStatus;
    bool m_navStatusPresent;
    float m_heading;
    bool m_headingPresent;
    float m_ROT;
    bool m_ROTPresent;
    float m_SOG;
    QString m_sourceId;
    bool m_sourceIdPresent;
    QString m_sourceName;
    QDateTime m_updateTime;
    int m_trackStatus;
    float m_width;
    bool m_widthPresent;

}; 

#endif

