package com.example.dxsjy.Service.Impl;

import com.example.dxsjy.Bean.*;
import com.example.dxsjy.Bean.EX.GraduateEX;
import com.example.dxsjy.Mapper.EX.GraduateEXMapper;
import com.example.dxsjy.Mapper.GraduateMapper;
import com.example.dxsjy.Mapper.Graduate_recordMapper;
import com.example.dxsjy.Mapper.Graduate_workMapper;
import com.example.dxsjy.Service.IGraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduateServiceImpl implements IGraduateService {
    @Autowired
    private GraduateEXMapper graduateEXMapper;

    @Autowired
    private GraduateMapper graduateMapper;

    @Autowired
    private Graduate_recordMapper graduate_recordMapper;

    @Autowired
    private Graduate_workMapper graduate_workMapper;


    @Override
    public List<GraduateEX> findAll() throws RuntimeException {
        List<GraduateEX> list = graduateEXMapper.findAll();
        return list;
    }

    @Override
    public void insert(Graduate graduate) throws RuntimeException {
        graduateMapper.insertSelective(graduate);
    }

    @Override
    public void insertW(Graduate_work graduate_work) throws RuntimeException {
        graduate_workMapper.insertSelective(graduate_work);
    }

    @Override
    public void insertR(Graduate_recordWithBLOBs graduate_recordWithBLOBs) throws RuntimeException {
        graduate_recordMapper.insertSelective(graduate_recordWithBLOBs);
    }


    @Override
    public void delete(int sId) throws RuntimeException {
            Graduate_recordExample graduate_recordExample = new Graduate_recordExample();
            graduate_recordExample.createCriteria().andGraduateId1EqualTo(sId);

            Graduate_workExample graduate_workExample = new Graduate_workExample();
            graduate_workExample.createCriteria().andGraduateIdEqualTo(sId);


            graduate_recordMapper.deleteByExample(graduate_recordExample);
            graduate_workMapper.deleteByExample(graduate_workExample);
            graduateMapper.deleteByPrimaryKey(sId);


    }

}