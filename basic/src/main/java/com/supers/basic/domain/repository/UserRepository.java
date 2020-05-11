package com.supers.basic.domain.repository;

import com.supers.basic.domain.entity.IamUser;

import java.util.List;

public interface UserRepository {
    List<IamUser> list(IamUser dto);
}
