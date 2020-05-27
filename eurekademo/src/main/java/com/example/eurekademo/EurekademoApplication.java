package com.example.eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableEurekaServer

public class EurekademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekademoApplication.class, args);
    }

}
