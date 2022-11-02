package com.artemisa.Proyecto.controller;

import com.artemisa.Proyecto.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.artemisa.Proyecto.service.UsuariosService;

import java.util.List;

@RestController
@RequestMapping("api")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("Usuarios")
    public List<Usuarios> GetUsuarios(){
        return usuariosService.getUsuarios();
    }
}
