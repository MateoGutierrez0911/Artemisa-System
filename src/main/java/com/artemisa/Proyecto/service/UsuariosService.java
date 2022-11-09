package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Alquileres;
import com.artemisa.Proyecto.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.IUsuariosRepository;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private IUsuariosRepository iUsuariosRepository;

    public List<Usuarios> getUsuarios(){
        return iUsuariosRepository.findAll();
    }

    public Usuarios saveUsuarios(Usuarios usuarios) {
        return iUsuariosRepository.save(usuarios);
    }

    public Usuarios getUsuarios(int id){
        return iUsuariosRepository.findById(id).get();
    }

    public Usuarios updateUsuarios(Usuarios usuarios) {
        return iUsuariosRepository.save(usuarios);
    }

    public void deleteUsuarios(int id){
        iUsuariosRepository.deleteById(id);
    }
}
