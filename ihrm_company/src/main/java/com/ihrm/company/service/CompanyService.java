package com.ihrm.company.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.ComPanyDao;
import com.ihrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private ComPanyDao comPanyDao;

    @Autowired
    private IdWorker idWorker;

    public void  addCompany(Company company){
        String id=idWorker.nextId()+"";
        company.setId(id);
        company.setAuditState("0");
        company.setState(1);
        Company save = comPanyDao.save(company);
    }

    public void  updateCompany(Company company){
        Company temp = comPanyDao.findById(company.getId()).get();
        temp.setName(company.getName());
        temp.setCompanyPhone(company.getCompanyPhone());
        Company save = comPanyDao.save(temp);
    }

    public  void  deleteCompanyById(String id){
        comPanyDao.deleteById(id);

    }

    public Company getCompantById(String id){
        return comPanyDao.findById(id).get();
    }

    public List<Company> getCompanyList(){
        List<Company> all = comPanyDao.findAll();
        return  all;
    }
}
