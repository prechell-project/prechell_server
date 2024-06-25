package com.api.prechell.api.service.trend;

import com.api.prechell.api.service.auth.dto.CreatorRankingResponse;
import com.api.prechell.api.service.auth.dto.KeywordRankingResponse;

import java.util.List;

public interface TrendService {

    //상위 키워드 랭킹 조회
    List<KeywordRankingResponse> getKeywordRankings(int limit);

    //상위 크리에이터 랭킹 조회
    List<CreatorRankingResponse> getCreatorRankings(int limit);

    void awardPointsToTopCreators();
}