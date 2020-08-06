package com.example.tp02.service.serviceImpl;

import com.example.tp02.model.Usuario;
import com.example.tp02.repository.UsuarioRepository;
import com.example.tp02.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioServiceImpl implements usuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Long id) { return usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario findUsuario(String email) {
        return usuarioRepository.findUsuario(email);
    }

}
