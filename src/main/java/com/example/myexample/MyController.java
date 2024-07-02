package com.example.myexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.observation.annotation.Observed;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Observed
public class MyController {
 
    @GetMapping("/welcome")
    public String welcome(){
        log.info("called welcome endpoint");
        return "this is welcome message........";
    }

    @GetMapping("/home")
    public String home(){
        log.info("called home  endpoint");
        return "this is home message........";
    } 
}