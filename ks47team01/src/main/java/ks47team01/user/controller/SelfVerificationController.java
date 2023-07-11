package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelfVerificationController {

    //자가검증 작물 등급 확인 화면
    @GetMapping("/userVrificationCheck/checkVerificationGrade")
    public String checkGrade(Model model){

        model.addAttribute("title", "작물등급확인");

        return "user_self_verification_check/self_verification_crop_grade";
    }


    // 판매할 작물 자가 검증 질문 답 작성 폼 화면 이동
    @GetMapping("/userVrificationCheck/answerForm")
    public String answerForm(Model model){

        model.addAttribute("title", "자가검증 질문 답 작성");

        return "user_self_verification_check/self_verification_answer_form";
    }
}
