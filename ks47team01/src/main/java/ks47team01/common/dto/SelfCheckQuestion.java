package ks47team01.common.dto;

import lombok.Data;

@Data
public class SelfCheckQuestion {

    private String selfCheckQuestionCode;
    private String urbanfarmAdminId;
    private String cropsSelfCheckCode;
    private String cropsNameCode;
    private String cropsName;
    private String selfCheckQuestionTitleContent;
    private String selfCheckQuestionPremiumCheck;
    private String selfCheckQuestionSuperiorCheck;
    private String selfCheckQuestionRegularCheck;
    private String selfCheckQuestionOrder;
    private String selfCheckQuestionRegDate;

}
