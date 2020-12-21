package com.liqiju.Controller;

import com.liqiju.dao.PersonDao;
import com.liqiju.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    private PersonDao personDao;

    //添加数据
    @PostMapping("person")
    public Person add(Person p) {
        return personDao.save(p); //添加成功返回添加的数据的对象
    }

    //查询数据
    @GetMapping("all")
    public List<Person> getAll() {
        return personDao.findAll();
    }

    @GetMapping("find/{id}")
    public Person getPerson(@PathVariable int id) {
        return personDao.findById(id).get();
    }

    //以下需PersonDao接口中定义
    @GetMapping("find/name/{name}")
    public List<Person> findByName(@PathVariable String name) {
        return personDao.findByPname(name);
    }

    @GetMapping("find/more/{name}/{age}")
    public List<Person> findByAgeName(@PathVariable String name, @PathVariable int age) {
        return personDao.findByPnameAndPage(name, age);
    }

    @GetMapping("find/age/{age}")
    public List<Person> findByAge(@PathVariable int age) {
        return personDao.findByPageGreaterThanEqual(age);
    }

    @GetMapping("find/like/{name}")
    public List<Person> findByLikeName(@PathVariable String name) {
        return personDao.findByPnameLike(name);
    }

    //修改数据
    @PostMapping("update")
    public boolean update(Person person) {
        int id = person.getPno();
        int age = person.getPage();
        Person p = personDao.findById(id).get();
        p.setPage(age);
        return personDao.save(p) != null;
    }

    //删除数据
    @PostMapping("delete")
    public List<Person> delete(Person person) {
        personDao.deleteById(person.getPno());
        return personDao.findAll();
    }

}




























