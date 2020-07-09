package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.EX.GraduateEX;
import com.example.dxsjy.Bean.Graduate;
import com.example.dxsjy.Bean.Graduate_recordWithBLOBs;
import com.example.dxsjy.Bean.Graduate_work;

import java.util.List;

public interface IGraduateService {
    List<GraduateEX> findAll() throws RuntimeException;
    void insert(Graduate graduate) throws RuntimeException;
    void insertW(Graduate_work graduate_work) throws RuntimeException;
    void insertR(Graduate_recordWithBLOBs graduate_recordWithBLOBs) throws RuntimeException;
    void delete(int sId) throws RuntimeException;

}
