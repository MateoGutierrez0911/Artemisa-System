package service;

import com.artemisa.Proyecto.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IProductoRepository;

import java.util.List;

@Service
public class ProductosService {

    @Autowired
    private IProductoRepository iProductoRepository;

    public List<Productos> getProductos(){
        return iProductoRepository.findAll();
    }
}
