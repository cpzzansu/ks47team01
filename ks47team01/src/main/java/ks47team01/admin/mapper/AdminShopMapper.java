package ks47team01.admin.mapper;

import ks47team01.common.dto.GoodsKit;
import ks47team01.common.dto.GoodsLabel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminShopMapper {

    // 상품라벨관리 체크된 상품라벨 객체 조회
    public GoodsLabel getGoodsLabelObj(String finalCheckedData);

    // 상품라벨관리 라벨 목록 삭제
    public int deleteGoodsLabelList(List<String> finalCheckedDate);

    // 상품라벨관리 라벨 목록 조회
    public List<GoodsLabel> getGoodsLabelList(Map<String, Object> paramMap);

    // 상품관리 체크된 상품 객체 조회
    public GoodsKit getGoodsKitObj(String finalCheckedData);

    // 상품관리 상품 목록 조회
    public List<GoodsKit> getGoodsKitList(Map<String, Object> paramMap);

    // 상품관리 상품 목록 삭제
    public int removeGoodsKitList(List<String> finalCheckedData);
}
