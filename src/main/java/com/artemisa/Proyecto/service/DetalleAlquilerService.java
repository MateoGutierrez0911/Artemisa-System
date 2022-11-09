package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Alquileres;
import com.artemisa.Proyecto.entity.DetalleAlquileres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.IDetalleAlquilerRepository;

import java.util.List;

@Service
public class DetalleAlquilerService {

    @Autowired
    private IDetalleAlquilerRepository iDetalleAlquilerRepository;

    public List<DetalleAlquileres> getDetalleAlquiler(){
        return iDetalleAlquilerRepository.findAll();
    }

    public DetalleAlquileres saveDetalleAlquiler(DetalleAlquileres detalleAlquileres) {
        return iDetalleAlquilerRepository.save(detalleAlquileres);
    }

    public DetalleAlquileres getDetalleAlquiler(int id){
        return iDetalleAlquilerRepository.findById(id).get();
    }

    public DetalleAlquileres updateDetalleAlquileres(DetalleAlquileres detalleAlquileres) {
        return iDetalleAlquilerRepository.save(detalleAlquileres);
    }

    public void deleteDetalleAlquileres(int id){
        iDetalleAlquilerRepository.deleteById(id);
    }
}
