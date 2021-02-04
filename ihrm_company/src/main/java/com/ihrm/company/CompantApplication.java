package com.ihrm.company;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.ihrm.company")
@EntityScan(value = "com.ihrm.domain.company")
public class CompantApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompantApplication.class);
    }
}
