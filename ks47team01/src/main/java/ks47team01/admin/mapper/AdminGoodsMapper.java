package ks47team01.admin.mapper;

import ks47team01.common.dto.GoodsBadStock;
import ks47team01.common.dto.GoodsBadStockCategory;
import ks47team01.common.dto.GoodsInventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminGoodsMapper {
    public List<GoodsBadStockCategory> getGoodsBadStockCategoryList(Map<String, Object> paramMap);

    public List<GoodsBadStock> getGoodsBadStockList(Map<String, Object> paramMap);

    public List<GoodsInventory> getGoodsList(Map<String, Object> paramMap);

}
