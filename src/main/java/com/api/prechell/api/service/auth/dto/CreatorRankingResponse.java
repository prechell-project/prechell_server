package com.api.prechell.api.service.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreatorRankingResponse {
    private String username;
    private int ranking;
    private int points;
}