package controller;

import com.artemisa.Proyecto.entity.Tipo_doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Tipo_docService;

import java.util.List;

@RestController
@RequestMapping("api")
public class Tipo_docController {


    @Autowired
    public Tipo_docService tipo_docService;

    @GetMapping("/TipoDoc")
    public List<Tipo_doc> GetTipoDoc(){
        return tipo_docService.getTipoDoc();
    }
}
