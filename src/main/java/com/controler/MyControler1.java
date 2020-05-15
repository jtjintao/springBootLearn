package com.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path1")
public class MyControler1 {
    @GetMapping("/path2")
    public String getInfo(String a,String b){
        System.out.println("print:"+a+b);
        return "aaaaa"+a+b;
    }
}
