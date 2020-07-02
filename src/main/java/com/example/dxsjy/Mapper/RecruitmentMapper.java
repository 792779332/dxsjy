package com.example.dxsjy.Mapper;

import com.example.dxsjy.Bean.Recruitment;
import com.example.dxsjy.Bean.RecruitmentExample;
import com.example.dxsjy.Bean.RecruitmentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentMapper {
    long countByExample(RecruitmentExample example);

    int deleteByExample(RecruitmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentWithBLOBs record);

    int insertSelective(RecruitmentWithBLOBs record);

    List<RecruitmentWithBLOBs> selectByExampleWithBLOBs(RecruitmentExample example);

    List<Recruitment> selectByExample(RecruitmentExample example);

    RecruitmentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecruitmentWithBLOBs record, @Param("example") RecruitmentExample example);

    int updateByExampleWithBLOBs(@Param("record") RecruitmentWithBLOBs record, @Param("example") RecruitmentExample example);

    int updateByExample(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByPrimaryKeySelective(RecruitmentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RecruitmentWithBLOBs record);

    int updateByPrimaryKey(Recruitment record);
}