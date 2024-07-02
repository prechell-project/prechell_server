package com.api.prechell.api.service.view;

import com.api.prechell.api.service.auth.dto.ViewHistoryDTO;
import com.api.prechell.api.service.view.dto.ViewHistoryResponse;
import com.api.prechell.domain.view.ViewHistoryRepository;
import com.api.prechell.legacy.entity.ViewHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ViewHistoryService {

    @Autowired
    private ViewHistoryRepository viewHistoryRepository;

    public ViewHistoryResponse getViewHistoriesByUserId(Long userId) {
        List<ViewHistory> histories = viewHistoryRepository.findByUserId(userId);
        List<ViewHistoryDTO> dtos = histories.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        ViewHistoryResponse response = new ViewHistoryResponse();
        response.setViewHistories(dtos);
        return response;
    }

    public void deleteViewHistory(Long viewHistoryId) {
        viewHistoryRepository.deleteById(viewHistoryId);
    }

    private ViewHistoryDTO convertToDto(ViewHistory history) {
        ViewHistoryDTO dto = new ViewHistoryDTO();
        dto.setViewHistoryId(history.getId());
        dto.setUserId(history.getUserId());
        dto.setContentId(history.getContentId());
        dto.setVideoTitle(history.getVideoTitle());
        dto.setWatchedAt(history.getWatchedAt().toString()); // 형식은 필요에 따라 변경할 수 있음
        return dto;
    }
}
