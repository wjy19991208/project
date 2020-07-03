package com.example.demo.entity;
//会员实体类
import lombok.Data;

public class Member {
    private Integer mid;
    private String name;
    private String phone;
    private int score;

    public Integer getMid() {           //获取会员号
        return mid;
    }

    public void setMid(Integer mid) {   //设置会议号
        this.mid = mid;
    }

    public String getName() {   return this.name;}
    public void setName(String name) { this.name=name;}

    public String getPhone() {   return this.phone;}
    public void setPhone(String phone) {   this.phone=phone;}

    public int getScore() {   return this.score;}
    public void setScore(int score) {   this.score=score;}
}
