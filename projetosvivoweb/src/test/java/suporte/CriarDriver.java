package suporte;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriarDriver {
 
    public static WebDriver createDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\felip\\OneDrive\\GitHub\\ProjetosVivoWeb\\projetosvivoweb\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
