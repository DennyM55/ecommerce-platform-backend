package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.ecommerce.repository")
@EntityScan(basePackages = "com.example.ecommerce.model")
public class EcommerceBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBasicApplication.class, args);
    }

}
