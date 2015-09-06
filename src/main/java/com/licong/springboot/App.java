package com.licong.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@RestController
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(App.class);
        springApplication.run(App.class, args);
    }
}
