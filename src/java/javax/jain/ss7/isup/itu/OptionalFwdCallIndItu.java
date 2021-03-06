/*
 @(#) src/java/javax/jain/ss7/isup/itu/OptionalFwdCallIndItu.java <p>
 
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

package javax.jain.ss7.isup.itu;

import javax.jain.ss7.isup.*;
import javax.jain.ss7.*;
import javax.jain.*;

/** A class representing the ITU ISUP Optional Forward Call Indicators.
  * This class provides the methods to access the ITU only sub-fields in the optional
  * forward call indicators parameter.
  * @version 1.2.2
  * @author Monavacon Limited
  */
public class OptionalFwdCallIndItu implements java.io.Serializable {
    public static final byte CUGCI_NON_CUG_CALL = 0;
    public static final byte CUGCI_CUG_CALL_OUTGOING_ACCESS_ALLOWED = 2;
    public static final byte CUGCI_CUG_CALL_OUTGOING_ACCESS_NOT_ALLOWED = 3;
    public static final boolean SSI_NO_ADDITIONAL_INFORMATION = false;
    public static final boolean SSI_ADDITIONAL_INFORMATION_SENT_IN_SEGMENTATION = true;
    public static final boolean CLIRI_NOT_REQUESTED = false;
    public static final boolean CLIRI_REQUESTED = true;
    /** Constructs a new Itu Optional Forward Call Indicators.  */
    public OptionalFwdCallIndItu() {
    }
    /** Constructs an ITU OptionalBwdInd class from the input parameters specified.
      * @param in_cugCallInd  The closed user group call indicator, range 0 to 3. <ul>
      * <li>CUGCI_NON_CUG_CALL, <li>CUGCI_CUG_CALL_OUTGOING_ACCESS_ALLOWED and
      * <li>CUGCI_CUG_CALL_OUTGOING_ACCESS_NOT_ALLOWED. </ul>
      * @param in_segInd  The simple segmentation indicator. <ul>
      * <li>SSI_NO_ADDITIONAL_INFORMATION and
      * <li>SSI_ADDITIONAL_INFORMATION_SENT_IN_SEGMENTATION. </ul>
      * @param in_colrInd  The the connected line identity request indicator. <ul>
      * <li>CLIRI_NOT_REQUESTED and <li>CLIRI_REQUESTED. </ul>
      * @exception ParameterRangeInvalidException - Thrown when value is out of range.
      */
    public OptionalFwdCallIndItu(byte in_cugCallInd, boolean in_segInd,
            boolean in_colrInd)
        throws ParameterRangeInvalidException {
        this.setClosedUserGroupCallInd(in_cugCallInd);
        this.setSegmentationInd(in_segInd);
        this.setConnectedLineIdentityReqInd(in_colrInd);
    }
    /** Gets the Closed User Group Call Indicator field of the parameter.
      * @return The Closed User Group Call Indicator value, range 0 to 3, see
      * OptionalFwdCallIndItu().
      */
    public byte getClosedUserGroupCallInd() {
        return m_CUGcallInd;
    }
    /** Sets the Closed User Group Call Indicator field of the parameter.
      * @param CUGcallInd  The Closed User Group call Indicator value, range 0 to 3, see
      * OptionalFwdCallIndItu().
      * @exception ParameterRangeInvalidException  Thrown when value is out of range.
      */
    public void setClosedUserGroupCallInd(byte CUGcallInd)
        throws ParameterRangeInvalidException {
        if (0 <= CUGcallInd && CUGcallInd <= 3) {
            m_CUGcallInd = CUGcallInd;
            return;
        }
        throw new ParameterRangeInvalidException("ClosedUserGroupCallInd value " + CUGcallInd + " out of range.");
    }
    /** Gets the Simple Segmentation Indicator field of the parameter.
      * @return Boolean containing the SimpleSegmentation value, see
      * OptionalFwdCallIndItu().
      */
    public boolean getSegmentationInd() {
        return m_simpleSegmentation;
    }
    /** Sets the Simple Segmentation Indicator field of the parameter.
      * @param aSimpleSegmentation  The SimpleSegmentation value, see
      * OptionalFwdCallIndItu().
      */
    public void setSegmentationInd(boolean aSimpleSegmentation) {
        m_simpleSegmentation = aSimpleSegmentation;
    }
    /** Gets the Connected Line Identity Request Indicator field of the parameter.
      * @return The COLR Ind value, see OptionalFwdCallIndItu().
      */
    public boolean getConnectedLineIdentityReqInd() {
        return m_COLRInd;
    }
    /** Sets the Connected Line Identity Request Indicator field of the parameter.
      * @param aCOLRInd  The Connected Line Identity Request Indicator value, see
      * OptionalFwdCallIndItu().
      */
    public void setConnectedLineIdentityReqInd(boolean aCOLRInd) {
        m_COLRInd = aCOLRInd;
    }
    /** The toString method retrieves a string containing the values of the members of the
      * OptionalFwdCallIndItu class.
      * @return A string representation of the member variables.
      */
    public java.lang.String toString() {
        StringBuffer b = new StringBuffer(512);
        b.append(super.toString());
        b.append("\njavax.jain.ss7.isup.itu.OptionalFwdCallIndItu");
        b.append("\n\tm_CUGcallInd: " + m_CUGcallInd);
        b.append("\n\tm_simpleSegmentation: " + m_simpleSegmentation);
        b.append("\n\tm_COLRInd: " + m_COLRInd);
        return b.toString();
    }
    protected byte m_CUGcallInd;
    protected boolean m_simpleSegmentation;
    protected boolean m_COLRInd;
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
