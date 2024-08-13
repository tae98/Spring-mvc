package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController 와 Controller 차이
// Controller: 반환타입이 view (html) 이 아닌 데이터일시 @ResponseBody 를 사용하여 선언해주어야함
// RestController: @ResponseBody 선언 없이 데이터만 반환 할수 있음

@RestController
@RequestMapping("/response/rest")
public class ResponseRestController {

    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }
}