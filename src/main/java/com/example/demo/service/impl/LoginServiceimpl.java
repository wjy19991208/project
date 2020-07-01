package com.example.demo.service.impl;


import com.example.demo.dao.LoginDAO;
import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceimpl implements LoginService{

   // @Autowired
    private LoginDAO loginDAO;

    @Override
    public List<Login> getAllLogin() {
        return loginDAO.getAllLogin();
    }

    @Override
    public boolean  checkExistUid(int uid) { return loginDAO.findLogin(uid);}

    @Override
    public boolean checkPasswd(int uid, String passwd) {return loginDAO.checkPasswd(uid, passwd);}


}
