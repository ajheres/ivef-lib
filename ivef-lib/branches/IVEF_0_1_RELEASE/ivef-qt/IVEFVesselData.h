/* 
 *  VesselData
 *
 *  VesselData is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Thu Apr 1 13:03:11 2010.
 **********************************************************************************
 *  Copyright 2010
 *
 */

#ifndef __VESSELDATA_H__
#define __VESSELDATA_H__

#include <QtCore>
#include "IVEFPosReport.h"
#include "IVEFStaticData.h"
#include "IVEFVoyage.h"
#include "IVEFTaggedItem.h"

//-----------------------------------------------------------
//! \brief       Class definition of VesselData
//!
//! DATA regarding an object in the supliers domain, contains at least 1 one of the sub elements (PosReport, StaticData, Voyage)
//!

class VesselData : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    VesselData();
    //!copy constructor
    //!
    VesselData(const VesselData&);
    //!= operator
    //!
    VesselData & operator=(const VesselData&/*val*/);
    //!              sets the PosReport
    //!
    void setPosReport(PosReport val);

    //!              gets the PosReport
    //!
    //! \return     PosReport
    //!
    PosReport getPosReport() const;

    //!              adds a StaticData.
    //!
    void addStaticData(StaticData val);

    //!              gets the i-th StaticData.
    //!
    StaticData getStaticDataAt(int i) const;

    //!              return the number of StaticData objects.
    //!
    //! \return     int
    int countOfStaticDatas() const;

    //!              adds a Voyage.
    //!
    void addVoyage(Voyage val);

    //!              gets the i-th Voyage.
    //!
    Voyage getVoyageAt(int i) const;

    //!              return the number of Voyage objects.
    //!
    //! \return     int
    int countOfVoyages() const;

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
    PosReport m_posReport;
    QVector<StaticData> m_staticDatas;
    QVector<Voyage> m_voyages;
    QVector<TaggedItem> m_taggedItems;

}; 

#endif

