package com.example.tp02.controller;

import com.example.tp02.model.Comentario;
import com.example.tp02.model.Filme;
import com.example.tp02.service.comentarioService;
import com.example.tp02.service.filmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComentarioController {


    @Autowired
    comentarioService comentarioService;
    @Autowired
   filmeService filmeService;

    @RequestMapping(value = "/comentario/filme/{id_filme}", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public String criarComentario  (@RequestBody Comentario comentario, @PathVariable Long id_filme ){
        Filme filme = filmeService.findById(id_filme);
        if(filme == null){
            return "Filme não encontrado";
        }

        comentario.setFilme(filme);
        comentarioService.save(comentario);

        return "comentario salvo com sucesso";
    }

    @RequestMapping(value = "/comentarios/filme/{id_filme}", method = RequestMethod.GET)
    public List<Comentario> visualizarTodosComentarios(@PathVariable Long id_filme){
        Filme filme = filmeService.findById(id_filme);
        List <Comentario> comentarios = comentarioService.findComentarioByFilme(filme);
        return comentarios;
    }
}
