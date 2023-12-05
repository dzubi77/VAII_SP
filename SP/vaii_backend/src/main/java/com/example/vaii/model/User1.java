package com.example.vaii.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "user1")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column //unique, nullable - bool
    private UUID userID;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
}
