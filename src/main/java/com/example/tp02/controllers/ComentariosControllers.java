package com.example.tp02.controllers;

import com.example.tp02.models.Comentarios;
import com.example.tp02.models.Filmes;
import com.example.tp02.repository.ComentariosRepository;
import com.example.tp02.repository.FilmesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/comentarios")
@RestController
@Api(value = "API REST PARA LISTAGEM E  CRIACAO DE COMENTARIOS")
@CrossOrigin(origins = "*")
public class ComentariosControllers {

    @Autowired
    ComentariosRepository comentariosRepository;
    @Autowired
    FilmesRepository filmesRepository;

    @GetMapping(value = "/filmes/{id_filme}", produces = "application/json")
    @ApiOperation(value = "Todos o comentarios de um filme")
    public List<Comentarios> index(@PathVariable long id_filme){

        Filmes filme = filmesRepository.findById(id_filme);

        return comentariosRepository.findComentariosByFilme(filme);
    }

    @PostMapping(value="/filmes/{id_filme}", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Cria um comentario para um filme")
    public ResponseEntity <Comentarios> create(@RequestBody Comentarios comentario, @PathVariable long id_filme){
        Filmes filme = filmesRepository.findById(id_filme);
        if(filme == null){
            return ResponseEntity.notFound().build();
        }
        comentario.setFilme(filme);

        return ResponseEntity.ok(comentariosRepository.save(comentario));
    }


}
