package com.api.prechell.config.jwt;

import com.api.prechell.domain.auth.CustomUserDetails;
import com.api.prechell.domain.member.MemberEntity;
import com.api.prechell.domain.member.Role;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JWTFilter extends OncePerRequestFilter {

    private final JWTUtil jwtUtil;

    public JWTFilter(JWTUtil jwtUtil){

        this.jwtUtil = jwtUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //request에서 Authorization 헤더를 찾음
        String authorization= request.getHeader("Authorization");
        // "Bearer ㅁㅁㅁ"

        //Authorization 헤더 검증
        if (authorization == null || !authorization.startsWith("Bearer ")) {

            System.out.println("token null");
            filterChain.doFilter(request, response);

            //조건이 해당되면 메소드 종료 (필수)
            return;
        }

        System.out.println("authorization now");

        String token = authorization.split(" ")[1];

        //토큰 소멸 시간 검증
        if (jwtUtil.isExpired(token)) {

            System.out.println("token expired");
            filterChain.doFilter(request, response);

            return;
        }

        Long userId = jwtUtil.getUserId(token);
        String userEmail = jwtUtil.getUserEmail(token);
        String username = jwtUtil.getUsername(token);
        String role = jwtUtil.getRole(token);

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setId(userId);
        memberEntity.setEmail(userEmail);
        memberEntity.setUserName(username);
        memberEntity.setPassword("temppassword");
        memberEntity.setRole(Role.valueOf(role));

        CustomUserDetails customUserDetails = new CustomUserDetails(memberEntity);

        Authentication authToken = new UsernamePasswordAuthenticationToken(customUserDetails, null, customUserDetails.getAuthorities());

        SecurityContextHolder.getContext().setAuthentication(authToken); // 메모리에 넣어두는것

        filterChain.doFilter(request, response);
    }
}
