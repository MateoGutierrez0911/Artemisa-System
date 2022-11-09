package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Alquileres;
import com.artemisa.Proyecto.entity.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.ICategoriasRepository;

import java.util.List;

@Service
public class CategoriasService {

    @Autowired
    private ICategoriasRepository iCategoriasRepository;

    public List<Categorias> getCategoria(){
        return iCategoriasRepository.findAll();
    }

    public Categorias sabeCategoria(Categorias categorias) {
        return iCategoriasRepository.save(categorias);
    }

    public Categorias getCategoria(int id){
        return iCategoriasRepository.findById(id).get();
    }

    public Categorias updateCategoria(Categorias categorias) {
        return iCategoriasRepository.save(categorias);
    }

    public void deleteCategoria(int id){
        iCategoriasRepository.deleteById(id);
    }
}
