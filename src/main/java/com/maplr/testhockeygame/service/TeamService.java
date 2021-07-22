package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.entity.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {

    Team getAllTeamByYear(Long year);

    List<Team> getAllTeam();

}
