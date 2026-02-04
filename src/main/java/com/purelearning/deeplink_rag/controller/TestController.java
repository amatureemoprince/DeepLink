package com.purelearning.deeplink_rag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/test")
public class TestController {
    @GetMapping("/1")
    public String test(){
        return "Hello World !";
    }
}
