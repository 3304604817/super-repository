package com.supers.basic.domain.entity;

import lombok.Data;

@Data
public class SysUser {
    public static final String FIELD_USER_ID = "userId";
    public static final String FIELD_USER_NAME = "userName";

    private Long userId;

    private String userName;
}
