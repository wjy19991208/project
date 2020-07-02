package com.example.demo.service.impl;


import com.example.demo.dao.LoginDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Login;
import com.example.demo.entity.User;
import com.example.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegisterServiceimpl implements RegisterService{
    @Autowired
    LoginDAO loginDAO;
    @Autowired
    UserDAO userDAO;


    @Override
    //检查是否有重名人
    public boolean checkExistName(String name){
        if( userDAO.selectName(name) ==0 )
            return false;
        else
            return true;
    }

    @Override
    public boolean insertIntoUser(User user) {
        if(userDAO.insert(user) == user.getUid() )
            return true;
        else
            return false;
    }

    @Override
    public boolean insertIntoLogin(Login login) {
        if(loginDAO.insert(login) == login.getUid())
            return true;
        else
            return false;

    }


}
