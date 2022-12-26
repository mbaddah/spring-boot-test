package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("{org.example.controller},{org.example.repository},{org.example.service}")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
