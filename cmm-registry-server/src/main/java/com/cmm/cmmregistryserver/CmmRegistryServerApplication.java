package com.cmm.cmmregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer

@SpringBootApplication
public class CmmRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmmRegistryServerApplication.class, args);
    }

}
