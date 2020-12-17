package com.liqiju.controller;

import com.liqiju.students.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("stu")
    public String stu(Model model) {
        List stu = new ArrayList<student>();
        stu.add(new student(1, "李白", 20, "酒"));
        stu.add(new student(2, "三少爷", 20, "剑"));
        stu.add(new student(4, "李白", 20, "酒"));
        stu.add(new student(5, "李白", 20, "酒"));
        stu.add(new student(8, "李白", 20, "酒"));
        stu.add(new student(3, "李白", 20, "酒"));
        model.addAttribute("stuList", stu);
        return "students";
    }

}
