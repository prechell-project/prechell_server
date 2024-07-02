package com.api.prechell.api.service.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewHistoryDTO {
    private Long viewHistoryId;
    private Long userId;
    private Long contentId;
    private String videoTitle;
    private String watchedAt;
}

