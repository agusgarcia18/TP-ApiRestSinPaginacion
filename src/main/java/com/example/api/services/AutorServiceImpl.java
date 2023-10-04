package com.example.api.services;

import com.example.api.entities.Autor;
import com.example.api.repositories.AutorRespository;
import com.example.api.repositories.BaseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,
        Long> implements AutorService{

    @Autowired
    private AutorRespository autorRespository;

    public AutorServiceImpl(BaseRespository<Autor, Long> baseRespository, AutorRespository autorRespository) {
        super(baseRespository);
        this.autorRespository = autorRespository;
    }
}
