package com.supers.basic.controller;

import com.supers.basic.domain.entity.IamUser;
import com.supers.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity userList(@RequestParam(value = "loginName", defaultValue = "admin") String loginName) {
        List<IamUser> users = userService.list(new IamUser());
        System.out.println("GetMapping");
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
