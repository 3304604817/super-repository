package com.supers.basic.service;

import com.supers.basic.domain.entity.IamUser;

import java.util.List;

public interface UserService {
    List<IamUser> list(IamUser dto);
}
