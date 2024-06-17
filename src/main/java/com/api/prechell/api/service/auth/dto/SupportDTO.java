package com.api.prechell.api.service.auth.dto;

import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
