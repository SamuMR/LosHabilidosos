package los.habilidosisimos.habil2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import los.habilidosisimos.habil2.entity.Usuario;
import los.habilidosisimos.habil2.model.UsuarioForm;
import los.habilidosisimos.habil2.repository.UserRepository;

@Controller
public class SignUpController {
    
    @Autowired
    private UserRepository userRepository;



    @GetMapping(path = "/signup")
    public String GetSignupPage(){
        return "signup";
    }

    @PostMapping(path = "/signup")
    public String SubmitSignup(UsuarioForm usuarioForm){
        
        //Guardar usuario
        Usuario usuario = null;
        if(null != usuarioForm){
            usuario = new Usuario(usuarioForm.getNombre(), usuarioForm.getApellido(), usuarioForm.getCorreoId(), usuarioForm.getPassword());            
        }  
        userRepository.save(usuario);
        return "index";
    }


}
