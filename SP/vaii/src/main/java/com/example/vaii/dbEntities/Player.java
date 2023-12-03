package com.example.vaii.dbEntities;

import java.time.LocalDate;

public class Player {
    private Long playerId;
    private String name;
    private String position;
    private Integer jerseyNumber;
    private LocalDate dateOfBirth;
    private String nationality;

    public Player(Long id, String name, String position, Integer jerseyNumber, LocalDate dateOfBirth, String nationality) {
        this.playerId = id;
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }

    public Long getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getJerseyNumber() {
        return this.jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
