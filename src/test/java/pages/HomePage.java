package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import suporte.Base;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /*public HomePage aceitarPermissao(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();
        return new HomePage(driver);
    }*/

    public void validarExibiçãoDoMenuGerenciarPerfis(){
        WebElement menuPaginaInicial = driver.findElement(By.linkText("Gerenciar perfis"));

        Assert.assertTrue(menuPaginaInicial.isDisplayed());
    }
}
