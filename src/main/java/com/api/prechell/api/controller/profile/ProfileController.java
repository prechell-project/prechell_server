package com.api.prechell.api.controller.profile;

import com.api.prechell.api.service.auth.dto.ProfileDTO;
import com.api.prechell.api.service.profile.ProfileService;
import com.api.prechell.api.service.profile.dto.ProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/mypage/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{userId}")
    public ResponseEntity<ProfileResponse> getProfile(@PathVariable Long userId) {
//        ProfileDTO profileDTO = profileService.getProfileByUserId(userId);
//        ProfileResponse response = new ProfileResponse("success", profileDTO);
//        return ResponseEntity.ok(response);
        return null;
    }

    @PutMapping("/{userId}")
    public ResponseEntity<ProfileResponse> updateProfile(@PathVariable Long userId, @RequestBody ProfileDTO profileDTO) {
        // Authentication and authorization logic can be added here

        profileService.updateProfile(profileDTO);
        ProfileResponse response = new ProfileResponse("success", profileDTO);
        return ResponseEntity.ok(response);
    }
}


