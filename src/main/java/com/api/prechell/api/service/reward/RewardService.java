package com.api.prechell.api.service.reward;

import com.api.prechell.api.service.auth.dto.RewardDTO;
import org.springframework.stereotype.Service;

@Service
public class RewardService {

    public RewardDTO getRewardByUserId(Long userId) {
        // Logic to fetch total points from user's rewards
        Integer totalPoints = 1000; // Example value
        RewardDTO rewardDTO = new RewardDTO();
        rewardDTO.setTotalPoints(totalPoints);
        return rewardDTO;
    }
}

