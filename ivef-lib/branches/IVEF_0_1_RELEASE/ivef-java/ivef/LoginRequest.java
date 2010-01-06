/* 
 *  LoginRequest
 *
 *  LoginRequest is free software: you can redistribute it and/or modify
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
 *  Generated by xsd2code on Wed Jan 6 14:24:23 2010.
 **********************************************************************************
 *  Copyright 2008
 *
 */

package ivef;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class LoginRequest { 

    private String m_name; // default value is uninitialized
    private String m_password; // default value is uninitialized
    private int m_encryption; // default value is uninitialized

    public LoginRequest() {

    }

    public LoginRequest(LoginRequest val) {

        m_name = val.getName();
        m_password = val.getPassword();
        m_encryption = val.getEncryption();
    }

    public void setName(String val) {

        m_name = val;
    }

    public String getName() {

        return m_name;
    }

    public void setPassword(String val) {

        m_password = val;
    }

    public String getPassword() {

        return m_password;
    }

    public void setEncryption(int val) {

        if ( ( val != 1 ) &&
             ( val != 2 ) )
            return;
        m_encryption = val;
    }

    public int getEncryption() {

        return m_encryption;
    }

    public String toXML() {

        String xml = "<LoginRequest";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        xml += " Name=\"" + encode( m_name) + "\"";
        xml += " Password=\"" + encode( m_password) + "\"";
        xml += " Encryption=\"" + m_encryption + "\"";
        xml += ">\n";
        xml += "</LoginRequest>\n";
        return xml;
    }

    public String toString(String lead) {

        String str = lead + "LoginRequest\n";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

        str +=  lead + "    Name = " + m_name + "\n";
        str +=  lead + "    Password = " + m_password + "\n";
        str +=  lead + "    Encryption = " + m_encryption + "\n";
        return str;
    }
    public String encode( String str) {

        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\"", "&quot;");
        return str;
    }


}
