package los.habilidosisimos.habil2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @Autowired
    private SesionController sesionController;

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/Crochet.html")
    public String crochet(){
        return "Crochet";
    }
    @GetMapping("/Billar.html")
    public String billar(){
        return "Billar";
    }
    @GetMapping("/Ejercicio.html")
    public String ejercicio(){
        return "Ejercicio";
    }
    @GetMapping("/Videojuegos.html")
    public String videojuegos(){
        return "videojuegos";
    }
}
