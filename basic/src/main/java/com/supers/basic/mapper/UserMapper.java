package com.supers.basic.mapper;

import com.supers.basic.domain.entity.IamUser;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Component
public interface UserMapper extends Mapper<IamUser> {
    List<IamUser> list(IamUser dto);
}
