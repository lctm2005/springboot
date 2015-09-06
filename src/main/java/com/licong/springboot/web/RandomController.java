package com.licong.springboot.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lctm2005 on 2015/9/4.
 */
@Slf4j
@Controller
public class RandomController {

    @Value("${my.number}")
    private int number;

    @Value("${my.secret}")
    private String secret;

    @Value("${my.bignumber}")
    private String bignumber;

    @Value("${my.number.less.than.ten}")
    private int lessThanTen;

    @Value("${my.number.in.range}")
    private int inRange;

    @RequestMapping("/random")
    @ResponseBody
    public String execute() {
        return "my.number:" + number
                + "<br>my.secret:" + secret
                + "<br>my.bignumber:" + bignumber
                + "<br>my.number.less.than.ten:" + lessThanTen
                + "<br>my.number.in.range:" + inRange;
    }

}
