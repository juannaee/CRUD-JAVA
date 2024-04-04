# Aplicação de Gerenciamento de Funcionários e Departamentos

Este é um projeto simples de aplicação em Java para gerenciamento de funcionários e departamentos, utilizando banco de dados relacional.

## Funcionalidades

### 1. Visualizar Funcionários
- Ao selecionar esta opção, a aplicação executa uma consulta SQL para recuperar todos os funcionários cadastrados no banco de dados.
- Para cada funcionário, são exibidos detalhes como nome, email, aniversário, salário base e departamento associado.
- O método `visualizarDados(String consulta)` na classe `Main.java` é responsável por essa funcionalidade.

### 2. Visualizar Departamentos
- Esta opção permite visualizar todos os departamentos existentes no banco de dados.
- A aplicação executa uma consulta SQL para recuperar os dados dos departamentos e os exibe na tela.
- O método `visualizarDados(String consulta)` na classe `Main.java` também é utilizado para essa funcionalidade.

### 3. Inserir Funcionários (não implementado)
- Esta funcionalidade permite inserir novos funcionários no banco de dados.
- O método `inserirDados()` na classe `Main.java` está parcialmente implementado para realizar essa tarefa, mas atualmente está comentado.

## Configuração do Banco de Dados

Para executar este projeto, é necessário configurar um banco de dados MySQL e fornecer as credenciais no arquivo `db.properties`.

## Dependências

Este projeto requer o driver JDBC para conexão com o banco de dados MySQL.

## Como Executar

1. Certifique-se de ter configurado corretamente o banco de dados e fornecido as credenciais no arquivo `db.properties`.
2. Execute o arquivo `Main.java` para iniciar a aplicação.
3. Siga as instruções para visualizar funcionários ou departamentos.

## Estrutura do Projeto

- `Main.java`: Contém a classe principal com métodos para visualização de dados e inserção de funcionários.
- `DB.java`: Contém a classe para gerenciamento da conexão com o banco de dados.
- `DbException.java`: Contém a classe para exceções relacionadas ao banco de dados.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
