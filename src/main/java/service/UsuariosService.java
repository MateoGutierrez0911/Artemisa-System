package service;

import com.artemisa.Proyecto.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IUsuariosRepository;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private IUsuariosRepository iUsuariosRepository;

    public List<Usuarios> getUsuarios(){
        return iUsuariosRepository.findAll();
    }
}
