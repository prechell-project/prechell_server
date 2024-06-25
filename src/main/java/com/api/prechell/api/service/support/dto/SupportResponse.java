package com.api.prechell.api.service.support.dto;

import com.api.prechell.api.service.news.dto.NewsResponse;
import com.api.prechell.domain.support.SupportEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SupportResponse {
    private Long id;
    private String title;
    private String content;
    private boolean isPublic;
    private Long memberId;
    private LocalDateTime createdAt;
}