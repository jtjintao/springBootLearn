package com.mybatis.studybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.studybatis.DAO")
public class StudybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudybatisApplication.class, args);
    }

}
