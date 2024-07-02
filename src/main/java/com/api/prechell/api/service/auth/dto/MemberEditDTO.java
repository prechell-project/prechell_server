package com.api.prechell.api.service.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberEditDTO {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}

