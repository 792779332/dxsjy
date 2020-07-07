package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.Job_guidance;

import java.util.List;

public interface IJobGuidance {
    List<Job_guidance> findAll() throws RuntimeException;
    void InsertOrUpdate(Job_guidance job_guidance) throws RuntimeException;

    void deletById(int id) throws RuntimeException;

    void deletSome(int[] ids) throws RuntimeException;

    List<Job_guidance> findByKey(String key) throws RuntimeException;

}
