package com.example.tp02.service;
import com.example.tp02.model.Filme;
import java.util.List;
public interface filmeService{
  List <Filme> findAll();
  Filme findById(long id);
  Filme save(Filme filme);
}