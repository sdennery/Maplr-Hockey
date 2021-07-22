package com.maplr.testhockeygame;

import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.repository.TeamRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TestHockeyGameApplication {

	public static void main(String[] args) {

//		SpringApplication.run(TestHockeyGameApplication.class, args);

		ConfigurableApplicationContext c = SpringApplication.run(TestHockeyGameApplication.class, args);
		TeamRepository tr = c.getBean(TeamRepository.class);
		PlayerRepository pr = c.getBean(PlayerRepository.class);

		Player james = new Player(Long.valueOf(6),"Lebron","James","Forward",true);
		Player bryant = new Player(Long.valueOf(24),"Kobe","Bryant","Forward",false);
		Player jordan = new Player(Long.valueOf(23),"Michael","Jordan","Forward",false);
		List<Player> players = Arrays.asList(james,bryant,jordan);

		Team team2017 = new Team("Tyron Lue",Long.valueOf(2017));
		Team team2018 = new Team("Tyron Lue",Long.valueOf(2018));
		Team team2019 = new Team("Tyron Lue",Long.valueOf(2019));
		Team team2020 = new Team("Tyron Lue",Long.valueOf(2020));
		Team team2021 = new Team("Tyron Lue",Long.valueOf(2021));

		List<Team> teams = Arrays.asList(team2017,team2018,team2019,team2020,team2021);
		tr.saveAll(teams);

		james.playersTeams(team2017);
		james.playersTeams(team2018);
		james.playersTeams(team2019);
		james.playersTeams(team2020);

		bryant.playersTeams(team2017);
		bryant.playersTeams(team2018);
		bryant.playersTeams(team2019);
		bryant.playersTeams(team2020);

		jordan.playersTeams(team2017);
		jordan.playersTeams(team2018);

		pr.saveAll(players);

	}

}
