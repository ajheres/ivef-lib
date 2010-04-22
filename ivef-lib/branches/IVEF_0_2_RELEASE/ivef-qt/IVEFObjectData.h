/* 
 *  ObjectData
 *
 *  ObjectData is free software: you can redistribute it and/or modify
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

#ifndef __OBJECTDATA_H__
#define __OBJECTDATA_H__

#include <QtCore>
#include "IVEFTrackData.h"
#include "IVEFVesselData.h"
#include "IVEFVoyageData.h"
#include "IVEFTaggedItem.h"

//-----------------------------------------------------------
//! \brief       Class definition of ObjectData
//!
//! DATA regarding an object in the supliers domain, contains at least 1 one of the sub elements (TrackData, VesselData, VoyageData)
//!

class ObjectData : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    ObjectData();
    //!copy constructor
    //!
    ObjectData(const ObjectData&);
    //!= operator
    //!
    ObjectData & operator=(const ObjectData&/*val*/);
    //!              sets the TrackData
    //!
    void setTrackData(TrackData val);

    //!              gets the TrackData
    //!
    //! \return     TrackData
    //!
    TrackData getTrackData() const;

    //!              returns true if TrackDatais used (optional field).
    //!
    //! \return     bool
    bool hasTrackData() const;

    //!              adds a VesselData.
    //!
    void addVesselData(VesselData val);

    //!              gets the i-th VesselData.
    //!
    VesselData getVesselDataAt(int i) const;

    //!              return the number of VesselData objects.
    //!
    //! \return     int
    int countOfVesselDatas() const;

    //!              adds a VoyageData.
    //!
    void addVoyageData(VoyageData val);

    //!              gets the i-th VoyageData.
    //!
    VoyageData getVoyageDataAt(int i) const;

    //!              return the number of VoyageData objects.
    //!
    //! \return     int
    int countOfVoyageDatas() const;

    //!              adds a TaggedItem.
    //!
    void addTaggedItem(TaggedItem val);

    //!              gets the i-th TaggedItem.
    //!
    TaggedItem getTaggedItemAt(int i) const;

    //!              return the number of TaggedItem objects.
    //!
    //! \return     int
    int countOfTaggedItems() const;

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
    TrackData m_trackData;
    bool m_trackDataPresent;
    QVector<VesselData> m_vesselDatas;
    QVector<VoyageData> m_voyageDatas;
    QVector<TaggedItem> m_taggedItems;

}; 

#endif

