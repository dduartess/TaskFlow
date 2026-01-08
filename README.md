# 🗂️ TaskFlow

**TaskFlow** é uma API REST simples para gerenciamento de tarefas, desenvolvida com **Spring Boot**, com foco em boas práticas de arquitetura, clareza de código e separação de responsabilidades.

O projeto foi criado com o objetivo de **estudo e consolidação de fundamentos de backend**, indo além de um CRUD básico.

---

## 🚀 Funcionalidades

- Criar tarefas
- Listar todas as tarefas
- Buscar tarefa por ID
- Atualizar título e descrição
- Marcar tarefa como concluída
- Remover tarefa

---

## 🧠 Conceitos aplicados

- Arquitetura em camadas (Controller, Service, Repository)
- API RESTful
- Spring Data JPA
- Banco de dados relacional (PostgreSQL)
- Containerização (Docker)
- Enum para status da tarefa
- Separação entre regras de negócio e camada web
- Boas práticas de atualização de entidades
- Uso adequado de HTTP Status Codes

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker & Docker Compose
- Maven
- Hibernate

---

## 📦 Modelo de domínio

### Task

```json
{
  "id": 1,
  "title": "Estudar Spring Boot",
  "description": "Revisar conceitos de JPA e REST",
  "status": "PENDING"
}
```

### Status possíveis
- `PENDING`
- `COMPLETED`

---

## 📌 Endpoints da API

### 🔹 Listar todas as tarefas
```
GET /tasks
```

### 🔹 Buscar tarefa por ID
```
GET /tasks/{id}
```

### 🔹 Criar nova tarefa
```
POST /tasks
```

**Body:**
```json
{
  "title": "Nova tarefa",
  "description": "Descrição da tarefa",
  "status": "PENDING"
}
```

### 🔹 Atualizar tarefa
```
PUT /tasks/{id}
```

**Body:**
```json
{
  "title": "Título atualizado",
  "description": "Descrição atualizada"
}
```

### 🔹 Marcar tarefa como concluída
```
PUT /tasks/{id}/complete
```

### 🔹 Deletar tarefa
```
DELETE /tasks/{id}
```

---

## 🧪 Banco de dados

O projeto utiliza **PostgreSQL** como banco de dados principal, executado via Docker.

### Dados de conexão (Padrão Docker):
- **URL:** `jdbc:postgresql://localhost:5432/taskflow`
- **Usuário:** `postgres`
- **Senha:** `postgres` (ou conforme definido no `docker-compose.yml`)

---

## ▶️ Como executar o projeto

### Pré-requisitos
- Docker e Docker Compose
- Git

### Passos com Docker

A maneira mais simples de rodar a aplicação é utilizando o Docker Compose, que sobe a API e o banco de dados automaticamente.

```bash
git clone https://github.com/dduartess/TaskFlow.git
cd TaskFlow
docker-compose up --build
```

A aplicação estará disponível em:
```
http://localhost:8080
```

---

## 📈 Próximos passos (roadmap)

- Implementar DTOs para entrada e saída de dados
- Validação com Bean Validation
- Tratamento global de exceções (`@ControllerAdvice`)
- Testes unitários com JUnit e Mockito


---

## 👨‍💻 Autor

**Daniel Duarte**  
Projeto desenvolvido para estudo e evolução em backend com Java e Spring Boot.

---

## 📝 Licença

Este projeto é de uso educacional e está aberto para estudos, melhorias e contribuições.

---

> 💡 **Observação final**  
> Este projeto não foi feito apenas para “funcionar”,  
> mas para **ser entendido, mantido e evoluído**.
