package com.example.dxsjy.Service.Impl;

import com.example.dxsjy.Bean.EX.GraduateEX;
import com.example.dxsjy.Mapper.EX.GraduateEXMapper;
import com.example.dxsjy.Service.IGraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduateServiceImpl implements IGraduateService {
    @Autowired
    private GraduateEXMapper graduateEXMapper;
    @Override
    public List<GraduateEX> findAll() throws RuntimeException {
        List<GraduateEX> list = graduateEXMapper.findAll();
        return list;
    }
}