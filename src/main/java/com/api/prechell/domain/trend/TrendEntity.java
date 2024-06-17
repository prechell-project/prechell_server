package com.api.prechell.domain.trend;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trend")
public class TrendEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trendId;

    @Column(length = 255)
    private String keyword;

    private String ranking;

}
