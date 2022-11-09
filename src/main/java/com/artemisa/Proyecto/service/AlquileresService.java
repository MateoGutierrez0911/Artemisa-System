package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Alquileres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.IAlquilerRepository;

import java.util.List;

@Service
public class AlquileresService {

    @Autowired
    private IAlquilerRepository iAlquilerRepository;

    public List<Alquileres> getAlquileres(){
        return iAlquilerRepository.findAll();
    }

    public Alquileres saveAlquiler(Alquileres alquileres) {
        return iAlquilerRepository.save(alquileres);
    }

    public Alquileres getAlquiler(int id){
        return iAlquilerRepository.findById(id).get();
    }

    public Alquileres updateAlquileres(Alquileres alquileres) {
        return iAlquilerRepository.save(alquileres);
    }

    public void deleteAlquiler(int id){
        iAlquilerRepository.deleteById(id);
    }
}
