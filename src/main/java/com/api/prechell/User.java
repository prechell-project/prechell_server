package com.api.prechell;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false,length = 255)
    private String email;

    @Column(nullable = false,length = 500)
    private String password;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(nullable = false,length = 10)
    private String gender;

    @Column(nullable = false,length = 20)
    private String phoneNumber;

}
