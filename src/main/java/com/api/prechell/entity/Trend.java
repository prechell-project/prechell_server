package com.api.prechell.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trend")
public class Trend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer trendId;

    @Column(length = 255)
    private String keyword;

    private Integer ranking;

}