package com.example.dxsjy.Mapper;

import com.example.dxsjy.Bean.Graduate_work;
import com.example.dxsjy.Bean.Graduate_workExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Graduate_workMapper {
    long countByExample(Graduate_workExample example);

    int deleteByExample(Graduate_workExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Graduate_work record);

    int insertSelective(Graduate_work record);

    List<Graduate_work> selectByExample(Graduate_workExample example);

    Graduate_work selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Graduate_work record, @Param("example") Graduate_workExample example);

    int updateByExample(@Param("record") Graduate_work record, @Param("example") Graduate_workExample example);

    int updateByPrimaryKeySelective(Graduate_work record);

    int updateByPrimaryKey(Graduate_work record);
}