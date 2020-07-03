package com.example.dxsjy.web;

import com.example.dxsjy.Bean.EX.GraduateEX;
import com.example.dxsjy.Service.IGraduateService;
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
@RequestMapping("/G")
@Api(description = "毕业生信息")
public class Graduate {
    @Autowired
    private IGraduateService graduateService;
    @GetMapping("/findAll")
    @ApiOperation("查询所有毕业生信息")
    public Message<List<GraduateEX>> findAll() {
        List<GraduateEX> list = graduateService.findAll();
        return MessageUtil.success(list);
    }

}
