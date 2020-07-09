package com.example.dxsjy.web;


import com.example.dxsjy.Bean.EX.BusinessEX;
import com.example.dxsjy.Service.IBusinessService;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@Api(description = "企业管理")
@RequestMapping("/Business")
public class BusinessController {

    @Autowired
    private IBusinessService businessService;

    @GetMapping("FindAll")
    @ApiOperation("查看全部")
    public Message FindAll(){
        List<BusinessEX> list =businessService.findAll();
        return MessageUtil.success(list);
    }
}
