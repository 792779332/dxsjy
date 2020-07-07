package com.example.dxsjy.Service.Impl;

import com.example.dxsjy.Bean.Job_guidance;
import com.example.dxsjy.Bean.Job_guidanceExample;
import com.example.dxsjy.Mapper.Job_guidanceMapper;
import com.example.dxsjy.Service.IJobGuidance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public void InsertOrUpdate(Job_guidance job_guidance) throws RuntimeException {
        Date day=new Date();
        if (job_guidance.getId()==null){

            //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            job_guidance.setTime(day);
            job_guidanceMapper.insert(job_guidance);
        }
        else {
            job_guidance.setTime(day);
            job_guidanceMapper.updateByPrimaryKey(job_guidance);
        }
    }

    @Override
    public void deletById(int id) throws RuntimeException {
        job_guidanceMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void deletSome(int[] ids) throws RuntimeException {
        for (int id:ids){
            job_guidanceMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Job_guidance> findByKey(String key) throws RuntimeException {
        if (key==null)
            key="";
        key="%"+key+"%";
        Job_guidanceExample job_guidanceExample=new Job_guidanceExample();
        job_guidanceExample.createCriteria().andTitleLike(key);

        List<Job_guidance> list=job_guidanceMapper.selectByExampleWithBLOBs(job_guidanceExample);
        return list;
    }




}
