package com.supers.basic.mapper;

import com.supers.basic.domain.entity.IamUser;
import org.springframework.stereotype.Component;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Component
public interface UserMapper {
    List<IamUser> list(IamUser dto);
}
