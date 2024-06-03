package com.api.prechell;

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
    private User user;

    @ManyToOne
    @JoinColumn(name = "content_id", nullable = false)
    private Content content;

    @Column(nullable = false)
    private String commentText;

    @Column(nullable = false)
    private LocalDateTime commentedAt = LocalDateTime.now();

}