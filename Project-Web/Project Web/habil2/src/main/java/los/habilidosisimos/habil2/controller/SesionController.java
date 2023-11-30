package los.habilidosisimos.habil2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SesionController {

    public void sesionActual(boolean bool) {
      boolean ssn = bool;
    }

    @GetMapping("/sesioniniciada")
    public String sesionIniciada(){
      sesionActual(false);
      return "index.html";
    }
}