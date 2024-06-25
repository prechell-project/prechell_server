package com.api.prechell.api.controller.support;

import com.api.prechell.api.service.support.SupportService;
import com.api.prechell.api.service.support.dto.SupportResponse;
import com.api.prechell.domain.support.SupportRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/support")
@RequiredArgsConstructor
public class SupportController {

    private final SupportService supportService;

    @PostMapping("/inquiry")
    public ResponseEntity<SupportResponse> createInquiry(@RequestBody SupportRequest supportRequest) {
        SupportResponse response = supportService.createSupport(supportRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/public")
    public ResponseEntity<List<SupportResponse>> getAllPublicSupports() {
        List<SupportResponse> responses = supportService.getAllPublicSupports();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/user/{memberId}")
    public ResponseEntity<List<SupportResponse>> getUserSupports(@PathVariable Long memberId) {
        List<SupportResponse> responses = supportService.getUserSupports(memberId);
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/faq")
    public ResponseEntity<List<SupportResponse>> getFAQs() {
        List<SupportResponse> responses = supportService.getFAQs();
        return ResponseEntity.ok(responses);
    }
}