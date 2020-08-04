package com.example.tp02.repository;

import com.example.tp02.model.Comentario;
import com.example.tp02.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository  extends JpaRepository <Comentario, Long>{

    List<Comentario> findComentarioByFilme(Filme filme);
}
