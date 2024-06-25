package com.api.prechell.api.controller.trend;

import com.api.prechell.api.service.auth.dto.CreatorRankingResponse;
import com.api.prechell.api.service.auth.dto.KeywordRankingResponse;
import com.api.prechell.api.service.trend.TrendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trend")
@RequiredArgsConstructor

public class TrendController {

    private final TrendService trendService;

    @GetMapping("/keyword-ranking")
    public ResponseEntity<List<KeywordRankingResponse>> getKeywordRanking() {
        List<KeywordRankingResponse> keywordRankings = trendService.getKeywordRankings(10);
        return ResponseEntity.ok(keywordRankings);
    }

    @GetMapping("/creator-ranking")
    public ResponseEntity<List<CreatorRankingResponse>> getCreatorRanking() {
        List<CreatorRankingResponse> creatorRankings = trendService.getCreatorRankings(10);
        return ResponseEntity.ok(creatorRankings);
    }

    @GetMapping("/award-points")
    public ResponseEntity<Void> awardPointsToTopCreators() {
        trendService.awardPointsToTopCreators();
        return ResponseEntity.ok().build();
    }
}