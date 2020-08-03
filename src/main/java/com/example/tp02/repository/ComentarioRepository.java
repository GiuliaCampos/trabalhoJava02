package com.example.tp02.repository;

import com.example.tp02.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository  extends JpaRepository <Comentario, Long>{}
