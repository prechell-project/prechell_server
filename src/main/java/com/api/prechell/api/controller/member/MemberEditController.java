package com.api.prechell.api.controller.member;

import com.api.prechell.api.service.auth.dto.MemberEditDTO;
import com.api.prechell.api.service.member.MemberEditService;
import com.api.prechell.api.service.member.dto.MemberEditResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mypage/member/edit")
public class MemberEditController {

    @Autowired
    private MemberEditService memberEditService;

    @PutMapping("/{userId}")
    public ResponseEntity<MemberEditResponse> updateMember(@PathVariable Long userId, @RequestBody MemberEditDTO memberEditDTO) {
        // Authentication and authorization logic can be added here

        memberEditService.updateMember(userId, memberEditDTO);
        MemberEditResponse response = new MemberEditResponse();
        response.setStatus("success");
        return ResponseEntity.ok(response);
    }
}

