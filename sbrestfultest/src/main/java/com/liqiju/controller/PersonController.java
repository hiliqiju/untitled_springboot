package com.liqiju.controller;

import com.liqiju.person.Info;
import com.liqiju.person.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class PersonController {

    private ArrayList<Person> personList = new ArrayList<Person>();

    public PersonController() {
        personList.add(new Person(1, "唐婉", 18, "女"));
        personList.add(new Person(3, "李白", 22, "男"));
        personList.add(new Person(4, "卓文君", 18, "女"));
    }

    @GetMapping("get")
    public Info getInfo() {
        return new Info(200, "请求成功", personList);
    }

    @PostMapping("del/{pno}")
    public Info del(@PathVariable int pno) {
        personList.removeIf(p -> (p.getPno() == pno));
        return new Info(200, "删除成功", personList);
    }

    @PostMapping("add")
    public Info add(Person p) {
        if (personList.size() == 0) {
            p.setPno(1);
        } else {
            p.setPno(personList.get(personList.size() - 1).getPno() + 1);
        }

        personList.add(p);
        return new Info(201, "添加成功", personList);
    }
}
