package com.api.prechell.api.service.trend.dto;

import com.api.prechell.domain.trend.TrendEntity;
import lombok.Builder;

public class TrendResponse {
    private Long trendId;
    private String keyword;
    private String ranking;

    @Builder
    private TrendResponse(Long trendId,String keyword,String ranking){
        this.trendId=trendId;
        this.keyword=keyword;
        this.ranking=ranking;
    }

    private static TrendResponse of(TrendEntity trendEntity){
        return TrendResponse.builder()
                .trendId(trendEntity.getTrendId())
                .keyword(trendEntity.getKeyword())
                .ranking(trendEntity.getRanking())
                .build();
    }
}
