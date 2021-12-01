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
		// ..cria algumas inserções por padrão via CommandLine
		Games g1 = new Games(null, "Espetinho de Gato com Pimenta", "Persa", 14.78, "Preparando");
		Games g2 = new Games(null, "Espetinho de Gato com Molho Inglês", "Siamês", 11.80, "Pronto");
		Games g3 = new Games(null, "Espetinho de Gato com Alho", "Sphynx", 29.30, "Assando");
		Games g4 = new Games(null, "Espetinho de Gato com Ketchup", "Donskoy", 23.50, "Preparando");
		gamesRepository.saveAll(Arrays.asList(g1,g2,g3,g4));
	}

}
