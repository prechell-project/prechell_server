package com.api.prechell.service;

import com.api.prechell.entity.Member;
import com.api.prechell.repository.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Member create(String username, String email, String password) {
        Member user = new Member();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
}
