package com.api.prechell.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Boolean existsByEmail(String email);

    MemberEntity findByEmail(String email);
}
