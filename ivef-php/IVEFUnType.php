<?php

// 
//  UnType
//
//  UnType is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  UnType is distributed in the hope that it will be useful,
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


class UnType { 

    var $m_codeA; // default value is uninitialized
    var $m_codeAPresent;
    var $m_codeB; // default value is uninitialized
    var $m_codeBPresent;
    var $m_mode; // default value is uninitialized
    var $m_modePresent;

    public function UnType() {

        date_default_timezone_set('UTC');
        $this->m_codeAPresent = false;
        $this->m_codeBPresent = false;
        $this->m_modePresent = false;
    }

    public function setCodeA( $val ) {

        if ($val < 0)
          return false;
        if ($val > 138)
          return false;
        $this->m_codeAPresent = true;
        $this->m_codeA = $val;
        return true;
    }

    public function getCodeA() {

        return $this->m_codeA;
    }

    public function setCodeB( $val ) {

        if ($val < 0)
          return false;
        if ($val > 9)
          return false;
        $this->m_codeBPresent = true;
        $this->m_codeB = $val;
        return true;
    }

    public function getCodeB() {

        return $this->m_codeB;
    }

    public function setMode( $val ) {

        if ( ( $val != 1 ) &&
             ( $val != 2 ) &&
             ( $val != 3 ) &&
             ( $val != 6 ) &&
             ( $val != 7 ) &&
             ( $val != 8 ) )
            return false;
        $this->m_modePresent = true;
        $this->m_mode = $val;
        return true;
    }

    public function getMode() {

        return $this->m_mode;
    }

    public function toXML() {

        $xml = new SimpleXMLElement("<UnType></UnType>");

        if ( $this->m_codeAPresent ) {
            $xml->addAttribute('CodeA', $this->m_codeA);
        } else { 
            return ""; // not all required attributes have been set 
        } 
        if ( $this->m_codeBPresent ) {
            $xml->addAttribute('CodeB', $this->m_codeB);
        } else { 
            return ""; // not all required attributes have been set 
        } 
        if ( $this->m_modePresent ) {
            $xml->addAttribute('Mode', $this->m_mode);
        } else { 
            return ""; // not all required attributes have been set 
        } 
        return $xml->asXML();
    }

    public function toString() {

    	return $this->toStringWithLead("");
    }

    public function toStringWithLead( $lead ) {

        $str = $lead . "UnType\n";

        $str .= $lead . "    CodeA = " . $this->m_codeA . "\n";
        $str .= $lead . "    CodeB = " . $this->m_codeB . "\n";
        $str .= $lead . "    Mode = " . $this->m_mode . "\n";

        return $str;
    }
}
?>
