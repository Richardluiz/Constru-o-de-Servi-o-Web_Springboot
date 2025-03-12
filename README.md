# Tarefa 2 - API Spring Boot

Este projeto é uma aplicação **Spring Boot** desenvolvida para realizar operações **CRUD** em uma entidade chamada `Product`. Ele utiliza **Maven** como gerenciador de dependências e possui endpoints REST para criar, ler, atualizar e deletar produtos.

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database** (banco de dados em memória para testes)
- **Postman** (para testes de API)

## 📌 Configuração do Projeto
### 1️⃣ Clonar o repositório:
```sh
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

### 2️⃣ Construir o projeto com Maven:
```sh
mvn clean install
```

### 3️⃣ Rodar a aplicação:
```sh
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## 📌 Endpoints da API

### 🔹 Criar um Produto (POST)
```http
POST /products
```
**Body (JSON):**
```json
{
  "name": "Produto Exemplo",
  "price": 100.50,
  "quantity": 10
}
```

### 🔹 Listar todos os Produtos (GET)
```http
GET /products
```

### 🔹 Buscar Produto por ID (GET)
```http
GET /products/{id}
```

### 🔹 Atualizar Produto (PUT)
```http
PUT /products/{id}
```
**Body (JSON):**
```json
{
  "name": "Novo Nome",
  "price": 150.00,
  "quantity": 5
}
```

### 🔹 Deletar Produto (DELETE)
```http
DELETE /products/{id}
```

## 🔥 Testando no Postman
1. Abra o **Postman**
2. Selecione o método correto (**GET, POST, PUT ou DELETE**)
3. Insira a URL correspondente
4. Caso necessário, vá em **Body → Raw → JSON** e insira os dados
5. Clique em **Send**

## 📝 Autor
Desenvolvido por [Richard Luiz](https://github.com/Richardluiz). Se gostou, deixe uma ⭐ no repositório!

---


