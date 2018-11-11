package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@ResponseBody
@RestController
public class AppController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
