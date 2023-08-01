package ks47team01.admin.service;

import ks47team01.admin.mapper.AdminGoodsMapper;
import ks47team01.common.dto.GoodsBadStock;
import ks47team01.common.dto.GoodsBadStockCategory;
import ks47team01.common.dto.GoodsInventory;
import ks47team01.common.dto.GoodsKit;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminGoodsService {

    private final AdminGoodsMapper adminGoodsMapper;
    public List<GoodsBadStockCategory> adminGoodsBadStockCategoryData(Map<String, Object> paramMap) {
        List<GoodsBadStockCategory> goodsBadStockCategoryList = adminGoodsMapper.getGoodsBadStockCategoryList(paramMap);

        return goodsBadStockCategoryList;
    }

    public List<GoodsBadStock> adminGoodsBadStockData(Map<String, Object> paramMap) {
        List<GoodsBadStock> goodsBadStockList = adminGoodsMapper.getGoodsBadStockList(paramMap);

        return goodsBadStockList;
    }

    public List<GoodsInventory> adminGoodsData(Map<String, Object> paramMap) {
        List<GoodsInventory> goodsList = adminGoodsMapper.getGoodsList(paramMap);

        return goodsList;
    }
}
