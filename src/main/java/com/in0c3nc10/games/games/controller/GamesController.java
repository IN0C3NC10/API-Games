package com.in0c3nc10.games.games.controller;

import java.net.URI;
import java.util.List;

import com.in0c3nc10.games.games.domain.Games;
import com.in0c3nc10.games.games.services.GamesServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
    
    @Autowired
    private GamesServices service;

    // ..PESQUISAR PELO ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Games> findById(@PathVariable Integer id){
        Games obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // ..PESQUISAR TODOS OS DADOS
    @GetMapping
    public ResponseEntity<List<Games>> findAll(){
        // ..acessa o método da service
        List<Games> list = service.findAll();
        // retorna o ok com a lista de dados
        return ResponseEntity.ok().body(list);
    }

    // ..ALTERAR OS DADOS
    @PutMapping(value = "/{id}")
    public ResponseEntity<Games> update(@PathVariable Integer id, @RequestBody Games obj){
        Games newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }

    // ..INSERIR OS DADOS
    @PostMapping
    public ResponseEntity<Games> create(@RequestBody Games obj){
        Games newObj = service.create(obj);
        // ..uri nada mais é que o retorno ao usuário do registro que ele acabou de criar
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    // ..DELETAR OS DADOS
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        // ..chama a operação na service
        service.delete(id);
        // ..não retorna nenhum conteúdo
        return ResponseEntity.noContent().build();
    }
}
