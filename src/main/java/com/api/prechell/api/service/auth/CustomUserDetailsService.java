package com.api.prechell.api.service.auth;

import com.api.prechell.domain.auth.CustomUserDetails;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.MemberRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public CustomUserDetailsService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        MemberEntity memberEntityData = memberRepository.findByEmail(email);

        if (memberEntityData != null){

            return new CustomUserDetails(memberEntityData);
        }


        return null;
    }
}
