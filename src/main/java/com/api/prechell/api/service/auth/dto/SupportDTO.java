package com.api.prechell.api.service.auth.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SupportDTO {
    private Long supportId;
    private String inquiryType;
    private String inquiryContent;
    private String responseContent;
    private LocalDateTime responseDate;
}
