package com.in0c3nc10.games.games.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.in0c3nc10.games.games.domain.Games;
import com.in0c3nc10.games.games.exceptions.services.ObjectNotFoundException;
import com.in0c3nc10.games.games.repositories.GamesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesServices {

    @Autowired
    private GamesRepository repository;

    @Autowired
    private EntityManager em;

    // ..PESQUISAR PELO ID
    public Games findById(Integer id){
        Optional<Games> obj = repository.findById(id);
        // ..caso encontrar ele retorna o game, se não ele retorna a throw ObjectNotFound
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto "+ id +" não encontrado!"));
    }

    public List<Games> listByRace(String param){
        String hql = "FROM Games WHERE race like: param ORDER BY name";
        Query query = em.createQuery(hql);
        query.setParameter("param", param + "%");
        List<Games> games = query.getResultList();
        return  games;
    }

    // ..PESQUISAR TODOS OS DADOS
    public List<Games> findAll() {
        return repository.findAll();
    }

    // ..ALTERAR OS DADOS
    public Games update(Integer id, Games obj) {
        // ..verifica se o id está presente via findById
        Games newObj = findById(id);
        // ..insere os dados na instância newObj
        newObj.setName(obj.getName());
        newObj.setRace(obj.getRace());
        newObj.setPrice(obj.getPrice());
        newObj.setStatus(obj.getStatus());
        // ..de fato salva os dados
        return repository.save(newObj);
    }

    // ..INSERIR OS DADOS
    public Games create(Games obj) {
        // ..por segurança setamos o Id como nulo
        obj.setId(null);
        return repository.save(obj);
    }

    // ..DELETAR OS DADOS
    public void delete(Integer id) {
        // ..verifica a existência do id
        findById(id);
        // ..deleta com o auxilio do JPA
        repository.deleteById(id);
    }
}
