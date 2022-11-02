package service;

import com.artemisa.Proyecto.entity.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICategoriasRepository;

import java.util.List;

@Service
public class CategoriasService {

    @Autowired
    private ICategoriasRepository iCategoriasRepository;

    public List<Categorias> getCategorias(){
        return iCategoriasRepository.findAll();
    }
}
