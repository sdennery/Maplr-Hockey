package com.maplr.testhockeygame.service.impl;

import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.repository.TeamRepository;
import com.maplr.testhockeygame.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Creation of the service "TeamService"
 * */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    /* Allows to get all the team thanks to the year */
    @Override
    public Team getAllTeamByYear(Long year) {
        return teamRepository.findByYear(year);
    }

    /* Allows to get all the team */
    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }
}
