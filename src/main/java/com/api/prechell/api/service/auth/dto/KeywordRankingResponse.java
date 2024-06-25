package com.api.prechell.api.service.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KeywordRankingResponse {
    private String keyword;
    private int ranking;
    private int searchCount;
}
