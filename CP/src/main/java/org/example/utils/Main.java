package org.example.utils;

import org.example.entitites.Cliente;
import org.example.entitites.Produto;
import org.example.entitites.Venda;
import org.example.repositories.ClienteRepository;
import org.example.repositories.ProdutoRepository;
import org.example.repositories.VendaRepository;

public class Main {
    public static void main(String[] args) {
        ProdutoRepository produtoRepo = new ProdutoRepository();
        ClienteRepository clienteRepo = new ClienteRepository();
        VendaRepository vendaRepo = new VendaRepository();


        var novoCliente = new Cliente(1,
                "João Pedro",
                "joaopvillagra1098@gmail.com",
                "Rua decolores, 171",
                null
                );



        var novaCompra = new Produto(1,
                "Lápis",
                "Com ponta 4B para desenhos",
                12.30,
                1200);

        var novaCompra2 = new Produto(2,
                "Caneta",
                "Com ponta fina para escrever redações",
                10,
                5000);


        var novaVenda = new Venda(1,
                 novoCliente,
                null ,
                "08/03/2024",
                0);
        clienteRepo.adicionarCompra(novaVenda);
        System.out.println(novoCliente);


        produtoRepo.create(novaCompra);
        produtoRepo.create(novaCompra2);
        clienteRepo.create(novoCliente);
        vendaRepo.create(novaVenda);

        //System.out.println(produtoRepo.read());
        //System.out.println(clienteRepo.read());


    }
}