package com.supers.basic.controller;

import com.supers.basic.util.redis.RedisHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.soap.Addressing;

@Controller
@RequestMapping("/basic")
public class BasicController {
    @Autowired
    private RedisHelper redisHelper;

    @GetMapping("/hello")
    public ResponseEntity hello(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("GetMapping");
        redisHelper.setCache("redis", "Object");
        System.out.println(redisHelper.getCatch("redis"));
        return new ResponseEntity(HttpStatus.OK);
    }
}
