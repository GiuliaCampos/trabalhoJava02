package com.example.tp02.controller;

import com.example.tp02.model.Usuario;
import com.example.tp02.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
    @Autowired
    usuarioService usuarioService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Usuario  create (@RequestBody String email, String password){
        Usuario usuario = usuarioService.findUsuario(email);
        if(usuario == null){
            return null;
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(!encoder.matches(password, usuario.getPasswordHash())){
            return null;
        }
        return usuario;
    }
}
