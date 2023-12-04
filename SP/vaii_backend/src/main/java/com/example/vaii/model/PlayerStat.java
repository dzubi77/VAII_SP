package com.example.vaii.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class PlayerStat {
    @Id
    @SequenceGenerator(name = "pStat_sequence", sequenceName = "pStat_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pStat_sequence")
    private Long statID;
    private Long playerID;
    private LocalDate season;
    private Integer matchesPlayed;
    private Integer totalShots;
    private Integer goalsScored;
    private Integer assists;
    private Integer points;
    private Integer penalties;

    public PlayerStat() {
    }

    public PlayerStat(Long statID, Long playerID, LocalDate season, Integer matchesPlayed, Integer totalShots, Integer goalsScored, Integer assists, Integer points, Integer penalties) {
        this.statID = statID;
        this.playerID = playerID;
        this.season = season;
        this.matchesPlayed = matchesPlayed;
        this.totalShots = totalShots;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.points = points;
        this.penalties = penalties;
    }

    public PlayerStat(Long playerID, LocalDate season, Integer matchesPlayed, Integer totalShots, Integer goalsScored, Integer assists, Integer points, Integer penalties) {
        this.playerID = playerID;
        this.season = season;
        this.matchesPlayed = matchesPlayed;
        this.totalShots = totalShots;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.points = points;
        this.penalties = penalties;
    }

    public Long getStatID() {
        return this.statID;
    }

    public void setStatID(Long statID) {
        this.statID = statID;
    }

    public Long getPlayerID() {
        return this.playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public LocalDate getSeason() {
        return this.season;
    }

    public void setSeason(LocalDate season) {
        this.season = season;
    }

    public Integer getMatchesPlayed() {
        return this.matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getTotalShots() {
        return this.totalShots;
    }

    public void setTotalShots(Integer totalShots) {
        this.totalShots = totalShots;
    }

    public Integer getGoalsScored() {
        return this.goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getAssists() {
        return this.assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getPoints() {
        return this.points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPenalties() {
        return this.penalties;
    }

    public void setPenalties(Integer penalties) {
        this.penalties = penalties;
    }

    public double getSuccessPercentage() {
        return (double) this.goalsScored / this.totalShots * 100;
    }

    @Override
    public String toString() {
        return "PlayerStat{" +
                "statID=" + this.statID +
                ", playerID=" + this.playerID +
                ", season=" + this.season +
                ", matchesPlayed=" + this.matchesPlayed +
                ", totalShots=" + this.totalShots +
                ", goalsScored=" + this.goalsScored +
                ", assists=" + this.assists +
                ", points=" + this.points +
                ", penalties=" + this.penalties +
                ", shooting=" + String.format("%.2f", this.getSuccessPercentage()) +
                '}';
    }
}
