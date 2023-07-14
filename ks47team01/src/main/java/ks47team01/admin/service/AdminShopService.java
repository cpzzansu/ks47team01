package ks47team01.admin.service;

import ks47team01.admin.mapper.AdminMapper;
import ks47team01.admin.mapper.AdminShopMapper;
import ks47team01.common.dto.GoodsKit;
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

    /**
     * 상품관리메인화면 키트상품목록 조회
     */
    public List<GoodsKit> getGoodsKitList(Map<String, Object> paramMap) {
        List<GoodsKit> goodsKitList = adminShopMapper.getGoodsKitList(paramMap);

        return goodsKitList;
    }

}
