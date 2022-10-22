# Meu diário
Sistema de organização de atividades diárias

> Este projeto foi utilizado para lecionar o workshop Introdução a APIs Java + SpringBoot na Opendev Hacktoberfest 2022!

## Requisitos do Meu diário

> Você também poderá conferir esses requisitos no kanban da aba Projeto desse repositório ou no formato de Issues.

- [ ] **US 1**: *Eu, como usuário do sistema, quero ter uma conta vinculada a mim, afim de realizar atividades vinculadas ao meu perfil.*
- [ ] **US 2**: *Eu, como usuário do sistema, quero poder editar as informaçãoes da minha conta.*
- [ ] **US 3**: *Eu, como usuário do sistema, quero poder desativar minha conta, com a possibilidade de reativação.*
- [ ] **US 4**: *Eu, como usuário do sistema, quero poder remover a minha conta do sistema permanentemente.*
- [ ] **US 5**: Eu, como usuário do sistema, quero fazer login em minha conta para realizar atividades.
- [ ] **US 6**: Eu, como usuário do sistema, quero ser capaz de adicionar tarefas ao meu perfil, contendo uma data, um título, uma descrição opcional acerca da atividade e um horário.
- [ ] **US 7**: Eu, como usuário do sistema, quero ser capaz de editar as informações de uma atividade adicionada.
- [ ] **US 8**: Eu, como usuário do sistema, quero ser capaz de remover as informações de uma atividade adicionada.
- [ ] **US 9**: Eu, como usuário do sistema, desejo listar de maneira ordenada as atividades do dia atual. 
- [ ] **US 10**: Eu, como usuário do sistema, desejo listar de maneira ordenada as atividades de um dia informado.
- [ ] **US 11**: Eu, como usuário do sistema, quero ser capaz de checar se existe alguma atividade alocada para certo dia e horário, sendo possível verificar qual atividade está ocupando o slot, quando existir.
- [ ] **US 12**: Eu, como usuário do sistema, quero ser capaz de checar se existe alguma atividade alocada para certo dia e horário, sendo possível verificar qual atividade está ocupando o slot, quando existir.
- [ ] **US 13**: Eu, como usuário do sistema, desejo gerar um PDF com a listagem de todas as atividades alocadas para um intervalo de dias. 

## Como contribuir
Acesse o arquivo [CONTRIBUTING.md](./CONTRIBUTING.md) para mais informações.


---
# Especificações para atividade do Workshop

Vamos implementar a entidade usuário?!

## Nosso usuário deverá...
1. ter um **nome**
2. ter um **sobrenome**
3. ter uma **data de nascimento** no formato **DD/MM/AAAA**

USUÁRIO||
--------|-
nome| String|
sobrenome| String|
data_nascimento| Date|

> Para simplificar, você poderá ter liberdade em como representar esta data de nascimento, fique livre para utilizar os tipos de Java para representação de tempo e data, para criar sua própria entidade ou representar isso em diferentes campos.

## Poderemos realizar...
1. O **cadastro** de um usuário passando as informações necessárias
2. **Listar todos** os usuários cadastrados até o momento no sistema

> Dica: essas operações parecem com algo que já vimos antes! Tente implementar a estrutura MVC com base no modelo HelloWorld disponibilizado.
