package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProdutoPage extends BasePage {

    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    public void selecionarProduto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        List<WebElement> produtos = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("a[href*='/produto/']")
                )
        );

        WebElement primeiroProduto = produtos.get(0);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);", primeiroProduto
        );

        wait.until(ExpectedConditions.elementToBeClickable(primeiroProduto));

        try {
            primeiroProduto.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", primeiroProduto
            );
        }
    }

    public void adicionarAoCarrinho() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement botaoComprar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[contains(.,'COMPRAR') or contains(.,'Comprar')]")
                )
        );


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", botaoComprar
        );


        wait.until(ExpectedConditions.elementToBeClickable(botaoComprar));

        try {
            botaoComprar.click();
        } catch (Exception e) {

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", botaoComprar
            );
        }
    }
}
