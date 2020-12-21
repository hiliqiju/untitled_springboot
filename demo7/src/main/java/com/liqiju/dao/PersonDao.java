package com.liqiju.dao;

import com.liqiju.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<Person, Integer> {
    public List<Person> findByPname(String name); //单条件查询
    public List<Person> findByPnameAndPage(String name, int age); //多条件and
    public List<Person> findByPageGreaterThanEqual(int age); //年龄 >= age
    public List<Person> findByPnameLike(String name); //模糊查询

}
