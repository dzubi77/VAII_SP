package com.example.vaii.dataAccess;

import com.example.vaii.model.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerInfoRepository extends JpaRepository<PlayerInfo, Long> {
}
