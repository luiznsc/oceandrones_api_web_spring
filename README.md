# GLOBAL SOLUTION | OCEANDRONES | 2TDSPT
Global Solution | Digital Business Enablement
> [!NOTE]
>**INTEGRANTES** <BR>
> Nome: Eduardo Fagundes Correa | RM: 97195 <BR>
> Nome: Murilo Ariel Reis | RM: 97002 <BR>
> Nome: Luiz Henrique de Jesus do Nascimento | RM: 96335 <BR>
> Nome: Samuel Enderson Lima da Silva | RM: 96677 <BR>

---
## DOCUMENTAÇÃO DA API
#### FUNCIONALIDADES:
> - CRUD (Create, Read, Update e Delete) de usuários.

> [!IMPORTANT]
> **Banco de Dados : Azure Database**
> <BR>
> **Deverá ser usado URL:** <BR>
> Spring: http://localhost:8080 <BR>
> <BR>
  ---

## CONTROLLER EMPRESA
### :heavy_plus_sign: CADASTRAR EMPRESA
- **URL:** /usuario/cadastrar
- **Método:** POST
- **Descrição:** Cadastrar uma novo usuário
- **Códigos de Status:**
  - :white_check_mark: 201 (Created) - Usuário cadastrado com sucesso
  -  :warning: 400 (Bad Request) - Dados de entrada inválidos.
- **Corpo da Solicitação (JSON):**

  ```json
    {
        "nomeUsuario": "João",
        "sobrenomeUsuario": "Almeida,
        "cpfUsuario": "111.222.333-50,
        "telUsuario": "(11)98765-4321",
        "emailUsuario": "joaoalmeida@gmail.com",
        "senhaUsuario": "Senha123",
    }

---

### :repeat: ATUALIZAR EMPRESA
> [!IMPORTANT]
> **Poderão ser atualizados apenas os campos:** <BR/>
> nomeUsuario, <BR/>
> sobrenomeUsuario, <BR/>
> telUsuario, <BR/>
> emailUsuario,<BR/>
> senhaUsuario, <BR/>

- **URL:** /usuarios/atualizar/{idEmpresa}
- **Método:** PUT
- **Descrição:** Atualiza os dados de um usuário existente
- **Parâmetros da URL:**
  - {idEmpresa} - ID do usuario a ter os dados atualizados.
- **Códigos de Status:**
  - :white_check_mark: 200 (OK) - Dados usuários atualizados com sucesso.
  - :warning: 400 (Bad Request) - Dados de entrada inválidos.
  - :x: 404 (Not Found) - Usuário não encontrado.
- **Corpo da Solicitação (JSON):**

  ```json
    {
        "nomeUsuario": "João",
        "sobrenomeUsuario": "Almeida,
        "telUsuario": "(11)98765-4321",
        "emailUsuario": "joaoalmeida@gmail.com",
        "senhaUsuario": "Senha123",
    }

---

### :page_with_curl: BUSCAR USUÁRIO / VISUALIZAR USUÁRIO

- **URL:** /usuarios/buscar
- **Método:** GET
- **Descrição:** Retorna os detalhes dos usuarios
- **Códigos de Status:**
  - :white_check_mark: 200 (OK) - Dados dos usuários retornados com sucesso.
  - :x: 404 (Not Found) - Usuário não encontrada.

---

### :wastebasket: APAGAR USUÁRIO

- **URL:** /usuarios/excluir/{idEmpresa}
- **Método:** DELETE
- **Descrição:** Deletar um cadastro de usuário.
- **Parâmetros da URL:**
  - {idEmpresa} - ID do usuário a ser deletado
- **Códigos de Status:**
  - :white_check_mark: 204 (No Content) - Usuário deletado com sucesso.
  - :x: 404 (Not Found) - Usuário não encontrado.
 
---
