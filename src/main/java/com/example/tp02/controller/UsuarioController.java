package com.example.tp02.controller;

import com.example.tp02.model.Usuario;
import com.example.tp02.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@RestController
public class UsuarioController {
    @Autowired
    usuarioService usuarioService;

    @RequestMapping(value="/user", method = RequestMethod.POST )
    public Usuario create(@RequestBody Usuario usuario){
        usuario.setPasswordHash(new BCryptPasswordEncoder().encode(usuario.getPasswordHash()));
        return usuarioService.save(usuario);
    }
}
