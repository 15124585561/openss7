/* This file was generated by mib2c and is intended for use as a mib module
  for the ucd-snmp snmpd agent. */

#ifndef _MIBGROUP_M3UAASPMIB_SIMPLE_H
#define _MIBGROUP_M3UAASPMIB_SIMPLE_H

/* we may use header_generic and header_simple_table from the util_funcs module */

config_require(util_funcs)

/* function prototypes */
	void init_m3uaAspMIB_simple(void);
	FindVarMethod var_m3uaAspMIB_simple;
	FindVarMethod var_m3uaAspTable;
	FindVarMethod var_m3uaAspAgTable;
	FindVarMethod var_m3uaAspSgTable;
	FindVarMethod var_m3uaAspSgpTable;
	FindVarMethod var_m3uaAspSpTable;
	FindVarMethod var_m3uaAspMtTable;
	FindVarMethod var_m3uaAspRsTable;
	FindVarMethod var_m3uaAspRlTable;
	FindVarMethod var_m3uaAspRtTable;
	FindVarMethod var_m3uaAspRcTable;
	FindVarMethod var_m3uaAspAsTable;
	FindVarMethod var_m3uaAspAfTable;

	WriteMethod write_m3uaAspName;
	WriteMethod write_m3uaAspAdministrativeState;
	WriteMethod write_m3uaAspCapabilities;
	WriteMethod write_m3uaAspIdPolicy;
	WriteMethod write_m3uaAspRegistrationPolicy;
	WriteMethod write_m3uaAspAssociationPolicy;
	WriteMethod write_m3uaAspStatus;
	WriteMethod write_m3uaAspAgProtocolVersion;
	WriteMethod write_m3uaAspAgOptions;
	WriteMethod write_m3uaAspAgRegistrationPolicy;
	WriteMethod write_m3uaAspAgAspIdPolicy;
	WriteMethod write_m3uaAspAgAspProtocolPayloadId;
	WriteMethod write_m3uaAspAgIpPort;
	WriteMethod write_m3uaAspAgMinOstreams;
	WriteMethod write_m3uaAspAgMaxIstreams;
	WriteMethod write_m3uaAspAgTimerT7;
	WriteMethod write_m3uaAspAgTimerT19;
	WriteMethod write_m3uaAspAgTimerT21;
	WriteMethod write_m3uaAspAgTimerT25A;
	WriteMethod write_m3uaAspAgTimerT28A;
	WriteMethod write_m3uaAspAgTimerT29A;
	WriteMethod write_m3uaAspAgTimerT30A;
	WriteMethod write_m3uaAspAgStatus;
	WriteMethod write_m3uaAspSgName;
	WriteMethod write_m3uaAspSgAdministrativeState;
	WriteMethod write_m3uaAspSgAspState;
	WriteMethod write_m3uaAspSgMaxInitRetrans;
	WriteMethod write_m3uaAspSgMaxLifeTime;
	WriteMethod write_m3uaAspSgTimerT1;
	WriteMethod write_m3uaAspSgTimerT2;
	WriteMethod write_m3uaAspSgTimerT3;
	WriteMethod write_m3uaAspSgTimerT4;
	WriteMethod write_m3uaAspSgTimerT5;
	WriteMethod write_m3uaAspSgTimerT17;
	WriteMethod write_m3uaAspSgTimerT19A;
	WriteMethod write_m3uaAspSgTimerT24;
	WriteMethod write_m3uaAspSgTimerT31A;
	WriteMethod write_m3uaAspSgTimerT32A;
	WriteMethod write_m3uaAspSgTimerT33A;
	WriteMethod write_m3uaAspSgTimerT34A;
	WriteMethod write_m3uaAspSgTimerT1T;
	WriteMethod write_m3uaAspSgTimerT2T;
	WriteMethod write_m3uaAspSgpName;
	WriteMethod write_m3uaAspSgpAdministrativeState;
	WriteMethod write_m3uaAspSgpAspState;
	WriteMethod write_m3uaAspSgpPrimaryAddress;
	WriteMethod write_m3uaAspSgpHostName;
	WriteMethod write_m3uaAspSgpStatus;
	WriteMethod write_m3uaAspSpName;
	WriteMethod write_m3uaAspSpAdministrativeState;
	WriteMethod write_m3uaAspSpAlarmStatus;
	WriteMethod write_m3uaAspSpPointCode;
	WriteMethod write_m3uaAspSpTimerT1R;
	WriteMethod write_m3uaAspSpTimerT18;
	WriteMethod write_m3uaAspSpTimerT20;
	WriteMethod write_m3uaAspSpTimerT22A;
	WriteMethod write_m3uaAspSpTimerT23A;
	WriteMethod write_m3uaAspSpTimerT24A;
	WriteMethod write_m3uaAspSpTimerT26A;
	WriteMethod write_m3uaAspSpTimerT27A;
	WriteMethod write_m3uaAspSpStatus;
	WriteMethod write_m3uaAspMtName;
	WriteMethod write_m3uaAspMtAdministrativeState;
	WriteMethod write_m3uaAspMtAsState;
	WriteMethod write_m3uaAspMtStatus;
	WriteMethod write_m3uaAspRsAdministrativeState;
	WriteMethod write_m3uaAspRsAlarmStatus;
	WriteMethod write_m3uaAspRlCost;
	WriteMethod write_m3uaAspRlAdministrativeState;
	WriteMethod write_m3uaAspRcValue;
	WriteMethod write_m3uaAspRcRegstrationPolicy;
	WriteMethod write_m3uaAspRcTrafficMode;
	WriteMethod write_m3uaAspRcStatus;
	WriteMethod write_m3uaAspAfAsState;
	WriteMethod write_m3uaAspAfAdministrativeState;

#endif				/* _MIBGROUP_M3UAASPMIB_SIMPLE_H */