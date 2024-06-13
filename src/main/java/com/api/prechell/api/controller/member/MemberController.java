package com.api.prechell.api.controller.member;

import com.api.prechell.api.service.member.MemberService;
import com.api.prechell.api.service.member.dto.MemberResponse;
import com.api.prechell.domain.auth.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    // 마이페이지에 쓰이는 api 중 하나
    @GetMapping
    public ResponseEntity<MemberResponse> getMember(@AuthenticationPrincipal CustomUserDetails user) throws Exception {
        return ResponseEntity.ok(memberService.getMember(user.getId()));
    }


}
