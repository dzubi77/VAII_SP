package com.example.vaii.controller;

import com.example.vaii.model.PlayerInfo;
import com.example.vaii.service.PlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/player_info")
public class PlayerInfoController {
    private final PlayerInfoService playerInfoService;

    @Autowired
    public PlayerInfoController(PlayerInfoService playerInfoService) {
        this.playerInfoService = playerInfoService;
    }

    @GetMapping
    public List<PlayerInfo> getPlayerInfo() {
        return this.playerInfoService.getPlayerInfo();
    }

    @PostMapping
    public void addNewPlayer(@RequestBody PlayerInfo pi) {
        this.playerInfoService.addNewPlayer(pi);
    }
}
