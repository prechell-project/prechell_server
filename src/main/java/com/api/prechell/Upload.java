package com.api.prechell;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "upload")
public class Upload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uploadId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

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

}