package com.example.dxsjy.Service;


import com.example.dxsjy.Bean.EX.BusinessEX;

import java.util.List;

public interface IBusinessService {

    List<BusinessEX> findAll() throws RuntimeException;
}
