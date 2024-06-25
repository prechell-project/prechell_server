package com.api.prechell.api.service.upload;

import com.api.prechell.api.service.upload.dto.UploadResponse;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.upload.UploadEntity;
import com.api.prechell.domain.upload.UploadRepository;
import com.api.prechell.domain.upload.UploadRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UploadServiceImpl implements UploadService {

    private final UploadRepository uploadRepository;

    @Override
    public UploadResponse createUpload(UploadRequest uploadRequest) {
        UploadEntity uploadEntity = new UploadEntity();
        uploadEntity.setFilePath(uploadRequest.getFilePath());
        uploadEntity.setVideoTags(uploadRequest.getVideoTags());
        uploadEntity.setVideoTitle(uploadRequest.getVideoTitle());
        uploadEntity.setDescription(uploadRequest.getDescription());
        uploadEntity.setThumbnailSetting(uploadRequest.getThumbnailSetting());

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(uploadRequest.getMemberId());
        uploadEntity.setMemberEntity(memberEntity);

        UploadEntity savedEntity = uploadRepository.save(uploadEntity);

        return toResponse(savedEntity);
    }

    private UploadResponse toResponse(UploadEntity uploadEntity) {
        UploadResponse response = new UploadResponse();
        response.setUploadId(uploadEntity.getUploadId());
        response.setMemberId(uploadEntity.getMemberEntity().getId());
        response.setFilePath(uploadEntity.getFilePath());
        response.setVideoTags(uploadEntity.getVideoTags());
        response.setVideoTitle(uploadEntity.getVideoTitle());
        response.setDescription(uploadEntity.getDescription());
        response.setThumbnailSetting(uploadEntity.getThumbnailSetting());
        response.setCreatedAt(uploadEntity.getCreatedAt());
        return response;
    }
}