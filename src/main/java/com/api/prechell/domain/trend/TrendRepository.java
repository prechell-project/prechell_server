package com.api.prechell.domain.trend;

import com.api.prechell.domain.trend.TrendEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrendRepository extends JpaRepository<TrendEntity, Long> {

    List<TrendEntity> findTop10ByOrderByRankingAsc();
}