package com.example.dxsjy.web;

import com.example.dxsjy.Bean.User;
import com.example.dxsjy.Service.IUserService;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/l")
@Api(description = "练习")
public class lianxi {

    @Autowired
    private IUserService userService;

    @GetMapping("/lianxi")
    @ApiOperation("练习")
    public Message lianxi(){
        return MessageUtil.success("摩的");
    }


    @GetMapping("/findall")
    @ApiOperation("查询所有用户")
    public Message<List<User>> finduser(){

        List<User> list=userService.FindAllUser();

        return MessageUtil.success(list);
    }

    //hgfcfhvfcbvbghhbghhggjjk
    //gfgjhkjk


}
