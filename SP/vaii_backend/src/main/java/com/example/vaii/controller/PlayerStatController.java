package com.example.vaii.controller;

import com.example.vaii.model.PlayerStat;
import com.example.vaii.service.PlayerStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerStatController {
    private final PlayerStatService playerStatService;

    @Autowired
    public PlayerStatController(PlayerStatService playerStatService) {
        this.playerStatService = playerStatService;
    }

    @GetMapping
    public List<PlayerStat> getAllStats() {
        return this.playerStatService.getAllStats();
    }

    @PostMapping
    public void createNewStat(@RequestBody PlayerStat ps) {
        this.playerStatService.createNewStat(ps);
    }
}
