package com.api.prechell.domain.content;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<ContentEntity, Long> {

    Boolean existsByContentId(Long contentId);

}
