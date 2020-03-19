package com.supers.basic.controller;

import com.supers.basic.domain.entity.SysLogin;
import com.supers.basic.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sys-login")
public class SysLoginController {
    @Autowired
    private SysLoginService sysLoginService;

    @GetMapping("/list")
    public List<SysLogin> listLogin() {
        List<SysLogin> sysLogins = sysLoginService.listLogin();
        return null;
    }
}
