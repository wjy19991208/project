package com.example.demo.entity;


import lombok.Data;
@Data

public class Login {
    private Integer uid;
    private String passwd;


    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd() {
        return passwd;
    }
}
