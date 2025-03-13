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

## Autor
Richard Luiz
