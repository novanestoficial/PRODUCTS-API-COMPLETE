# 🛒 Products Gerence API

API REST para gerenciamento de produtos desenvolvida com Java e Spring Boot.

## 🚀 Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- H2(SQL)
- Lombok

## ▶️ Como executar
1. Clone o repositório
2. Configure o banco no `application.properties`
3. Execute com `./mvnw spring-boot:run`

## 📌 Endpoints
| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /products | Lista todos |
| GET | /products/{id} | Busca por ID |
| POST | /products | Cria produto |
| PUT | /products/{id} | Atualiza produto |
| DELETE | /products/{id} | Deleta produto |
