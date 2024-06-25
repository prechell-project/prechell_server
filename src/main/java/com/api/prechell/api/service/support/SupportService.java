package com.api.prechell.api.service.support;

import com.api.prechell.api.service.support.dto.SupportResponse;
import com.api.prechell.domain.support.SupportRequest;

import java.util.List;

public interface SupportService {
    SupportResponse createSupport(SupportRequest supportRequest);
    List<SupportResponse> getAllPublicSupports();
    List<SupportResponse> getUserSupports(Long memberId);
    List<SupportResponse> getFAQs();
}