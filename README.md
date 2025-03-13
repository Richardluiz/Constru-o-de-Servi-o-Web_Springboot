# Tarefa 2 - API Spring Boot

# API de Consulta FIPE

## Descrição
Esta API permite consultar informações de veículos através da tabela FIPE, incluindo marcas, modelos, anos e valores.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Maven**
- **RestTemplate** para chamadas HTTP

## Endpoints Disponíveis

### 🔹 Consultar Marcas
**Requisição:**
```http
GET /marcas
```
**Resposta Exemplo:**
```json
[
    { "codigo": "59", "nome": "Volkswagen" },
    { "codigo": "25", "nome": "Fiat" },
    { "codigo": "21", "nome": "Chevrolet" }
]
```

### 🔹 Consultar Modelos de uma Marca
**Requisição:**
```http
GET /modelos/{marcaId}
```
**Exemplo:**
```http
GET /modelos/59
```
**Resposta Exemplo:**
```json
{
    "modelos": [
        { "codigo": "5229", "nome": "Gol" },
        { "codigo": "5940", "nome": "Polo" }
    ]
}
```

### 🔹 Consultar Anos de um Modelo
**Requisição:**
```http
GET /anos/{marcaId}/{modeloId}
```
**Exemplo:**
```http
GET /anos/59/5229
```
**Resposta Exemplo:**
```json
[
    { "codigo": "2013-1", "nome": "2013 Gasolina" },
    { "codigo": "2020-1", "nome": "2020 Flex" }
]
```

### 🔹 Consultar Valor do Veículo
**Requisição:**
```http
GET /valor/{marcaId}/{modeloId}/{ano}
```
**Exemplo:**
```http
GET /valor/59/5229/2020-1
```
**Resposta Exemplo:**
```json
{
    "valor": "R$ 45.000,00",
    "marca": "Volkswagen",
    "modelo": "Gol",
    "anoModelo": 2020,
    "combustivel": "Flex"
}
```

## Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seuusuario/seurepositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```sh
   cd seurepositorio
   ```
3. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse os endpoints no navegador ou Postman (`http://localhost:8080/marcas`).

6. # API de Produtos

## Descrição
Esta API permite a gestão de produtos, oferecendo operações CRUD (Create, Read, Update, Delete).

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Maven**
- **Banco de Dados** (MySQL ou outro configurado no projeto)
- **Postman** (para testes de API)

## Endpoints

### 1. Listar todos os produtos
**GET /api/produtos**

#### Resposta de Exemplo:
```json
[
  {
    "id": 1,
    "nome": "Produto A",
    "preco": 100.0,
    "quantidade": 10
  },
  {
    "id": 2,
    "nome": "Produto B",
    "preco": 200.0,
    "quantidade": 5
  }
]
```

### 2. Buscar produto por ID
**GET /api/produtos/{id}**

#### Resposta de Exemplo:
```json
{
  "id": 1,
  "nome": "Produto A",
  "preco": 100.0,
  "quantidade": 10
}
```

### 3. Criar um novo produto
**POST /api/produtos**

#### Corpo da Requisição:
```json
{
  "nome": "Produto C",
  "preco": 150.0,
  "quantidade": 20
}
```

#### Resposta de Exemplo:
```json
{
  "id": 3,
  "nome": "Produto C",
  "preco": 150.0,
  "quantidade": 20
}
```

### 4. Atualizar um produto
**PUT /api/produtos/{id}**

#### Corpo da Requisição:
```json
{
  "nome": "Produto C Modificado",
  "preco": 180.0,
  "quantidade": 25
}
```

#### Resposta de Exemplo:
```json
{
  "id": 3,
  "nome": "Produto C Modificado",
  "preco": 180.0,
  "quantidade": 25
}
```

### 5. Deletar um produto
**DELETE /api/produtos/{id}**

#### Resposta:
```
204 No Content
```

## Como Testar com Postman
1. **Listar Produtos:** Faça uma requisição **GET** para `http://localhost:8080/api/produtos`
2. **Buscar Produto por ID:** Faça uma requisição **GET** para `http://localhost:8080/api/produtos/1`
3. **Criar Produto:** Faça uma requisição **POST** para `http://localhost:8080/api/produtos` com um corpo JSON válido.
4. **Atualizar Produto:** Faça uma requisição **PUT** para `http://localhost:8080/api/produtos/1` com um corpo JSON atualizado.
5. **Deletar Produto:** Faça uma requisição **DELETE** para `http://localhost:8080/api/produtos/1`.

## Configuração do Banco de Dados
Certifique-se de configurar o **application.properties** com as credenciais do banco:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Execução do Projeto
1. Clone o repositório.
2. Configure o banco de dados.
3. Execute o comando:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API via **Postman** ou **Navegador** em `http://localhost:8080/api/produtos`.

---

© 2025 API de Produtos - Todos os direitos reservados.


## Autor
Richard Luiz
