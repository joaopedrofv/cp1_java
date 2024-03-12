package org.example.entitites;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Cliente extends _BaseEntity {
    private String nome;
    private String email;
    private String endereco;
    private static List<Venda> historicoDeCompras = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int id, String nome, String email, String endereco, List<Venda> historicoDeCompras) {
        super(id);
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.historicoDeCompras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static List<Venda> getHistoricoDeCompras() {
        return historicoDeCompras;
    }

    public static void setHistoricoDeCompras(List<Venda> historicoDeCompras) {
        Cliente.historicoDeCompras = historicoDeCompras;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cliente.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("email='" + email + "'")
                .add("endereco='" + endereco + "'")
                .add("id=" + id)
                .toString();
    }
}
