package com.api.prechell.api.service.support.dto;

import com.api.prechell.api.service.news.dto.NewsResponse;
import com.api.prechell.domain.support.SupportEntity;
import lombok.Builder;

import java.time.LocalDateTime;

public class SupportResponse {

    private Long supportId;
    private String inquiryType;
    private String inquiryContent;
    private String responseContent;
    private LocalDateTime responseDate;

    @Builder
    private SupportResponse(Long supportId,String inquiryType,String inquiryContent, String responseContent,LocalDateTime responseDate){

        this.supportId=supportId;
        this.inquiryType=inquiryType;
        this.inquiryContent=inquiryContent;
        this.responseContent=responseContent;
        this.responseDate=responseDate;
    }


    private static SupportResponse of(SupportEntity supportEntity){
        return SupportResponse.builder()
                .supportId(supportEntity.getSupportId())
                .inquiryType(supportEntity.getInquiryType())
                .inquiryContent(supportEntity.getResponseContent())
                .responseContent(supportEntity.getResponseContent())
                .responseDate(supportEntity.getResponseDate())
                .build();
    }
}
