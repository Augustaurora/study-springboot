package com.aurocal.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Example")
public class ExampleController {

    @RequestMapping
    public String home(){
        return "hello world ！";
    }

}
