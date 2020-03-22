package com.supers.basic.mapper;

import com.supers.basic.domain.entity.SysLogin;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Component
public interface SysLoginMapper extends Mapper<SysLogin> {
    List<SysLogin> listLogin();
}
