package service;

import com.artemisa.Proyecto.entity.DetalleAlquileres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IDetalleAlquilerRepository;

import java.util.List;

@Service
public class DetalleAlquilerService {

    @Autowired
    private IDetalleAlquilerRepository iDetalleAlquilerRepository;

    public List<DetalleAlquileres> getDetalleAlquiler(){
        return iDetalleAlquilerRepository.findAll();
    }
}
