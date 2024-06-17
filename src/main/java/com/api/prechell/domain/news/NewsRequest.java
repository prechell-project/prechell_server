package com.api.prechell.domain.news;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsRequest {
    private String title;

    private String content;

    private String type;

}
