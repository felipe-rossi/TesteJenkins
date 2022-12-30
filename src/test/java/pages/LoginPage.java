package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Base;

public class LoginPage extends Base{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage fazerLogin(String email, String senha){
        
        driver.findElement(By.linkText("Entrar")).click();

        driver.findElement(By.id("id_userLoginId")).sendKeys(email);
        driver.findElement(By.id("id_password")).sendKeys(senha);

        driver.findElement(By.xpath("//button[@data-uia = 'login-submit-button']")).click();

        return new HomePage(driver);
    }
}
