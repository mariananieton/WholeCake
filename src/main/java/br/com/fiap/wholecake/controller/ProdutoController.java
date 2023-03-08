package br.com.fiap.wholecake.controller;

import br.com.fiap.wholecake.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ProdutoController {

    @GetMapping("/api/produtos")
    public Produto show(){
        return new Produto(1, "Brigadeiro", new BigDecimal(1.50));
    }
}
