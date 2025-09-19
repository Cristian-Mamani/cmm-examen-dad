package com.cmm.cmmmsmatriculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients

@SpringBootApplication
public class CmmMsMatriculasApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmmMsMatriculasApplication.class, args);
    }

}
