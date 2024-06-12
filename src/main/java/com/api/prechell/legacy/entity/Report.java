package com.api.prechell.legacy.entity;

import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reportId;

    @ManyToOne
    @JoinColumn(name = "reporting_user_id", nullable = false)
    private MemberEntity reportingMemberEntity;

    @ManyToOne
    @JoinColumn(name = "reported_user_id", nullable = false)
    private MemberEntity reportedMemberEntity;

    @Column(nullable = false, length = 500)
    private String reportContent;

    @Column(nullable = false)
    private LocalDateTime reportDate = LocalDateTime.now();

}
