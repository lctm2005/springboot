package com.licong.springboot.web;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lctm2005 on 2015/9/4.
 */
@RestController
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
    public Random execute() {
        Random random = new Random();
        random.setNumber(number);
        random.setBignumber(bignumber);
        random.setSecret(secret);
        random.setInRange(inRange);
        random.setLessThanTen(lessThanTen);
        return random;
    }

    @Data
    class Random {
        private int number;
        private String secret;
        private String bignumber;
        private int lessThanTen;
        private int inRange;
    }

}
