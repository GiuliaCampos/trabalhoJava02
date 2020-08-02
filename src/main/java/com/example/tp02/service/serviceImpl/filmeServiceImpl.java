 package com.example.tp02.service.serviceImpl;


  import com.example.tp02.model.Filme;
  import com.example.tp02.repository.FilmeRepository;
  import com.example.tp02.service.filmeService;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;

  import java.util.List;
@Service
 public class filmeServiceImpl implements filmeService {

   @Autowired
   FilmeRepository filmeRepository;

   @Override
   public List<Filme> findAll() {
     return filmeRepository.findAll();
   }

   @Override
   public Filme findById(long id) {
     return filmeRepository.findById(id).get();
   }
 }