package com.in0c3nc10.games.games.controller;

import java.net.URI;
import java.util.List;

import com.in0c3nc10.games.games.domain.Games;
import com.in0c3nc10.games.games.services.GamesServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Games Endpoint 'Games'", tags = {"Endpoints"})
@RestController
@RequestMapping(value = "api/games")
public class GamesController {
    
    @Autowired
    private GamesServices service;

    // ..PESQUISAR PELO ID
    @ApiOperation(value = "Show one Game with its id", response = Games.class)
    @GetMapping(value = "/{id}")
    public ResponseEntity<Games> findById(@PathVariable Integer id){
        Games obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // ..PESQUISAR PELO NOME
    @ApiOperation(value = "Show all Games, using your name", response = Games.class)
    @GetMapping("/name/{param}")
    public List<Games> listByName(@PathVariable("param") String param){
        return service.listByName(param);
    }

    // ..PESQUISAR POR CATEGORIA
    @ApiOperation(value = "Show all Games, using your category", response = Games.class)
    @GetMapping("/category/{param}")
    public List<Games> listByCategory(@PathVariable("param") String param){
        return service.listByCategory(param);
    }

    // ..PESQUISAR TODOS OS DADOS
    @ApiOperation(value = "Show all Games in database", response = List.class)
    @GetMapping
    public ResponseEntity<List<Games>> findAll(){
        // ..acessa o método da service
        List<Games> list = service.findAll();
        // retorna o ok com a lista de dados
        return ResponseEntity.ok().body(list);
    }

    // ..ALTERAR OS DADOS
    @ApiOperation(value = "Change a Game by its id and show it", response = Games.class)
    @PutMapping(value = "/{id}")
    public ResponseEntity<Games> update(@PathVariable Integer id, @RequestBody Games obj){
        Games newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }

    // ..INSERIR OS DADOS
    @ApiOperation(value = "Persist an Game", response = Games.class)
    @PostMapping
    public ResponseEntity<Games> create(@RequestBody Games obj){
        Games newObj = service.create(obj);
        // ..uri nada mais é que o retorno ao usuário do registro que ele acabou de criar
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    // ..DELETAR OS DADOS
    @ApiOperation(value = "Remove a Game with its id", response = Games.class)
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        // ..chama a operação na service
        service.delete(id);
        // ..não retorna nenhum conteúdo
        return ResponseEntity.noContent().build();
    }
}
