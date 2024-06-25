package com.api.prechell.api.service.support;

import com.api.prechell.api.service.support.dto.SupportResponse;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.support.SupportEntity;
import com.api.prechell.domain.support.SupportRepository;
import com.api.prechell.domain.support.SupportRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SupportServiceImpl implements SupportService {

    private final SupportRepository supportRepository;

    @Override
    public SupportResponse createSupport(SupportRequest supportRequest) {
        SupportEntity supportEntity = new SupportEntity();
        supportEntity.setInquiryType(supportRequest.getTitle());
        supportEntity.setInquiryContent(supportRequest.getContent());
        supportEntity.setPublic(supportRequest.isPublic());
        supportEntity.setMemberEntity(new MemberEntity());
        supportEntity.getMemberEntity().setId(supportRequest.getMemberId());
        supportEntity.setCreatedAt(LocalDateTime.now());
        SupportEntity savedEntity = supportRepository.save(supportEntity);

        return toResponse(savedEntity);
    }

    @Override
    public List<SupportResponse> getAllPublicSupports() {
        return supportRepository.findByIsPublicTrue()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<SupportResponse> getUserSupports(Long memberId) {
        return supportRepository.findByMemberEntityId(memberId)
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<SupportResponse> getFAQs() {
        return supportRepository.findByInquiryType("FAQ")
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    private SupportResponse toResponse(SupportEntity supportEntity) {
        SupportResponse response = new SupportResponse();
        response.setId(supportEntity.getSupportId());
        response.setTitle(supportEntity.getInquiryType());
        response.setContent(supportEntity.getInquiryContent());
        response.setPublic(supportEntity.isPublic());
        response.setMemberId(supportEntity.getMemberEntity().getId());
        response.setCreatedAt(supportEntity.getCreatedAt());
        return response;
    }
}