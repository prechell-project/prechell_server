package com.api.prechell.api.service.auth.dto;

import com.api.prechell.domain.member.Gender;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JoinDto {
    private String email;
    private String password;
    private String userName;
}
