package com.licong.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author licong
 * @date 15-9-7
 */
@RestController
public class GreetingsController {
    @Autowired
    private CounterService counterService;

    @RequestMapping("/greet")
    public String greet() {
        counterService.increment("myapp.greet.count");
        return "Hello!";
    }
}