package com.tlylb.authcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthcenterApplication.class, args);
    }

}
