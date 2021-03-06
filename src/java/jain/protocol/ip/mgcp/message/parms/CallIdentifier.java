// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*
 @(#) src/java/jain/protocol/ip/mgcp/message/parms/CallIdentifier.java <p>
 
 Copyright &copy; 2008-2015  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a>
 */

package jain.protocol.ip.mgcp.message.parms;

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*

   Overview  Package   Class  Tree  Index  Help
   JAIN^TM MGCP API (Final Release) - Version 1.0
    PREV CLASS   NEXT CLASS FRAMES    NO FRAMES
   SUMMARY:  INNER | FIELD | CONSTR | METHOD DETAIL:
   FIELD | CONSTR | METHOD
     _________________________________________________________________

jain.protocol.ip.mgcp.message.parms
Class CallIdentifier

java.lang.Object
  |
  +--jain.protocol.ip.mgcp.message.parms.CallIdentifier

   All Implemented Interfaces:
          java.io.Serializable
     _________________________________________________________________

   public final class CallIdentifier
   extends java.lang.Object
   implements java.io.Serializable

   Specifies the globally unique call identifier for the call of which
   this connection is a part.

   See Also: 
          Serialized Form
     _________________________________________________________________

   Constructor Summary
   CallIdentifier(java.lang.String callIdentifier)
             Constructs a new Call Identifier object, setting the string
   that designates the Call Identifier.



   Method Summary
    void setCallIdentifier(java.lang.String callIdentifier)
             Sets the Call Identifier.
    java.lang.String toString()
             The Call Identifier, as a java.lang.String.



   Methods inherited from class java.lang.Object
   clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait,
   wait, wait



   Constructor Detail

  CallIdentifier

public CallIdentifier(java.lang.String callIdentifier)
               throws java.lang.IllegalArgumentException

          Constructs a new Call Identifier object, setting the string
          that designates the Call Identifier.

        Parameters:
                callIdentifier - A string that designates the Call
                Identifier.

        Throws:
                java.lang.IllegalArgumentException - Indicates that the
                java.lang.String used to instantiate the Call Identifier does not
                contain between 1 and 32 hexadecimal digits.

   Method Detail

  setCallIdentifier

public void setCallIdentifier(java.lang.String callIdentifier)
                       throws java.lang.IllegalArgumentException

          Sets the Call Identifier.

        Parameters:
                callIdentifier - A string that designates the Call
                Identifier.

        Throws:
                java.lang.IllegalArgumentException - Indicates that the
                java.lang.String used to instantiate the Call Identifier does not
                contain between 1 and 32 hexadecimal digits.
     _________________________________________________________________

  toString

public java.lang.String toString()

          The Call Identifier, as a java.lang.String.

        Overrides:
                toString in class java.lang.Object

        Returns:
                A string that designates the Call Identifier.
     _________________________________________________________________

   Overview  Package   Class  Tree  Index  Help
   JAIN^TM MGCP API (Final Release) - Version 1.0
    PREV CLASS   NEXT CLASS FRAMES    NO FRAMES
   SUMMARY:  INNER | FIELD | CONSTR | METHOD DETAIL:
   FIELD | CONSTR | METHOD
     _________________________________________________________________

                  Copyright (C) 2000 Sun Microsystems, Inc.
*/
