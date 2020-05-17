package com.mybatis.studybatis.controller;

import com.mybatis.studybatis.entity.User1;
import com.mybatis.studybatis.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BatisController {
    @Autowired
    UserService userService;
    @PostMapping("/selectAllUser")
    public String selectAllUser(String sql){
        System.out.println("here");
        return userService.getalluser(sql);

    }
}
