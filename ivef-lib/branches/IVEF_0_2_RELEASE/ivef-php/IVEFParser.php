<?php

// 
//  Parser
//
//  Parser is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  Parser is distributed in the hope that it will be useful,
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

require_once "IVEFMSG_IVEF.php";

class Parser { 

    public function messageNameOfXMLString($data) { 

        $xml = new SimpleXMLElement($data);
        return $xml->getName();
    }

    public function parseXMLMessage($data) { 

        $tag = $this->messageNameOfXMLString($data);

        if ($tag == "MSG_IVEF") {
            $xml = new SimpleXMLElement($data);
            return $this->parseMSG_IVEF($xml);
        } 
        return; // error no root message found
    }

    private function hasAttribute($object, $attribute) { 
        foreach($object->attributes() as $a => $b) { 
            if ($a == $attribute) { 
                return true; 
            }     
        } 
        return false; 
    }

    private function hasChild($object, $child) { 
        foreach($object->children() as $a => $b) { 
            if ($a == $child) { 
                return true; 
            }     
        } 
        return false; 
    }

    private function countOfChild($object, $child) { 
        $count = 0;
        foreach($object->children() as $a => $b) { 
            if ($a == $child) { 
                $count++; 
            }     
        } 
        return $count; 
    }

    public function parseMSG_IVEF( $simplexml ) {

        $element = new MSG_IVEF();

        if ($this->hasChild($simplexml, "Header")) { 
            $child = $this->parseHeader($simplexml->Header);
            $element->setHeader($child);
        } else { 
            // required element is missing
        }
        if ($this->hasChild($simplexml, "Body")) { 
            $child = $this->parseBody($simplexml->Body);
            $element->setBody($child);
        } else { 
            // required element is missing
        }
        return $element;
    }

    private function parseBody( $simplexml ) {

        $element = new Body();

        if ($this->hasChild($simplexml, "LoginRequest")) { 
            $child = $this->parseLoginRequest($simplexml->LoginRequest);
            $element->setLoginRequest($child);
        }
        if ($this->hasChild($simplexml, "LoginResponse")) { 
            $child = $this->parseLoginResponse($simplexml->LoginResponse);
            $element->setLoginResponse($child);
        }
        if ($this->hasChild($simplexml, "Logout")) { 
            $child = $this->parseLogout($simplexml->Logout);
            $element->setLogout($child);
        }
        if ($this->hasChild($simplexml, "ObjectDatas")) { 
            $child = $this->parseObjectDatas($simplexml->ObjectDatas);
            $element->setObjectDatas($child);
        }
        if ($this->hasChild($simplexml, "Ping")) { 
            $child = $this->parsePing($simplexml->Ping);
            $element->setPing($child);
        }
        if ($this->hasChild($simplexml, "Pong")) { 
            $child = $this->parsePong($simplexml->Pong);
            $element->setPong($child);
        }
        if ($this->hasChild($simplexml, "ServerStatus")) { 
            $child = $this->parseServerStatus($simplexml->ServerStatus);
            $element->setServerStatus($child);
        }
        if ($this->hasChild($simplexml, "ServiceRequest")) { 
            $child = $this->parseServiceRequest($simplexml->ServiceRequest);
            $element->setServiceRequest($child);
        }
        if ($this->hasChild($simplexml, "ServiceRequestResponse")) { 
            $child = $this->parseServiceRequestResponse($simplexml->ServiceRequestResponse);
            $element->setServiceRequestResponse($child);
        }
        return $element;
    }

    private function parseObjectDatas( $simplexml ) {

        $element = new ObjectDatas();

        for ($i = 0; $i < $this->countOfChild($simplexml, "ObjectData"); $i++) { 
            $child = $this->parseObjectData($simplexml->ObjectData[$i]);
            $element->addObjectData($child);
        }
        return $element;
    }

