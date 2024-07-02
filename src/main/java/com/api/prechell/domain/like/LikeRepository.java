package com.api.prechell.domain.like;

import com.api.prechell.legacy.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Likes, Integer> {

    // 사용자의 ID를 기준으로 해당 사용자가 좋아요한 모든 컨텐츠를 조회하는 메서드
    List<Likes> findByMemberEntityId(Long userId);

    // ContentEntity의 ID를 기준으로 해당 컨텐츠에 대한 좋아요 기록을 조회하는 메서드
    List<Likes> findByContentId(Long contentId);
}

