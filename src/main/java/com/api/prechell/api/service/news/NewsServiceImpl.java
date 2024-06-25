package com.api.prechell.api.service.news;

import com.api.prechell.api.service.news.dto.NewsResponse;
import com.api.prechell.domain.news.NewsEntity;
import com.api.prechell.domain.news.NewsRepositoy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsRepositoy newsRepository;

    @Override
    public List<NewsResponse> getAllNotices() {
        // 공지사항 조회
        List<NewsEntity> notices = newsRepository.findByType("notices");
        return notices.stream()
                .map(NewsResponse::of)
                .collect(Collectors.toList());
    }

    @Override
    public List<NewsResponse> getAllEvents() {
        // 이벤트 조회
        List<NewsEntity> events = newsRepository.findByType("event");
        return events.stream()
                .map(NewsResponse::of)
                .collect(Collectors.toList());
    }

    @Override
    public NewsResponse getNewsById(Long id) {
        // 특정 뉴스 조회
        NewsEntity newsEntity = newsRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("조회 정보 없음: " + id));
        return NewsResponse.of(newsEntity);
    }

}
