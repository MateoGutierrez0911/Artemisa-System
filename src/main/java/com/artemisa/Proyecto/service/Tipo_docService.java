package com.artemisa.Proyecto.service;

import com.artemisa.Proyecto.entity.Alquileres;
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

    public Tipo_doc saveTipoDoc(Tipo_doc tipo_doc) {
        return iTipo_docRepository.save(tipo_doc);
    }

    public Tipo_doc getTipoDoc(int id){
        return iTipo_docRepository.findById(id).get();
    }

    public Tipo_doc updateTipoDoc(Tipo_doc tipo_doc) {
        return iTipo_docRepository.save(tipo_doc);
    }

    public void deleteTipoDoc(int id){
        iTipo_docRepository.deleteById(id);
    }
}
