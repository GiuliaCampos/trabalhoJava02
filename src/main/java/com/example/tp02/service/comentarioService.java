package com.example.tp02.service;

import com.example.tp02.model.Comentario;
import java.util.List;

public interface comentarioService {
   List <Comentario> findAll();
   Comentario findById(Long id_comentario);
   Comentario save(Comentario comentario);
}
