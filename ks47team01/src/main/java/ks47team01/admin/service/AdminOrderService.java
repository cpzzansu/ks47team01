package ks47team01.admin.service;

import ks47team01.admin.mapper.AdminOrderMapper;
import ks47team01.common.dto.Order;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminOrderService {

    private final AdminOrderMapper adminOrderMapper;

    public List<Order> adminOrderData(Map<String, Object> paramMap) {
        List<Order> orderList = adminOrderMapper.getOrderList(paramMap);

        return orderList;
    }
}
