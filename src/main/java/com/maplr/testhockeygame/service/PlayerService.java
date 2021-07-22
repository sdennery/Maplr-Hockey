package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.entity.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {

    Player savePlayer(Player player);

    Player updateCaptain(List<Team> team,Long id);
}
