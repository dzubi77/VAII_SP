package com.example.vaii.service;

import com.example.vaii.dataAccess.PlayerStatRepository;
import com.example.vaii.model.PlayerStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerStatService {
    private final PlayerStatRepository playerStatRepository;

    @Autowired
    public PlayerStatService(PlayerStatRepository playerStatRepository) {
        this.playerStatRepository = playerStatRepository;
    }

    public List<PlayerStat> getAllStats() {
        return this.playerStatRepository.findAll();
    }

    public void createNewStat(PlayerStat ps) {
        this.playerStatRepository.save(ps);
    }
}
