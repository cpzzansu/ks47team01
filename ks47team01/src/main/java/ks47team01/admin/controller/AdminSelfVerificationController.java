package ks47team01.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/adminSelfVerification")
public class AdminSelfVerificationController {

    /**
     * 관리자 - 자가검증 질문 등록 화면 이동
     * @param model title=화면제목
     * @return admin_self_verification_question/add_verification_question
     */
    @GetMapping("/question/addVerificationQuestion")
    public String moveAddQuestion(Model model){

        model.addAttribute("title", "자가검증 질문 등록");

        return "admin_self_verification_question/add_verification_question";
    }

    /**
     * 관리자 - 자가검증 질문 목록 화면 이동
     * @param model title=화면제목
     * @return admin_self_verification_question/list_verification_question
     */
    @GetMapping("/question/ListVerificationQuestion")
    public String moveListQuestion(Model model){

        model.addAttribute("title","자가검증 질문 조회");

        return "admin_self_verification_question/list_verification_question";
    }

    /**
     * 관리자 - 자가검증 질문 수정 화면 이동
     * @param model title=화면제목
     * @return admin_self_verification_question/modify_verification_question
     */
    @GetMapping("/question/modifyVerificationQuestion")
    public String moveModifyQuestion(Model model){

        model.addAttribute("title","자가검증 질문 수정");

        return "admin_self_verification_question/modify_verification_question";
    }

    /**
     * 관리자 - 자가검증 질문 삭제 처리 메서드
     * @param model title=화면제목
     * @return redirect!
     */
    @GetMapping("/question/removeVerificationQuestion")
    public String removeVerifyQuestion(Model model){

        model.addAttribute("title","자가검증 질문 삭제");

        return "admin_self_verification_question/list_verification_question";
    }

    /**
     * 관리자 - 자가검증 상품 등급 등록 화면 이동
     * @param model
     * @return admin_self_verification_product_grade/add_verification_product_grade
     */
    @GetMapping("/productGrade/addVerificationProductGrade")
    public String moveAddProductGrade(Model model){

        model.addAttribute("title","자가검증 상품등급 등록");

        return "admin_self_verification_product_grade/add_verification_product_grade";
    }

    /**
     * 관리자 - 자가검증 상품등급 목록 화면 이동
     * @param model
     * @return admin_self_verification_product_grade/list_verification_product_grade
     */
    @GetMapping("/productGrade/listVerificationProductGrade")
    public String moveListProductGrade(Model model){

        model.addAttribute("title","자가검증 상품등급 목록");

        return "admin_self_verification_product_grade/list_verification_product_grade";
    }

    /**
     * 관리자 - 자가검증 상품등급 수정화면 이동
     * @param model
     * @return admin_self_verification_product_grade/modify_verification_product_grade
     */
    @GetMapping("/productGrade/modifyVerificationProductGrade")
    public String moveModifyProductGrade(Model model){

        model.addAttribute("title","자가검증 상품등급 수정");

        return "admin_self_verification_product_grade/modify_verification_product_grade";
    }

    /**
     * 관리자 - 자가검증 상품등급 삭제처리
     * @param model
     * @return redirect!
     */
    @GetMapping("/productGrade/removeVerificationProductGrade")
    public String removeProductGrade(Model model){

        model.addAttribute("title","자가검증 상품등급 삭제");

        return "admin_self_verification_product_grade/list_verification_product_grade";
    }
}
