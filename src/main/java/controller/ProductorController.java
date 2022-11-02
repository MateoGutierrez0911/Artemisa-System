package controller;

import com.artemisa.Proyecto.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductosService;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductorController {

    @Autowired
    private ProductosService productosService;

    @GetMapping("/productos")
    public List<Productos> GetProductos(){
        return productosService.getProductos();
    }
}
