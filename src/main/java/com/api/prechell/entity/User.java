package com.api.prechell.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "member")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = true,length = 255)
    private String email;

    @Column(nullable = false,length = 500)
    private String password;

    @Column(nullable = false,length = 100)
    private String userName;

    @Column(nullable = true,length = 10)
    private String gender;

    @Column(nullable = true,length = 20)
    private String phoneNumber;

    @Column(nullable = false,length = 20)
    private String role;

}
