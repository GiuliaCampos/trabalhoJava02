package com.example.tp02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.tp02.service.filmeService;
import com.example.tp02.model.Filme;

import java.util.List;

@Controller
public class FilmeController {

    @Autowired
    filmeService filmeService;

    @RequestMapping(value = "/filmes", method = RequestMethod.GET)
    public ModelAndView getFilmes(){
        ModelAndView mv = new ModelAndView("filmes");
        List<Filme> filmes = filmeService.findAll();
        mv.addObject("filmes", filmes);
        return mv;
    }

}
