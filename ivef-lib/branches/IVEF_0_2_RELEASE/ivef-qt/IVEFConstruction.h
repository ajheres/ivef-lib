/* 
 *  Construction
 *
 *  Construction is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Tue Jan 5 16:22:59 2010.
 **********************************************************************************
 *  Copyright 2009
 *
 */

#ifndef __CONSTRUCTION_H__
#define __CONSTRUCTION_H__

#include <QtCore>
#include "IVEFUnType.h"

//-----------------------------------------------------------
//! \brief       Class definition of Construction
//!
//! attributes of the object regarding the physical construction
//!

class Construction : public QObject { 
    Q_OBJECT

public:
    //!constructor
    //!
    Construction();
    //!copy constructor
    //!
    Construction(const Construction&);
    //!= operator
    //!
    Construction & operator=(const Construction&/*val*/);
    //!              sets the UnType: Object type according to CODES FOR TYPES OF MEANS OF TRANSPORT Revision 2 (UNECE CEFACT Trade Facilitation Recommendation No. 28 edition 2007) Check latest version
    //!
    void setUnType(UnType val);

    //!              gets the UnType: Object type according to CODES FOR TYPES OF MEANS OF TRANSPORT Revision 2 (UNECE CEFACT Trade Facilitation Recommendation No. 28 edition 2007) Check latest version
    //!
    //! \return     UnType
    //!
    UnType getUnType() const;

    //!              sets the HullColor: Color of Hull (in RGB hex) for SAR operations
    //!
    void setHullColor(QString val);

    //!              gets the HullColor: Color of Hull (in RGB hex) for SAR operations
    //!
    //! \return     QString
    //!
    QString getHullColor() const;

    //!              returns true if HullColoris used (optional field).
    //!
    //! \return     bool
    bool hasHullColor();

    //!              sets the HullType: Type of hull (1 = single,  2 = double, 3 =  triple)
    //!
    void setHullType(int val);

    //!              gets the HullType: Type of hull (1 = single,  2 = double, 3 =  triple)
    //!
    //! \return     int
    //!
    int getHullType() const;

    //!              returns true if HullTypeis used (optional field).
    //!
    //! \return     bool
    bool hasHullType();

    //!              sets the Length: Length of the target in meter as confirmed by NCA
    //!
    void setLength(float val);

    //!              gets the Length: Length of the target in meter as confirmed by NCA
    //!
    //! \return     float
    //!
    float getLength() const;

    //!              returns true if Lengthis used (optional field).
    //!
    //! \return     bool
    bool hasLength();

    //!              sets the LloydsShipType: Number indicating type of vessel
    //!
    void setLloydsShipType(int val);

    //!              gets the LloydsShipType: Number indicating type of vessel
    //!
    //! \return     int
    //!
    int getLloydsShipType() const;

    //!              returns true if LloydsShipTypeis used (optional field).
    //!
    //! \return     bool
    bool hasLloydsShipType();

    //!              sets the MaxKeelHeight: Maximum height of the object, to be used if voyage data is not available
    //!
    void setMaxKeelHeight(float val);

    //!              gets the MaxKeelHeight: Maximum height of the object, to be used if voyage data is not available
    //!
    //! \return     float
    //!
    float getMaxKeelHeight() const;

    //!              returns true if MaxKeelHeightis used (optional field).
    //!
    //! \return     bool
    bool hasMaxKeelHeight();

    //!              sets the MaxDraught: Maximum draught of the object in meters, to be used if voyage data is not available
    //!
    void setMaxDraught(float val);

    //!              gets the MaxDraught: Maximum draught of the object in meters, to be used if voyage data is not available
    //!
    //! \return     float
    //!
    float getMaxDraught() const;

    //!              returns true if MaxDraughtis used (optional field).
    //!
    //! \return     bool
    bool hasMaxDraught();

    //!              sets the MaxPersonsOnBoard: The maximum number of persons on board of the object (crew, support, passengers, pilots)
    //!
    void setMaxPersonsOnBoard(float val);

    //!              gets the MaxPersonsOnBoard: The maximum number of persons on board of the object (crew, support, passengers, pilots)
    //!
    //! \return     float
    //!
    float getMaxPersonsOnBoard() const;

    //!              returns true if MaxPersonsOnBoardis used (optional field).
    //!
    //! \return     bool
    bool hasMaxPersonsOnBoard();

    //!              sets the MaxSpeed: The maximum speed the object is able to sustain with normal draft and load
    //!
    void setMaxSpeed(float val);

    //!              gets the MaxSpeed: The maximum speed the object is able to sustain with normal draft and load
    //!
    //! \return     float
    //!
    float getMaxSpeed() const;

    //!              returns true if MaxSpeedis used (optional field).
    //!
    //! \return     bool
    bool hasMaxSpeed();

    //!              sets the Width: Width of the target in meter as confirmed by the NCA
    //!
    void setWidth(float val);

    //!              gets the Width: Width of the target in meter as confirmed by the NCA
    //!
    //! \return     float
    //!
    float getWidth() const;

    //!              returns true if Widthis used (optional field).
    //!
    //! \return     bool
    bool hasWidth();

    //!              generates XML of this object including attributes and child elements
    //!
    //! \return     QString
    QString toXML();

    //!              generates output of this object including attributes and child elements
    //!
    //! \return     QString
    QString toString(QString lead);

    //!              encodes a string returning the encoded string
    //!
    //! \return     QString
    QString encode(QString str);


private:
    UnType m_unType;
    QString m_hullColor;
    bool m_hullColorPresent;
    int m_hullType;
    bool m_hullTypePresent;
    float m_length;
    bool m_lengthPresent;
    int m_lloydsShipType;
    bool m_lloydsShipTypePresent;
    float m_maxKeelHeight;
    bool m_maxKeelHeightPresent;
    float m_maxDraught;
    bool m_maxDraughtPresent;
    float m_maxPersonsOnBoard;
    bool m_maxPersonsOnBoardPresent;
    float m_maxSpeed;
    bool m_maxSpeedPresent;
    float m_width;
    bool m_widthPresent;

}; 

#endif

