package com.artemisa.Proyecto.controller;

import com.artemisa.Proyecto.entity.Alquileres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.artemisa.Proyecto.service.AlquileresService;

import java.util.List;

@RestController
@RequestMapping("api")
public class AlquileresController {

    @Autowired
    private AlquileresService alquileresServices;

    @GetMapping("/alquileres")
    public List<Alquileres> GetAlquileres(){
        return alquileresServices.getAlquileres();
    }

    @PostMapping("/Alquileres/new")
    public Alquileres SaveAlquileres(@RequestBody Alquileres alquileres){
        return alquileresServices.saveAlquiler(alquileres);
    }


}
