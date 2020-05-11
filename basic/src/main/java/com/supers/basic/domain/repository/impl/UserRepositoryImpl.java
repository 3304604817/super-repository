package com.supers.basic.domain.repository.impl;

import com.supers.basic.domain.entity.IamUser;
import com.supers.basic.domain.repository.UserRepository;
import com.supers.basic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<IamUser> list(IamUser dto){
        return userMapper.list(dto);
    }
}
