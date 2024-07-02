package com.api.prechell.api.service.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberDTO {

    private String email;
    private String password;
    private String username;
    private String phoneNumber;


}

