package com.liqiju.entity;

public class Info {
    private int code;
    private String msg;
    private Person person;

    public Info() {

    }

    public Info(int code, String msg, Person person) {
        this.code = code;
        this.msg = msg;
        this.person = person;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
