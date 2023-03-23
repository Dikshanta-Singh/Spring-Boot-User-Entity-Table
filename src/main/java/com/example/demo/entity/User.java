package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(name = "user_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "user_name", unique = true)
    private String userName;
    @Column(name = "first_name")
    private String firstName;
    @Column (name = "middle_name")
    private String middleName;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "password")
    private String password;
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updateddat;
    @Column(name = "Active")
    private  boolean  active=true;
}
