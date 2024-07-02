package com.api.prechell.api.service.profile.dto;

import com.api.prechell.api.service.auth.dto.ProfileDTO;

public class ProfileResponse {

    private String status;
    private ProfileDTO data;

    public ProfileResponse(String success, ProfileDTO profileDTO) {
    }

    // constructors, getters, setters, toString etc.
}

