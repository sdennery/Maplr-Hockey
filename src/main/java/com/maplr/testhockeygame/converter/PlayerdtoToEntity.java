package com.maplr.testhockeygame.converter;

import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.entity.Player;

/**
 * PlayerDTO converter
 */
public class PlayerdtoToEntity {

    /* Allows to convert the dto to the player entity */
    public static Player dtoToPlayer(PlayerDto playerDto){
        Player player = new Player();
        player.setNumber(playerDto.getNumber());
        player.setName(playerDto.getName());
        player.setLastname(playerDto.getLastname());
        player.setPosition(playerDto.getPosition());
        player.setCaptain(playerDto.isCaptain());

        return player;
    }
}
