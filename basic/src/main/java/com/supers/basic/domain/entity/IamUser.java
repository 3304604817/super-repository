package com.supers.basic.domain.entity;

import lombok.Data;

@Data
public class IamUser {
    private Long id;

    private String loginName;

    private String email;

    private Long organizationId;

    private String hashPassword;

    private String realName;

    private String phone;

    private String internationalTelCode;

    private String language;

    private String timeZone;
}
