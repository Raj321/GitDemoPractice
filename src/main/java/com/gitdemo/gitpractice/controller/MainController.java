package com.gitdemo.gitpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

    @GetMapping("/hello")
    public  String HelloWorld(){

        return "hello";
    }
    @GetMapping("/fetch")
    public  String Save(){

        return "commit and push";
    }

    @PostMapping("/save")
    public  String saveObject(){

        return "retrieve";
    }


}
