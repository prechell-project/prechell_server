package com.api.prechell.api.service.trend;


import com.api.prechell.api.service.auth.dto.CreatorRankingResponse;
import com.api.prechell.api.service.auth.dto.KeywordRankingResponse;
import com.api.prechell.domain.trend.TrendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class TrendServiceImpl implements TrendService {

    private final TrendRepository trendRepository;

    @Override
    public List<KeywordRankingResponse> getKeywordRankings(int limit) {
        return trendRepository.findTop10ByOrderByRankingAsc()
                .stream()
                .map(trend -> new KeywordRankingResponse(trend.getKeyword(), Integer.parseInt(trend.getRanking()), trend.getSearchCount()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CreatorRankingResponse> getCreatorRankings(int limit) {
        // 크리에이터 랭킹을 조회하는 로직을 구현해야 합니다.
        return List.of(
                new CreatorRankingResponse("user1", 1, 1000),
                new CreatorRankingResponse("user2", 2, 900),
                new CreatorRankingResponse("user3", 3, 800)
        );
    }
    @Override
    public void awardPointsToTopCreators() {
        List<CreatorRankingResponse> topCreators = getCreatorRankings(3);
        for (CreatorRankingResponse creator : topCreators) {
            if (creator.getRanking() == 1) {
                creator.setPoints(creator.getPoints() + 100); // 1등에게 100 포인트
            } else if (creator.getRanking() == 2) {
                creator.setPoints(creator.getPoints() + 50);  // 2등에게 50 포인트
            } else if (creator.getRanking() == 3) {
                creator.setPoints(creator.getPoints() + 30);  // 3등에게 30 포인트
            }
        }
    }
}