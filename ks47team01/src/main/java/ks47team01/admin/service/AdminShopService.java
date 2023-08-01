package ks47team01.admin.service;

import ks47team01.admin.mapper.UrbanfarmAdminMapper;
import ks47team01.admin.mapper.AdminShopMapper;
import ks47team01.common.dto.GoodsKit;
import ks47team01.common.dto.GoodsLabel;
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
public class AdminShopService {

    private final AdminShopMapper adminShopMapper;

    public GoodsLabel getGoodsLabelObj(String finalCheckedData) {
        GoodsLabel goodsLabelObj = adminShopMapper.getGoodsLabelObj(finalCheckedData);

        return goodsLabelObj;
    }

    public void deleteGoodsLabelList(List<String> finalCheckedData) {
        adminShopMapper.deleteGoodsLabelList(finalCheckedData);
    }

    public List<GoodsLabel> getGoodsLabelList(Map<String, Object> paramMap) {
        List<GoodsLabel> goodsLabelList = adminShopMapper.getGoodsLabelList(paramMap);

        return goodsLabelList;
    }

    public GoodsKit getGoodsKitObj(String finalCheckedData) {
        GoodsKit goodsKitObj = adminShopMapper.getGoodsKitObj(finalCheckedData);

        return goodsKitObj;
    }

    /**
     * 상품관리메인화면 키트상품목록 조회
     * @param paramMap
     * @return
     */
    public List<GoodsKit> getGoodsKitList(Map<String, Object> paramMap) {
        List<GoodsKit> goodsKitList = adminShopMapper.getGoodsKitList(paramMap);

        return goodsKitList;
    }

    /**
     * 상품관리메인화면 키트상품목록 삭제
     * @param finalCheckedData
     */
    public void removeGoodsKitList(List<String> finalCheckedData) {
        adminShopMapper.removeGoodsKitList(finalCheckedData);
    }

}
