package com.supers.basic.controller;

import org.apache.ibatis.annotations.Results;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/basic")
public class BasicController {
    @GetMapping("/hello")
    public ResponseEntity hello(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("GetMapping");
        return new ResponseEntity(HttpStatus.OK);
    }
}
