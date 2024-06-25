package com.api.prechell.domain.support;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupportRequest {
    private String title;
    private String content;
    private boolean isPublic;
    private Long memberId;
}