package ks47team01.common.dto;

import lombok.Data;

@Data
public class VendingMachine {

	private String vendingMachineId;
	private String urbanfarmHubCrewId;
	private String urbanfarmHubId;
	private String vendingMachineName;
	private int vendingMachineSpaceUsing;
	private int vendingMachineSpaceMax;
	private String vendingMachineStateId;
	private String vendingMachineState;
	private String vendingMachineRegDate;
}
