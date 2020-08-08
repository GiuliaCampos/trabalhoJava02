package com.example.tp02.controller;

import com.example.tp02.model.Usuario;
import com.example.tp02.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {
    @Autowired
    usuarioService usuarioService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public HttpStatus create (@RequestBody Usuario usuario){
        Usuario aux = usuarioService.findByEmail(usuario.getEmail());
//        if(aux == null){
//            return HttpStatus.NOT_FOUND;
//        }
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        if(!encoder.matches(usuario.getPasswordHash(), aux.getPasswordHash())){
//            return HttpStatus.NOT_FOUND;
//        }

        return HttpStatus.OK;

    }
}
