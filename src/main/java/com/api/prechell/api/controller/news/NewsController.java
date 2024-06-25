package com.api.prechell.api.controller.news;

import com.api.prechell.api.service.news.NewsServiceImpl;
import com.api.prechell.api.service.news.dto.NewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsServiceImpl newsService;

    // 공지사항 조회
    @GetMapping("/notices")
    public ResponseEntity<List<NewsResponse>> getNotices() {
        List<NewsResponse> notices = newsService.getAllNotices();
        return ResponseEntity.ok(notices);
    }

    // 이벤트 조회
    @GetMapping("/events")
    public ResponseEntity<List<NewsResponse>> getEvents() {
        List<NewsResponse> events = newsService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    // 특정 뉴스 조회
    @GetMapping("/{id}")
    public ResponseEntity<NewsResponse> getNewsById(@PathVariable Long id) {
        NewsResponse news = newsService.getNewsById(id);
        return ResponseEntity.ok(news);
    }

}