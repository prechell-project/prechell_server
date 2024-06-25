package com.api.prechell.domain.upload;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UploadRepository extends JpaRepository<UploadEntity, Long> {

    // 특정 사용자 업로드 조회
    List<UploadEntity> findByMemberEntityId(Long memberId);

    // 특정 비디오 조회
    List<UploadEntity> findByVideoTagsContaining(String videoTag);

    // 업로드 제목으로 조회
    List<UploadEntity> findByVideoTitleContaining(String title);
}