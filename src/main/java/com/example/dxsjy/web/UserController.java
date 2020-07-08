package com.example.dxsjy.web;


import com.example.dxsjy.Bean.User;
import com.example.dxsjy.Service.IUserService;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "用户管理器")
@RequestMapping("/User")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("findall")
    @ApiOperation("查询所有用户")
    public Message<List<User>> finduser(){

        List<User> list=userService.FindAllUser();

        return MessageUtil.success(list);
    }

    @PostMapping("Login")
    @ApiOperation("登录")
    public Message Login(String name,int password){
        String s=userService.Login(name,password);
        return MessageUtil.success(s);
    }


    @PostMapping("Register")
    @ApiOperation("注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "ID",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name ="name",value = "用户名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "password",value = "6位数字密码",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "type",value = "身份",paramType = "query",dataType = "String",required = true)
    })

    public Message Register(User user){
        userService.Register(user);
        return MessageUtil.success("注册成功");
    }


    @PostMapping("RePassword")
    @ApiOperation("修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "ID",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name ="oldpassword",value = "旧密码",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "newpassword",value = "新6位数字密码",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "confirm",value = "确认密码",paramType = "query",dataType = "int",required = true)
    })
    public Message RePassword(int id,int oldpassword,int newpassword,int confirm){
        String s=userService.RePassword(id,oldpassword,newpassword,confirm);
        return MessageUtil.success(s);
    }

    @GetMapping("FindById")
    @ApiOperation("通过id查询")
    @ApiImplicitParam(name = "id",value = "ID",paramType = "query",dataType = "int",required = true)
    public Message FindById(int id){
        User user=userService.FindById(id);
        return MessageUtil.success(user);
    }


    @PostMapping("ReName")
    @ApiOperation("修改用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "ID",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "name",value = "新用户名",paramType = "query",dataType = "String",required = true)
    })
    public Message ReName(int id,String name){
        String s=userService.ReName(id,name);
        return MessageUtil.success(s);
    }




}
