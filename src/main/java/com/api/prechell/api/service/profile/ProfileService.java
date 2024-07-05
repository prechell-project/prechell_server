package com.api.prechell.api.service.profile;

import com.api.prechell.api.service.auth.dto.ProfileDTO;
import com.api.prechell.domain.profile.ProfileRepository;
import com.api.prechell.legacy.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

//    public ProfileDTO getProfileByUserId(Long userId) {
//        Profile profile = profileRepository.findByUserId(userId);
//        return convertToDto(profile);
//    }

    public void updateProfile(ProfileDTO profileDTO) {
        Profile profile = convertToEntity(profileDTO);
        profileRepository.save(profile);
    }

    private ProfileDTO convertToDto(Profile profile) {
        if (profile == null) {
            return null;
        }
        ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setProfileImage(profile.getProfileImage());
        profileDTO.setUsername(profile.getUsername());
        profileDTO.setSelfIntroduction(profile.getSelfIntroduction());
        profileDTO.setTotalViews(profile.getTotalViews());
        profileDTO.setTotalPoints(profile.getTotalPoints());
        return profileDTO;
    }

    private Profile convertToEntity(ProfileDTO profileDTO) {
        Profile profile = new Profile();
        profile.setProfileImage(profileDTO.getProfileImage());
        profile.setUsername(profileDTO.getUsername());
        profile.setSelfIntroduction(profileDTO.getSelfIntroduction());
        profile.setTotalViews(profileDTO.getTotalViews());
        profile.setTotalPoints(profileDTO.getTotalPoints());
        return profile;
    }
}
