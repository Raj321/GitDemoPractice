package com.gitdemo.gitpractice.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
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
    public  String getObject(){

        return "fetch the result";
    }

    @PostMapping("/save")
    public  String saveObject(){

        return "save into db";
    }

    @DeleteMapping("/delete")
    public  String deleteObject(){

        return "delete object from db";
    }
    @DeleteMapping("/deleteByID")
    public  String deleteObjectById(){

        return "delete object from db";
    }


}
