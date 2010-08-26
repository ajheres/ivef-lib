<?php

// 
//  TaggedItem
//
//  TaggedItem is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  TaggedItem is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY ); without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
//
//*********************************************************************************
//  WARNING: THIS CODE WAS GENERATED DO NOT MODIFY, CHANGE THE XSD INSTEAD
//  Generated by xsd2code on Thu Aug 26 11:51:18 2010.
//*********************************************************************************
//  Copyright 2010
//


class TaggedItem { 

    var $m_key; // default value is uninitialized
    var $m_keyPresent;
    var $m_value; // default value is uninitialized
    var $m_valuePresent;

    public function TaggedItem() {

        date_default_timezone_set('UTC');
        $this->m_keyPresent = false;
        $this->m_valuePresent = false;
    }

    public function setKey( $val ) {

        if (strlen ($val) < 1)
          return false;
        if (strlen ($val) > 42)
          return false;
        $this->m_keyPresent = true;
        $this->m_key = $val;
        return true;
    }

    public function getKey() {

        return $this->m_key;
    }

    public function setValue( $val ) {

        $this->m_valuePresent = true;
        $this->m_value = $val;
        return true;
    }

    public function getValue() {

        return $this->m_value;
    }

    public function toXML() {

        $xml = new SimpleXMLElement("<TaggedItem></TaggedItem>");

        if ( $this->m_keyPresent ) {
            $xml->addAttribute('Key', $this->m_key);
        } else { 
            return ""; // not all required attributes have been set 
        } 
        if ( $this->m_valuePresent ) {
            $xml->addAttribute('Value', $this->m_value);
        } else { 
            return ""; // not all required attributes have been set 
        } 
        return $xml->asXML();
    }

    public function toString() {

    	return $this->toStringWithLead("");
    }

    public function toStringWithLead( $lead ) {

        $str = $lead . "TaggedItem\n";

        $str .= $lead . "    Key = " . $this->m_key . "\n";
        $str .= $lead . "    Value = " . $this->m_value . "\n";

        return $str;
    }
}
?>
