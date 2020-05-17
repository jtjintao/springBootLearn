package com.controler;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyControler1 {
    @Autowired
    UserService userService;
    @Autowired
    User user;


    @GetMapping("/path")
    public boolean getInfo(){

        return true;
    }
    @GetMapping("/userInfo")
    public String getUserInfo(){
        return "name="+user.getName()+",age="+user.getAge();
    }
    @GetMapping("/setUserInfo")
    public String setUserInfo(Integer age){
        user.setAge(age);
        return "name="+user.getName()+",age="+user.getAge();
    }
}
