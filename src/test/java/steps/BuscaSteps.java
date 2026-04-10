package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class BuscaSteps {

    WebDriver driver;
    HomePage home;

    @Given("que estou no Kabum")
    public void abrirKabum() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kabum.com.br/");

        Thread.sleep(5000);

        home = new HomePage(driver);
    }


    @When("busco por {string}")
    public void buscarProduto(String produto) {
        home.buscarProduto(produto);
    }

    @Then("vejo resultados")
    public void validarBusca() {
        assertTrue(driver.getTitle().contains("KaBuM"));
        driver.quit();
    }
}
