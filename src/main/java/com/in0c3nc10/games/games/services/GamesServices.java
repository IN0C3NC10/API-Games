package com.in0c3nc10.games.games.services;

import java.util.List;
import java.util.Optional;

import com.in0c3nc10.games.games.domain.Games;
import com.in0c3nc10.games.games.exceptions.services.ObjectNotFoundException;
import com.in0c3nc10.games.games.repositories.GamesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesServices {

    @Autowired
    private GamesRepository repository;

    public Games findById(Integer id){
        Optional<Games> obj = repository.findById(id);
        // ..caso encontrar ele retorna o game, se não ele retorna a throw ObjectNotFound
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto "+ id +" não encontrado!"));
    }

    public List<Games> findAll() {
        return repository.findAll();
    }
}
