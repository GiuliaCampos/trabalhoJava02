package com.example.tp02.controllers;

import com.example.tp02.helpers.UsuarioInterface;
import com.example.tp02.helpers.UsuarioLogin;
import com.example.tp02.models.Usuario;
import com.example.tp02.repository.UsuarioRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
@CrossOrigin(origins = "*")
public class SessionController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    @ApiOperation(value = "Faz o login")
    public ResponseEntity <Usuario> create (@RequestBody UsuarioLogin usr){
        Usuario usuario = usuarioRepository.findByEmail(usr.getEmail());

        if(usuario == null){

            return ResponseEntity.notFound().build();
        }

        if(!BCrypt.checkpw(usr.getSenha(), usuario.getPassword_hash())){
            return ResponseEntity.notFound().build();
        }
        usuario.setPassword_hash("");
        return ResponseEntity.ok(usuario);
    }

}
