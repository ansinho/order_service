# Order Service

Um microserviço simples para gerenciamento de pedidos construído com Spring Boot.

## Descrição

Este projeto implementa um serviço de processamento de pedidos com integração de mensageria via RabbitMQ.

## Tecnologias

- **Java** - Linguagem de programação
- **Spring Boot** - Framework web
- **RabbitMQ** - Message broker para comunicação assíncrona
- **Maven** - Gerenciador de dependências
- **Docker** - Containerização

## Estrutura do Projeto

```
src/main/java/com/anderson/order_service/
├── OrderServiceApplication.java    # Classe principal
├── config/                         # Configurações (RabbitMQ)
├── controller/                     # Controladores REST
├── domain/                         # Entidades e repositórios
├── dto/                           # Data Transfer Objects
├── messaging/                     # Produtores e consumidores de mensagens
└── service/                       # Lógica de negócio
```

## Como Executar

### Pré-requisitos
- JDK 11+
- Maven
- RabbitMQ rodando (via Docker Compose ou localmente)

### Executar com Docker Compose

```bash
docker-compose -f docker/docker-compose.yaml up
```

### Executar a aplicação

```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`

## API

### Endpoints
- `POST /orders` - Criar um novo pedido

## Licença

MIT
