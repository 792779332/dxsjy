package com.example.dxsjy.Service.Impl;

import com.example.dxsjy.Bean.Job_guidance;
import com.example.dxsjy.Bean.Job_guidanceExample;
import com.example.dxsjy.Mapper.Job_guidanceMapper;
import com.example.dxsjy.Service.IJobGuidance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobGuidanceImpl implements IJobGuidance {

    @Autowired
    private Job_guidanceMapper job_guidanceMapper;

    @Override
    public List<Job_guidance> findAll() throws RuntimeException {

        Job_guidanceExample job_guidanceExample=new Job_guidanceExample();
        List<Job_guidance> list =job_guidanceMapper.selectByExampleWithBLOBs(job_guidanceExample);
        return list;
    }

    @Override
    public void Insert(Job_guidance job_guidance) throws RuntimeException {

    }

}
