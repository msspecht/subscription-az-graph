package com.br.subscriptionazgraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SubscriptionAzGraphApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubscriptionAzGraphApplication.class, args);
    }

}
