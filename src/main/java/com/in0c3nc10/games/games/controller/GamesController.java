package com.in0c3nc10.games.games.controller;

import com.in0c3nc10.games.games.domain.Games;
import com.in0c3nc10.games.games.services.GamesServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
    
    @Autowired
    private GamesServices service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Games> findById(@PathVariable Integer id){
        Games obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
