package com.api.prechell.api.service.member.dto;


import com.api.prechell.domain.member.Gender;
import com.api.prechell.domain.member.MemberEntity;
import lombok.Builder;

public class MemberResponse {
    private Long id;
    private String email;
    private String userName;
    private Gender gender;
    private String phoneNumber;

    @Builder
    private MemberResponse(Long id, String email, String userName, Gender gender, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public static MemberResponse of(MemberEntity memberEntity){
        return MemberResponse.builder()
                .id(memberEntity.getId())
                .email(memberEntity.getEmail())
                .userName(memberEntity.getUsername())
                .gender(memberEntity.getGender())
                .phoneNumber(memberEntity.getPhoneNumber())
                .build();
    }

}
