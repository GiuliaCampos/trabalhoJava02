package com.example.tp02.controller;

import com.example.tp02.model.Comentario;
import com.example.tp02.service.comentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComentarioController {


    @Autowired
    comentarioService comentarioService;

    @RequestMapping(value = "/comentario", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Comentario criarComentario  (@RequestBody Comentario comentario ){
        return comentarioService.save(comentario);
    }

    @RequestMapping(value = "/comentarios", method = RequestMethod.GET)
    public List<Comentario> visualizarTodosComentarios(){
        List <Comentario> comentarios = comentarioService.findAll();
        return comentarios;
    }
}
