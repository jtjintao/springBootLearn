package thymeleaf.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeafController {
    @GetMapping("/path")
    public String hello(){
        System.out.println("hello boot");
        return "index";
    }
}
