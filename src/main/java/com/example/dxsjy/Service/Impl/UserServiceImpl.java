package com.example.dxsjy.Service.Impl;


import com.example.dxsjy.Bean.User;
import com.example.dxsjy.Bean.UserExample;
import com.example.dxsjy.Mapper.UserMapper;
import com.example.dxsjy.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> FindAllUser() throws RuntimeException {
        UserExample userExample=new UserExample();

        List<User> list =userMapper.selectByExample(userExample);

        return list;
    }
}
