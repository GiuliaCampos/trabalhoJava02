package com.example.tp02.repository;

import com.example.tp02.models.Comentarios;

import com.example.tp02.models.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {
    List<Comentarios> findComentariosByFilme(Filmes filme);
}
