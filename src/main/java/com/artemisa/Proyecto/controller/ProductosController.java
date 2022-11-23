package com.artemisa.Proyecto.controller;

import com.artemisa.Proyecto.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.artemisa.Proyecto.service.ProductosService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductorController {

    @Autowired
    private ProductosService productosService;

    @GetMapping("/producto/all")
    public String getProductos(Model model){
        List<Productos> suppliers = productosService.getProductos();
        model.addAttribute("producto", suppliers);
        return "Producto/all";
    }

    @GetMapping("/producto/new")
    public String showNewProductoModel (Model model){
        model.addAttribute("producto", new Productos());
        return "producto/new";
    }

    @PostMapping("/producto/save")
    public String newProducto(Productos productos){
        productosService.saveProductos(productos);
        return "redirect:/productos/all";
    }

    @GetMapping("/producto/update/{id}")
    public String showUpdateProducto(@PathVariable int id, Model model){
        model.addAttribute("productos", productosService.getProductos(id));
        return "producto/update";
    }

    @PostMapping("/producto/update/{id}")
    public String updateSupplier(@PathVariable int id,Productos productos){
        productos.setIdProducto(id);
        productosService.updateProductos(productos);
        return "redirect:/producto/all";
    }

    @GetMapping("/producto/delete/{id}")
    public String deleteSupplier(@PathVariable int id){
        productosService.deleteProductos(id);
        return "redirect:/producto/all";
    }
}
