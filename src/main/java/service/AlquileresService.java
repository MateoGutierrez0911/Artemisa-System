package service;

import com.artemisa.Proyecto.entity.Alquileres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IAlquilerRepository;

import java.util.List;

@Service
public class AlquileresService {

    @Autowired
    private IAlquilerRepository iAlquilerRepository;

    public List<Alquileres> getAlquileres(){
        return iAlquilerRepository.findAll();
    }
}
