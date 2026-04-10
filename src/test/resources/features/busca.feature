Feature: Busca de produto

  Scenario: Buscar produto no Kabum
    Given que estou no Kabum
    When busco por "mouse"
    Then vejo resultados
