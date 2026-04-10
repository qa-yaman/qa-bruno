Feature: Login

  Scenario: Tentativa de login inválido
    Given que estou na tela de login
    When informo CPF "00000000000"
    Then vejo erro
