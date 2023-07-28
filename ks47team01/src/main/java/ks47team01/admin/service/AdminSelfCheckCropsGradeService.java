package ks47team01.admin.service;

import ks47team01.admin.mapper.SelfCheckCropsGradeMapper;
import ks47team01.common.dto.SelfCheckCropsGrade;
import ks47team01.common.dto.UrbanKit;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@AllArgsConstructor
@Log4j2
@Service
public class AdminSelfCheckCropsGradeService {

    private SelfCheckCropsGradeMapper selfCheckCropsGradeMapper;

    /**
     * 관리자 - 자가검증 상품 등급 등록 실행 메서드
     * @param selfCheckCropsGrade 자가검증 상품 등급 등록 화면에서 입력받은 정보를 담은 객체
     */
    public void addCropsGrade(SelfCheckCropsGrade selfCheckCropsGrade){

        // 기본키 생성
        String selfCheckCropsGradeCode = selfCheckCropsGradeMapper.autoIncreaseCode("self_check_crops_grade");

        // 기본키 세팅
        selfCheckCropsGrade.setSelfCheckCropsGradeCode(selfCheckCropsGradeCode);

        // 등록 메서드 호출
        selfCheckCropsGradeMapper.addCropsGrade(selfCheckCropsGrade);

    }

    /**
     * 관리자 - DataTables data 상품 등급 객체 리스트 호출 메서드
     * @return 상품 등급 객체 리스트
     */
    public List<SelfCheckCropsGrade> dataProductGrade(){

        // 상품 등급 목록 리스트
        List<SelfCheckCropsGrade> dataProductGrade = selfCheckCropsGradeMapper.dataProductGrade();

        return dataProductGrade;
    }

    /**
     * 상품등급 코드로 상품등급 정보 객체 가져오는 메서드
     * @param selfCheckCropsGradeCode 가져올 상품등급 정보
     * @return 입력한 코드의 상품정보 객체
     */
    public SelfCheckCropsGrade getProductGradeByCode(String selfCheckCropsGradeCode) {

        SelfCheckCropsGrade selfCheckCropsGrade = selfCheckCropsGradeMapper.getProductGradeByCode(selfCheckCropsGradeCode);

        return selfCheckCropsGrade;
    }

    /**
     * 상품등급 수정처리 메서드
     * @param selfCheckCropsGrade 수정 할 상품정보 객체
     */
    public void updateProductGrade(SelfCheckCropsGrade selfCheckCropsGrade){

        selfCheckCropsGradeMapper.updateProductGrade(selfCheckCropsGrade);

    }

    /**
     * 상품등급 삭제처리 메서드
     * @param deleteCodeList 삭제할 상품정보 코드 리스트
     */
    public void deleteProductGrade(List<String> deleteCodeList){

        selfCheckCropsGradeMapper.deleteProductGrade(deleteCodeList);
    }

    /**
     * 전체 키트 리스트 가져오는 메서드
     * @return 전체 키트 리스트
     */
    public List<UrbanKit> getKitList(){

        List<UrbanKit> kitList = selfCheckCropsGradeMapper.getKitList();

        return kitList;
    }

    /**
     * 검색한 키트 리스트를 가져오는 메서드
     * @param searchColumn 검색한 열
     * @param searchValue 검색한 값
     * @return 검색된 키트 객체 리스트
     */
    public List<UrbanKit> searchKitList(String searchColumn, String searchValue){

        List<UrbanKit> searchKitList = selfCheckCropsGradeMapper.searchKitList(searchColumn, searchValue);

        return searchKitList;
    }


}
