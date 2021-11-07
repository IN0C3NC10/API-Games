package com.in0c3nc10.games.games;

import java.util.Arrays;

import com.in0c3nc10.games.games.domain.Games;
import com.in0c3nc10.games.games.repositories.GamesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamesApplication implements CommandLineRunner{

	@Autowired
	private GamesRepository gamesRepository;

	public static void main(String[] args) {
		SpringApplication.run(GamesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// ..cria algumas inserções por padrão
		Games g1 = new Games(null, "Red Dead Redemption 2", "Ação/Aventura");
		Games g2 = new Games(null, "Forza Horizon 5", "Corrida");
		gamesRepository.saveAll(Arrays.asList(g1,g2));
	}

}
