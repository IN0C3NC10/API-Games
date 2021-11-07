package com.in0c3nc10.games.games.repositories;

import com.in0c3nc10.games.games.domain.Games;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// ..vale citar que o tipo presente no JPA é referente ao Id utilizado na domain
@Repository
public interface GamesRepository extends JpaRepository<Games, Integer> {
    //
}
