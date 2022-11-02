package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.IRolRepository;

import java.util.List;

@Service
public class RolService {
    @Autowired
    private IRolRepository iRolRepository;

    public List<Rol> getRols() {
        return iRolRepository.findAll();
    }

    public Rol saveRol(Rol rol){
        return iRolRepository.save(rol);
    }

    public Rol getRol(int id){
        return iRolRepository.findById(id).get();
    }

    public Rol updateRol(Rol rol){
        return iRolRepository.save(rol);
    }

    public void deleteRol(int id){
        iRolRepository.deleteById(id);
    }

}