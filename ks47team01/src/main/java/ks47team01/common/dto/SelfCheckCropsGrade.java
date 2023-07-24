package ks47team01.common.dto;

import lombok.Data;

@Data
public class SelfCheckCropsGrade {

    private String selfCheckCropsGradeCode;
    private String urbanfarmAdminId;
    private String productGrade;
    private int productHighGrade;
    private int productLowGrade;
    private String selfCheckCropsGradeRegDate;

}
