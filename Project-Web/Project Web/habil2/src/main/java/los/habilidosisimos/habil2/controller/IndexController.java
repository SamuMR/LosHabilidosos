package los.habilidosisimos.habil2.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/Videojuegos.html")
    public String videojogos(){
        return "Videojogos.html";
    }

    @GetMapping("/Cperros.html")
    public String videoperros(){
        return "Cperros.html";
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
