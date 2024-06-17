package com.api.prechell.domain.content;

import com.api.prechell.domain.upload.UploadEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "content")
public class ContentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentId;

    @ManyToOne
    @JoinColumn(name = "upload_id", nullable = false)
    private UploadEntity uploadEntity;

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

}
