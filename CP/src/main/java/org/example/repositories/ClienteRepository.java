package org.example.repositories;

import org.example.entitites.Cliente;
import org.example.entitites.Venda;

import java.util.List;

public class ClienteRepository extends  _BaseRepositoryImpl <Cliente>{

    public void adicionarCompra(Venda venda){
       List<Venda> historicoDeCompras = Cliente.getHistoricoDeCompras();
       historicoDeCompras.add(venda);
   }

}
