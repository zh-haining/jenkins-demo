package com.snpx.jenkinsdemo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public String sayHello(String name){
        String msg = String.format("Hi %s, hello world",name);
        System.out.println(msg);
        return msg;
    }
}
