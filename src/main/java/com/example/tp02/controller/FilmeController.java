package com.example.tp02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.tp02.service.filmeService;
import com.example.tp02.model.Filme;

import java.util.List;

@RestController
public class FilmeController {

    @Autowired
    filmeService filmeService;

    @RequestMapping(value = "/filmes", method = RequestMethod.GET)
    public List<Filme> getFilmes() {

        List<Filme> filmes = filmeService.findAll();

        return filmes;
    }

    @RequestMapping(value = "/filme/{id_cliente}", method = RequestMethod.GET)
    public Filme getFilme(@PathVariable Long id_cliente) {
        Filme filme = filmeService.findById(id_cliente);
        return filme;
    }

}
