package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Tipo_doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artemisa.Proyecto.repository.ITipo_docRepository;

import java.util.List;

@Service
public class Tipo_docService {

    @Autowired
    private ITipo_docRepository iTipo_docRepository;

    public List<Tipo_doc> getTipoDoc(){
        return iTipo_docRepository.findAll();
    }
}
