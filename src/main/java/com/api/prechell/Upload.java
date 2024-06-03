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

    private String filePath;
    private String videoTags;
    private String videoTitle;
    private String description;
    private String thumbnailSetting;

}