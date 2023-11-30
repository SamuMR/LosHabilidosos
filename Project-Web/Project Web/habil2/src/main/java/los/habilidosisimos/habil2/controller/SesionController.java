package los.habilidosisimos.habil2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import los.habilidosisimos.habil2.entity.Sesion;
import los.habilidosisimos.habil2.repository.SesionRepository;

@Controller
public class SesionController {
    private SesionRepository sesionRepo;

    @GetMapping("/sesionIniciada")
  public String sesion(Model model) {

    // Obtenemos los datos de la base de datos
    Sesion sesion = sesionRepo.findById(1L).get();

    // Pasamos los datos al objeto de sesión
    model.addAttribute("sesion", sesion);

    return "sesion";
}}
