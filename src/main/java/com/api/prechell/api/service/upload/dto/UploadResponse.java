package com.api.prechell.api.service.upload.dto;

import com.api.prechell.domain.upload.UploadEntity;
import lombok.Builder;

public class UploadResponse {
    private Long uploadId;
    private String filePath;
    private String videoTags;
    private String videoTitle;
    private String description;
    private String thumbnailSetting;

    @Builder
    public UploadResponse(Long uploadId, String filePath, String videoTags,String videoTitle,String description,String thumbnailSetting){
        this.uploadId=uploadId;
        this.filePath=filePath;
        this.videoTags=videoTags;
        this.videoTitle=videoTitle;
        this.description=description;
        this.thumbnailSetting=thumbnailSetting;
    }

    public static UploadResponse of(UploadEntity uploadEntity){
        return UploadResponse.builder()
                .uploadId(uploadEntity.getUploadId())
                .filePath(uploadEntity.getFilePath())
                .videoTags(uploadEntity.getVideoTags())
                .videoTitle(uploadEntity.getVideoTitle())
                .description(uploadEntity.getDescription())
                .thumbnailSetting(uploadEntity.getThumbnailSetting())
                .build();
    }
}
