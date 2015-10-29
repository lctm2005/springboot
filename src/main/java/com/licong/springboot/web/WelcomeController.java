package com.licong.springboot.web;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model, HttpServletRequest request) {
        model.put("time", new Date());
        model.put("message", this.message);
        HttpSession httpSession =  request.getSession();
        httpSession.setAttribute("name","licong");
        return "welcome";
    }
}
