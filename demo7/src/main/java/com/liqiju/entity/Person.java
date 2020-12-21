package com.liqiju.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_person")
public class Person {

    @Id
    @GeneratedValue  //自增Id
    private int pno;
    private String pname;
    private int page;
    private String message;

    public Person(int pno, String pname, int page, String message) {
        this.pno = pno;
        this.pname = pname;
        this.page = page;
        this.message = message;
    }

    public Person() {

    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
