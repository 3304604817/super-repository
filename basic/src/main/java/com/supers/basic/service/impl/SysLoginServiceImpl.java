package com.supers.basic.service.impl;

import com.supers.basic.domain.entity.SysLogin;
import com.supers.basic.domain.repository.SysLoginRepository;
import com.supers.basic.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLoginServiceImpl implements SysLoginService {
    @Autowired
    private SysLoginRepository sysLoginRepository;

    @Override
    public List<SysLogin> listLogin(){
        return sysLoginRepository.listLogin();
    }
}
