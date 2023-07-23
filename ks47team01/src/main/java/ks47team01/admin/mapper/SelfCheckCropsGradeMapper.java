package ks47team01.admin.mapper;

import ks47team01.common.dto.SelfCheckCropsGrade;
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

}
