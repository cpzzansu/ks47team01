package ks47team01.admin.mapper;

import ks47team01.common.dto.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminOrderMapper {
    public List<Order> getOrderList(Map<String, Object> paramMap);
}
