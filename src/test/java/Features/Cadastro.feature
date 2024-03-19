# language: pt
# encoding: UTF-8
Funcionalidade: Cadastro de funcionario

  Cenario: Cadastro com sucesso
    Dado que o usuario esteja na tela de login
    E que ele envie dados validos
    E ele clicar em Login
    E que va para a aba de cadastro de funcionario
    E que ele preencha dados validos
    Quando clicar em Save
    Entao O sistema exibe uma mensagem de sucesso


