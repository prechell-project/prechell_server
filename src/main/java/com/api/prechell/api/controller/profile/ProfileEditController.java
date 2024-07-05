package com.api.prechell.api.controller.profile;

import com.api.prechell.api.service.auth.dto.ProfileEditDTO;
import com.api.prechell.api.service.profile.ProfileEditService;
import com.api.prechell.api.service.profile.dto.ProfileEditResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mypage/profile/edit")
public class ProfileEditController {

    @Autowired
    private ProfileEditService profileEditService;

    @PutMapping("/{userId}")
    public ResponseEntity<ProfileEditResponse> updateProfile(@PathVariable Long userId, @RequestBody ProfileEditDTO profileEditDTO) {
        // Authentication and authorization logic can be added here
//
//        profileEditService.updateProfile(userId, profileEditDTO);
//        ProfileEditResponse response = new ProfileEditResponse();
//        response.setStatus("success");
//        return ResponseEntity.ok(response);
//    }
//}
        return null;
    }
}
