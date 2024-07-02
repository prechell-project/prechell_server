package com.api.prechell.api.service.like.dto;

import com.api.prechell.api.service.auth.dto.LikeDTO;

import java.util.List;

public class LikeResponse {

    private List<LikeDTO> likes;


    public List<LikeDTO> getLikes() {
        return likes;
    }

    public void setLikes(List<LikeDTO> likes) {
        this.likes = likes;
    }
}

