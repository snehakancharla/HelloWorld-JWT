package com.stackroute.UserLoginService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/hello")
    public String firstPage()
    {
        return "hello world";
    }

}
