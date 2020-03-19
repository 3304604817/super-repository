package com.supers.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/basic")
public class BasicController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("GetMapping");
        return String.format("Hello %s!", name);
    }
}
