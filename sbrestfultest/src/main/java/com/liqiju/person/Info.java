package com.liqiju.person;

import java.util.ArrayList;

public class Info {
    private int code;
    private String msg;
    private ArrayList<Person> personList;

    public Info() {

    }

    public Info(int code, String msg, ArrayList<Person> personList) {
        this.code = code;
        this.msg = msg;
        this.personList = personList;
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

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
}
