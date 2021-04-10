package com.gitdemo.gitpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

    @GetMapping("/hello")
    public  String HelloWorld(){

        return "hello";
    }
    @GetMapping("/fetch")
    public  String Save(){

        return "change it from retrieve to get data from db";
    }
}
