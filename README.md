# Analise Dinheiro Backend
- Projeto para analisar a quantidade de dinheiro depositado durante os meses

## Dependências para executar projeto
- Docker
- Java
- Intellij

## Como executar o projeto
- Execute o arquivo docker-compose.yml para subir o banco de dados
- No arquivo Application.java clique para executar -> Modify Run Configuration
  - Na parte de Environment Variables adicione a variavel SPRING_PROFILES_ACTIVE=dev

## Analise de negocio do projeto

### Telas frontend
- Tela de login
- Tela inicial
  - Menu com opções
    - Inicio
    - Depositos
    - Freelas
    - Explicação (Definições do ano)
    - Sair
  - Gráfico de depósitos do ano corrente (depósitos mensais somados com freelas)
  - Tabela de depósito mensal ano corrente (depósitos mensais somados com freelas)
- Tela de Depósitos
  - Adicionar novo depósito
  - Editar depósito
  - Excluir depósito
  - Gráfico de depósitos mensais do ano corrente (somente depósitos mensais)
  - Tabela de depósito mensal ano corrente (somente depósitos mensais)
- Tela de Freelas
  - Adicionar novo depósito de freela
  - Editar depósito de freela
  - Excluir depósito de freela
  - Gráfico de depósitos de freela mensais do ano corrente (somente depósitos freela)
  - Tabela de depósito mensal ano corrente (somente depósitos freela)
- Tela de Explicação (Definições do ano)
  - Criar novo objetivo anual
  - Editar objetivo anual
  - Excluir objetivo anual
  - Gráfico de valor depositado por ano (valores por ano)
  - Tabela de valor depositado por ano (valores por ano)

### Desenho das telas no Figma
