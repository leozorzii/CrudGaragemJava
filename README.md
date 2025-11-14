# 🚗 CRUD Garagem — Sistema de Gerenciamento de Veículos em Java

Este projeto implementa um sistema completo de gerenciamento de veículos utilizando os princípios da **Programação Orientada a Objetos (POO)** e coleções em **Java**. Ele permite realizar todas as operações CRUD (Create, Read, Update, Delete) de forma simples, organizada e modular.

---

## Repositório

 **URL Pública:**  
https://github.com/leozorzii/CrudGaragemJava.git

---

## Funcionalidades

| Módulo | Funcionalidade | Detalhes Técnicos |
|--------|----------------|------------------|
| **Estrutura** | Arquitetura POO | Separação entre entidade (`Carro.java`) e gerenciador (`metodosGaragem.java`). |
| **Coleções** | Armazenamento dos veículos | Uso de `ArrayList<Carro>` para armazenamento dinâmico. |
| **Cadastro** | Criação de objetos | Construtores obrigatórios: Placa, Modelo, Ano e Cor. |
| **Validação** | Regras de negócio | Sistema impede duplicação de placas (`toUpperCase()` para padronização). |
| **Interação** | Entrada de dados | CRUD completo via console usando `Scanner`. |
| **Listagem** | Exibição formatada | Implementação do método `toString()` na classe Carro. |

---

## Tecnologias Utilizadas

- **Java (JDK 8+)**
- **Programação Orientada a Objetos (POO)**
- **Estrutura de Dados: `ArrayList<Carro>`**
- **Entrada de dados via classe `Scanner`**


