package com.api.prechell.domain.upload;

import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "upload")
public class UploadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uploadId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private MemberEntity memberEntity;

    @Column(length = 255)
    private String filePath;

    @Column(length = 255)
    private String videoTags;

    @Column(length = 100)
    private String videoTitle;

    @Column(length = 500)
    private String description;

    @Column(length = 255)
    private String thumbnailSetting;

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
