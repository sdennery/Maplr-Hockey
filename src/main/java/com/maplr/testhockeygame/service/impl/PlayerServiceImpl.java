package com.maplr.testhockeygame.service.impl;

import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Creation of the service "PlayerService"
 * */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    /* Allows to save Player*/
    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    /* Allows to update the captain status of a player in a team */
    @Override
    public Player updateCaptain(List<Team> teams,Long id) {
        Player updatePlayer = new Player();
        for (Team team : teams){
            List<Player> players = team.getPlayers();
            for (Player player : players){
                if (player.isCaptain()){
                    if (player.getNumber() == id){
                        updatePlayer = player;
                    } else {
                        player.setCaptain(false);
                        playerRepository.save(player);
                    }
                } else {
                    if (player.getNumber() == id){
                        player.setCaptain(true);
                        updatePlayer = playerRepository.save(player);
                    }
                }
            }
        }
        return updatePlayer;
    }
}
