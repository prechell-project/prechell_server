package com.api.prechell.api.service.upload;

import com.api.prechell.api.service.upload.dto.UploadResponse;
import com.api.prechell.domain.upload.UploadRequest;

public interface UploadService {
    UploadResponse createUpload(UploadRequest uploadRequest);
}