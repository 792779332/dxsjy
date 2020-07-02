package com.example.dxsjy.web;


import com.example.dxsjy.Bean.Job_guidance;
import com.example.dxsjy.Mapper.Job_guidanceMapper;
import com.example.dxsjy.Service.IJobGuidance;
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
@Api(description = "就业指导管理")
@RequestMapping("/JobGuidance")
public class Job_guidanceControlle {
    @Autowired
    private IJobGuidance jobGuidance;

    @GetMapping("FindAll")
    @ApiOperation("查询所有就业指导信息")
    public Message<List<Job_guidance>> FindALl(){
        List<Job_guidance> list =jobGuidance.findAll();
        return MessageUtil.success(list);
    }

}
