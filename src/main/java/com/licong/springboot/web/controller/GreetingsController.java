package com.licong.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.trace.TraceRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author licong
 * @date 15-9-7
 */
@RestController
public class GreetingsController {
    @Autowired
    private CounterService counterService;

    @Autowired
    private TraceRepository traceRepository;

    @RequestMapping("/greet")
    public String greet() {
        counterService.increment("myapp.greet.count");
        Map<String,Object> trace = new HashMap<>();
        trace.put("mystrace", "XXX");
        traceRepository.add(trace);
        return "Hello!";
    }
}