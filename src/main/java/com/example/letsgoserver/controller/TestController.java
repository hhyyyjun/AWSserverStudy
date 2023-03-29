package com.example.letsgoserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/mytest")
    public String mytest(){

        return "반가워요 테스트";
    }
}
