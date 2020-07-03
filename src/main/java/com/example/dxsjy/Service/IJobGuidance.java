package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.Job_guidance;

import java.util.List;

public interface IJobGuidance {
    List<Job_guidance> findAll() throws RuntimeException;
    void InsertOrUpdate(Job_guidance job_guidance) throws RuntimeException;


}
