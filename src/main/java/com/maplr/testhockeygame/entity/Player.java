package com.maplr.testhockeygame.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creation of the entity "Player"
 * */
@Entity
@Table(name = "Player")
public class Player {

    @Id
    private Long number;

    private String name;

    private String lastname;

    private String position;

    private boolean isCaptain;

    @ManyToMany
    @JoinTable(
            name = "players_teams",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<Team> playersTeams = new ArrayList<>();

    public Player() {
    }

    public Player(Long number, String name, String lastname, String position, boolean isCaptain) {
        this.number = number;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.isCaptain = isCaptain;
    }

    public void playersTeams(Team team){
        playersTeams.add(team);
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }
}
