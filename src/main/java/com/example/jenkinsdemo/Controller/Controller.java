package com.example.jenkinsdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }
}
