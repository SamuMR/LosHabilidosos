package los.habilidosisimos.habil2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import los.habilidosisimos.habil2.entity.Usuario;
import los.habilidosisimos.habil2.model.UsuarioSignin;
import los.habilidosisimos.habil2.repository.UserRepository;

@Controller
public class SignInController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/signin")
    public String GetSigninPage(){
        return "signin";
    }

    @PostMapping(path = "/signin")
    public String SubmitSignin(UsuarioSignin usuarioSignin) {
    
        // Buscar usuario por correo electrónico
        Usuario usuario = userRepository.findByCorreoId(usuarioSignin.getCorreoId());
        // Si el usuario no existe, devolver error
        if (usuario == null) {
            return "error";
        }
    
        // Comparar contraseñas
        if (usuario.getPassword().equals(usuarioSignin.getPassword())) {
            // Usuario autenticado, redireccionar a página principal
            return "index";
        } else {
            // Contraseña incorrecta, devolver error
            return "error";
        }
    }
}
