package com.api.prechell.api.service.view.dto;

import com.api.prechell.api.service.auth.dto.ViewHistoryDTO;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ViewHistoryResponse {
    private List<ViewHistoryDTO> viewHistories;
}