    private function parseArea( $simplexml ) {

        $element = new Area();

        for ($i = 0; $i < $this->countOfChild($simplexml, "Pos"); $i++) { 
            $child = $this->parsePos($simplexml->Pos[$i]);
            $element->addPos($child);
        }
        if ($this->hasAttribute($simplexml, "Name")) { 
            $element->setName((string) $simplexml["Name"]);
        }
        return $element;
    }

    private function parseOtherId( $simplexml ) {

        $element = new OtherId();

        if ($this->hasAttribute($simplexml, "Id")) { 
            $element->setId((string) $simplexml["Id"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Value")) { 
            $element->setValue((string) $simplexml["Value"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseOtherName( $simplexml ) {

        $element = new OtherName();

        if ($this->hasAttribute($simplexml, "Lang")) { 
            $element->setLang((string) $simplexml["Lang"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Name")) { 
            $element->setName((string) $simplexml["Name"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseHeader( $simplexml ) {

        $element = new Header();

        if ($this->hasAttribute($simplexml, "MsgRefId")) { 
            $element->setMsgRefId((string) $simplexml["MsgRefId"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Version")) { 
            $element->setVersion((string) $simplexml["Version"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseLoginRequest( $simplexml ) {

        $element = new LoginRequest();

        if ($this->hasAttribute($simplexml, "Encryption")) { 
            $element->setEncryption((string) $simplexml["Encryption"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Name")) { 
            $element->setName((string) $simplexml["Name"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Password")) { 
            $element->setPassword((string) $simplexml["Password"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseLoginResponse( $simplexml ) {

        $element = new LoginResponse();

        if ($this->hasAttribute($simplexml, "Reason")) { 
            $element->setReason((string) $simplexml["Reason"]);
        }
        if ($this->hasAttribute($simplexml, "ResponseOn")) { 
            $element->setResponseOn((string) $simplexml["ResponseOn"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Result")) { 
            $element->setResult((string) $simplexml["Result"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseLogout( $simplexml ) {

        $element = new Logout();

        return $element;
    }

    private function parseObjectData( $simplexml ) {

        $element = new ObjectData();

        if ($this->hasChild($simplexml, "TrackData")) { 
            $child = $this->parseTrackData($simplexml->TrackData);
            $element->setTrackData($child);
        }
        for ($i = 0; $i < $this->countOfChild($simplexml, "VesselData"); $i++) { 
            $child = $this->parseVesselData($simplexml->VesselData[$i]);
            $element->addVesselData($child);
        }
        for ($i = 0; $i < $this->countOfChild($simplexml, "VoyageData"); $i++) { 
            $child = $this->parseVoyageData($simplexml->VoyageData[$i]);
            $element->addVoyageData($child);
        }
        for ($i = 0; $i < $this->countOfChild($simplexml, "TaggedItem"); $i++) { 
            $child = $this->parseTaggedItem($simplexml->TaggedItem[$i]);
            $element->addTaggedItem($child);
        }
        return $element;
    }

    private function parsePing( $simplexml ) {

        $element = new Ping();

        if ($this->hasAttribute($simplexml, "TimeStamp")) { 
            $element->setTimeStamp((string) $simplexml["TimeStamp"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parsePong( $simplexml ) {

        $element = new Pong();

        if ($this->hasAttribute($simplexml, "ResponseOn")) { 
            $element->setResponseOn((string) $simplexml["ResponseOn"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "SourceId")) { 
            $element->setSourceId((string) $simplexml["SourceId"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "TimeStamp")) { 
            $element->setTimeStamp((string) $simplexml["TimeStamp"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parsePos( $simplexml ) {

        $element = new Pos();

        if ($this->hasAttribute($simplexml, "Altitude")) { 
            $element->setAltitude((string) $simplexml["Altitude"]);
        }
        if ($this->hasAttribute($simplexml, "EstAccAlt")) { 
            $element->setEstAccAlt((string) $simplexml["EstAccAlt"]);
        }
        if ($this->hasAttribute($simplexml, "EstAccLat")) { 
            $element->setEstAccLat((string) $simplexml["EstAccLat"]);
        }
        if ($this->hasAttribute($simplexml, "EstAccLong")) { 
            $element->setEstAccLong((string) $simplexml["EstAccLong"]);
        }
        if ($this->hasAttribute($simplexml, "Lat")) { 
            $element->setLat((string) $simplexml["Lat"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Long")) { 
            $element->setLong((string) $simplexml["Long"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseServerStatus( $simplexml ) {

        $element = new ServerStatus();

        if ($this->hasAttribute($simplexml, "ContactIdentity")) { 
            $element->setContactIdentity((string) $simplexml["ContactIdentity"]);
        }
        if ($this->hasAttribute($simplexml, "Details")) { 
            $element->setDetails((string) $simplexml["Details"]);
        }
        if ($this->hasAttribute($simplexml, "Status")) { 
            $element->setStatus((string) $simplexml["Status"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseServiceRequest( $simplexml ) {

        $element = new ServiceRequest();

        for ($i = 0; $i < $this->countOfChild($simplexml, "Area"); $i++) { 
            $child = $this->parseArea($simplexml->Area[$i]);
            $element->addArea($child);
        }
        if ($this->hasChild($simplexml, "Transmission")) { 
            $child = $this->parseTransmission($simplexml->Transmission);
            $element->setTransmission($child);
        } else { 
            // required element is missing
        }
        for ($i = 0; $i < $this->countOfChild($simplexml, "Item"); $i++) { 
            $child = $this->parseItem($simplexml->Item[$i]);
            $element->addItem($child);
        }
        if ($this->hasChild($simplexml, "Filter")) { 
            $child = $this->parseFilter($simplexml->Filter);
            $element->setFilter($child);
        }
        return $element;
    }

    private function parseTransmission( $simplexml ) {

        $element = new Transmission();

        if ($this->hasAttribute($simplexml, "Type")) { 
            $element->setType((string) $simplexml["Type"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Period")) { 
            $element->setPeriod((string) $simplexml["Period"]);
        }
        return $element;
    }

    private function parseItem( $simplexml ) {

        $element = new Item();

        if ($this->hasAttribute($simplexml, "DataSelector")) { 
            $element->setDataSelector((string) $simplexml["DataSelector"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "FieldSelector")) { 
            $element->setFieldSelector((string) $simplexml["FieldSelector"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseFilter( $simplexml ) {

        $element = new Filter();

        if ($this->hasAttribute($simplexml, "Predicate")) { 
            $element->setPredicate((string) $simplexml["Predicate"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseServiceRequestResponse( $simplexml ) {

        $element = new ServiceRequestResponse();

        if ($this->hasAttribute($simplexml, "Reason")) { 
            $element->setReason((string) $simplexml["Reason"]);
        }
        if ($this->hasAttribute($simplexml, "ResponseOn")) { 
            $element->setResponseOn((string) $simplexml["ResponseOn"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Result")) { 
            $element->setResult((string) $simplexml["Result"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseTaggedItem( $simplexml ) {

        $element = new TaggedItem();

        if ($this->hasAttribute($simplexml, "Key")) { 
            $element->setKey((string) $simplexml["Key"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Value")) { 
            $element->setValue((string) $simplexml["Value"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseTrackData( $simplexml ) {

        $element = new TrackData();

        for ($i = 0; $i < $this->countOfChild($simplexml, "Pos"); $i++) { 
            $child = $this->parsePos($simplexml->Pos[$i]);
            $element->addPos($child);
        }
        for ($i = 0; $i < $this->countOfChild($simplexml, "NavStatus"); $i++) { 
            $child = $this->parseNavStatus($simplexml->NavStatus[$i]);
            $element->addNavStatus($child);
        }
        if ($this->hasAttribute($simplexml, "COG")) { 
            $element->setCOG((string) $simplexml["COG"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "EstAccSOG")) { 
            $element->setEstAccSOG((string) $simplexml["EstAccSOG"]);
        }
        if ($this->hasAttribute($simplexml, "EstAccCOG")) { 
            $element->setEstAccCOG((string) $simplexml["EstAccCOG"]);
        }
        if ($this->hasAttribute($simplexml, "Id")) { 
            $element->setId((string) $simplexml["Id"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Length")) { 
            $element->setLength((string) $simplexml["Length"]);
        }
        if ($this->hasAttribute($simplexml, "Heading")) { 
            $element->setHeading((string) $simplexml["Heading"]);
        }
        if ($this->hasAttribute($simplexml, "ROT")) { 
            $element->setROT((string) $simplexml["ROT"]);
        }
        if ($this->hasAttribute($simplexml, "SOG")) { 
            $element->setSOG((string) $simplexml["SOG"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "SourceId")) { 
            $element->setSourceId((string) $simplexml["SourceId"]);
        }
        if ($this->hasAttribute($simplexml, "SourceName")) { 
            $element->setSourceName((string) $simplexml["SourceName"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "UpdateTime")) { 
            $element->setUpdateTime((string) $simplexml["UpdateTime"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "TrackStatus")) { 
            $element->setTrackStatus((string) $simplexml["TrackStatus"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Width")) { 
            $element->setWidth((string) $simplexml["Width"]);
        }
        return $element;
    }

    private function parseNavStatus( $simplexml ) {

        $element = new NavStatus();

        if ($this->hasAttribute($simplexml, "Value")) { 
            $element->setValue((string) $simplexml["Value"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseVesselData( $simplexml ) {

        $element = new VesselData();

        if ($this->hasChild($simplexml, "Construction")) { 
            $child = $this->parseConstruction($simplexml->Construction);
            $element->setConstruction($child);
        }
        if ($this->hasChild($simplexml, "Identifier")) { 
            $child = $this->parseIdentifier($simplexml->Identifier);
            $element->setIdentifier($child);
        }
        if ($this->hasAttribute($simplexml, "Class")) { 
            $element->setClass((string) $simplexml["Class"]);
        }
        if ($this->hasAttribute($simplexml, "BlackListed")) { 
            $element->setBlackListed((string) $simplexml["BlackListed"]);
        }
        if ($this->hasAttribute($simplexml, "Id")) { 
            $element->setId((string) $simplexml["Id"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "SpecialAttention")) { 
            $element->setSpecialAttention((string) $simplexml["SpecialAttention"]);
        }
        if ($this->hasAttribute($simplexml, "SourceId")) { 
            $element->setSourceId((string) $simplexml["SourceId"]);
        }
        if ($this->hasAttribute($simplexml, "SourceName")) { 
            $element->setSourceName((string) $simplexml["SourceName"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "SourceType")) { 
            $element->setSourceType((string) $simplexml["SourceType"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "UpdateTime")) { 
            $element->setUpdateTime((string) $simplexml["UpdateTime"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseConstruction( $simplexml ) {

        $element = new Construction();

        if ($this->hasChild($simplexml, "UnType")) { 
            $child = $this->parseUnType($simplexml->UnType);
            $element->setUnType($child);
        }
        if ($this->hasAttribute($simplexml, "HullColor")) { 
            $element->setHullColor((string) $simplexml["HullColor"]);
        }
        if ($this->hasAttribute($simplexml, "HullType")) { 
            $element->setHullType((string) $simplexml["HullType"]);
        }
        if ($this->hasAttribute($simplexml, "DeadWeight")) { 
            $element->setDeadWeight((string) $simplexml["DeadWeight"]);
        }
        if ($this->hasAttribute($simplexml, "GrossWeight")) { 
            $element->setGrossWeight((string) $simplexml["GrossWeight"]);
        }
        if ($this->hasAttribute($simplexml, "Length")) { 
            $element->setLength((string) $simplexml["Length"]);
        }
        if ($this->hasAttribute($simplexml, "LloydsShipType")) { 
            $element->setLloydsShipType((string) $simplexml["LloydsShipType"]);
        }
        if ($this->hasAttribute($simplexml, "YearOfBuild")) { 
            $element->setYearOfBuild((string) $simplexml["YearOfBuild"]);
        }
        if ($this->hasAttribute($simplexml, "MaxAirDraught")) { 
            $element->setMaxAirDraught((string) $simplexml["MaxAirDraught"]);
        }
        if ($this->hasAttribute($simplexml, "MaxDraught")) { 
            $element->setMaxDraught((string) $simplexml["MaxDraught"]);
        }
        if ($this->hasAttribute($simplexml, "MaxPersonsOnBoard")) { 
            $element->setMaxPersonsOnBoard((string) $simplexml["MaxPersonsOnBoard"]);
        }
        if ($this->hasAttribute($simplexml, "MaxSpeed")) { 
            $element->setMaxSpeed((string) $simplexml["MaxSpeed"]);
        }
        if ($this->hasAttribute($simplexml, "Width")) { 
            $element->setWidth((string) $simplexml["Width"]);
        }
        return $element;
    }

    private function parseUnType( $simplexml ) {

        $element = new UnType();

        if ($this->hasAttribute($simplexml, "CodeA")) { 
            $element->setCodeA((string) $simplexml["CodeA"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "CodeB")) { 
            $element->setCodeB((string) $simplexml["CodeB"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "Mode")) { 
            $element->setMode((string) $simplexml["Mode"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseIdentifier( $simplexml ) {

        $element = new Identifier();

        for ($i = 0; $i < $this->countOfChild($simplexml, "OtherId"); $i++) { 
            $child = $this->parseOtherId($simplexml->OtherId[$i]);
            $element->addOtherId($child);
        }
        for ($i = 0; $i < $this->countOfChild($simplexml, "OtherName"); $i++) { 
            $child = $this->parseOtherName($simplexml->OtherName[$i]);
            $element->addOtherName($child);
        }
        if ($this->hasAttribute($simplexml, "Callsign")) { 
            $element->setCallsign((string) $simplexml["Callsign"]);
        }
        if ($this->hasAttribute($simplexml, "IMO")) { 
            $element->setIMO((string) $simplexml["IMO"]);
        }
        if ($this->hasAttribute($simplexml, "Name")) { 
            $element->setName((string) $simplexml["Name"]);
        }
        if ($this->hasAttribute($simplexml, "FormerName")) { 
            $element->setFormerName((string) $simplexml["FormerName"]);
        }
        if ($this->hasAttribute($simplexml, "Flag")) { 
            $element->setFlag((string) $simplexml["Flag"]);
        }
        if ($this->hasAttribute($simplexml, "Owner")) { 
            $element->setOwner((string) $simplexml["Owner"]);
        }
        if ($this->hasAttribute($simplexml, "MMSI")) { 
            $element->setMMSI((string) $simplexml["MMSI"]);
        }
        if ($this->hasAttribute($simplexml, "LRIT")) { 
            $element->setLRIT((string) $simplexml["LRIT"]);
        }
        return $element;
    }

    private function parseVoyageData( $simplexml ) {

        $element = new VoyageData();

        for ($i = 0; $i < $this->countOfChild($simplexml, "Waypoint"); $i++) { 
            $child = $this->parseWaypoint($simplexml->Waypoint[$i]);
            $element->addWaypoint($child);
        }
        if ($this->hasAttribute($simplexml, "AirDraught")) { 
            $element->setAirDraught((string) $simplexml["AirDraught"]);
        }
        if ($this->hasAttribute($simplexml, "Id")) { 
            $element->setId((string) $simplexml["Id"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "CargoTypeIMO")) { 
            $element->setCargoTypeIMO((string) $simplexml["CargoTypeIMO"]);
        }
        if ($this->hasAttribute($simplexml, "ContactIdentity")) { 
            $element->setContactIdentity((string) $simplexml["ContactIdentity"]);
        }
        if ($this->hasAttribute($simplexml, "DestCode")) { 
            $element->setDestCode((string) $simplexml["DestCode"]);
        }
        if ($this->hasAttribute($simplexml, "DestName")) { 
            $element->setDestName((string) $simplexml["DestName"]);
        }
        if ($this->hasAttribute($simplexml, "DepartCode")) { 
            $element->setDepartCode((string) $simplexml["DepartCode"]);
        }
        if ($this->hasAttribute($simplexml, "DepartName")) { 
            $element->setDepartName((string) $simplexml["DepartName"]);
        }
        if ($this->hasAttribute($simplexml, "Draught")) { 
            $element->setDraught((string) $simplexml["Draught"]);
        }
        if ($this->hasAttribute($simplexml, "ETA")) { 
            $element->setETA((string) $simplexml["ETA"]);
        }
        if ($this->hasAttribute($simplexml, "ATD")) { 
            $element->setATD((string) $simplexml["ATD"]);
        }
        if ($this->hasAttribute($simplexml, "ISPSLevel")) { 
            $element->setISPSLevel((string) $simplexml["ISPSLevel"]);
        }
        if ($this->hasAttribute($simplexml, "OverSizedLength")) { 
            $element->setOverSizedLength((string) $simplexml["OverSizedLength"]);
        }
        if ($this->hasAttribute($simplexml, "OverSizedWidth")) { 
            $element->setOverSizedWidth((string) $simplexml["OverSizedWidth"]);
        }
        if ($this->hasAttribute($simplexml, "PersonsOnBoard")) { 
            $element->setPersonsOnBoard((string) $simplexml["PersonsOnBoard"]);
        }
        if ($this->hasAttribute($simplexml, "Pilots")) { 
            $element->setPilots((string) $simplexml["Pilots"]);
        }
        if ($this->hasAttribute($simplexml, "RouteBound")) { 
            $element->setRouteBound((string) $simplexml["RouteBound"]);
        }
        if ($this->hasAttribute($simplexml, "SourceId")) { 
            $element->setSourceId((string) $simplexml["SourceId"]);
        }
        if ($this->hasAttribute($simplexml, "SourceName")) { 
            $element->setSourceName((string) $simplexml["SourceName"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "SourceType")) { 
            $element->setSourceType((string) $simplexml["SourceType"]);
        } else { 
            // required attribute is missing
        }
        if ($this->hasAttribute($simplexml, "TankerStatus")) { 
            $element->setTankerStatus((string) $simplexml["TankerStatus"]);
        }
        if ($this->hasAttribute($simplexml, "Tugs")) { 
            $element->setTugs((string) $simplexml["Tugs"]);
        }
        if ($this->hasAttribute($simplexml, "UpdateTime")) { 
            $element->setUpdateTime((string) $simplexml["UpdateTime"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }

    private function parseWaypoint( $simplexml ) {

        $element = new Waypoint();

        if ($this->hasChild($simplexml, "Pos")) { 
            $child = $this->parsePos($simplexml->Pos);
            $element->setPos($child);
        }
        if ($this->hasAttribute($simplexml, "ATA")) { 
            $element->setATA((string) $simplexml["ATA"]);
        }
        if ($this->hasAttribute($simplexml, "ETA")) { 
            $element->setETA((string) $simplexml["ETA"]);
        }
        if ($this->hasAttribute($simplexml, "RTA")) { 
            $element->setRTA((string) $simplexml["RTA"]);
        }
        if ($this->hasAttribute($simplexml, "LoCode")) { 
            $element->setLoCode((string) $simplexml["LoCode"]);
        }
        if ($this->hasAttribute($simplexml, "Name")) { 
            $element->setName((string) $simplexml["Name"]);
        } else { 
            // required attribute is missing
        }
        return $element;
    }


}
?>
