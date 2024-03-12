# Descrição do Exercício
**Objetivo:** Implementar as entidades fundamentais de um sistema de e-commerce (Produto, Cliente, Venda) em Java, aplicando interfaces, generics, e gerenciamento de arquivos com Gson, seguindo os princípios de DDD.

## Entidades e Requisitos
**Produto:**

**Atributos:** ID, nome, descrição, preço, estoque.

**Métodos:** Construtores, getters/setters, toString().


**Cliente:**

**Atributos:** ID, nome, email, endereço, histórico de compras.

**Métodos:** Construtores, getters/setters, adicionarCompra(Venda venda), toString().


**Venda:**
**Atributos:** ID, cliente (referência ao Cliente), itens de venda (produtos com quantidades), data, valor total.

**Métodos:** Construtores, getters/setters, calcularTotal(), toString().

# Requisitos Específicos
**Interfaces:** Definir interfaces para as operações básicas que podem ser aplicadas a cada entidade, como salvar, carregar, atualizar e deletar.

**Genérics:** Utilizar genéricos para criar um sistema flexível de manipulação de dados que possa ser reutilizado para diferentes tipos de entidades.

**Gson para Gerenciamento de Arquivos:** Implementar a funcionalidade de persistir e recuperar entidades usando Gson, tratando a serialização e deserialização de objetos para o formato JSON.

**Aplicação dos Princípios de DDD:** Estruturar o projeto de acordo com DDD, separando claramente a lógica de negócios das entidades e garantindo que as regras do domínio sejam adequadamente representadas e encapsuladas nas entidades.

