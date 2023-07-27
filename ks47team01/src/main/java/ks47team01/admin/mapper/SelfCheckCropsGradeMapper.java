package ks47team01.admin.mapper;

import ks47team01.common.dto.SelfCheckCropsGrade;
import ks47team01.common.dto.UrbanKit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelfCheckCropsGradeMapper {

    /**
     * 기본키 자동증가
     * @param tableName 테이블 명
     * @return 자동증가된 기본키 값
     */
    public String autoIncreaseCode(String tableName);


    /**
     * 상품 등급 등록 메서드
     * @param selfCheckCropsGrade
     * @return
     */
    public int addCropsGrade(SelfCheckCropsGrade selfCheckCropsGrade);

    /**
     * 상품 등급 목록 리스트 매퍼 메서드
     * @return 상품 등급 객체 리스트
     */
    public List<SelfCheckCropsGrade> dataProductGrade();

    /**
     * 상품등급 코드로 해당 상품등급 정보 가져오는 메서드
     * @param selfCheckCropsGradeCode 가져올 상품등급 코드
     * @return 수정할 상품등급 정보
     */
    public SelfCheckCropsGrade getProductGradeByCode(String selfCheckCropsGradeCode);

    /**
     * 상품등급 수정처리 메서드
     * @param selfCheckCropsGrade 수정처리 할 상품등급 정보
     */
    public void updateProductGrade(SelfCheckCropsGrade selfCheckCropsGrade);

    /**
     * 상품등급 삭제처리 메서드
     * @param deleteCodeList 삭제할 상품등급 코드 리스트
     */
    public void deleteProductGrade(List<String> deleteCodeList);

    /**
     * 키트 리스트 가져오는 메서드
     * @return 키트 리스트
     */
    public List<UrbanKit> getKitList();

    /**
     * 검색해서 키트 리스트 가져오는 메서드
     * @param searchColumn 검색할 열
     * @param searchValue 검색할 값
     * @return
     */
    public List<UrbanKit> searchKitList(String searchColumn, String searchValue);


}
