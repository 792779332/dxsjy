package com.example.dxsjy.web;


import com.example.dxsjy.Bean.Business;
import com.example.dxsjy.Bean.EX.BusinessEX;
import com.example.dxsjy.Bean.Recruitment;
import com.example.dxsjy.Bean.RecruitmentWithBLOBs;
import com.example.dxsjy.Mapper.BusinessMapper;
import com.example.dxsjy.Service.IBusinessService;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public Message<List<BusinessEX>> FindAll(){
        List<BusinessEX> list =businessService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("FindById")
    @ApiOperation("通过id查询")
    public Message FindById(int id){
        BusinessEX businessEX=businessService.findById(id);
        return MessageUtil.success(businessEX);
    }

    @PostMapping("AddBusiness")
    @ApiOperation("添加公司")
    public Message AddBusiness(Business business){
       String s=businessService.addOrUpdateBusiness(business);
        return MessageUtil.success(s);
    }

    @PostMapping("UpdateBusiness")
    @ApiOperation("修改公司信息")
    public Message UpdateBusiness(Business business){

        String s = businessService.addOrUpdateBusiness(business);
        return MessageUtil.success(s);
    }
    @PostMapping("AddRecruitment")
    @ApiOperation("添加招聘信息")
    public Message AddRecruitment(RecruitmentWithBLOBs recruitment){
        String s=businessService.addOrUpdateRecruitment(recruitment);
        return MessageUtil.success(s);
    }

    @PostMapping("UpdateRecruitment")
    @ApiOperation("修改招聘信息")
    public Message UpdateRecruitment(RecruitmentWithBLOBs recruitment){
        String s=businessService.addOrUpdateRecruitment(recruitment);
        return MessageUtil.success(s);
    }

    @GetMapping("SelectByKey")
    @ApiOperation("关键字查询")
    @ApiImplicitParam(name = "key",value = "关键字",paramType = "query",dataType = "String")
    public Message SelectByKey(String key){
        List<BusinessEX> list = businessService.selectByKey(key);
        return MessageUtil.success(list);
    }

    @GetMapping("DeleteById")
    @ApiOperation("通过id删除企业信息")
    @ApiImplicitParam(name = "id",value = "企业ID",paramType = "query",dataType = "int",required = true)
    public Message DeleteById(int id){
        String s =businessService.deleteById(id);
        return MessageUtil.success(s);
    }
    @GetMapping("DeleteRById")
    @ApiOperation("通过id删除招聘信息")
    @ApiImplicitParam(name = "id",value = "招聘信息ID",paramType = "query",dataType = "int",required = true)
    public Message DeleteRById(int id){
        String s =businessService.deleteRById(id);
        return MessageUtil.success(s);
    }
}
