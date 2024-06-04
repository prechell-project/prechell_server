package com.api.prechell.UserDasom;

import jakarta.persistence.*;

@Entity
public class UserDasom1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID = null;

    @Column(nullable = false, length = 100, name = "name")
    private  String name;

    @Column(nullable = false, length = 500)
    private String password;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 20)
    private String phone_number;

}
