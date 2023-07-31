package ks47team01.admin.mapper;

import ks47team01.common.dto.CropsSelfCheck;
import ks47team01.common.dto.SelfCheckQuestion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminSelfCheckQuestionMapper {

    /**
     * 자가검증 질문 등록 처리
     * @param cropsSelfCheck 질문등록 data
     */
    public void insertQuestion(CropsSelfCheck cropsSelfCheck);

    /**
     * 자가검증 질문 상세 등록
     * @param selfCheckQuestion 자가검증 질문 상세 입력 data
     */
    public void insertSelfCheckQuestion(SelfCheckQuestion selfCheckQuestion);

    /**
     * 자가검증 질문 리스트 가져오기
     * @return 자가검증 질문 리스트
     */
    public List<CropsSelfCheck> getQuestionList();

    /**
     * 수정할 자가검증 질문 DB data 가져오기
     * @param cropsSelfCheckCode 수정할 자가검증 질문 code
     * @return 수정할 자가검증 질문 DB data
     */
    public CropsSelfCheck getUpdateCropsSelfCheck(String cropsSelfCheckCode);

    /**
     * 수정할 상세 질문 리스트 가져오기
     * @param cropsSelfCheckCode FK 자가 검증 질문
     * @return 수정할 상세 질문 리스트
     */
    public List<SelfCheckQuestion> getQuestionDetailList(String cropsSelfCheckCode);

}
