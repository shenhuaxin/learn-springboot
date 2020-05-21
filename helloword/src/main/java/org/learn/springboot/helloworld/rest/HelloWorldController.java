package org.learn.springboot.helloworld.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @RequestMapping(value = "/test")
    public void test() {
        System.out.println("helloworld-hello");
    }

}
