package com.api.prechell.api.service.upload.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UploadResponse {
    private Long uploadId;
    private Long memberId;
    private String filePath;
    private String videoTags;
    private String videoTitle;
    private String description;
    private String thumbnailSetting;
    private LocalDateTime createdAt;
}