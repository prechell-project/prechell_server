package com.api.prechell.legacy.entity;

import com.api.prechell.domain.content.ContentEntity;
import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private MemberEntity memberEntity;

    @ManyToOne
    @JoinColumn(name = "content_id", nullable = false)
    private ContentEntity content;

    @Column(nullable = false, length = 500)
    private String commentText;

    @Column(nullable = false)
    private LocalDateTime commentedAt = LocalDateTime.now();

}
