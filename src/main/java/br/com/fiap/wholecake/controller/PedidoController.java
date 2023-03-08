package br.com.fiap.wholecake.controller;

import br.com.fiap.wholecake.model.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
public class PedidoController {

    @GetMapping("/api/pedidos")
    public Pedido show(){
        return new Pedido(1, 123, LocalDate.now(), LocalDate.now(), "Cartão de Crédito", new BigDecimal(250));
    }
}
