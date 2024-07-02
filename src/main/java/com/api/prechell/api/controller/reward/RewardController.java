package com.api.prechell.api.controller.reward;

import com.api.prechell.api.service.auth.dto.RewardDTO;
import com.api.prechell.api.service.reward.RewardService;
import com.api.prechell.api.service.reward.dto.RewardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mypage/reward")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @GetMapping("/{userId}")
    public ResponseEntity<RewardResponse> getReward(@PathVariable Long userId) {
        RewardDTO rewardDTO = rewardService.getRewardByUserId(userId);
        RewardResponse response = new RewardResponse();
        response.setStatus("success");
        response.setData(rewardDTO);
        return ResponseEntity.ok(response);
    }
}

