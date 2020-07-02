package com.example.dxsjy.Service;

import com.example.dxsjy.Bean.EX.GraduateEX;

import java.util.List;

public interface IGraduateService {
    List<GraduateEX> findAll() throws RuntimeException;
}
