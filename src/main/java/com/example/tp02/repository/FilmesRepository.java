package com.example.tp02.repository;

import com.example.tp02.models.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmesRepository  extends JpaRepository<Filmes, Long> {
    Filmes findById(long id_filme);
}
