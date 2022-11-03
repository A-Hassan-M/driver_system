package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        AdminConroller Admin;
        System.out.println("Start Application");
        SpringApplication.run(DemoApplication.class, args);
    }

}
