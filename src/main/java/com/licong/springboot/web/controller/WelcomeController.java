package com.licong.springboot.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class WelcomeController {

    // ":" 后面表示当读取不到配置时使用的默认值
    @Value("${application.message:Hello World}")
    private String message;

    @RequestMapping("/")
    public ModelAndView welcome(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("name", "licong");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        modelAndView.addObject("message", this.message);
        return modelAndView;
    }
}
