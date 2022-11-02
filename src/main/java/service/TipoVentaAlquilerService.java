package service;

import com.artemisa.Proyecto.entity.TipoVentaAlquileres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ITipoVentaAlquilerRepository;

import java.util.List;

@Service
public class TipoVentaAlquilerService {

    @Autowired
    private ITipoVentaAlquilerRepository iTipoVentaAlquilerRepository;

    public List<TipoVentaAlquileres> getTipoVA(){
        return iTipoVentaAlquilerRepository.findAll();
    }

}
