package org.learn.springboot.helloworld.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @Autowired
    Person person;

    @RequestMapping(value = "/test")
    public void test() {
        System.out.println("helloworld \n");
        System.out.println(person.getName());
    }

}
