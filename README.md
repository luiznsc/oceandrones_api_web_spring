# GLOBAL SOLUTION | OCEANDRONES | 2TDSPT
Global Solution | Digital Business Enablement
> [!NOTE]
>**INTEGRANTES** <BR>
> Nome: Eduardo Fagundes Correa | RM: 97195 <BR>
> Nome: Murilo Ariel Reis | RM: 97002 <BR>
> Nome: Luiz Henrique de Jesus do Nascimento | RM: 96335 <BR>
> Nome: Samuel Enderson Lima da Silva | RM: 96677 <BR>

## OBJETIVO
> - A OceanDrones tem como objetivo fornecer dados precisos e abrangentes sobre as regiões oceânicas da costa brasileira.<br>
> Utilizando drones aquáticos, a empresa coleta informações detalhadas sobre a saúde dos ecossistemas marinhos,<br>
> a presença de espécies e a qualidade dos recifes. Esses dados são essenciais para<br>
> promover a conservação, a pesquisa científica e a gestão sustentável dos oceanos. Dessa forma<br>
> as intituições interessadas em promover a preservação e manutenabilidade dos oceanos<br>
> poderão se preocuparcom a parte mais importante: usar esses dados de maneira positiva. <br>
> Enquanto a OceanDrones cuida da parte técnica, burocrática, logística e mão de obra.

---
## DOCUMENTAÇÃO DA API
#### FUNCIONALIDADES:
> - CRUD (Create, Read, Update e Delete) de usuários.
> - Cadastrar e deletar requisições de expedição de drones.

> [!IMPORTANT]
> **BANCO DE DADOS**<br>
> Azure Database

> [!IMPORTANT]
> **APLICAÇÃO EM NUVEM**:
> - A aplicação está rodando em nuvem na Azure, assim como o banco de dados.<br>
> Para realizar teste de requisições poderá ser usado o SWAGGER -> <br>
> https://oceandrones-weabpp-java.azurewebsites.net/swagger-ui/index.html<br>
> <br>
>
> **Ao acessar o link será solicitado LOGIN e SENHA, deverá ser usado os dados do SpringSecurity:** <br>
>   **Login: oceandrones** <br>
>   **Senha: 12345**
> <BR>

> [!IMPORTANT]
> Caso queira usar outro testador de API, basta utilizar a url:<br>
> https://oceandrones-weabpp-java.azurewebsites.net/<br>
> e acrescentar os caminhos conforme a documentação abaixo.

  ---

## CONTROLLER USUÁRIO
### :heavy_plus_sign: CADASTRAR USUÁRIO
- **URL:** /usuario/cadastrar
- **Método:** POST
- **Descrição:** Cadastrar um novo usuário
- **Códigos de Status:**
  - :white_check_mark: 201 (Created) - Usuário cadastrado com sucesso
  -  :warning: 400 (Bad Request) - Dados de entrada inválidos.
- **Corpo da Solicitação (JSON):**

  ```json
    {
        "nomeUsuario": "João",
        "sobrenomeUsuario": "Almeida",
        "cpfUsuario": "111.222.333-50",
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

- **URL:** /usuarios/atualizar/{idUsuario}
- **Método:** PUT
- **Descrição:** Atualiza os dados de um usuário existente
- **Parâmetros da URL:**
  - {idUsuario} - ID do usuario a ter os dados atualizados.
- **Códigos de Status:**
  - :white_check_mark: 200 (OK) - Dados usuários atualizados com sucesso.
  - :warning: 400 (Bad Request) - Dados de entrada inválidos.
  - :x: 404 (Not Found) - Usuário não encontrado.
- **Corpo da Solicitação (JSON):**

  ```json
    {
        "nomeUsuario": "João Victor",
        "telUsuario": "(11)95050-1010",
        "emailUsuario": "joaoalmeida@hotmail.com",
        "senhaUsuario": "Senha1235"
    }

---

### :page_with_curl: BUSCAR USUÁRIO / VISUALIZAR USUÁRIO

- **URL:** /usuarios/buscar?{emailUsuario}&{senhaUsuario}
- **Método:** GET
- **Descrição:** Retorna os detalhes dos usuarios
- **Parâmetros da URL:**
  - {emailUsuario} - email cadastrado do usuário
  - {senhaUsuario} - senha cadastrada do usuário
- **Códigos de Status:**
  - :white_check_mark: 200 (OK) - Dados dos usuários retornados com sucesso.
  - :x: 404 (Not Found) - Usuário não encontrada.

---

### :wastebasket: APAGAR USUÁRIO

- **URL:** /usuarios/deletar/{idEmpresa}
- **Método:** DELETE
- **Descrição:** Deletar um cadastro de usuário.
- **Parâmetros da URL:**
  - {idEmpresa} - ID do usuário a ser deletado
- **Códigos de Status:**
  - :white_check_mark: 204 (No Content) - Usuário deletado com sucesso.
  - :x: 404 (Not Found) - Usuário não encontrado.
 
---

  ---

## CONTROLLER EXPEDICAO DRONE 
### :heavy_plus_sign: CADASTRAR EXPEDIÇÃO DE UM DRONE
- **URL:** /expedicaodrones/cadastrar
- **Método:** POST
- **Descrição:** Cadastrar uma nova expedição de drone.
- **Códigos de Status:**
  - :white_check_mark: 201 (Created) - Expedição cadastrada com sucesso
  -  :warning: 400 (Bad Request) - Dados de entrada inválidos.
- **Corpo da Solicitação (JSON):**

  ```json
    {
      "drones": "IBUBBLE",
      "ufExpedicao": "AM",
      "porto": "PORTOCHIBATAO",
      "trajeto": "TRAJETOPORTOCHIBATAO"
    }

---

### :wastebasket: APAGAR EXPEDIÇÃO

- **URL:** /expedicaodrones/deletar/{idExpDrone}
- **Método:** DELETE
- **Descrição:** Deletar uma expedição cadastrada.
- **Parâmetros da URL:**
  - {idExpDrone} - ID da expedição a ser deletada
- **Códigos de Status:**
  - :white_check_mark: 204 (No Content) - Expedição deletada com sucesso.
  - :x: 404 (Not Found) - Expedição não encontrado.
 
