package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.User;

import java.util.List;

public interface IUserService {
    List<User> FindAllUser() throws RuntimeException;
    String Login(String name,int password) throws RuntimeException;
    String Register(User user) throws RuntimeException;
    String RePassword(int id,int oldpassword,int newpassword,int confirm) throws RuntimeException;
    String ReName(int id,String name) throws RuntimeException;
    User FindById(int id) throws  RuntimeException;
}
