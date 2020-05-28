package com.ckk.consumeserver;

import com.ckk.product.client.TestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = TestClient.class)
public class ConsumeserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeserverApplication.class, args);
    }

}
