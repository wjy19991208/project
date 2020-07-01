package com.example.demo.dao;


import com.example.demo.entity.Login;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LoginDAO {
    @Insert(value = "INSERT INTO Login VALUE(#{login.uid),#(login.passwd)")
    int insert(Login login);

    @Select(value = "SELECT * FROM Login")
    List<Login>  getAllLogin();

    @Select(value = "SELECT uid FROM Login WHERE Login.uid = #{uid}" )
    boolean findLogin(int uid);

    @Select(value = "SELECT passwd FROM Login WHERE Login.uid = #{uid} AND Login.passwd = #{passwd}")
    boolean checkPasswd(int uid, String passwd);
}
