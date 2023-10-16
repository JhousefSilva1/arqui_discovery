package com.example.discov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscovApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscovApplication.class, args);
    }

}
