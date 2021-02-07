package com.ihrm.company;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan(value = "com.ihrm.domain.company")
@EnableSwagger2
public class CompantApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompantApplication.class);
    }

    @Bean
    public IdWorker idWorker(){
        return  new IdWorker();
    }
}
