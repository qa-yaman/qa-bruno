package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.ProdutoPage;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CarrinhoSteps {

    WebDriver driver;
    HomePage home;
    ProdutoPage produto;

    @Given("que busquei um produto")
    public void buscarProduto() {
        driver = new ChromeDriver();
        driver.get("https://www.kabum.com.br/");
        home = new HomePage(driver);
        home.buscarProduto("mouse");
        produto = new ProdutoPage(driver);
    }

    @When("adiciono ao carrinho")
    public void adicionarCarrinho() {
        produto.selecionarProduto();
        produto.adicionarAoCarrinho();
    }

    @Then("produto vai para o carrinho")
    public void validarProdutoNoCarrinho() {
        produto.aceitarCookiesSeExistir();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement mensagem = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(text(),'Produto adicionado')]")
                )
        );

        Assert.assertTrue(mensagem.isDisplayed());
    }
}