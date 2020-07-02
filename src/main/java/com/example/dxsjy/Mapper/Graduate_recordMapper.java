package com.example.dxsjy.Mapper;

import com.example.dxsjy.Bean.Graduate_record;
import com.example.dxsjy.Bean.Graduate_recordExample;
import com.example.dxsjy.Bean.Graduate_recordWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Graduate_recordMapper {
    long countByExample(Graduate_recordExample example);

    int deleteByExample(Graduate_recordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Graduate_recordWithBLOBs record);

    int insertSelective(Graduate_recordWithBLOBs record);

    List<Graduate_recordWithBLOBs> selectByExampleWithBLOBs(Graduate_recordExample example);

    List<Graduate_record> selectByExample(Graduate_recordExample example);

    Graduate_recordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Graduate_recordWithBLOBs record, @Param("example") Graduate_recordExample example);

    int updateByExampleWithBLOBs(@Param("record") Graduate_recordWithBLOBs record, @Param("example") Graduate_recordExample example);

    int updateByExample(@Param("record") Graduate_record record, @Param("example") Graduate_recordExample example);

    int updateByPrimaryKeySelective(Graduate_recordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Graduate_recordWithBLOBs record);

    int updateByPrimaryKey(Graduate_record record);
}