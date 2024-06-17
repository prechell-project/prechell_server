package com.api.prechell.api.service.news;

import com.api.prechell.api.service.news.dto.NewsResponse;
import com.api.prechell.domain.news.NewsRequest;

import java.util.List;

public interface NewsServiceInterface {
    List<NewsResponse> getAllNotices();

    List<NewsResponse> getAllEvents();

    NewsResponse getNewsById(Long id);

    NewsResponse createNews(NewsRequest newsRequest);

    NewsResponse updateNews(Long id, NewsRequest newsRequest);

    void deleteNews(Long id);
}
