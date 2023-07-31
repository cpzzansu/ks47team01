package ks47team01.common.dto;

import lombok.Data;

@Data
public class GoodsInventory {
    private String goodsKitInventoryCode;
    private String goodsKitCode;
    private String urbanKitName;
    private String urbanfarmAdminId;
    private int goodsKitInventoryTotalAmount;
    private String goodsKitInventoryRegDate;
}
