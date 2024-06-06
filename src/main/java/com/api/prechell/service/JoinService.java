package com.api.prechell.service;

import com.api.prechell.dto.JoinDTO;
import com.api.prechell.entity.User;
import com.api.prechell.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {

        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void joinProcess(JoinDTO joinDTO) {

        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();

        Boolean isExist = userRepository.existsByUserName(username);

        if (isExist) {

            return;
        }

        User data = new User();

        data.setUserName(data.getUserName());
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole("ROLE_regular member");

        userRepository.save(data);

    }
}