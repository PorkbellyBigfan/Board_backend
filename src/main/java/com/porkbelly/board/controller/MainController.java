package com.porkbelly.board.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @RestController와  @Controller의 차이는 반환하는 데이터의 타입인데
// @Controller는 주로 View를 반환하고 @RestController는 JSON 또는 XML 형식의 데이터를 집적 전송
// @Controller 는 데이터를 전송하기 위해서 @ResponseBody에다가 JSON, XML과 같은 데이터를 담아서 보낼수 있는데
// @RestController는 그 과정을 합쳐버렸다. 매우 편리!
@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("")
    public String hello(){
        return "Connected Successfully!";
    }
}
