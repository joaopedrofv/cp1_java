package org.example.entitites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

public class Venda extends _BaseEntity{
    private Cliente cliente;
    private List<Produto> itensVenda = new ArrayList<>();
    private String data;
    private double valorTotal;

    public Venda() {
    }

    public Venda(int id, Cliente cliente, List<Produto> itensVenda, String data, double valorTotal) {
        super(id);
        this.cliente = cliente;
        this.itensVenda = itensVenda;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getItensVenda(Produto novaCompra) {
        return itensVenda;
    }

    public void setItensVenda(List<Produto> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Venda.class.getSimpleName() + "[", "]")
                .add("cliente=" + cliente)
                .add("itensVenda=" + itensVenda)
                .add("data=" + data)
                .add("valorTotal=" + valorTotal)
                .add("id=" + id)
                .toString();
    }
}
