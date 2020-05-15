package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ServletComponentScan
@RestController
public class Mywebapplication {
    public static void main(String[] args) {
        SpringApplication.run(Mywebapplication.class,args);
    }
}
