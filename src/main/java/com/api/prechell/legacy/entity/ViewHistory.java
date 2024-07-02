package com.api.prechell.legacy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "view_history")
public class ViewHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "content_id")
    private Long contentId;

    @Column(name = "video_title")
    private String videoTitle;

    @Column(name = "watched_at")
    private LocalDateTime watchedAt;

}

