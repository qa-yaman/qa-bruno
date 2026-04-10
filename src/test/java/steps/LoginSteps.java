package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;
    LoginPage login;

    @Given("que estou na tela de login")
    public void abrirLogin() {
        driver = new ChromeDriver();
        driver.get("https://www.kabum.com.br/login");
        login = new LoginPage(driver);
    }

    @When("informo CPF {string}")
    public void informarCPF(String cpf) {
        login.inserirCPF(cpf);
    }

    @Then("vejo erro")
    public void validarErro() {
        assertTrue(driver.getPageSource().toLowerCase().contains("erro"));
        driver.quit();
    }
}
