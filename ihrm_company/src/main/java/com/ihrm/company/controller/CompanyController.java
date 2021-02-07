package com.ihrm.company.controller;


import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.company.service.CompanyService;
import com.ihrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/save")
    public Result saveCompany(@RequestBody Company company){
        companyService.addCompany(company);
        return  new Result(ResultCode.SUCCESS);
    }

    @PostMapping("/update/{id}")
    public Result updateCompany(@PathVariable("id") String id ,@RequestBody Company company){
        company.setId(id);
        companyService.updateCompany(company);
        return  new Result(ResultCode.SUCCESS);
    }

    @GetMapping("/delete/{id}")
    public Result deleteCompanyById(@PathVariable("id") String id){
        companyService.deleteCompanyById(id);
        return  new Result(ResultCode.SUCCESS);
    }

    @GetMapping("/get/{id}")
    public Result getCompanyById(@PathVariable("id") String id){
        Company compantById = companyService.getCompantById(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(compantById);
        return result;
    }

    @GetMapping("/getAll")
    public Result findAllCompany() throws Exception{
        List<Company> companyList = companyService.getCompanyList();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(companyList);
        return result;
    }
}
