package ks47team01.common.dto;

import lombok.Data;

@Data
public class GoodsKit {
    private String goodsKitCode;
    private String urbanfarmAdminId;
    private String urbanKitCode;
    private String urbanKitName;
    private String goodsKitTitle;
    private String goodsKitContents;
    private int goodsKitPrice;
    private String goodsKitDeliveryDate;
    private String goodsKitRegDate;
}
