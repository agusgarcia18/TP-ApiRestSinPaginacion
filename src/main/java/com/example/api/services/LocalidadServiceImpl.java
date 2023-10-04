package com.example.api.services;

import com.example.api.entities.Localidad;
import com.example.api.repositories.BaseRespository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRespository<Localidad, Long> baseRespository) {
        super(baseRespository);
    }

}
