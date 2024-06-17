package com.api.prechell.api.service.auth.dto;

import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadDTO {
    private Long uploadId;
    private MemberEntity memberEntity;
    private String filePath;
    private String videoTags;
    private String videoTitle;
    private String description;
    private String thumbnailSetting;
}
