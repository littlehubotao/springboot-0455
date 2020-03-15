package com.example.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {



    

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return  "11111";
    }



    @RequestMapping("/hello2")
    public String hello2(){
        return  "hello";
    }

}
