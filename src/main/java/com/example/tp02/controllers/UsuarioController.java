package com.example.tp02.controllers;

import com.example.tp02.helpers.UsuarioInterface;
import com.example.tp02.models.Filmes;
import com.example.tp02.models.Usuario;
import com.example.tp02.repository.UsuarioRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    @ApiOperation(value = "cadastra um novo usuario a plataforma")
    public ResponseEntity<Usuario> create (@RequestBody Usuario usuario){

        String pwHash = BCrypt.hashpw(usuario.getPassword_hash(), BCrypt.gensalt(10));
        usuario.setPassword_hash(pwHash);

        return ResponseEntity.ok(usuarioRepository.save(usuario));
    }

    @GetMapping("/{id_usuario}")
    @ApiOperation(value = "Retorna um usuario")
    public ResponseEntity<Usuario> show (@PathVariable(value = "id_usuario")  long id_usuario){
        Usuario usuario = usuarioRepository.findById(id_usuario);

        if(usuario == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @PutMapping
    @ApiOperation(value = "mudar a senha")
    public ResponseEntity<Usuario> updateSenha (@RequestBody UsuarioInterface usr){
        Usuario usuario = usuarioRepository.findByEmail(usr.getEmail());


        if(usuario == null){

            return ResponseEntity.notFound().build();
        }

        if(!usr.getSenha().equals(usr.getConfirmacao_senha())){

            return ResponseEntity.notFound().build();
        }

        usuario.setPassword_hash(BCrypt.hashpw(usr.getSenha(), BCrypt.gensalt(10)));

        Usuario aux = usuarioRepository.save(usuario);
        aux.setPassword_hash("");
        return ResponseEntity.ok(aux);
    }


}
