package com.supers.basic.mapper;

import com.supers.basic.domain.entity.SysLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface SysLoginMapper {
    List<SysLogin> listLogin();
}
