package com.example.ecommercebasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class EcommerceBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBasicApplication.class, args);
    }

}
