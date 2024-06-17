package com.api.prechell.api.service.content.dto;

import com.api.prechell.domain.content.ContentEntity;
import lombok.Builder;

public class ContentResponse {

    private Long contentId;
    private String videoLayout;
    private String username;
    private String keywords;
    private String title;
    private String description;

    @Builder
    private ContentResponse(Long contentId,String videoLayout,String username, String keywords, String title, String description){

        this.contentId = contentId;
        this.videoLayout = videoLayout;
        this.username = username;
        this.keywords = keywords;
        this.title = title;
        this.description = description;
    }

    public static ContentResponse of(ContentEntity contentEntity){
        return ContentResponse.builder()
                .contentId(contentEntity.getContentId())
                .videoLayout(contentEntity.getVideoLayout())
                .username(contentEntity.getUsername())
                .keywords(contentEntity.getKeywords())
                .title(contentEntity.getTitle())
                .description(contentEntity.getDescription())
                .build();
    }
}
