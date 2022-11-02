package service;

import com.artemisa.Proyecto.entity.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IVentasRepository;

import java.util.List;

@Service
public class VentasService {

    @Autowired
    private IVentasRepository iVentasRepository;

    public List<Ventas> getVentas(){
        return iVentasRepository.findAll();
    }

}
