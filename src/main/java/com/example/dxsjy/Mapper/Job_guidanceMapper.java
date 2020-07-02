package com.example.dxsjy.Mapper;

import com.example.dxsjy.Bean.Job_guidance;
import com.example.dxsjy.Bean.Job_guidanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Job_guidanceMapper {
    long countByExample(Job_guidanceExample example);

    int deleteByExample(Job_guidanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Job_guidance record);

    int insertSelective(Job_guidance record);

    List<Job_guidance> selectByExampleWithBLOBs(Job_guidanceExample example);

    List<Job_guidance> selectByExample(Job_guidanceExample example);

    Job_guidance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Job_guidance record, @Param("example") Job_guidanceExample example);

    int updateByExampleWithBLOBs(@Param("record") Job_guidance record, @Param("example") Job_guidanceExample example);

    int updateByExample(@Param("record") Job_guidance record, @Param("example") Job_guidanceExample example);

    int updateByPrimaryKeySelective(Job_guidance record);

    int updateByPrimaryKeyWithBLOBs(Job_guidance record);

    int updateByPrimaryKey(Job_guidance record);
}