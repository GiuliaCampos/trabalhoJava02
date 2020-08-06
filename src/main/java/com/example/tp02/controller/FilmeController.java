package com.example.tp02.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.tp02.service.filmeService;
import com.example.tp02.model.Filme;

import java.util.List;

@RestController
public class FilmeController {

    @Autowired
    filmeService filmeService;


    @RequestMapping(value = "/filmes", method = RequestMethod.GET)
    public List<Filme> getFilmes() {

        return filmeService.findAll();
    }

    @RequestMapping(value = "/filme/{id_filme}", method = RequestMethod.GET)
    public Filme getFilme(@PathVariable Long id_filme) {
        Filme filme = filmeService.findById(id_filme);
        return filme;
    }
    @RequestMapping(value = "/filme/gostei/{id_filme}", method = RequestMethod.PUT,  produces = "application/json")
    public Filme updateNumeroGostei(@PathVariable Long id_filme){
        Filme filme = filmeService.findById(id_filme);
        filme.setQtd_gostei();
        return filmeService.save(filme);
    }



}
