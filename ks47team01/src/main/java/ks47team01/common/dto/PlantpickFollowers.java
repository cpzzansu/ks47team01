package ks47team01.common.dto;

import lombok.Data;

@Data
public class PlantpickFollowers {
	
	//db보고 만듦
	private String plantpickFollowersCode;
	private String urbanfarmerFollowerId;
	private String urbanfarmerId;
	private String plantpickFollowersRegDate;
	
	private Urbanfarmer urbanfarmer;
	
	
}
