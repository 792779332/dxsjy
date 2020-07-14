package com.example.dxsjy.Service.Impl;

import com.example.dxsjy.Bean.Business;
import com.example.dxsjy.Bean.EX.BusinessEX;
import com.example.dxsjy.Bean.RecruitmentExample;
import com.example.dxsjy.Bean.RecruitmentWithBLOBs;
import com.example.dxsjy.Mapper.BusinessMapper;
import com.example.dxsjy.Mapper.EX.BusinessEXMapper;
import com.example.dxsjy.Mapper.RecruitmentMapper;
import com.example.dxsjy.Service.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements IBusinessService {

    @Autowired
    private BusinessEXMapper businessEXMapper;
    @Autowired
    private RecruitmentMapper recruitmentMapper;
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<BusinessEX> findAll() throws RuntimeException {

       List<BusinessEX>list = businessEXMapper.findAll();
        return list;
    }

    @Override
    public BusinessEX findById(int id) throws RuntimeException {
        BusinessEX businessEX=businessEXMapper.findById(id);

        return businessEX;
    }

    @Override
    public String addOrUpdateRecruitment(RecruitmentWithBLOBs recruitment) throws RuntimeException {
        Business business=businessMapper.selectByPrimaryKey(recruitment.getbId());
        if (recruitment.getId()==null){

            if (business==null||business.equals("")){
                return "公司不存在请重新输入";
            }else {
                recruitmentMapper.insert(recruitment);
                return "添加成功";
            }

        }else {

            if (business==null||business.equals("")){
                return "公司不存在请重新输入";
            }else {

                recruitmentMapper.updateByPrimaryKeyWithBLOBs(recruitment);
                return "修改成功";
            }
        }

    }

    @Override
    public String addOrUpdateBusiness(Business business) throws RuntimeException {
        if (business.getbId()==null){

            businessMapper.insert(business);
            return "添加成功";
        }else {

            businessMapper.updateByPrimaryKey(business);
            return "修改成功";
        }

    }

    @Override
    public List<BusinessEX> selectByKey(String key) throws RuntimeException {
        if (key==null){
            key="";
        }
        key="%"+key+"%";
        List<BusinessEX> list = businessEXMapper.selectByKey(key);
        return list;
    }

    @Override
    public String deleteById(int id) throws RuntimeException {
        RecruitmentExample recruitmentExample=new RecruitmentExample();
        recruitmentExample.createCriteria().andBIdEqualTo(id);
        recruitmentMapper.deleteByExample(recruitmentExample);
        businessMapper.deleteByPrimaryKey(id);

        return "删除成功";
    }

    @Override
    public String deleteRById(int id) throws RuntimeException {
        recruitmentMapper.deleteByPrimaryKey(id);
        return "删除成功";
    }
}
