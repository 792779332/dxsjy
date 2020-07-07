package com.example.dxsjy.web;


import com.example.dxsjy.Bean.Job_guidance;

import com.example.dxsjy.Service.IJobGuidance;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





import java.util.List;

@RestController
@Api(description = "就业指导管理")
@RequestMapping("/JobGuidance")
public class Job_guidanceController {
    @Autowired
    private IJobGuidance jobGuidance;


    @GetMapping("FindAll")
    @ApiOperation("查询所有就业指导信息")
    public Message<List<Job_guidance>> FindALl(){
        List<Job_guidance> list =jobGuidance.findAll();
        return MessageUtil.success(list);
    }


    @PostMapping("Insert")
    @ApiOperation("添加就业指导信息")
    @ApiImplicitParams({

            @ApiImplicitParam(name = "id",paramType = "query",dataType = "int",value = "ID"),
            @ApiImplicitParam(name = "title", paramType = "query",value = "标题",required = true),
            @ApiImplicitParam(name = "data",paramType = "query", value = "内容", dataType = "text",required = true)
    })

    public Message Insert(Job_guidance job_guidance){

        jobGuidance.InsertOrUpdate(job_guidance);
        return MessageUtil.success("添加成功");
    }

    @PostMapping("Update")
    @ApiOperation("修改就业指导信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",paramType = "query",dataType = "int",value = "ID",required = true),
            @ApiImplicitParam(name = "title", paramType = "query",value = "标题",required = true),
            @ApiImplicitParam(name = "data",paramType = "query", value = "内容", dataType = "text",required = true)
    })
    public Message Update(Job_guidance job_guidance){
        jobGuidance.InsertOrUpdate(job_guidance);
        return MessageUtil.success("修改成功");
    }


    @GetMapping("DeletById")
    @ApiOperation("通过id删除")
    @ApiImplicitParam(name = "id",value = "ID",paramType = "query",dataType = "int",required = true)
    public Message DeletById(int id){
        jobGuidance.deletById(id);
        return MessageUtil.success("删除成功");
    }

    @GetMapping("DeletSome")
    @ApiOperation("批量删除")
    @ApiImplicitParam(name = "ids",value = "批量ID",paramType = "query",required = true,dataType = "int",allowMultiple = true)
    public Message DeletSome(int[] ids){

        jobGuidance.deletSome(ids);

        return MessageUtil.success("删除成功");
    }

    @GetMapping("FindByKey")
    @ApiOperation("通过标题关键字查找")
    @ApiImplicitParam(name = "key",value = "标题关键字",dataType = "String",paramType = "query")
    public Message<List<Job_guidance>> FindByKey(String key){

        List<Job_guidance> list=jobGuidance.findByKey(key);
        return MessageUtil.success(list);
    }

}
