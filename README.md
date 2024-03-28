# Microserviço CRUD de Usuários

Este é um projeto simples de microserviço para gerenciar usuários com operações básicas CRUD (Create, Read, Update, Delete). O projeto é desenvolvido em Java usando Spring Boot, seguindo a arquitetura de camadas MVC e orientação a objetos.

## Funcionalidades

- Cadastro de novos usuários com nome e e-mail.
- Atualização de informações de usuários existentes.
- Exclusão de usuários.
- Recuperação de informações de usuários existentes.

## Estrutura do Projeto

O projeto segue uma estrutura de camadas com separação de responsabilidades:

1. **Camada de Entidade (Entity Layer)**:
   - `Usuario`: Classe que representa a entidade de usuário com campos como nome e e-mail.

2. **Camada de Repositório (Repository Layer)**:
   - `UsuarioRepository`: Interface que estende JpaRepository para realizar operações de persistência no banco de dados.

3. **Camada de Serviço (Service Layer)**:
   - `UsuarioService`: Classe responsável por manipular os dados da entidade de usuário e disponibilizá-los para a camada de controle.

4. **Camada de Controlador (Controller Layer)**:
   - `UsuarioController`: Controlador REST responsável por lidar com as requisições HTTP, processar os dados e retornar as respostas.

5. **Classes DTO (Data Transfer Objects)**:
   - `UsuarioDTO`: Classes DTO para filtrar os dados exibidos pela camada de controle.

## Instalação e Uso

1. Clone o repositório do projeto.
2. Configure seu ambiente de desenvolvimento Java e Spring Boot.
3. Execute o aplicativo Spring Boot.
4. Acesse os endpoints fornecidos pela API para realizar operações CRUD de usuários.

## Endpoints Disponíveis

### 1. Obter Todos os Usuários

- **Descrição**: Retorna todos os usuários cadastrados no sistema.
- **Método**: GET
- **URL**: `http://localhost:8080/users`

### 2. Buscar Usuário por ID

- **Descrição**: Retorna um usuário específico com base em seu ID.
- **Método**: GET
- **URL**: `http://localhost:8080/users/{id}`
  - Substitua `{id}` pelo ID do usuário desejado.

### 3. Adicionar Usuário

- **Descrição**: Adiciona um novo usuário ao sistema.
- **Método**: POST
- **URL**: `http://localhost:8080/users`
- **Corpo da Requisição**:
  ```json
  {
    "name": "ExemploName",
    "email": "exemploEmail@gmail.com"
  }

### 4. Atualizar Usuário 

- **Descrição**: Atualizar usuário existente
- **Método**: PUT
- **URL**: `http://localhost:8080/users/{id}`
- Substitua `{id}` pelo ID do usuário que deseja atualizar.

### 5. Deletar Usuário

- **Descrição**: Deletar usuário
- **Método**: DELETE
- **URL**: `http://localhost:8080/users/{id}`
- Substitua `{id}` pelo ID do usuário que deseja deletar.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar solicitações pull.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
