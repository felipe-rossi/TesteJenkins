package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.CriarDriver;
import suporte.TirarPrintDaTela;

public class LogarNetflixTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = CriarDriver.createDriver();
        driver.get("https://www.netflix.com/br/");
    }

    @Test
    public void fazerLoginNaNetflix(){
        new LoginPage(driver).fazerLogin("felipe.rossigz@hotmail.com", "0SbAiXXeoj").validarExibiçãoDoMenuGerenciarPerfis();
    }

    @After
    public void tearDown(){
        TirarPrintDaTela.tirarPrint();
        driver.quit();
    }

}
