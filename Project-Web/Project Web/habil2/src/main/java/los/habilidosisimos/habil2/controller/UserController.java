package los.habilidosisimos.habil2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import los.habilidosisimos.habil2.service.UserService;
import los.habilidosisimos.habil2.model.User;



@Controller
public class UserController {
    @Autowired
    UserService userService;

    //Registro
    @GetMapping("/reg.html")
    public String list(Model model){

        model.addAttribute("user", userService.listUser());
        model.addAttribute("user",new User());

        return "index";
    }

    @PostMapping("/save")
    public String save(User user, Model model){

        model.addAttribute("user", user);
        userService.saveUser(user);
        return("redirect:/index");
    }

    //Iniciar sesion

}