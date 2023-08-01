package ks47team01.common.dto;

import lombok.Data;

@Data
public class GoodsBadStock {
    private String goodsKitBadStockCode;
    private String goodsKitCode;
    private String urbanKitName;
    private int goodsKitBadStockAmount;
    private String goodsKitBadStockReasonCateCode;
    private String goodsKitBadStockActionTaken;
    private String goodsKitInventoryIncommingCode;
    private String urbanFarmAdminId;
    private String goodsKitBadStockRegDate;
}
