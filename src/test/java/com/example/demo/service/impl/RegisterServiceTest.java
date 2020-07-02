package com.example.demo.service.impl;

import static org.junit.Assert.*;

import com.example.demo.entity.User;
import com.example.demo.entity.Login;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//测试注册服务
public class RegisterServiceTest {
    @Autowired
    private RegisterServiceimpl rgtl;
    private User user;
    private Login login;

    @Test
    //测试名字在数据库中

    public void TestCheckExistName(){
        assertEquals(true,rgtl.checkExistName("高健"));
    }

    @Test
    //测试名字不在数据库中
    public void TestCheckNotExistName(){
        assertEquals(false,rgtl.checkExistName("火狐"));
    }



    @Test
    //测试插入表User !!!!错误示例
    public void TestInsertIntoUser()
    {
        user.setUid(18080101);
        user.setName("鸡哥");
        user.setIdentity(3);
        user.setSalary(2500);
        assertEquals(true,rgtl.insertIntoUser(user) );
    }

}