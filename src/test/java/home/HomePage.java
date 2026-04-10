package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By campoBusca = By.xpath("//input[contains(@type,'search')]");

    private By botaoBusca = By.cssSelector("button[type='submit']");


    public void buscarProduto(String produto) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement campoBusca = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//input[contains(@placeholder,'KaBuM')]")
                )
        );

        campoBusca.click();
        campoBusca.clear();
        campoBusca.sendKeys(produto);
        campoBusca.sendKeys(Keys.ENTER);
    }
}
