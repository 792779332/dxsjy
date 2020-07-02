package com.example.dxsjy.Mapper;

import com.example.dxsjy.Bean.Graduate;
import com.example.dxsjy.Bean.GraduateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduateMapper {
    long countByExample(GraduateExample example);

    int deleteByExample(GraduateExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Graduate record);

    int insertSelective(Graduate record);

    List<Graduate> selectByExampleWithBLOBs(GraduateExample example);

    List<Graduate> selectByExample(GraduateExample example);

    Graduate selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByExampleWithBLOBs(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByExample(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByPrimaryKeySelective(Graduate record);

    int updateByPrimaryKeyWithBLOBs(Graduate record);

    int updateByPrimaryKey(Graduate record);
}