package com.ylb.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TulingStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(TulingStockApplication.class, args);
    }

}
