package ks47team01.admin.mapper;

import ks47team01.common.dto.GoodsKit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminShopMapper {
    public GoodsKit getGoodsKitObj(String finalCheckedData);

    // 상품관리 상품 목록 조회
    public List<GoodsKit> getGoodsKitList(Map<String, Object> paramMap);

    // 상품관리 상품 목록 삭제
    public int removeGoodsKitList(List<String> finalCheckedData);



}
