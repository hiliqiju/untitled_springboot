package com.liqiju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody //作为ajax数据返回
    public String hello() {
        return "hello string boot";
    }

    @RequestMapping("jsp")
    public String getIndex() {
        return "index";
    }

}
