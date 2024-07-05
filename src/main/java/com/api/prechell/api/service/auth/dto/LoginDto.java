package com.api.prechell.api.service.auth.dto;

import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.Role;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginDto {
    private String email;
    private String password;
    private String userName;

}
