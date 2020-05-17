package com.config;

import com.domain.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;



@SpringBootConfiguration
public class Config {
    @Bean
    public User getUser(){
        User user = new User("jintao",30);
        return user;
}
}
