package com.ihrm.company;


import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.ihrm.company")
@EntityScan(value = "com.ihrm.domain.company")
public class CompantApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompantApplication.class);
    }

    @Bean
    public IdWorker idWorker(){
        return  new IdWorker();
    }
}
