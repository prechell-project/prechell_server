package com.api.prechell.api.service.auth.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LikeDTO {

    private Long likeId;
    private Long userId;
    private Long contentId;
    private LocalDateTime likedAt;


}

