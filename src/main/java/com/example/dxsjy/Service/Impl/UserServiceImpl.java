package com.example.dxsjy.Service.Impl;


import com.example.dxsjy.Bean.User;
import com.example.dxsjy.Bean.UserExample;
import com.example.dxsjy.Mapper.UserMapper;
import com.example.dxsjy.Service.IUserService;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> FindAllUser() throws RuntimeException {
        UserExample userExample = new UserExample();

        List<User> list =userMapper.selectByExample(userExample);

        return list;
    }

    @Override
    public String Login(String name, int password) throws RuntimeException {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andNameLike(name);
        List<User> user=userMapper.selectByExample(userExample);

        if (null == user || user.size() ==0){
            return "用户名不存在请注册";
        }else {

            if(user.get(0).getPassword().equals(password) ){
                return "登录成功";
            }else {
                return "密码错误";
            }

        }

    }

    @Override
    public String Register(User user) throws RuntimeException {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andNameLike(user.getName());
        List<User> list=userMapper.selectByExample(userExample);
        if (null == list || list.size() ==0){
            Date day=new Date();
            user.setDate(day);
            userMapper.insert(user);
            return "添加成功";
        }else {

            return "用户名已存在，请直接登录或更换用户名";
        }

    }


}
