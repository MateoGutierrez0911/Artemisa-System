package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Alquileres;
import com.artemisa.Proyecto.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.IProductoRepository;

import java.util.List;

@Service
public class ProductosService {

    @Autowired
    private IProductoRepository iProductoRepository;

    public List<Productos> getProductos(){
        return iProductoRepository.findAll();
    }

    public Productos saveProductos(Productos productos) {
        return iProductoRepository.save(productos);
    }

    public Productos getProductos(int id){
        return iProductoRepository.findById(id).get();
    }

    public Productos updateProductos(Productos productos) {
        return iProductoRepository.save(productos);
    }

    public void deleteProductos(int id){
        iProductoRepository.deleteById(id);
    }
}
