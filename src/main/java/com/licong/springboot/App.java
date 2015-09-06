package com.licong.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
        app.setShowBanner(false);
        app.run(App.class, args);
    }
}
