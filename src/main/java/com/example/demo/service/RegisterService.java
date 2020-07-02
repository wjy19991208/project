package com.example.demo.service;


import com.example.demo.entity.Login;
import com.example.demo.entity.User;

public interface RegisterService {
    boolean checkExistName(String name);           //查找User员工表中是否存在相同名字员工
    boolean insertIntoUser(User user);           //将user插入User表中
    boolean insertIntoLogin(Login login);           //将login 插入Login表


}
