package com.api.prechell.api.service.like;

import com.api.prechell.api.service.auth.dto.LikeDTO;
import com.api.prechell.api.service.like.dto.LikeResponse;
import com.api.prechell.domain.like.LikeRepository;
import com.api.prechell.legacy.entity.Likes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    // 사용자의 ID를 기준으로 해당 사용자가 좋아요한 모든 컨텐츠를 조회하는 메서드
    public LikeResponse getLikesByUserId(Long userId) {
        List<Likes> likes = likeRepository.findByMemberEntityId(userId);
        return convertToResponse(likes);
    }

    // Like 엔티티 리스트를 LikeDTO 리스트로 변환하는 메서드
    private LikeResponse convertToResponse(List<Likes> likes) {
        LikeResponse response = new LikeResponse();
        List<LikeDTO> likeDTOs = likes.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        response.setLikes(likeDTOs);
        return response;
    }

    // Like 엔티티를 LikeDTO로 변환하는 메서드
    private LikeDTO convertToDto(Likes like) {
        LikeDTO dto = new LikeDTO();
        dto.setLikeId(Long.valueOf(like.getLikeId()));
        dto.setUserId(like.getMemberEntity().getId());
        dto.setContentId(like.getContent().getContentId());
        dto.setLikedAt(like.getLikedAt());
        return dto;
    }
}

