package com.springboot.pointofsale.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@CrossOrigin
public class TestController {


    @GetMapping
    public void getMyText(){

        String myText = "Fundamental_PPT";
        System.out.println(myText);
    }


}
