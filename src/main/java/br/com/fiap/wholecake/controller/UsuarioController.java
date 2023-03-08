package br.com.fiap.wholecake.controller;

import br.com.fiap.wholecake.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class UsuarioController {

    @GetMapping("/api/usuarios")
    public Usuario show(){
        return new Usuario(1, "Mariana", "mariananieton", "senhaDificilDeDescobrir", LocalDate.now());
    }
}
