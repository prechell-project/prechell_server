package com.api.prechell.domain.upload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadRequest {
    private Long memberId;
    private String filePath;
    private String videoTags;
    private String videoTitle;
    private String description;
    private String thumbnailSetting;
}