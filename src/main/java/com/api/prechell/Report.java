package com.api.prechell;

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
    private User reportingUser;

    @ManyToOne
    @JoinColumn(name = "reported_user_id", nullable = false)
    private User reportedUser;

    @Column(nullable = false)
    private String reportContent;

    @Column(nullable = false)
    private LocalDateTime reportDate = LocalDateTime.now();

}