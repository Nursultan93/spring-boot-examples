package com.course.l1springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/get-name/{name}")
    public String getName(@PathVariable String name) {
        return name +" Test";
    }

    @GetMapping("/topla/{birinci}/{ikinci}")
    public Integer toplama(@PathVariable Integer birinci, @PathVariable Integer ikinci) {
        return birinci + ikinci;
    }
}
