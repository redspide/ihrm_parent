package com.ihrm.company;


import com.ihrm.company.dao.ComPanyDao;
import com.ihrm.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyDaoTest {

    @Autowired
    private ComPanyDao comPanyDao;

    @Test
    public  void testJpa(){
        Company company = comPanyDao.findAll().get(0);
        System.out.println(company.getName());
    }
}
