package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Usuarios;
import com.artemisa.Proyecto.entity.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.IVentasRepository;

import java.util.List;

@Service
public class VentasService {

    @Autowired
    private IVentasRepository iVentasRepository;

    public List<Ventas> getVentas(){
        return iVentasRepository.findAll();
    }

    public Ventas saveVentas(Ventas ventas) {
        return iVentasRepository.save(ventas);
    }

    public Ventas getVentas(int id){
        return iVentasRepository.findById(id).get();
    }

    public Ventas updateVentas(Ventas ventas) {
        return iVentasRepository.save(ventas);
    }

    public void deleteVentas(int id){
        iVentasRepository.deleteById(id);
    }
}
