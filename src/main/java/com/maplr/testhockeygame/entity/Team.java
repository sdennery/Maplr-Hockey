package com.maplr.testhockeygame.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creation of the entity "Team"
 * */
@Entity
@Table(name = "Team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "coach")
    private String coach;

    @Column(name = "year")
    private Long year;

    @ManyToMany( mappedBy = "playersTeams")
    private List<Player> players = new ArrayList<>();

    public Team() {
    }

    public Team(String coach, Long year) {
        this.coach = coach;
        this.year = year;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
