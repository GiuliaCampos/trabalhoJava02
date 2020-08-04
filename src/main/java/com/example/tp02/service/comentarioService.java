package com.example.tp02.service;

import com.example.tp02.model.Comentario;
import com.example.tp02.model.Filme;

import java.util.List;

public interface comentarioService {
   List <Comentario> findAll();
   Comentario findById(Long id_comentario);
   Comentario save(Comentario comentario);
   List<Comentario> findComentarioByFilme(Filme filme_id_filme);
}
