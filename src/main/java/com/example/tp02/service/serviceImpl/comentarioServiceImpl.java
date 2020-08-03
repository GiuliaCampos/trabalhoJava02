package com.example.tp02.service.serviceImpl;

import com.example.tp02.model.Comentario;
import com.example.tp02.repository.ComentarioRepository;
import com.example.tp02.service.comentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class comentarioServiceImpl implements comentarioService {
    @Autowired
    ComentarioRepository comentarioRepository;
    @Override
    public List<Comentario> findAll() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario findById(Long id_comentario) {
        return comentarioRepository.findById(id_comentario).get();
    }

    @Override
    public Comentario save(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }
}
