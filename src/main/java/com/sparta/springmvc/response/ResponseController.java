package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {

    //Content-Type : text/html
    //Response Body
    //{"name":"Robbie","age":95}
    //자바에는 Json 이 존제하지 않기에 Json 포멧을 String 형태로 frontend 에 반환
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    //Content-Type : application/Json
    //Response Body
    //"{\"name\":\"Robbie\",\"age\":95}"
    //스프링 자체에서 객체를 Json형태로 변환시켜 반환해줌
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }
}
