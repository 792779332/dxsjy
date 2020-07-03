package com.example.dxsjy.web;


import com.example.dxsjy.Bean.Job_guidance;
import com.example.dxsjy.Mapper.Job_guidanceMapper;
import com.example.dxsjy.Service.IJobGuidance;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


import java.text.SimpleDateFormat;
import java.util.Date;
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


    @GetMapping("Insert")
    @ApiOperation("添加就业指导信息")
    @ApiImplicitParams({

            @ApiImplicitParam(name = "id",paramType = "query",value = "ID"),
            @ApiImplicitParam(name = "title", paramType = "query",value = "标题"),
            @ApiImplicitParam(name = "data",paramType = "query", value = "内容", dataType = "text")
    })

    public Message Insert(Job_guidance job_guidance){

        jobGuidance.InsertOrUpdate(job_guidance);
        return MessageUtil.success("添加成功");
    }

    @GetMapping("Update")
    @ApiOperation("修改就业指导信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", paramType = "query",value = "标题"),
            @ApiImplicitParam(name = "data",paramType = "query", value = "内容", dataType = "text")
    })
    public Message Update(Job_guidance job_guidance){
        jobGuidance.InsertOrUpdate(job_guidance);
        return MessageUtil.success("修改成功");
    }

}
