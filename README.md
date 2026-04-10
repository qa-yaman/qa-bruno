# Automação de Testes - KaBuM

Projeto de automação de testes para o e-commerce KaBuM, desenvolvido utilizando Java 17, Selenium WebDriver e Cucumber, seguindo o padrão Page Object Model (POM) e abordagem BDD.

---

## Tecnologias utilizadas

* Java 17
* Selenium WebDriver
* Cucumber (BDD com Gherkin)
* Maven
* JUnit

---

## Estrutura do projeto

```
src
 ├── main/java
 │   ├── home
 │   │   └── HomePage.java
 │   ├── login
 │   │   └── LoginPage.java
 │   ├── produto
 │   │   └── ProdutoPage.java
 │   └── pages
 │       └── BasePage.java
 │
 ├── test/java
 │   ├── runners
 │   │   └── TestRunner.java
 │   └── steps
 │       ├── BuscaSteps.java
 │       ├── CarrinhoSteps.java
 │       └── LoginSteps.java
 │
 └── test/resources
     └── features
         ├── busca.feature
         ├── carrinho.feature
         └── login.feature
```

---

## Descrição da arquitetura

O projeto foi estruturado utilizando o padrão Page Object Model (POM), separando responsabilidades entre:

* Pages: responsáveis por encapsular interações com a interface
* Steps: implementação dos passos definidos nos cenários BDD
* Features: cenários escritos em Gherkin
* Runner: classe responsável por executar os testes

Essa abordagem facilita a manutenção, reutilização de código e escalabilidade da automação.

---

## Cenários automatizados

* Busca de produtos no site
* Adição de produtos ao carrinho
* Tentativa de login com dados simulados

---

## Como executar o projeto

### Pré-requisitos

* Java 17 instalado
* Maven instalado
* Navegador Google Chrome

---

### Execução dos testes

```bash
mvn clean test
```

---

## Boas práticas aplicadas

* Uso de Page Object Model (POM)
* Separação clara entre camadas
* Reutilização de código através de BasePage
* Escrita de cenários em BDD com Gherkin
* Organização modular dos testes

---

## Autor

Bruno Esteves

---

## Observações

Este projeto foi desenvolvido com o objetivo de demonstrar conhecimentos em automação de testes web, incluindo organização de código, uso de padrões de projeto e escrita de cenários orientados a comportamento.
