package com.api.prechell.repository;

import com.api.prechell.domain.news.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsRepositoy extends JpaRepository<NewsEntity, Long> {
    List<NewsEntity> findByType(String type);
}
