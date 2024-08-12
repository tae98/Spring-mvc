package com.sparta.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api") //맵핑 경로를 지정한 이름으로 통일시켜준다
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return"Hello World!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return"Get Method Request";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return ("Post Method Request");
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return("Put Method Request");
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return("Delete Method Request");
    }

}
