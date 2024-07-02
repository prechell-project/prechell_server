package com.api.prechell.api.service.auth;

import com.api.prechell.api.service.auth.dto.LoginDto;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.MemberRepository;
import com.api.prechell.domain.member.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void loginProcess(LoginDto loginDTO) {

        String email = loginDTO.getEmail();
        String username = loginDTO.getUserName();
        String password = loginDTO.getPassword();

        Boolean isExist = memberRepository.existsByEmail(email);

        if (isExist) {

            return;
        }

        MemberEntity data = new MemberEntity();

        data.setEmail(email);
        data.setUsername(username);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole(Role.ROLE_USER);

        memberRepository.save(data);
    }
}
