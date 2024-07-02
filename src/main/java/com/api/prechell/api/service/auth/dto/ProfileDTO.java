package com.api.prechell.api.service.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProfileDTO {

    private Integer profileId;
    private String profileImage;
    private String username;
    private String selfIntroduction;
    private Integer totalViews;
    private Integer totalPoints;


}

