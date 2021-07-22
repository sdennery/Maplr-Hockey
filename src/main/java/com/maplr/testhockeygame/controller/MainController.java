package com.maplr.testhockeygame.controller;

import com.maplr.testhockeygame.converter.PlayerdtoToEntity;
import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.service.impl.PlayerServiceImpl;
import com.maplr.testhockeygame.service.impl.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private TeamServiceImpl teamService;

    @Autowired
    private PlayerServiceImpl playerService;

    @GetMapping("/team/{year}")
    public Team getAllTeam(@PathVariable Long year){
        return teamService.getAllTeamByYear(year);
    }

    @PostMapping("/team/{year}")
    public Player savePlayers(@PathVariable Long year, @RequestBody PlayerDto playerdto){
        Team team = teamService.getAllTeamByYear(year);
        Player player = PlayerdtoToEntity.dtoToPlayer(playerdto);
        player.playersTeams(team);
        return playerService.savePlayer(player);
    }

    @PutMapping("/player/captain/{id}")
    public Player updateCaptain(@PathVariable Long id){
        List<Team> teams = teamService.getAllTeam();
        return playerService.updateCaptain(teams,id);
    }
}
