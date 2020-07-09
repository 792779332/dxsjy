package com.example.dxsjy.web;

import com.example.dxsjy.Bean.EX.GraduateEX;
import com.example.dxsjy.Bean.Graduate;
import com.example.dxsjy.Bean.Graduate_recordWithBLOBs;
import com.example.dxsjy.Bean.Graduate_work;
import com.example.dxsjy.Service.IGraduateService;
import com.example.dxsjy.Util.Message;
import com.example.dxsjy.Util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/G")
@Api(description = "毕业生信息")
public class GraduateController {
    @Autowired
    private IGraduateService graduateService;

    @GetMapping("/findAll")
    @ApiOperation("查询所有毕业生信息")
    public Message<List<GraduateEX>> findAll() {
        List<GraduateEX> list = graduateService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("/insert")
    @ApiOperation("添加毕业生信息")
    public Message insert(Graduate graduate) {
        graduateService.insert(graduate);
        return MessageUtil.success("添加毕业生信息成功！！！");
    }

    @PostMapping("insertW")
    @ApiOperation("添加毕业生工作经历")
    public Message insertW(Graduate_work graduate_work) {
        graduateService.insertW(graduate_work);
        return MessageUtil.success("添加毕业生工作经历成功！！！");
    }

    @PostMapping("/insertR")
    @ApiOperation("添加毕业生培训记录")
    public Message insertR(Graduate_recordWithBLOBs graduate_recordWithBLOBs) {
        graduateService.insertR(graduate_recordWithBLOBs);
        return MessageUtil.success("添加毕业生培训记录成功！！！");
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除毕业生信息（包括毕业生的信息、工作经历和培训记录）")
    public Message delete(int sId) {
        graduateService.delete(sId);

        return MessageUtil.success("删除毕业生信息成功！！！");
    }



}
