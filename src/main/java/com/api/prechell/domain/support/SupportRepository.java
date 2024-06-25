package com.api.prechell.domain.support;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupportRepository extends JpaRepository<SupportEntity, Long> {
    List<SupportEntity> findByMemberEntityId(Long memberId);
    List<SupportEntity> findByIsPublicTrue();
    List<SupportEntity> findByInquiryType(String inquiryType);
}