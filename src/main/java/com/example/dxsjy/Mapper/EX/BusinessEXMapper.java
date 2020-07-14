package com.example.dxsjy.Mapper.EX;

import com.example.dxsjy.Bean.EX.BusinessEX;

import java.util.List;

public interface BusinessEXMapper {

    List<BusinessEX> findAll();
    BusinessEX findById(int id);
    List<BusinessEX> selectByKey(String key);
}
