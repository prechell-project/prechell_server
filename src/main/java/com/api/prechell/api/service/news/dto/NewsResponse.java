package com.api.prechell.api.service.news.dto;

import com.api.prechell.domain.news.NewsEntity;
import lombok.Builder;

public class NewsResponse {
    private Long newsId;
    private String type;
    private String content;

    @Builder
    private NewsResponse(Long newsId, String type, String content){

        this.newsId = newsId;
        this.type = type;
        this.content = content;
    }

    public static NewsResponse of(NewsEntity newsEntity){
        return NewsResponse.builder()
                .newsId(newsEntity.getNewsId())
                .type(newsEntity.getType())
                .content(newsEntity.getContent())
                .build();
    }
}
