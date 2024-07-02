package com.api.prechell.domain.view;

import com.api.prechell.legacy.entity.ViewHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ViewHistoryRepository extends JpaRepository<ViewHistory, Long> {
    List<ViewHistory> findByUserId(Long userId);
}

