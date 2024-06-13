package com.api.prechell.api.controller.auth;

import com.api.prechell.api.service.auth.dto.JoinDto;
import com.api.prechell.api.service.auth.JoinService;
import com.api.prechell.domain.auth.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final JoinService joinService;

    @PostMapping("/join")
    public ResponseEntity joinProcess(@RequestBody JoinDto joinDTO) {

        joinService.joinProcess(joinDTO);

        return ResponseEntity.ok("ok");
    }
    @GetMapping("/auth/info")
    public ResponseEntity getMemberInfo(@AuthenticationPrincipal CustomUserDetails user){
        return ResponseEntity.ok(user);
    }
}
