package com.sparta.springmvc.HtmlController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    //redirect to desired html file
    @GetMapping("/html/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    //template에있는 html문서를 불러올때는 return html파일명 만 .html 필요(x)
    @GetMapping("/html/templates")
    public String htmlTemplates(){
        return "hello";
    }

    //동적 페이지 메서드
    @GetMapping("/html/dynamic")
    //메서드 안에 모델 변수를 받음
    public String htmlDynamic(Model model){
        visitCount ++;
        //모델에 추가할 사항을 addAttribute 을통해 html 파일속 변경을하는 변수 이름 AttributeName 과 그 값 을 선언
        model.addAttribute("visits", visitCount);
        //변경사항을 전달해줄 view모델 (html파일명에 리턴)
        return "hello-visit";
    }

}

