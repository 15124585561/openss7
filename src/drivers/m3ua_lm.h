/*****************************************************************************

 @(#) src/drivers/m3ua_lm.h

 -----------------------------------------------------------------------------

 Copyright (c) 2008-2015  Monavacon Limited <http://www.monavacon.com/>
 Copyright (c) 2001-2008  OpenSS7 Corporation <http://www.openss7.com/>
 Copyright (c) 1997-2001  Brian F. G. Bidulock <bidulock@openss7.org>

 All Rights Reserved.

 This program is free software; you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation; version 3 of the License.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more
 details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>, or
 write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA.

 -----------------------------------------------------------------------------

 U.S. GOVERNMENT RESTRICTED RIGHTS.  If you are licensing this Software on
 behalf of the U.S. Government ("Government"), the following provisions apply
 to you.  If the Software is supplied by the Department of Defense ("DoD"), it
 is classified as "Commercial Computer Software" under paragraph 252.227-7014
 of the DoD Supplement to the Federal Acquisition Regulations ("DFARS") (or any
 successor regulations) and the Government is acquiring only the license rights
 granted herein (the license rights customarily provided to non-Government
 users).  If the Software is supplied to any unit or agency of the Government
 other than DoD, it is classified as "Restricted Computer Software" and the
 Government's rights in the Software are defined in paragraph 52.227-19 of the
 Federal Acquisition Regulations ("FAR") (or any successor regulations) or, in
 the cases of NASA, in paragraph 18.52.227-86 of the NASA Supplement to the FAR
 (or any successor regulations).

 -----------------------------------------------------------------------------

 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See http://www.openss7.com/

 *****************************************************************************/

#ifndef __M3UA_LM_H__
#define __M3UA_LM_H__

/*
 *  =========================================================================
 *
 *  M3UA --> LM	(Upstream Primitives to Layer Management)
 *
 *  =========================================================================
 */
/*
 *  LM_LINK_IND
 *  -------------------------------------------------------------------------
 *  This is the bottom half of pass-through control of any of the links under
 *  the multiplexor from the configuration daemon stream.
 */
static __inline__ int
lm_link_ind(queue_t *q, mblk_t *dp)
{
	mblk_t *mp;
	lm_link_ind_t *p;
	lp_t *lp = (lp_t *) q->q_ptr;

	if ((mp = allocb(sizeof(*p), BPRI_MED))) {
		mp->b_datap->db_type = dp->b_datap->db_type;
		p = (lm_link_ind_t *) mp->b_wptr;
		p->primitive = LM_EVENT_IND;
		p->muxid = lp->muxid;
		p->type = lp->type;
		p->mode = lp->mode;
		p->class = lp->class;
		mp->b_wptr += sizeof(*p);
		mp->b_cont = dp;
		pullmsg(mp, -1);
		m3ua_u_rput(m3ua_lmq, mp);
		return (0);
	}
	return (-ENOBUFS);
}

/*
 *  M_NOTIFY_IND
 *  -------------------------------------------------------------------------
 */
static __inline__ mblk_t *
m3_notify_ind(void)
{
	mblk_t *mp;
	m3_notify_ind_t *p;

	if ((mp = allocb(sizeof(*p), BPRI_MED))) {
		mp->b_datap->db_type = M_PCPROTO;
		p = (m3_notify_ind_t *) mp->b_wptr;
		p->primitive = M3_NOTIFY_IND;
		/* 
		 *  FIXME: do some more...
		 */
		mp->b_wptr += sizeof(*p);
	}
	return (mp);
}

/*
 *  M_ERROR_IND
 *  -------------------------------------------------------------------------
 */
static __inline__ mblk_t *
m3_error_ind(void)
{
	mblk_t *mp;
	m3_error_ind_t *p;

	if ((mp = allocb(sizeof(*p), BPRI_MED))) {
		mp->b_datap->db_type = M_PCPROTO;
		p = (m3_error_ind_t *) mp->b_wptr;
		p->primitive = M3_ERROR_IND;
		/* 
		 *  FIXME: do some more...
		 */
		mp->b_wptr += sizeof(*p);
	}
	return (mp);
}

/*
 *  M_LINK_NOTIFY_IND
 */

/*
 *  LM_AS_EVENT_IND
 *  -------------------------------------------------------------------------
 */
static __inline__ int
lm_as_event_ind(uint muxid, uint event, uint asid, uint aspid)
{
	mblk_t *mp;
	LM_as_event_ind_t *p;

	if ((mp = allocb(sizeof(*p), BPRI_MED))) {
		mp->b_datap->db_type = M_PROTO;
		p = (LM_as_event_ind_t *) mp->b_wptr;
		p->PRIM_type = LM_AS_EVENT_IND;
		p->MUX_identifier = muxid;
		p->AS_identifier = asid;
		p->ASP_identifier = aspid;
		mp->b_wptr += sizeof(*p);
		m3ua_u_rput(m3ua_lmq, mp);
		return (0);
	}
	return (-ENOBUFS);
}

#endif				/* __M3UA_LM_H__ */
