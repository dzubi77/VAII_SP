package com.example.vaii.service;

import com.example.vaii.dataAccess.PlayerInfoRepository;
import com.example.vaii.model.PlayerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerInfoService {
    private final PlayerInfoRepository playerInfoRepository;

    @Autowired
    public PlayerInfoService(PlayerInfoRepository playerInfoRepository) {
        this.playerInfoRepository = playerInfoRepository;
    }

    public List<PlayerInfo> getPlayerInfo() {
        return this.playerInfoRepository.findAll();
    }

    public void addNewPlayer(PlayerInfo pi) {
        this.playerInfoRepository.save(pi);
    }
}
