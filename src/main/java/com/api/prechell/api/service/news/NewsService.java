package com.api.prechell.api.service.news;

import com.api.prechell.api.service.news.dto.NewsResponse;

import java.util.List;

public interface NewsService {
    List<NewsResponse> getAllNotices();

    List<NewsResponse> getAllEvents();

    NewsResponse getNewsById(Long id);

}
