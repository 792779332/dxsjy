package com.example.dxsjy.Service.Impl;


import com.example.dxsjy.Bean.User;
import com.example.dxsjy.Bean.UserExample;
import com.example.dxsjy.Mapper.UserMapper;
import com.example.dxsjy.Service.IUserService;
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

    @Override
    public String RePassword(int id, int oldpassword, int newpassword, int confirm) throws RuntimeException {
        User user = userMapper.selectByPrimaryKey(id);

        if (user != null) {
            if (newpassword == confirm) {

                if (user.getPassword() == oldpassword) {
                    User user1 = new User();
                    user1.setId(id);
                    user1.setPassword(newpassword);
                    userMapper.updateByPrimaryKeySelective(user1);
                    return "修改密码成功";
                } else {
                    return "旧密码错误请重新输入";
                }

            } else {
                return "两次新密码不相同请重新输入新密码";
            }


        }else {
            return "用户不存在请注册";
        }


    }

    @Override
    public String ReName(int id, String name) throws RuntimeException {
        User user=new User();
        user.setName(name);
        user.setId(id);
        userMapper.updateByPrimaryKeySelective(user);
        return "修改成功";
    }

    @Override
    public User FindById(int id) throws RuntimeException {
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }


}
