package com.artemisa.Proyecto.controller;

import com.artemisa.Proyecto.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.artemisa.Proyecto.service.RolService;

import java.util.List;

@RestController
@RequestMapping("api")
public class RolController {

    @Autowired
    public RolService rolService;

    @GetMapping("/Roles")
    public List<Rol> GetRol(){
        return rolService.getRols();
    }
}
