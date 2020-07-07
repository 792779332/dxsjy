package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.User;

import java.util.List;

public interface IUserService {
    List<User> FindAllUser() throws RuntimeException;
    String Login(String name,int password) throws RuntimeException;
    String Register(User user) throws RuntimeException;
}
