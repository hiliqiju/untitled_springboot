package com.liqiju.controller;

import com.liqiju.entity.Info;
import com.liqiju.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @RequestMapping(value = "getInfo1", method = RequestMethod.GET)
    public Info getInfo1() {
        Person p = new Person(3, "唐婉", 20, "雨送黄昏花易落");
        Info info = new Info(200, "成功", p);

        return info;
    }

    @GetMapping("/")
    public Person getInfo() {
        Person p = new Person(1, "李沁", 18, "沁人心脾");
        return p;
    }

    @PostMapping("getInfo2")
    public Person getInfo2(Person p) {
        p.setPno(5);
        p.setMessage("hello world");
        return p;
    }

    @RequestMapping(value = "person3", method = RequestMethod.POST)
    public Person getPerson3(Person p) {
        p.setPno(5);
        p.setMessage("hello world");
        return p;
    }

}
