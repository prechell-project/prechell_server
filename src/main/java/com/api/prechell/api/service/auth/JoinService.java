package com.api.prechell.api.service.auth;

import com.api.prechell.api.service.auth.dto.JoinDto;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.MemberRepository;
import com.api.prechell.domain.member.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

//    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
//
//        this.userRepository = userRepository;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }

    public void joinProcess(JoinDto joinDTO) {

        String email = joinDTO.getEmail();
        String username = joinDTO.getUserName();
        String password = joinDTO.getPassword();

        Boolean isExist = memberRepository.existsByEmail(email);

        if (isExist) {

            return;
        }

        MemberEntity data = new MemberEntity();

        data.setEmail(email);
        data.setUserName(username);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole(Role.ROLE_USER);

        memberRepository.save(data);
    }
}
