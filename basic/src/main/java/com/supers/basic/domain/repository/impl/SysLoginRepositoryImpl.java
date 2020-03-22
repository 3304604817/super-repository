package com.supers.basic.domain.repository.impl;

import com.supers.basic.domain.entity.SysLogin;
import com.supers.basic.domain.repository.SysLoginRepository;
import com.supers.basic.mapper.SysLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysLoginRepositoryImpl implements SysLoginRepository {
    @Autowired
    private SysLoginMapper sysLoginMapper;

    @Override
    public List<SysLogin> listLogin(){
//        return sysLoginMapper.listLogin();
        return sysLoginMapper.selectAll();
    }
}
