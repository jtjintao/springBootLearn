package day3.controller;

import day3.configs.day3configs;
import day3.domain.Ball;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day3Contoller1 {

    @Autowired
    day3configs xday3configs;
    @Autowired
    Ball ball;

    @GetMapping("getConfigs")
    public String getConfigs(){
        System.out.println(ball==xday3configs.getBall());
        return xday3configs.getName()+"  "+ xday3configs.getAge()+ " ball.size:"+xday3configs.getBall().getSize()+ "ball.color:"+xday3configs.getBall().getColor();

    }
}
