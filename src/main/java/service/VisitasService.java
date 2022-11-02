package service;

import com.artemisa.Proyecto.entity.Visitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IVisitasRepository;

import java.util.List;

@Service
public class VisitasService {

    @Autowired
    private IVisitasRepository iVisitasRepository;

    public List<Visitas> getVisitas(){
        return iVisitasRepository.findAll();
    }

    public Visitas savevisitas(Visitas visitas){
        return iVisitasRepository.save(visitas);
    }

    public Visitas getVisita(int id){
        return iVisitasRepository.findById(id).get();
    }

    public Visitas updateVisitas(Visitas visitas){
        return iVisitasRepository.save(visitas);
    }

    public void deleteVisita(int id){
        iVisitasRepository.deleteById(id);
    }
}
