package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/4/25.
 */
@Controller
public class BootTest {

    @GetMapping("/")
    public String index(){
        return "hello.html";
    }

    @GetMapping("/test1")
    public String loginPapge(){
        return "test.html";
    }

}
