package com.example.demo.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoginDAOTest {
    @Autowired
    private LoginDAO loginDAO;

    @Test
    public void TestNotInDB(){
        assertEquals(0,loginDAO.findLogin(123456));
    }





}