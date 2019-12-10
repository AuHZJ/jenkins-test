package com.duapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: huzhijin
 * @create: 2019/12/10 8:53 下午
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
