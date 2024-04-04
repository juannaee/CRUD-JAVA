# Aplicação de Gerenciamento de Funcionários e Departamentos

Este é um projeto simples de aplicação em Java para gerenciamento de funcionários e departamentos, utilizando banco de dados relacional.

## Funcionalidades

### Visualizar Funcionários

O método `visualizarDados(String consulta)` na classe `Main` permite visualizar os funcionários presentes no banco de dados. Ele aceita uma consulta SQL como parâmetro e exibe os resultados de forma dinâmica, lidando com diferentes tipos de colunas. Este método utiliza o `ResultSetMetaData` para obter informações sobre o resultado da consulta, incluindo o número de colunas e seus nomes. As colunas são impressas com seus nomes e valores correspondentes, formatando datas no padrão dd/MM/yyyy quando necessário.

### Visualizar Departamentos

Similar ao método de visualização de funcionários, a função de visualização de departamentos também utiliza o método `visualizarDados(String consulta)`, permitindo visualizar os departamentos existentes no banco de dados.

### Inserir Funcionários (não implementado)

A função de inserção de funcionários permite adicionar novos funcionários ao banco de dados. No entanto, esta funcionalidade ainda não foi implementada.

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

## Última Modificação

Este arquivo foi atualizado em 2024-04-07.

## Dinamismo da Aplicação

A aplicação é dinâmica devido ao uso do método `visualizarDados(String consulta)`. Este método aceita qualquer consulta SQL como parâmetro, permitindo a visualização de dados de qualquer tabela do banco de dados. Ele adapta dinamicamente a exibição dos resultados, lidando com diferentes tipos de colunas e formatando datas conforme necessário.

## Futuras Funcionalidades

Mais funcionalidades serão adicionadas no futuro para melhorar a aplicação, incluindo a implementação da função de inserção de funcionários e outras características de gerenciamento avançado.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
