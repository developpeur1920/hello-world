package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value ="/")
    public String ShowhelloWorld(){
        return "index";
    }



}
