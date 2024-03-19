# language: pt
# encoding: UTF-8
Funcionalidade: Login
    Cenario: Login com sucesso
        Dado que o usuario esteja na tela de login
        E que ele envie dados validos
        Quando ele clicar em Login
        Entao o sistema faz o login
