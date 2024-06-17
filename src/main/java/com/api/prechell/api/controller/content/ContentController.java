package com.api.prechell.api.controller.content;

import com.api.prechell.api.service.auth.dto.ContentDTO;
import com.api.prechell.api.service.content.ContentService;
import com.api.prechell.api.service.content.dto.ContentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;


    //컨텐츠 조회 api
    @GetMapping("/contentlist")
    public ResponseEntity<List<ContentDTO>> getContentList() {
        List<ContentDTO> contentList = contentService.getContentList();
        return ResponseEntity.ok(contentList);
    }

    @GetMapping("/{contentId}")
    public ResponseEntity<ContentDTO> getContent(@PathVariable Long contentId) {
        ContentDTO contentDTO = contentService.getContentById(contentId);
        return ResponseEntity.ok(contentDTO);
    }
}
