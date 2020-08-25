package com.example.tp02.repository;

import com.example.tp02.models.Filmes;
import com.example.tp02.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
    Usuario findById(long id_filme);
}
