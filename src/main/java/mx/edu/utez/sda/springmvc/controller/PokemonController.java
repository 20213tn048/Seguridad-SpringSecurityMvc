package mx.edu.utez.sda.springmvc.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {
    
    @GetMapping("/pokemon/consulta")
    @Secured("ROLE_ADMIN")
    public String consultaPokemon() {
        System.out.println("Entró a consulta");
        return "consulta";
    }
}
