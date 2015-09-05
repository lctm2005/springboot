package com.licong.springboot;

import com.licong.springboot.web.listener.ApplicationStartupListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@RestController
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(App.class);
        springApplication.addListeners(new ApplicationStartupListener());
        springApplication.run(App.class, args);
    }
}
