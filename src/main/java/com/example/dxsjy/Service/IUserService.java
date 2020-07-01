package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.User;

import java.util.List;

public interface IUserService {
    List<User> FindAllUser() throws RuntimeException;
}
