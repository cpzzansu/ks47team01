package ks47team01.admin.controller;

import jakarta.servlet.http.HttpSession;
import ks47team01.admin.service.AdminSelfCheckCropsGradeService;
import ks47team01.common.dto.CropsName;
import ks47team01.common.dto.CropsSelfCheck;
import ks47team01.common.dto.SelfCheckCropsGrade;
import ks47team01.common.dto.UrbanKit;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Log4j2
@Controller
@AllArgsConstructor
@RequestMapping("/adminSelfCheck")
public class AdminSelfCheckController {

    private AdminSelfCheckCropsGradeService adminSelfCheckCropsGradeService;

    /**
     * 관리자 - 자가검증 질문 등록 화면 이동
     * @param model title=화면제목
     * @return admin_self_check_question/add_verification_question
     */
    @GetMapping("/question/addVerificationQuestion")
    public String moveAddQuestion(Model model, HttpSession session){

        String urbanfarmAdminId = (String) session.getAttribute("S_id");

        model.addAttribute("title", "자가검증 질문 등록");
        model.addAttribute("urbanfarmAdminId", urbanfarmAdminId);

        return "admin_self_check_question/add_verification_question";
    }

    /**
     * 검색한 키트 리스트 반환
     * @param searchData 검색 데이터
     * @return 검색한 키트 리스트
     */
    @ResponseBody
    @PostMapping("/question/kitSearch")
    public List<UrbanKit> searchKitList(@RequestBody Map<String, Object> searchData){

        log.info(searchData);

        String searchColumn = (String) searchData.get("kitSearchColumn");
        String searchValue = (String) searchData.get("kitSearchValue");
        searchValue = "%" + searchValue + "%";

        log.info(searchColumn);
        log.info(searchValue);

        List<UrbanKit> kitList = adminSelfCheckCropsGradeService.searchKitList(searchColumn, searchValue);

        return kitList;
    }

    /**
     * 전체 키트 리스트 반환하는 메서드
     * @return 전체 키트 리스트
     */
    @GetMapping("/question/listKit")
    @ResponseBody
    public List<UrbanKit> kitList(){

        List<UrbanKit> kitList = adminSelfCheckCropsGradeService.getKitList();

        return kitList;
    }

    /**
     * 전체 작물 이름 테이블 리스트 가져오기
     * @return 전체 작물 이름 테이블 리스트
     */
    @GetMapping("/question/listCrops")
    @ResponseBody
    public List<CropsName> cropsNameList(){

        List<CropsName> cropsNameList = adminSelfCheckCropsGradeService.getCropsNameList();

        return cropsNameList;
    }

    /**
     * 검색한 작물 이름 리스트 가져오기
     * @param searchData 검색할 데이터
     * @return 검색한 작물 이름 리스트
     */
    @ResponseBody
    @PostMapping("/question/cropsSearch")
    public List<CropsName> searchCropsList(@RequestBody Map<String, Object> searchData){

        log.info(searchData);

        String searchColumn = (String) searchData.get("cropsSearchColumn");
        String searchValue = (String) searchData.get("cropsSearchValue");
        searchValue = "%" + searchValue + "%";

        log.info(searchColumn);
        log.info(searchValue);

        List<CropsName> cropsList = adminSelfCheckCropsGradeService.searchCropsList(searchColumn, searchValue);

        return cropsList;
    }

    /**
     * 자가검증 질문 등록 처리
     * @param cropsSelfCheck 질문 등록 data
     * @return 자가검증 질문 등록 상세화면 이동 리다이렉트 경로
     */
    @PostMapping("/question/insertQuestion")
    public String insertQuestion(CropsSelfCheck cropsSelfCheck,
                                 RedirectAttributes reAttr){

        adminSelfCheckCropsGradeService.insertQuestion(cropsSelfCheck);
        reAttr.addFlashAttribute("cropsSelfCheck", cropsSelfCheck);

        return "redirect:/adminSelfCheck/question/addVerificationQuestionDetail";
    }

    /**
     * 관리자 - 자가검증 질문 등록 상세 화면 이동
     * @param model
     * @return admin_self_check_question/add_verification_question_detail.html
     */
    @GetMapping("/question/addVerificationQuestionDetail")
    public String moveQuestionDetail(Model model){
        // 등록 처리 메서드에서 세션에 넣은 객체 model 객체에 담기
        if(model.containsAttribute("cropsSelfCheck")){
            CropsSelfCheck cropsSelfCheck = (CropsSelfCheck) model.asMap().get("cropsSelfCheck");
            model.addAttribute("cropsSelfCheck", cropsSelfCheck);
        }
        model.addAttribute("title", "상세화면");

        return "admin_self_check_question/add_verification_question_detail";
    }

