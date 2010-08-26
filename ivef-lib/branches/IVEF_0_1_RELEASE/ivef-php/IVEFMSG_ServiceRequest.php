<?php

// 
//  MSG_ServiceRequest
//
//  MSG_ServiceRequest is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  MSG_ServiceRequest is distributed in the hope that it will be useful,
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

require_once "IVEFHeader.php";
require_once "IVEFBody.php";

class MSG_ServiceRequest { 

    var $m_header; // default value is uninitialized
    var $m_headerPresent;
    var $m_body; // default value is uninitialized
    var $m_bodyPresent;

    public function MSG_ServiceRequest() {

        date_default_timezone_set('UTC');
        $this->m_headerPresent = false;
        $this->m_header = new Header();
        $this->m_bodyPresent = false;
        $this->m_body = new Body();
    }

    public function setHeader( $val ) {

        $this->m_headerPresent = true;
        $this->m_header = $val;
        return true;
    }

    public function getHeader() {

        return $this->m_header;
    }

    public function setBody( $val ) {

        $this->m_bodyPresent = true;
        $this->m_body = $val;
        return true;
    }

    public function getBody() {

        return $this->m_body;
    }

    public function toXML() {

        $xml = new SimpleXMLElement("<MSG_ServiceRequest></MSG_ServiceRequest>");

        if ( $this->m_headerPresent ) {
            $dom = dom_import_simplexml($xml);
            $child_as_xml = $this->m_header->toXML();
            $child_as_simplexml = new SimpleXMLElement($child_as_xml);
            $child_as_dom = dom_import_simplexml($child_as_simplexml);
            $child_as_leaf = $dom->ownerDocument->importNode($child_as_dom, true);
            $dom->appendChild($child_as_leaf);
            $xml = simplexml_import_dom($dom);
        } else { 
            return ""; // not all required data members have been set 
        } 
        if ( $this->m_bodyPresent ) {
            $dom = dom_import_simplexml($xml);
            $child_as_xml = $this->m_body->toXML();
            $child_as_simplexml = new SimpleXMLElement($child_as_xml);
            $child_as_dom = dom_import_simplexml($child_as_simplexml);
            $child_as_leaf = $dom->ownerDocument->importNode($child_as_dom, true);
            $dom->appendChild($child_as_leaf);
            $xml = simplexml_import_dom($dom);
        } else { 
            return ""; // not all required data members have been set 
        } 
        return $xml->asXML();
    }

    public function toString() {

    	return $this->toStringWithLead("");
    }

    public function toStringWithLead( $lead ) {

        $str = $lead . "MSG_ServiceRequest\n";

        $str .=  $this->m_header->toStringWithLead($lead . "    ");
        $str .=  $this->m_body->toStringWithLead($lead . "    ");

        return $str;
    }
}
?>
