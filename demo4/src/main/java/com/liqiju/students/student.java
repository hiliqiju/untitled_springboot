package com.liqiju.students;

public class student {
    private int no;
    private String name;
    private int age;
    private String hobby;

    public student() {

    }

    public student(int no, String name, int age, String hobby) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
