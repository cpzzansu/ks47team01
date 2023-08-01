package ks47team01.common.dto;

import lombok.Data;

@Data
public class Order {
    private String goodsKitOrderCode;
    private String urbanfarmerId;
    private String goodsKitCode;
    private int goodsKitOrderTotalAmount;
    private String goodsKitOrderPaymentStatus;
    private String goodsKitOrderShippingStatus;
    private String goodsKitOrderRegDate;
}
