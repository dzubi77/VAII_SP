package com.example.vaii.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID playerID;
    private String fullName;
    private String position;
    private Integer jerseyNumber;
    private LocalDate birthDate;
    private String nationality;
}
