package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//MVC 패턴
// 1. 컨트롤러 선언
// 2. 메서드 생성
// 3. return값으로 보여 줄 페이지 이름 설정
// 4. GetMapping으로 접근할 경로 지정

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","지연");

        //return 값으로 보여줄 페이지
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","지연");
        return "goodbye";
    }

}
