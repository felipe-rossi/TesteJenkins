package suporte;

import org.openqa.selenium.WebDriver;

public class Base {
    protected WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }
}
