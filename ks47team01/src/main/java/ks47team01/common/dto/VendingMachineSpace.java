package ks47team01.common.dto;

import lombok.Data;

@Data
public class VendingMachineSpace {
	private final String vending_machine_space_code;
	private final String urbanfarm_hub_crew_id;
	private final String urbanfarm_hub_code;
	private final String vending_machine_code;
	private final String vending_machine_name;
	private final int vending_machine_space_number;
	private final int vending_machine_space_price;
	private final String vending_machine_space_state_code;
	private final String vending_machine_space_reg_date;
	private final String vending_machine_space_state;
}
