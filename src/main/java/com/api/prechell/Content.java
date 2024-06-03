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

    private String videoLayout;
    private String username;
    private String keywords;
    private String title;
    private String description;

    public Content() {
    }
}