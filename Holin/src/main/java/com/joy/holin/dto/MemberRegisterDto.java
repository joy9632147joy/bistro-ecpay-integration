package com.joy.holin.dto;

import lombok.Data;

@Data
public class MemberRegisterDto {
    private String name;
    private String email;
    private String pwd;
    private String phone;
    private String address;
}
