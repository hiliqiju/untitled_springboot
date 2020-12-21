package com.liqiju.person;

public class Person {
    private int pno;
    private String pname;
    private int page;
    private String pgender;

    public Person() {

    }

    public Person(int pno, String pname, int page, String pgender) {
        this.pno = pno;
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
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

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }
}
