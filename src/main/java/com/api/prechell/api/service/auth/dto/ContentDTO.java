package com.api.prechell.api.service.auth.dto;

import com.api.prechell.domain.upload.UploadEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContentDTO {

    private Long contentId;
    private String videoLayout;
    private String username;
    private String keywords;
    private String title;
    private String description;
    private String imageUrl;
    private String videoUrl;

}


