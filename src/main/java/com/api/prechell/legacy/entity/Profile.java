package com.api.prechell.legacy.entity;

import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profileId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private MemberEntity memberEntity;

    @Column(length = 255)
    private String profileImage;

    @Column(length = 100)
    private String username;

    @Column(length = 500)
    private String selfIntroduction;

    private Integer totalViews;

    private Integer totalPoints;

}
