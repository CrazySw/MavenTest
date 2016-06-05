package com.Cirno.POJO;

public class Test {
    private int id;
    private String test;

    public Test(String test) {
        this.test = test;
    }

    public Test(int id, String test) {
        this.id = id;
        this.test = test;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
