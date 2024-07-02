package com.api.prechell.api.service.profile;

import com.api.prechell.api.service.auth.dto.ProfileEditDTO;
import com.api.prechell.domain.profile.ProfileRepository;
import com.api.prechell.legacy.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileEditService {

    @Autowired
    private ProfileRepository profileRepository;

    public String getProfileImage(Long userId) {
        Profile profile = profileRepository.findByUserId(userId);
        return profile != null ? profile.getProfileImage() : null;
    }

    public String getSelfIntroduction(Long userId) {
        Profile profile = profileRepository.findByUserId(userId);
        return profile != null ? profile.getSelfIntroduction() : null;
    }

    public void updateProfile(Long userId, ProfileEditDTO profileEditDTO) {
        Profile profile = profileRepository.findByUserId(userId);
        if (profile != null) {
            profile.setProfileImage(profileEditDTO.getProfileImage());
            profile.setSelfIntroduction(profileEditDTO.getSelfIntroduction());
            profileRepository.save(profile);
        }
    }
}



