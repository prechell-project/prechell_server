package com.api.prechell.api.controller.upload;

import com.api.prechell.api.service.upload.UploadService;
import com.api.prechell.api.service.upload.dto.UploadResponse;
import com.api.prechell.domain.upload.UploadRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
@RequiredArgsConstructor
public class UploadController {

    private final UploadService uploadService;

    @PostMapping
    public ResponseEntity<UploadResponse> createUpload(@RequestBody UploadRequest uploadRequest) {
        UploadResponse response = uploadService.createUpload(uploadRequest);
        return ResponseEntity.ok(response);
    }
}