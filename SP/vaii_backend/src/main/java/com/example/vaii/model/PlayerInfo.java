package com.example.vaii.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class PlayerInfo {
    @Id
    @SequenceGenerator(name = "pInfo_sequence", sequenceName = "pInfo_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pInfo_sequence")
    private Long playerID;
    private String fullName;
    private String position;
    private Integer jerseyNumber;
    private LocalDate birthDate;
    private String nationality;

    public PlayerInfo() {
    }

    public PlayerInfo(Long playerID, String fullName, String position, Integer jerseyNumber, LocalDate birthDate, String nationality) {
        this.playerID = playerID;
        this.fullName = fullName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    public PlayerInfo(String fullName, String position, Integer jerseyNumber, LocalDate birthDate, String nationality) {
        this.fullName = fullName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    public Long getPlayerID() {
        return this.playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "PlayerInfo{" +
                "playerID=" + this.playerID +
                ", fullName='" + this.fullName + '\'' +
                ", position='" + this.position + '\'' +
                ", jerseyNumber=" + this.jerseyNumber +
                ", birthDate=" + this.birthDate +
                ", nationality='" + this.nationality + '\'' +
                '}';
    }
}
