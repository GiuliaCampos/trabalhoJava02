package com.example.tp02.service;

import com.example.tp02.model.Usuario;

public interface usuarioService {
    Usuario save(Usuario usuario);
    Usuario findById(Long id);
    Usuario findUsuario(String email);
}
