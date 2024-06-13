package com.api.prechell.api.service.member;

import com.api.prechell.api.service.member.dto.MemberResponse;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberResponse getMember(Long userId) throws Exception {
        MemberEntity memberEntity = memberRepository.findById(userId).orElseThrow(Exception::new);

        return MemberResponse.of(memberEntity);
    }

}
