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
import java.util.Map;

@Controller
@RequestMapping("/basic")
public class BasicController {
    @Autowired
    private RedisHelper redisHelper;

    @GetMapping("/hello")
    public ResponseEntity hello(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("hello");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/cache")
    public ResponseEntity redisCache(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("GetMapping");
        redisHelper.setCache("1", "1");
        redisHelper.setCache("2", "2");
        redisHelper.setCache("3", "3");
        redisHelper.setCache("4", "4");
        redisHelper.setCache("5", "5");
        Map<String, Object> redisMap = redisHelper.batchGetCatch("1", "2", "3", "4", "5");
        redisHelper.batchDelCache("1", "2", "3", "4", "5");
        return new ResponseEntity(HttpStatus.OK);
    }
}