    /**
     * 관리자 - 자가검증 질문 목록 화면 이동
     * @param model title=화면제목
     * @return admin_self_check_question/list_verification_question
     */
    @GetMapping("/question/listVerificationQuestion")
    public String moveListQuestion(Model model){

        model.addAttribute("title","자가검증 질문 조회");

        return "admin_self_check_question/list_verification_question";
    }

    /**
     * 관리자 - 자가검증 질문 수정 화면 이동
     * @param model title=화면제목
     * @return admin_self_check_question/modify_verification_question
     */
    @GetMapping("/question/modifyVerificationQuestion")
    public String moveModifyQuestion(Model model){

        model.addAttribute("title","자가검증 질문 수정");

        return "admin_self_check_question/modify_verification_question";
    }

    /**
     * 관리자 - 자가검증 질문 삭제 처리 메서드
     * @param model title=화면제목
     * @return redirect!
     */
    @GetMapping("/question/removeVerificationQuestion")
    public String removeVerifyQuestion(Model model){

        model.addAttribute("title","자가검증 질문 삭제");

        return "admin_self_check_question/list_verification_question";
    }

    /**
     * 관리자 - 자가검증 상품 등급 등록 화면 이동
     * @param model
     * @return admin_self_check_product_grade/add_verification_product_grade
     */
    @GetMapping("/productGrade/addVerificationProductGrade")
    public String moveAddProductGrade(Model model, HttpSession session){
        String urbanfarmAdminId = (String) session.getAttribute("S_id");

        model.addAttribute("title","자가검증 상품등급 등록");
        model.addAttribute("urbanfarmAdminId", urbanfarmAdminId);

        return "admin_self_check_product_grade/add_verification_product_grade";
    }

    /**
     * 관리자 - 자가검증 상품 등급 등록 실행 메서드
     * @param selfCheckCropsGrade 자가검증 상품 등급 등록 화면에서 입력받은 정보를 담은 객체
     * @return redirect:/adminSelfCheck/productGrade/listVerificationProductGrade
     */
    @PostMapping("/productGrade/addVerificationProductGrade")
    public String addProductGrade(SelfCheckCropsGrade selfCheckCropsGrade){

        adminSelfCheckCropsGradeService.addCropsGrade(selfCheckCropsGrade);

        return "redirect:/adminSelfCheck/productGrade/listVerificationProductGrade";
    }


    /**
     * 관리자 - 자가검증 상품등급 목록 화면 이동
     * @param model
     * @return admin_self_check_product_grade/list_verification_product_grade
     */
    @GetMapping("/productGrade/listVerificationProductGrade")
    public String moveListProductGrade(Model model){

        model.addAttribute("title","자가검증 상품등급 목록");

        return "admin_self_check_product_grade/list_verification_product_grade";
    }

    /**
     * 관리자 - DataTables 상품등급 리스트
     * @return DataTables 상품 등급 객체 리스트
     */
    @ResponseBody
    @GetMapping("/productGrade/dataProductGrade")
    public List<SelfCheckCropsGrade> adminDataProductGrade() {

        // 상품 목록 객체 호출 후 대입 메서드
        List<SelfCheckCropsGrade> dataProductGrade = adminSelfCheckCropsGradeService.dataProductGrade();

        return dataProductGrade;
    }

    /**
     * 작물 등급 수정 화면 이동
     * @param selfCheckCropsGrade 수정정보 코드
     * @return 수정할 상품등급 정보
     */
    @ResponseBody
    @PostMapping("/productGrade/modifyProductGradeData")
    public SelfCheckCropsGrade modifyProductGradeModal(@RequestBody String selfCheckCropsGrade){
        log.info("selfCheckCropsGrade: {}", selfCheckCropsGrade);

        String selfCheckCropsGradeCode = selfCheckCropsGrade;
        SelfCheckCropsGrade result = adminSelfCheckCropsGradeService.getProductGradeByCode(selfCheckCropsGradeCode);

        return result;
    }


    @ResponseBody
    @PostMapping("/productGrade/modifyUpdateProductGrade")
    public void modifyUpdateProductGradeModal(@RequestBody SelfCheckCropsGrade selfCheckCropsGrade){

        adminSelfCheckCropsGradeService.updateProductGrade(selfCheckCropsGrade);

    }

    /**
     * 관리자 - 자가검증 상품등급 삭제처리
     * @param model
     * @return redirect!
     */
    @PostMapping("/productGrade/removeProductGrade")
    @ResponseBody
    public void deleteProductGrade(@RequestBody List<String> deleteList){
        log.info("deleteProductGrade Controller {}", deleteList);

        adminSelfCheckCropsGradeService.deleteProductGrade(deleteList);
    }
}
