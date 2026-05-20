# 🛒 Products Gerence API

API REST para gerenciamento de produtos desenvolvida com Java e Spring Boot.

## 🚀 Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

## ▶️ Como executar

1. Clone o repositório
```bash
git clone https://github.com/novanestoficial/PRODUCTS-API-COMPLETE.git
```
2. Configure as credenciais do banco no `application.yaml`
3. Crie o banco de dados `productsdb` no PostgreSQL
4. Execute com `./mvnw spring-boot:run`

## 📌 Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /products | Lista todos os produtos |
| GET | /products/{id} | Busca produto por ID |
| POST | /products | Cria um produto |
| POST | /products/batch | Cria vários produtos |
| PUT | /products/{id} | Atualiza produto |
| DELETE | /products/{id} | Deleta um produto |
| DELETE | /products | Deleta vários por IDs |

## 📋 Exemplo de uso

### Criar produto
```json
POST /products
{
    "name": "Notebook Gamer",
    "description": "16GB RAM, RTX 4060",
    "price": 5500.00
}
```

### Criar vários produtos
```json
POST /products/batch
[
    {
        "name": "Notebook Gamer",
        "description": "16GB RAM, RTX 4060",
        "price": 5500.00
    },
    {
        "name": "Mouse Gamer",
        "description": "RGB, 16000 DPI",
        "price": 350.00
    }
]
```
