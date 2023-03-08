package br.com.fiap.wholecake.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.StringJoiner;

public class Pedido {

    private int id;
    private int numero;
    private LocalDate dataPedido;
    private LocalDate dataEncomenda;
    private String formaPagamento;
    private BigDecimal valorTotal;

    public Pedido() {
    }

    public Pedido(int id, int numero, LocalDate dataPedido, LocalDate dataEncomenda, String formaPagamento, BigDecimal valorTotal) {
        this.id = id;
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.dataEncomenda = dataEncomenda;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataEncomenda() {
        return dataEncomenda;
    }

    public void setDataEncomenda(LocalDate dataEncomenda) {
        this.dataEncomenda = dataEncomenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pedido.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("numero=" + numero)
                .add("dataPedido=" + dataPedido)
                .add("dataEncomenda=" + dataEncomenda)
                .add("formaPagamento='" + formaPagamento + "'")
                .add("valorTotal=" + valorTotal)
                .toString();
    }
}
