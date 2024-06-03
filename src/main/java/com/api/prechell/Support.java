package com.api.prechell;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "support")
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supportId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String inquiryType;
    private String inquiryContent;
    private String responseContent;
    private LocalDateTime responseDate;

}