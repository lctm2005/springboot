package com.licong.springboot;

import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author licong
 * @date 2016/3/23
 */
public class TraversonTest {

    public static void main(String[] args) throws URISyntaxException {
//        Traverson traverson = new Traverson(new URI("http://localhost:8080/users/1"), MediaTypes.HAL_JSON);
//        String name = traverson.follow("").toObject("$.name").toString();
//        System.out.println(name);
        Traverson traverson = new Traverson(new URI("http://localhost:8080/users/1/department"), MediaTypes.HAL_JSON);
        String name = traverson.follow("parent","parent").
                toObject("$.name").toString();
        System.out.println(name);
    }
}
