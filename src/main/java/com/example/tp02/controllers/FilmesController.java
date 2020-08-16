package com.example.tp02.controllers;

import java.util.List;

import com.example.tp02.models.Filmes;
import com.example.tp02.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    @Autowired
    FilmesRepository filmesRepository;

    @GetMapping
    public ResponseEntity<List<Filmes>> index(){

        return ResponseEntity.ok().body(filmesRepository.findAll());
    }
    @GetMapping("/{id_filme}")
    public ResponseEntity<Filmes> show(@PathVariable(value = "id_filme") long id_filme){
        return  ResponseEntity.ok().body(filmesRepository.findById(id_filme));
    }

    @PutMapping("/gostei/{id_filme}")
    public ResponseEntity <Filmes> gostei(@PathVariable(value = "id_filme") long id_filme){
        Filmes filme = filmesRepository.findById(id_filme);
        if(filme == null){
            return ResponseEntity.notFound().build();
        }
        System.out.println(filme.getQtd_gostei()+1);
        filme.setQtd_gostei(filme.getQtd_gostei()+1);
        return ResponseEntity.ok(filmesRepository.save(filme));
    }
    @PutMapping("/nao_gostei/{id_filme}")
    public ResponseEntity <Filmes> naoGostei(@PathVariable(value = "id_filme") long id_filme){
        Filmes filme = filmesRepository.findById(id_filme);
        if(filme == null){
            return ResponseEntity.notFound().build();
        }
        filme.setQtd_nao_gostei(filme.getQtd_nao_gostei()+1);
        return ResponseEntity.ok(filmesRepository.save(filme));
    }
}
