package com.api.prechell.domain.member;


import com.api.prechell.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "member")
public class MemberEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Long id;

    @Column(nullable = true,length = 255)
    private String email;

    @Column(nullable = false,length = 500)
    private String password;

    @Column(nullable = false,length = 100)
    private String username;

    @Column(nullable = true,length = 10)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = true,length = 20)
    private String phoneNumber;

    @Column(nullable = false,length = 20)
    @Enumerated(EnumType.STRING)
    private Role role;

}
