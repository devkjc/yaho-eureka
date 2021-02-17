package com.toy.yahoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YahoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YahoEurekaApplication.class, args);
    }

}
