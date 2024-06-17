package com.api.prechell.domain.news;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "news")
public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long newsId;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String type;

    @Column(length = 500)
    private String content;
}
