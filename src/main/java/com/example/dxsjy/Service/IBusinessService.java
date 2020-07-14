package com.example.dxsjy.Service;


import com.example.dxsjy.Bean.Business;
import com.example.dxsjy.Bean.EX.BusinessEX;
import com.example.dxsjy.Bean.RecruitmentWithBLOBs;

import java.util.List;

public interface IBusinessService {

    List<BusinessEX> findAll() throws RuntimeException;
    BusinessEX findById(int id) throws RuntimeException;

    String addOrUpdateRecruitment(RecruitmentWithBLOBs recruitment) throws RuntimeException;

    String addOrUpdateBusiness(Business business) throws RuntimeException;

    List<BusinessEX> selectByKey(String key) throws  RuntimeException;

    String deleteById(int id) throws RuntimeException;
    String deleteRById(int id) throws RuntimeException;
}
