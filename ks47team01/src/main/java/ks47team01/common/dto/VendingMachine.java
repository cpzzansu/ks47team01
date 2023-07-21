package ks47team01.common.dto;

import lombok.Data;

@Data
public class VendingMachine {

	private String vendingMachineCode;
	private String urbanfarmHubCrewId;
	private String urbanfarmHubCode;
	private String vendingMachineName;
	private int vendingMachineSpaceUsing;
	private int vendingMachineSpaceMax;
	private String vendingMachineStateCode;
	private String vendingMachineState;
	private String vendingMachineRegDate;
}
