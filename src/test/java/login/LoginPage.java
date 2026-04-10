package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By campoCPF = By.cssSelector("input[type='text']");

    private By botaoContinuar = By.cssSelector("button[type='submit']");

    public void inserirCPF(String cpf) {
        driver.findElement(campoCPF).sendKeys(cpf);
        driver.findElement(botaoContinuar).click();
    }
}

