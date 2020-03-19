package com.supers.basic.domain.entity;

import lombok.Data;

@Data
public class SysLogin {
    public static final String FIELD_LOGIN_ID = "loginId";
    public static final String FIELD_LOGIN_NUM = "loginNum";
    public static final String FIELD_PASSWORD = "password";
    public static final String FIELD_USER_ID = "userId";

    private Long loginId;

    private String loginNum;

    private String password;

    private Long userId;
}
