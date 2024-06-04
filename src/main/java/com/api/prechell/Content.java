package com.api.prechell;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contentId;

    @ManyToOne
    @JoinColumn(name = "upload_id", nullable = false)
    private Upload upload;

    @Column(length = 100)
    private String videoLayout;

    @Column(length = 100)
    private String username;

    @Column(length = 255)
    private String keywords;

    @Column(length = 100)
    private String title;

    @Column(length = 500)
    private String description;

    public Content() {
    }
}