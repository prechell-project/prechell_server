package com.api.prechell.domain.profile;

import com.api.prechell.api.service.auth.dto.ProfileDTO;

public class ProfileResponse {

    private String status;
    private ProfileDTO data;

    public ProfileResponse() {
    }

    public ProfileResponse(String status, ProfileDTO data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProfileDTO getData() {
        return data;
    }

    public void setData(ProfileDTO data) {
        this.data = data;
    }
}

