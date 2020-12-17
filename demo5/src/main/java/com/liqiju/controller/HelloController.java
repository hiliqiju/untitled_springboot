package com.liqiju.controller;

import com.liqiju.untitle.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String login() {
        return "hello world";
    }

    @RequestMapping("/")
    public String getStu(Model model) {
        List stu = new ArrayList<Student>();
        stu.add(new Student(1, "李白", 20, "酒"));
        stu.add(new Student(2, "三少爷", 20, "剑"));
        stu.add(new Student(4, "李白", 20, "酒"));
        stu.add(new Student(5, "李白", 20, "酒"));
        stu.add(new Student(8, "李白", 20, "酒"));
        stu.add(new Student(3, "李白", 20, "酒"));
        model.addAttribute("stuList", stu);
        return "index";
    }

}
