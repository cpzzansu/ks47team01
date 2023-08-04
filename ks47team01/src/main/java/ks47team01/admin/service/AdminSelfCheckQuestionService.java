package ks47team01.admin.service;

import ks47team01.admin.mapper.AdminSelfCheckCropsGradeMapper;
import ks47team01.admin.mapper.AdminSelfCheckQuestionMapper;
import ks47team01.common.dto.CropsSelfCheck;
import ks47team01.common.dto.SelfCheckQuestion;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@AllArgsConstructor
@Log4j2
@Service
public class AdminSelfCheckQuestionService {

    private final AdminSelfCheckQuestionMapper adminSelfCheckQuestionMapper;
    private final AdminSelfCheckCropsGradeMapper adminSelfCheckCropsGradeMapper;
    /**
     * 자가검증 질문 등록 처리
     * @param cropsSelfCheck 질문등록 data
     */
    public void insertQuestion(CropsSelfCheck cropsSelfCheck){

        // 기본키 생성
        String cropsSelfCheckCode = adminSelfCheckCropsGradeMapper.autoIncreaseCode("crops_self_check");

        // 기본키 세팅
        cropsSelfCheck.setCropsSelfCheckCode(cropsSelfCheckCode);

        // 등록 처리
        adminSelfCheckQuestionMapper.insertQuestion(cropsSelfCheck);
    }

    /**
     * 자가검증 질문 상세 insert
     * @param selfCheckQuestion 자가검증 질문 상세 입력 data
     */
    public void insertSelfCheckQuestion(SelfCheckQuestion selfCheckQuestion){

        // 기본키 생성
        String selfCheckQuestionCode = adminSelfCheckCropsGradeMapper.autoIncreaseCode("self_check_question");

        // 기본키 세팅
        selfCheckQuestion.setSelfCheckQuestionCode(selfCheckQuestionCode);

        // 등록 처리
        adminSelfCheckQuestionMapper.insertSelfCheckQuestion(selfCheckQuestion);
    }

    /**
     * DataTables 이용 질문 List 가져오기
     * @return 질문List
     */
    public List<CropsSelfCheck> getQuestionList(){

        List<CropsSelfCheck> cropsSelfCheckList = adminSelfCheckQuestionMapper.getQuestionList();

        return cropsSelfCheckList;
    }

    /**
     * 수정할 자가검증 질문 정보 가져오기
     * @param cropsSelfCheckCode 수정할 자가검증 질문 코드
     * @return 수정할 자가검증 질문 DB data
     */
    public CropsSelfCheck getUpdateCropsSelfCheck(String cropsSelfCheckCode){

        CropsSelfCheck cropsSelfCheck = adminSelfCheckQuestionMapper.getUpdateCropsSelfCheck(cropsSelfCheckCode);

        return cropsSelfCheck;
    }

    /**
     * 수정할 상세 질문 리스트 가져오기
     * @param cropsSelfCheckCode FK 자가 검증 질문 코드
     * @return 수정할 상세 질문 리스트
     */
    public List<SelfCheckQuestion> getQuestionDetailList(String cropsSelfCheckCode){

        List<SelfCheckQuestion> selfCheckQuestionList = adminSelfCheckQuestionMapper.getQuestionDetailList(cropsSelfCheckCode);

        return selfCheckQuestionList;
    }

}
