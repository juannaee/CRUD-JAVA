# Sistema de Gerenciamento de Funcionários

Este é um sistema simples de gerenciamento de funcionários desenvolvido em Java, utilizando JDBC e MySQL.

## Como Funciona

O sistema permite inserir novos funcionários no banco de dados e atualizar o salário base dos funcionários de um determinado departamento.

## Estrutura do Projeto

O projeto consiste em dois pacotes principais:

### `application`

Este pacote contém a classe principal do programa, onde estão definidas as funcionalidades de inserção e atualização de dados, além de métodos auxiliares para visualização e interação com o usuário.

#### Funções Principais

- `main(String[] args)`: O método principal do programa. Atualmente, está configurado para chamar a função `atualizarDados()`, que incrementa o salário base dos funcionários de um departamento específico.
  
- `menuOpcaoVisualizacao()`: Método que exibe um menu de opções para o usuário escolher entre visualizar os funcionários ou os departamentos. Retorna a consulta SQL correspondente à opção escolhida.

- `visualizarDados(String consulta)`: Método que executa a consulta SQL fornecida como parâmetro e exibe os resultados na tela.

- `inserirDados()`: Método que insere um novo funcionário no banco de dados.

- `atualizarDados()`: Método que atualiza o salário base dos funcionários de um departamento específico.

#### Variáveis Globais

- `sc`: Um objeto `Scanner` para capturar a entrada do usuário.

- `conn`: Uma conexão global com o banco de dados, permitindo seu uso em todos os métodos da classe.

### `db`

Este pacote contém classes relacionadas à conexão com o banco de dados.

#### `DB`

- `getConnection()`: Método estático que retorna uma conexão com o banco de dados. Se uma conexão já existir, ela será reutilizada.

- `closeConnection()`: Método estático para fechar a conexão com o banco de dados.

- `closeStatement(Statement st)`: Método estático para fechar um objeto `Statement`.

- `closeResultSet(ResultSet rs)`: Método estático para fechar um objeto `ResultSet`.

- `loadProperties()`: Método privado para carregar as configurações do banco de dados a partir de um arquivo `db.properties`.

### Configuração do Banco de Dados

As credenciais de acesso ao banco de dados estão definidas no arquivo `db.properties` localizado na raiz do projeto.

## Como Utilizar

1. **Clone o repositório**: Faça uma cópia do repositório para o seu ambiente de desenvolvimento utilizando o comando `git clone`.
   
2. **Configure o MySQL**: Certifique-se de ter o MySQL instalado e crie um banco de dados chamado `jdbccurso` utilizando o seu cliente MySQL preferido ou através do terminal.

3. **Configure as credenciais de acesso**: Edite o arquivo `db.properties` localizado na raiz do projeto e insira as credenciais de acesso ao seu banco de dados MySQL.

4. **Compile e execute o projeto**: Utilize sua IDE Java preferida para compilar e executar o projeto. Certifique-se de ter o JDK 8 ou superior instalado em seu ambiente.

5. **Siga as instruções no console**: Após executar o projeto, siga as instruções exibidas no console para interagir com o sistema. Você poderá inserir novos funcionários e atualizar seus salários conforme necessário.

## Contribuindo

1. **Faça um fork do repositório**: Crie uma cópia do repositório em sua própria conta do GitHub utilizando a opção "Fork".

2. **Crie uma branch para sua nova funcionalidade**: Utilize o comando `git checkout -b feature/nova-funcionalidade` para criar uma nova branch e começar a trabalhar em sua nova funcionalidade.

3. **Faça commit de suas alterações**: Após implementar as alterações necessárias, faça commit das mesmas utilizando o comando `git commit -am 'Adiciona nova funcionalidade'`.

4. **Faça push para a branch**: Envie suas alterações para o seu repositório remoto utilizando o comando `git push origin feature/nova-funcionalidade`.

5. **Crie um novo Pull Request**: Abra um novo Pull Request no repositório original para que suas alterações sejam revisadas e integradas ao projeto principal.

## Tecnologias Utilizadas

- Java
- JDBC
- MySQL

## Requisitos

- JDK 8 ou superior
- MySQL Server
- Conexão com a internet (para baixar dependências Maven, se aplicável)

## Licença

Este projeto é licenciado sob a MIT License. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.
