package com.example.dxsjy.Service.Impl;

import com.example.dxsjy.Bean.EX.BusinessEX;
import com.example.dxsjy.Mapper.EX.BusinessEXMapper;
import com.example.dxsjy.Service.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements IBusinessService {

    @Autowired
    private BusinessEXMapper businessEXMapper;

    @Override
    public List<BusinessEX> findAll() throws RuntimeException {
       List<BusinessEX>list = businessEXMapper.findAll();
        return list;
    }
}
