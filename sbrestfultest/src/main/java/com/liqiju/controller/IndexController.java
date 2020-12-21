package com.liqiju.controller;

import com.liqiju.entity.Info;
import com.liqiju.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class IndexController {

    @RequestMapping(value = "getInfo1/{id}", method = RequestMethod.GET)
    public Info getInfo1(@PathVariable int id) {
        Person p = new Person(0, "空", 0, "空");
        Info info = new Info(400, "id不存在", p);

        if (id == 1) {
            p = new Person(1, "唐婉", 20, "雨送黄昏花易落");
            info = new Info(200, "成功", p);
        }
        if (id == 2) {
            p = new Person(2, "陆游", 20, "江南小陌又逢春");
            info = new Info(200, "成功", p);
        }

        return info;
    }

    @GetMapping("/helloworld")
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
