package com.api.prechell.api.service.member;

import com.api.prechell.api.service.auth.dto.MemberEditDTO;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.MemberRepository;
import com.api.prechell.legacy.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberEditService {

    @Autowired
    private MemberRepository memberRepository;

    public void updateMember(Long userId, MemberEditDTO memberEditDTO) {
        MemberEntity member = memberRepository.findById(userId).orElse(null);
        if (member != null) {
            member.setUsername(memberEditDTO.getUsername());
            member.setPassword(memberEditDTO.getPassword());
            memberRepository.save(member);
        }
    }
}


/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberEditService {

    @Autowired
    private MemberRepository memberRepository;

    public MemberEditDTO getMemberInfo(Long memberId) {
        MemberEntity member = memberRepository.findById(memberId).orElse(null);
        if (member == null) {
            return null;
        }
        MemberEditDTO dto = new MemberEditDTO();
        dto.setMemberId(member.getId());
        dto.setUsername(member.getUsername());
        dto.setPassword(member.getPassword());
        return dto;
    }

    public void updateMemberInfo(MemberEditDTO dto) {
        MemberEntity member = memberRepository.findById(dto.getMemberId()).orElse(null);
        if (member != null) {
            member.setUsername(dto.getUsername());
            member.setPassword(dto.getPassword());
            memberRepository.save(member);
        }
    }


}*/


