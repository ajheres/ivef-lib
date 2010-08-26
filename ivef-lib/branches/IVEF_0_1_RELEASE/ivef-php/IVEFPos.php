<?php

// 
//  Pos
//
//  Pos is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  Pos is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY ); without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
//
//*********************************************************************************
//  WARNING: THIS CODE WAS GENERATED DO NOT MODIFY, CHANGE THE XSD INSTEAD
//  Generated by xsd2code on Thu Aug 26 11:23:11 2010.
//*********************************************************************************
//  Copyright 2010
//


class Pos { 

    var $m_lat; // default value is uninitialized
    var $m_latPresent;
    var $m_long; // default value is uninitialized
    var $m_longPresent;

    public function Pos() {

        date_default_timezone_set('UTC');
        $this->m_latPresent = false;
        $this->m_longPresent = false;
    }

    public function setLat( $val ) {

        if ($val < -90)
          return false;
        if ($val > 90)
          return false;
        $this->m_latPresent = true;
        $this->m_lat = $val;
        return true;
    }

    public function getLat() {

        return $this->m_lat;
    }

    public function setLong( $val ) {

        if ($val < -180)
          return false;
        if ($val > 180)
          return false;
        $this->m_longPresent = true;
        $this->m_long = $val;
        return true;
    }

    public function getLong() {

        return $this->m_long;
    }

    public function toXML() {

        $xml = new SimpleXMLElement("<Pos></Pos>");

        if ( $this->m_latPresent ) {
            $xml->addAttribute('Lat', number_format($this->m_lat, 6));
        } else { 
            return ""; // not all required attributes have been set 
        } 
        if ( $this->m_longPresent ) {
            $xml->addAttribute('Long', number_format($this->m_long, 6));
        } else { 
            return ""; // not all required attributes have been set 
        } 
        return $xml->asXML();
    }

    public function toString() {

    	return $this->toStringWithLead("");
    }

    public function toStringWithLead( $lead ) {

        $str = $lead . "Pos\n";

        $str .= $lead . "    Lat = " . number_format($this->m_lat, 6) . "\n";
        $str .= $lead . "    Long = " . number_format($this->m_long, 6) . "\n";

        return $str;
    }
}
?>
