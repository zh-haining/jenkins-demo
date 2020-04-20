package com.snpx.jenkinsdemo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public String sayHello(String name){
        String uuid = UUID.randomUUID().toString().toLowerCase();
        String msg = String.format("Hi %s, nice | %s",name,uuid);
        System.out.println(msg);
        return msg;
    }
}
