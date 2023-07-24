package ks47team01.admin.service;

import ks47team01.admin.mapper.SelfCheckCropsGradeMapper;
import ks47team01.common.dto.SelfCheckCropsGrade;
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
}
