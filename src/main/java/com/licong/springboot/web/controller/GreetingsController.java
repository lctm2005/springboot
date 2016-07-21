package com.licong.springboot.web.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.trace.TraceRepository;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/v1/greet/{name}", method = RequestMethod.GET)
    public GreetingContent greet(@PathVariable("name") String name, @RequestParam Integer times, @RequestBody GreetingContent content) {
//        counterService.increment("myapp.greet.count");
//        Map<String, Object> trace = new HashMap<>();
//        trace.put("mystrace", "XXX");
//        traceRepository.add(trace);
        GreetingContent greetingContent = new GreetingContent();
        greetingContent.setGreetingWay(content.getGreetingWay());
        greetingContent.setGreetingContent("Hello " + name + ",I have received your greeting[" + content + "] " + times + " times!");
        return greetingContent;
    }
}