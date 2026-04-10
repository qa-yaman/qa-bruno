Feature: Carrinho

  Scenario: Adicionar produto ao carrinho
    Given que busquei um produto
    When adiciono ao carrinho
    Then produto vai para o carrinho
