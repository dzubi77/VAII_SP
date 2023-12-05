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
public class PlayerStat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID statID;
    private Long playerID;
    private LocalDate season;
    private Integer matchesPlayed;
    private Integer totalShots;
    private Integer goalsScored;
    private Integer assists;
    private Integer points;
    private Integer penalties;
}
