package com.api.prechell.legacy.entity;

import com.api.prechell.api.service.auth.dto.LikeDTO;
import com.api.prechell.domain.content.ContentEntity;
import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private MemberEntity memberEntity;

    @ManyToOne
    @JoinColumn(name = "content_id", nullable = false)
    private ContentEntity content;

    @Column(nullable = false)
    private LocalDateTime likedAt = LocalDateTime.now();

    private LikeDTO convertToDto(Likes like) {
        LikeDTO dto = new LikeDTO();
        dto.setLikeId(Long.valueOf(like.getLikeId())); // getter 메서드를 사용하여 접근
        dto.setUserId(like.getMemberEntity().getId());
        dto.setContentId(like.getContent().getContentId());
        dto.setLikedAt(like.getLikedAt());
        return dto;
    }

}
