package com.example.vaii.dbEntities;

import java.time.LocalTime;

public class PlayerStat {
    private Long statId;
    private Long playerId;
    private Integer season;
    private Integer matchesPlayed;
    private Integer goalsScored;
    private Integer assists;
    private Integer plusMinus;
    private LocalTime penalties;

    public PlayerStat(Long statId, Long playerId, Integer season, Integer matchesPlayed, Integer goalsScored, Integer assists, Integer plusMinus, LocalTime penalties) {
        this.statId = statId;
        this.playerId = playerId;
        this.season = season;
        this.matchesPlayed = matchesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.plusMinus = plusMinus;
        this.penalties = penalties;
    }

    public Long getStatId() {
        return this.statId;
    }

    public void setStatId(Long statId) {
        this.statId = statId;
    }

    public Long getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Integer getSeason() {
        return this.season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getMatchesPlayed() {
        return this.matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
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

    public Integer getPlusMinus() {
        return this.plusMinus;
    }

    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    public LocalTime getPenalties() {
        return this.penalties;
    }

    public void setPenalties(LocalTime penalties) {
        this.penalties = penalties;
    }
}
