package com.api.prechell.api.service.content;

import com.api.prechell.api.service.auth.dto.ContentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentService {

    private static List<ContentDTO> contentDatabase = new ArrayList<>();


    public List<ContentDTO> getContentList() {
        return contentDatabase;
    }

    public ContentDTO getContentById(Long contentId) {
        for (ContentDTO content : contentDatabase) {
            if (content.getContentId().equals(contentId)) {
                return content;
            }
        }
        return null;
    }

}
