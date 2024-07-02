package com.api.prechell.api.controller.view;

import com.api.prechell.api.service.view.ViewHistoryService;
import com.api.prechell.api.service.view.dto.ViewHistoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/view-history")
public class ViewHistoryController {

    @Autowired
    private ViewHistoryService viewHistoryService;

    @GetMapping("/{userId}")
    public ResponseEntity<ViewHistoryResponse> getViewHistoriesByUserId(@PathVariable Long userId) {
        ViewHistoryResponse response = viewHistoryService.getViewHistoriesByUserId(userId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{viewHistoryId}")
    public ResponseEntity<Void> deleteViewHistory(@PathVariable Long viewHistoryId) {
        viewHistoryService.deleteViewHistory(viewHistoryId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
