### CRUD de API REST utilizando Spring Boot

Descrição
Este é um projeto de CRUD (Create, Read, Update, Delete) implementado como uma API REST com foco no Back-end.
O objetivo do projeto é receber dados de cadastro e registrar as informações em um banco de dados MySQL com as devidas validações.
Para testes, utilizei o Insomnia para enviar os dados para o servidor, dispensando a necessidade de um front-end ou interface gráfica.

### Tecnologias Utilizadas

+ Spring Boot: Framework para construção da API REST.
+ Java 17: Linguagem utilizada para o desenvolvimento.
+ Lombok: Biblioteca para reduzir o código.
+ MySQL/Flyway: Banco de dados relacional e ferramenta de versionamento de banco de dados.
+ JPA/Hibernate: Frameworks para mapeamento objeto-relacional (ORM) e persistência de dados.
+ Maven: Gerenciador de dependências e construção do projeto.
+ Insomnia: Ferramenta utilizada para enviar requisições HTTP para a API.

## Exemplo de Dados a serem Enviados

    "nome": "João",
    "sobrenome": "Carlos",
    "email": "joao.carlos@example.com",
    "nomedeexibicao": "Joãozinho",
    "endereco": {
        "rua": "Rua Flores",
        "bairro": "Centro",
        "numero": "123",
        "cep": "12345-678",
        "complemento": "Apto 10",
        "uf": "MG"
