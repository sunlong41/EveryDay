package com.atguigu.springcloud.entities;


public class Payment {
    private Long id;
    private String serial;

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}